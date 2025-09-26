package WebRobot.Cli.Sdk.custom;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.RequestConfig;
import com.amazonaws.ResetException;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalTime;
import com.amazonaws.SdkBaseException;
import com.amazonaws.SdkClientException;
import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CanHandleNullCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressInputStream;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.SDKProgressPublisher;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.HandlerAfterAttemptContext;
import com.amazonaws.handlers.HandlerBeforeAttemptContext;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.*;
import com.amazonaws.http.apache.client.impl.ApacheHttpClientFactory;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.apache.request.impl.ApacheHttpRequestFactory;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.http.client.HttpClientFactory;
import com.amazonaws.http.exception.HttpRequestTimeoutException;
import com.amazonaws.http.request.HttpRequestFactory;
import com.amazonaws.http.response.AwsResponseHandlerAdapter;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.http.timers.client.ClientExecutionAbortTrackerTask;
import com.amazonaws.http.timers.client.ClientExecutionTimeoutException;
import com.amazonaws.http.timers.client.ClientExecutionTimer;
import com.amazonaws.http.timers.client.SdkInterruptedException;
import com.amazonaws.http.timers.request.HttpRequestAbortTaskTracker;
import com.amazonaws.http.timers.request.HttpRequestTimer;
import com.amazonaws.internal.AmazonWebServiceRequestAdapter;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkBufferedInputStream;
import com.amazonaws.internal.auth.SignerProviderContext;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.monitoring.internal.ClientSideMonitoringRequestHandler;
import com.amazonaws.retry.ClockSkewAdjuster;
import com.amazonaws.retry.RetryPolicyAdapter;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.retry.ClockSkewAdjuster.AdjustmentRequest;
import com.amazonaws.retry.ClockSkewAdjuster.ClockSkewAdjustment;
import com.amazonaws.retry.internal.AuthErrorRetryStrategy;
import com.amazonaws.retry.internal.AuthRetryParameters;
import com.amazonaws.retry.v2.RetryPolicy;
import com.amazonaws.retry.v2.RetryPolicyContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsClientSideMonitoringMetrics;
import com.amazonaws.util.CapacityManager;
import com.amazonaws.util.CollectionUtils;
import com.amazonaws.util.CountingInputStream;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.ImmutableMapParameter;
import com.amazonaws.util.MetadataCache;
import com.amazonaws.util.NullResponseMetadataCache;
import com.amazonaws.util.ResponseMetadataCache;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.util.UnreliableFilterInputStream;
import com.amazonaws.util.AWSRequestMetrics.Field;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.execchain.RequestAbortedException;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;

@ThreadSafe
public class AmazonHttpClientTest {
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String HEADER_SDK_TRANSACTION_ID = "amz-sdk-invocation-id";
    public static final String HEADER_SDK_RETRY_INFO = "amz-sdk-retry";
    static final Log log = LogFactory.getLog(com.amazonaws.http.AmazonHttpClient.class);
    @SdkInternalApi
    public static final Log requestLog = LogFactory.getLog("com.amazonaws.request");
    private static final HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();

    private static UnreliableTestConfigTest unreliableTestConfig;
    private static final int THROTTLED_RETRY_COST = 5;
    private final ClockSkewAdjuster clockSkewAdjuster;
    private final HttpRequestFactory<HttpRequestBase> httpRequestFactory;
    private ConnectionManagerAwareHttpClient httpClient;
    private final ClientConfiguration config;
    private final RetryPolicy retryPolicy;
    private final HttpClientSettings httpClientSettings;
    private final MetadataCache responseMetadataCache;
    private final HttpRequestTimer httpRequestTimer;
    private final CapacityManager retryCapacity;
    private final ClientExecutionTimer clientExecutionTimer;
    private final RequestMetricCollector requestMetricCollector;
    private final Random random;
    private volatile int timeOffset;

    public AmazonHttpClientTest(ClientConfiguration config) {
        this(config, (RequestMetricCollector)null);
    }

    public AmazonHttpClientTest(ClientConfiguration config, RequestMetricCollector requestMetricCollector) {
        this(config, requestMetricCollector, false);
    }

    public AmazonHttpClientTest(ClientConfiguration config, RequestMetricCollector requestMetricCollector, boolean useBrowserCompatibleHostNameVerifier) {
        this(config, requestMetricCollector, useBrowserCompatibleHostNameVerifier, false);
    }

    public AmazonHttpClientTest(ClientConfiguration config, RequestMetricCollector requestMetricCollector, boolean useBrowserCompatibleHostNameVerifier, boolean calculateCRC32FromCompressedData) {
        this(config, (RetryPolicy)null, requestMetricCollector, useBrowserCompatibleHostNameVerifier, calculateCRC32FromCompressedData);
    }

    private AmazonHttpClientTest(ClientConfiguration config, RetryPolicy retryPolicy, RequestMetricCollector requestMetricCollector, boolean useBrowserCompatibleHostNameVerifier, boolean calculateCRC32FromCompressedData) {
        this(config, retryPolicy, requestMetricCollector, HttpClientSettings.adapt(config, useBrowserCompatibleHostNameVerifier, calculateCRC32FromCompressedData));
        this.httpClient = (ConnectionManagerAwareHttpClient)httpClientFactory.create(this.httpClientSettings);
    }

    @SdkTestInternalApi
    public AmazonHttpClientTest(ClientConfiguration clientConfig, ConnectionManagerAwareHttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this(clientConfig, (RetryPolicy)null, requestMetricCollector, HttpClientSettings.adapt(clientConfig, false));
        this.httpClient = httpClient;
    }

    private AmazonHttpClientTest(ClientConfiguration clientConfig, RetryPolicy retryPolicy, RequestMetricCollector requestMetricCollector, HttpClientSettings httpClientSettings) {
        this.clockSkewAdjuster = new ClockSkewAdjuster();
        this.httpRequestFactory = new ApacheHttpRequestFactory();
        this.random = new Random();
        this.timeOffset = SDKGlobalTime.getGlobalTimeOffset();
        this.config = clientConfig;
        this.retryPolicy = (RetryPolicy)(retryPolicy == null ? new RetryPolicyAdapter(clientConfig.getRetryPolicy(), clientConfig) : retryPolicy);
        this.httpClientSettings = httpClientSettings;
        this.requestMetricCollector = requestMetricCollector;
        this.responseMetadataCache = (MetadataCache)(clientConfig.getCacheResponseMetadata() ? new ResponseMetadataCache(clientConfig.getResponseMetadataCacheSize()) : new NullResponseMetadataCache());
        this.httpRequestTimer = new HttpRequestTimer();
        this.clientExecutionTimer = new ClientExecutionTimer();
        int throttledRetryMaxCapacity = clientConfig.useThrottledRetries() ? 5 * this.config.getMaxConsecutiveRetriesBeforeThrottling() : -1;
        this.retryCapacity = new CapacityManager(throttledRetryMaxCapacity);
    }

    public static AmazonHttpClientTest.Builder builder() {
        return new AmazonHttpClientTest.Builder();
    }

    private static boolean isTemporaryRedirect(HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status == 307 && response.getHeaders("Location") != null && response.getHeaders("Location").length > 0;
    }

    protected void finalize() throws Throwable {
        this.shutdown();
        super.finalize();
    }

    public void shutdown() {
        this.clientExecutionTimer.shutdown();
        this.httpRequestTimer.shutdown();
        IdleConnectionReaper.removeConnectionManager(this.httpClient.getHttpClientConnectionManager());
        this.httpClient.getHttpClientConnectionManager().shutdown();
    }

    static void configUnreliableTestConditions(UnreliableTestConfigTest config) {
        unreliableTestConfig = config;
    }

    @SdkTestInternalApi
    public HttpRequestTimer getHttpRequestTimer() {
        return this.httpRequestTimer;
    }

    @SdkTestInternalApi
    public ClientExecutionTimer getClientExecutionTimer() {
        return this.clientExecutionTimer;
    }

    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest request) {
        return this.responseMetadataCache.get(request);
    }

    public RequestMetricCollector getRequestMetricCollector() {
        return this.requestMetricCollector;
    }

    public int getTimeOffset() {
        return this.timeOffset;
    }

    /** @deprecated */
    @Deprecated
    public <T> Response<T> execute(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler, HttpResponseHandler<AmazonServiceException> errorResponseHandler, ExecutionContext executionContext) {
        return this.execute(request, responseHandler, errorResponseHandler, executionContext, new AmazonWebServiceRequestAdapter(request.getOriginalRequest()));
    }

    @SdkInternalApi
    public <T> Response<T> execute(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler, HttpResponseHandler<AmazonServiceException> errorResponseHandler, ExecutionContext executionContext, RequestConfig requestConfig) {
        HttpResponseHandler<T> adaptedRespHandler = new AwsResponseHandlerAdapter(this.getNonNullResponseHandler(responseHandler), request, executionContext.getAwsRequestMetrics(), this.responseMetadataCache);


        return this.requestExecutionBuilder().request(request).requestConfig(requestConfig).errorResponseHandler(new AwsErrorResponseHandlerTest(errorResponseHandler, executionContext.getAwsRequestMetrics())).executionContext(executionContext).execute(adaptedRespHandler);
    }

    private <T> HttpResponseHandler<T> getNonNullResponseHandler(HttpResponseHandler<T> responseHandler) {
        return responseHandler != null ? responseHandler : new HttpResponseHandler<T>() {
            public T handle(com.amazonaws.http.HttpResponse response) throws Exception {
                return null;
            }

            public boolean needsConnectionLeftOpen() {
                return false;
            }
        };
    }

    public AmazonHttpClient.RequestExecutionBuilder requestExecutionBuilder() {
        return new AmazonHttpClientTest.RequestExecutionBuilderImpl();
    }

    static {
        List<String> problematicJvmVersions = Arrays.asList("1.6.0_06", "1.6.0_13", "1.6.0_17", "1.6.0_65", "1.7.0_45");
        String jvmVersion = System.getProperty("java.version");
        if (problematicJvmVersions.contains(jvmVersion)) {
            log.warn("Detected a possible problem with the current JVM version (" + jvmVersion + ").  If you experience XML parsing problems using the SDK, try upgrading to a more recent JVM update.");
        }

    }

    private class RequestExecutor<Output> {
        private final Request<?> request;
        private final RequestConfig requestConfig;
        private final HttpResponseHandler<? extends SdkBaseException> errorResponseHandler;
        private final HttpResponseHandler<Output> responseHandler;
        private final ExecutionContext executionContext;
        private final List<RequestHandler2> requestHandler2s;
        private final AWSRequestMetrics awsRequestMetrics;
        private RequestHandler2 csmRequestHandler;

        private RequestExecutor(Request<?> request, RequestConfig requestConfig, HttpResponseHandler<? extends SdkBaseException> errorResponseHandler, HttpResponseHandler<Output> responseHandler, ExecutionContext executionContext, List<RequestHandler2> requestHandler2s) {
            this.request = request;
            this.requestConfig = requestConfig;
            this.errorResponseHandler = errorResponseHandler;
            this.responseHandler = responseHandler;
            this.executionContext = executionContext;
            this.requestHandler2s = requestHandler2s;
            this.awsRequestMetrics = executionContext.getAwsRequestMetrics();
            Iterator var8 = requestHandler2s.iterator();

            while(var8.hasNext()) {
                RequestHandler2 requestHandler2 = (RequestHandler2)var8.next();
                if (requestHandler2 instanceof ClientSideMonitoringRequestHandler) {
                    this.csmRequestHandler = requestHandler2;
                    break;
                }
            }

        }

        private Response<Output> execute() {
            if (this.executionContext == null) {
                throw new SdkClientException("Internal SDK Error: No execution context parameter specified.");
            } else {
                Response var1;
                try {
                    var1 = this.executeWithTimer();
                } catch (InterruptedException var6) {
                    throw this.handleInterruptedException(var6);
                } catch (AbortedException var7) {
                    throw this.handleAbortedException(var7);
                } finally {
                    if (this.executionContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
                        Thread.interrupted();
                    }

                }

                return var1;
            }
        }

        private Response<Output> executeWithTimer() throws InterruptedException {
            ClientExecutionAbortTrackerTask clientExecutionTrackerTask = AmazonHttpClientTest.this.clientExecutionTimer.startTimer(this.getClientExecutionTimeout(this.requestConfig));

            Response outputResponse;
            try {
                this.executionContext.setClientExecutionTrackerTask(clientExecutionTrackerTask);
                outputResponse = this.doExecute();
            } finally {
                this.executionContext.getClientExecutionTrackerTask().cancelTask();
            }

            return outputResponse;
        }

        private Response<Output> doExecute() throws InterruptedException {
            this.runBeforeRequestHandlers();
            this.setSdkTransactionId(this.request);
            this.setUserAgent(this.request);
            ProgressListener listener = this.requestConfig.getProgressListener();
            this.request.getHeaders().putAll(AmazonHttpClientTest.this.config.getHeaders());
            this.request.getHeaders().putAll(this.requestConfig.getCustomRequestHeaders());
            this.mergeQueryParameters(this.requestConfig.getCustomQueryParameters());
            Response<Output> response = null;
            InputStream origContent = this.request.getContent();
            InputStream toBeClosed = this.beforeRequest();
            InputStream notCloseable = toBeClosed == null ? null : ReleasableInputStream.wrap(toBeClosed).disableClose();
            this.request.setContent(notCloseable);

            Response var6;
            try {
                SDKProgressPublisher.publishProgress(listener, ProgressEventType.CLIENT_REQUEST_STARTED_EVENT);
                response = this.executeHelper();
                SDKProgressPublisher.publishProgress(listener, ProgressEventType.CLIENT_REQUEST_SUCCESS_EVENT);
                this.awsRequestMetrics.endEvent(AwsClientSideMonitoringMetrics.ApiCallLatency);
                this.awsRequestMetrics.getTimingInfo().endTiming();
                this.afterResponse(response);
                var6 = response;
            } catch (AmazonClientException var10) {
                SDKProgressPublisher.publishProgress(listener, ProgressEventType.CLIENT_REQUEST_FAILED_EVENT);
                this.awsRequestMetrics.endEvent(AwsClientSideMonitoringMetrics.ApiCallLatency);
                this.afterError(response, var10);
                throw var10;
            } finally {
                this.closeQuietlyForRuntimeExceptions(toBeClosed, AmazonHttpClientTest.log);
                this.request.setContent(origContent);
            }

            return var6;
        }

        private void closeQuietlyForRuntimeExceptions(Closeable c, Log log) {
            try {
                IOUtils.closeQuietly(c, log);
            } catch (RuntimeException var4) {
                if (log.isDebugEnabled()) {
                    log.debug("Unable to close closeable", var4);
                }
            }

        }

        private void runBeforeRequestHandlers() {
            AWSCredentials credentials = this.getCredentialsFromContext();
            this.request.addHandlerContext(HandlerContextKey.AWS_CREDENTIALS, credentials);

            RequestHandler2 requestHandler2;
            for(Iterator var2 = this.requestHandler2s.iterator(); var2.hasNext(); requestHandler2.beforeRequest(this.request)) {
                requestHandler2 = (RequestHandler2)var2.next();
                if (requestHandler2 instanceof CredentialsRequestHandler) {
                    ((CredentialsRequestHandler)requestHandler2).setCredentials(credentials);
                }
            }

        }

        private RuntimeException handleInterruptedException(InterruptedException e) {
            if (e instanceof SdkInterruptedException && ((SdkInterruptedException)e).getResponse() != null) {
                ((SdkInterruptedException)e).getResponse().getHttpResponse().getHttpRequest().abort();
            }

            if (this.executionContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
                Thread.interrupted();
                ClientExecutionTimeoutException exception = new ClientExecutionTimeoutException();
                this.reportClientExecutionTimeout(exception);
                return exception;
            } else {
                Thread.currentThread().interrupt();
                return new AbortedException(e);
            }
        }

        private RuntimeException handleAbortedException(AbortedException ae) {
            if (this.executionContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
                Thread.interrupted();
                ClientExecutionTimeoutException exception = new ClientExecutionTimeoutException();
                this.reportClientExecutionTimeout(exception);
                return exception;
            } else {
                Thread.currentThread().interrupt();
                return ae;
            }
        }

        private void reportClientExecutionTimeout(ClientExecutionTimeoutException exception) {
            if (this.csmRequestHandler != null) {
                this.csmRequestHandler.afterError(this.request, (Response)null, exception);
            }

        }

        private void checkInterrupted() throws InterruptedException {
            this.checkInterrupted((Response)null);
        }

        private void checkInterrupted(Response<?> response) throws InterruptedException {
            if (Thread.interrupted()) {
                throw new SdkInterruptedException(response);
            }
        }

        private void mergeQueryParameters(Map<String, List<String>> params) {
            Map<String, List<String>> existingParams = this.request.getParameters();
            Iterator var3 = params.entrySet().iterator();

            while(var3.hasNext()) {
                Entry<String, List<String>> param = (Entry)var3.next();
                String pName = (String)param.getKey();
                List<String> pValues = (List)param.getValue();
                existingParams.put(pName, CollectionUtils.mergeLists((List)existingParams.get(pName), pValues));
            }

        }

        private InputStream beforeRequest() {
            ProgressListener listener = this.requestConfig.getProgressListener();
            this.reportContentLength(listener);
            if (this.request.getContent() == null) {
                return null;
            } else {
                InputStream content = this.monitorStreamProgress(listener, this.buffer(this.makeResettable(this.request.getContent())));
                return AmazonHttpClientTest.unreliableTestConfig == null ? content : this.wrapWithUnreliableStream(content);
            }
        }

        private void reportContentLength(ProgressListener listener) {
            Map<String, String> headers = this.request.getHeaders();
            String contentLengthStr = (String)headers.get("Content-Length");
            if (contentLengthStr != null) {
                try {
                    long contentLength = Long.parseLong(contentLengthStr);
                    SDKProgressPublisher.publishRequestContentLength(listener, contentLength);
                } catch (NumberFormatException var6) {
                    AmazonHttpClientTest.log.warn("Cannot parse the Content-Length header of the request.");
                }
            }

        }

        private InputStream makeResettable(InputStream content) {
            if (!content.markSupported() && content instanceof FileInputStream) {
                try {
                    return new ResettableInputStream((FileInputStream)content);
                } catch (IOException var3) {
                    if (AmazonHttpClientTest.log.isDebugEnabled()) {
                        AmazonHttpClientTest.log.debug("For the record; ignore otherwise", var3);
                    }
                }
            }

            return content;
        }

        private InputStream buffer(InputStream content) {
            if (!((InputStream)content).markSupported()) {
                content = new SdkBufferedInputStream((InputStream)content);
            }

            return (InputStream)content;
        }

        private InputStream monitorStreamProgress(ProgressListener listener, InputStream content) {
            return ProgressInputStream.inputStreamForRequest(content, listener);
        }

        private InputStream wrapWithUnreliableStream(InputStream content) {
            return (new UnreliableFilterInputStream(content, AmazonHttpClientTest.unreliableTestConfig.isFakeIOException())).withBytesReadBeforeException(AmazonHttpClientTest.unreliableTestConfig.getBytesReadBeforeException()).withMaxNumErrors(AmazonHttpClientTest.unreliableTestConfig.getMaxNumErrors()).withResetIntervalBeforeException(AmazonHttpClientTest.unreliableTestConfig.getResetIntervalBeforeException());
        }

        private void afterError(Response<?> response, AmazonClientException e) throws InterruptedException {
            Iterator var3 = this.requestHandler2s.iterator();

            while(var3.hasNext()) {
                RequestHandler2 handler2 = (RequestHandler2)var3.next();
                handler2.afterError(this.request, response, e);
                this.checkInterrupted(response);
            }

        }

        private <T> void afterResponse(Response<T> response) throws InterruptedException {
            Iterator var2 = this.requestHandler2s.iterator();

            while(var2.hasNext()) {
                RequestHandler2 handler2 = (RequestHandler2)var2.next();
                handler2.afterResponse(this.request, response);
                this.checkInterrupted(response);
            }

        }

        private <T> void beforeAttempt(HandlerBeforeAttemptContext context) throws InterruptedException {
            Iterator var2 = this.requestHandler2s.iterator();

            while(var2.hasNext()) {
                RequestHandler2 handler2 = (RequestHandler2)var2.next();
                handler2.beforeAttempt(context);
                this.checkInterrupted();
            }

        }

        private <T> void afterAttempt(HandlerAfterAttemptContext context) throws InterruptedException {
            Iterator var2 = this.requestHandler2s.iterator();

            while(var2.hasNext()) {
                RequestHandler2 handler2 = (RequestHandler2)var2.next();
                handler2.afterAttempt(context);
                this.checkInterrupted(context.getResponse());
            }

        }

        private Response<Output> executeHelper() throws InterruptedException {
            this.awsRequestMetrics.addPropertyWith(Field.RequestType, this.requestConfig.getRequestType()).addPropertyWith(Field.ServiceName, this.request.getServiceName()).addPropertyWith(Field.ServiceEndpoint, this.request.getEndpoint());
            Map<String, List<String>> originalParameters = new LinkedHashMap(this.request.getParameters());
            Map<String, String> originalHeaders = new HashMap(this.request.getHeaders());
            AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams = new AmazonHttpClientTest.RequestExecutor.ExecOneRequestParams();
            InputStream originalContent = this.request.getContent();
            int readLimit;
            if (originalContent != null && originalContent.markSupported() && !(originalContent instanceof BufferedInputStream)) {
                readLimit = this.requestConfig.getRequestClientOptions().getReadLimit();
                originalContent.mark(readLimit);
            }

            this.awsRequestMetrics.startEvent(AwsClientSideMonitoringMetrics.ApiCallLatency);

            Response var10;
            Response response;
            Object savedException;
            boolean thrown;
            while(true) {
                this.checkInterrupted();
                if (originalContent instanceof BufferedInputStream && originalContent.markSupported()) {
                    readLimit = this.requestConfig.getRequestClientOptions().getReadLimit();
                    originalContent.mark(readLimit);
                }

                execOneParams.initPerRetry();
                URI redirectedURI = execOneParams.redirectedURI;
                if (redirectedURI != null) {
                    String scheme = redirectedURI.getScheme();
                    String beforeAuthority = scheme == null ? "" : scheme + "://";
                    String authority = redirectedURI.getAuthority();
                    String path = redirectedURI.getPath();
                    this.request.setEndpoint(URI.create(beforeAuthority + authority));
                    this.request.setResourcePath(SdkHttpUtils.urlEncode(path, true));
                    this.awsRequestMetrics.addPropertyWith(Field.RedirectLocation, redirectedURI.toString());
                }

                if (execOneParams.authRetryParam != null) {
                    this.request.setEndpoint(execOneParams.authRetryParam.getEndpointForRetry());
                }

                this.awsRequestMetrics.setCounter(Field.RequestCount, (long)execOneParams.requestCount);
                if (execOneParams.isRetry()) {
                    this.request.setParameters(originalParameters);
                    this.request.setHeaders(originalHeaders);
                    this.request.setContent(originalContent);
                }

                response = null;
                savedException = null;
                thrown = false;
                boolean var25 = false;

                HttpEntity entityxx;
                HandlerAfterAttemptContext afterAttemptContextx;
                label272: {
                    try {
                        var25 = true;
                        HandlerBeforeAttemptContext beforeAttemptContext = HandlerBeforeAttemptContext.builder().withRequest(this.request).build();
                        this.beforeAttempt(beforeAttemptContext);
                        response = this.executeOneRequest(execOneParams);
                        savedException = execOneParams.retriedException;
                        if (response != null) {
                            var10 = response;
                            var25 = false;
                            break;
                        }

                        var25 = false;
                    } catch (IOException var30) {
                        savedException = var30;
                        this.handleRetryableException(execOneParams, var30);
                        var25 = false;
                        break label272;
                    } catch (InterruptedException var31) {
                        savedException = var31;
                        thrown = true;
                        throw var31;
                    } catch (RuntimeException var32) {
                        savedException = var32;
                        thrown = true;
                        throw (RuntimeException)this.lastReset(this.captureExceptionMetrics(var32));
                    } catch (Error var33) {
                        thrown = true;
                        throw (Error)this.lastReset(this.captureExceptionMetrics(var33));
                    } finally {
                        if (var25) {
                            if ((!execOneParams.leaveHttpConnectionOpen || thrown) && execOneParams.apacheResponse != null) {
                                HttpEntity entityx = execOneParams.apacheResponse.getEntity();
                                if (entityx != null) {
                                    try {
                                        IOUtils.closeQuietly(entityx.getContent(), AmazonHttpClientTest.log);
                                    } catch (IOException var26) {
                                        AmazonHttpClientTest.log.warn("Cannot close the response content.", var26);
                                    }
                                }
                            }

                            HandlerAfterAttemptContext afterAttemptContext = HandlerAfterAttemptContext.builder().withRequest(this.request).withResponse(response).withException((Exception)savedException).build();
                            this.afterAttempt(afterAttemptContext);
                        }
                    }

                    if ((!execOneParams.leaveHttpConnectionOpen || thrown) && execOneParams.apacheResponse != null) {
                        entityxx = execOneParams.apacheResponse.getEntity();
                        if (entityxx != null) {
                            try {
                                IOUtils.closeQuietly(entityxx.getContent(), AmazonHttpClientTest.log);
                            } catch (IOException var29) {
                                AmazonHttpClientTest.log.warn("Cannot close the response content.", var29);
                            }
                        }
                    }

                    afterAttemptContextx = HandlerAfterAttemptContext.builder().withRequest(this.request).withResponse(response).withException((Exception)savedException).build();
                    this.afterAttempt(afterAttemptContextx);
                    continue;
                }

                if ((!execOneParams.leaveHttpConnectionOpen || thrown) && execOneParams.apacheResponse != null) {
                    entityxx = execOneParams.apacheResponse.getEntity();
                    if (entityxx != null) {
                        try {
                            IOUtils.closeQuietly(entityxx.getContent(), AmazonHttpClientTest.log);
                        } catch (IOException var28) {
                            AmazonHttpClientTest.log.warn("Cannot close the response content.", var28);
                        }
                    }
                }

                afterAttemptContextx = HandlerAfterAttemptContext.builder().withRequest(this.request).withResponse(response).withException((Exception)savedException).build();
                this.afterAttempt(afterAttemptContextx);
            }

            if ((!execOneParams.leaveHttpConnectionOpen || thrown) && execOneParams.apacheResponse != null) {
                HttpEntity entity = execOneParams.apacheResponse.getEntity();
                if (entity != null) {
                    try {
                        IOUtils.closeQuietly(entity.getContent(), AmazonHttpClientTest.log);
                    } catch (IOException var27) {
                        AmazonHttpClientTest.log.warn("Cannot close the response content.", var27);
                    }
                }
            }

            HandlerAfterAttemptContext afterAttemptContextxx = HandlerAfterAttemptContext.builder().withRequest(this.request).withResponse(response).withException((Exception)savedException).build();
            this.afterAttempt(afterAttemptContextxx);
            return var10;
        }

        private void handleRetryableException(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams, Exception e) {
            this.captureExceptionMetrics(e);
            this.awsRequestMetrics.addProperty(Field.AWSRequestID, (Object)null);
            SdkClientException sdkClientException;
            if (!(e instanceof SdkClientException)) {
                sdkClientException = new SdkClientException("Unable to execute HTTP request: " + e.getMessage(), e);
            } else {
                sdkClientException = (SdkClientException)e;
            }

            boolean willRetry = this.shouldRetry(execOneParams, sdkClientException);
            if (AmazonHttpClientTest.log.isTraceEnabled()) {
                AmazonHttpClientTest.log.trace(sdkClientException.getMessage() + (willRetry ? " Request will be retried." : ""), e);
            } else if (AmazonHttpClientTest.log.isDebugEnabled()) {
                AmazonHttpClientTest.log.trace(sdkClientException.getMessage() + (willRetry ? " Request will be retried." : ""));
            }

            if (!willRetry) {
                throw (SdkClientException)this.lastReset(sdkClientException);
            } else {
                execOneParams.retriedException = sdkClientException;
            }
        }

        private <T extends Throwable> T lastReset(T t) {
            try {
                InputStream content = this.request.getContent();
                if (content != null && content.markSupported()) {
                    content.reset();
                }
            } catch (Exception var3) {
                AmazonHttpClientTest.log.debug("FYI: failed to reset content inputstream before throwing up", var3);
            }

            return t;
        }

        private AWSCredentials getCredentialsFromContext() {
            AWSCredentialsProvider credentialsProvider = this.executionContext.getCredentialsProvider();
            AWSCredentials credentials = null;
            if (credentialsProvider != null) {
                this.awsRequestMetrics.startEvent(Field.CredentialsRequestTime);

                try {
                    credentials = credentialsProvider.getCredentials();
                } finally {
                    this.awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
                }
            }

            return credentials;
        }

        private Response<Output> executeOneRequest(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams) throws IOException, InterruptedException {
            if (execOneParams.isRetry()) {
                this.resetRequestInputStream(this.request, execOneParams.retriedException);
            }

            this.checkInterrupted();
            if (com.amazonaws.http.AmazonHttpClient.requestLog.isDebugEnabled()) {
                com.amazonaws.http.AmazonHttpClient.requestLog.debug((execOneParams.isRetry() ? "Retrying " : "Sending ") + "Request: " + this.request);
            }

            AWSCredentials credentials = this.getCredentialsFromContext();
            ProgressListener listener = this.requestConfig.getProgressListener();
            if (execOneParams.isRetry()) {
                this.pauseBeforeRetry(execOneParams, listener);
            }

            this.updateRetryHeaderInfo(this.request, execOneParams);
            execOneParams.newSigner(this.request, this.executionContext);
            if (execOneParams.signer != null && (credentials != null || execOneParams.signer instanceof CanHandleNullCredentials)) {
                this.awsRequestMetrics.startEvent(Field.RequestSigningTime);

                try {
                    if (AmazonHttpClientTest.this.timeOffset != 0) {
                        this.request.setTimeOffset(AmazonHttpClientTest.this.timeOffset);
                    }

                    execOneParams.signer.sign(this.request, credentials);
                } finally {
                    this.awsRequestMetrics.endEvent(Field.RequestSigningTime);
                }
            }

            this.checkInterrupted();
            execOneParams.newApacheRequest(AmazonHttpClientTest.this.httpRequestFactory, this.request, AmazonHttpClientTest.this.httpClientSettings);
            this.captureConnectionPoolMetrics();
            HttpClientContext localRequestContext = ApacheUtils.newClientContext(AmazonHttpClientTest.this.httpClientSettings, ImmutableMapParameter.of(AWSRequestMetrics.SIMPLE_NAME, this.awsRequestMetrics));
            execOneParams.resetBeforeHttpRequest();
            SDKProgressPublisher.publishProgress(listener, ProgressEventType.HTTP_REQUEST_STARTED_EVENT);
            this.awsRequestMetrics.startEvent(Field.HttpRequestTime);
            this.awsRequestMetrics.setCounter(Field.RetryCapacityConsumed, (long) AmazonHttpClientTest.this.retryCapacity.consumedCapacity());
            this.executionContext.getClientExecutionTrackerTask().setCurrentHttpRequest(execOneParams.apacheRequest);
            HttpRequestAbortTaskTracker requestAbortTaskTracker = AmazonHttpClientTest.this.httpRequestTimer.startTimer(execOneParams.apacheRequest, this.getRequestTimeout(this.requestConfig));

            try {
                execOneParams.apacheResponse = AmazonHttpClientTest.this.httpClient.execute(execOneParams.apacheRequest, localRequestContext);
                if (this.shouldBufferHttpEntity(this.responseHandler.needsConnectionLeftOpen(), this.executionContext, execOneParams, requestAbortTaskTracker)) {
                    execOneParams.apacheResponse.setEntity(new BufferedHttpEntity(execOneParams.apacheResponse.getEntity()));
                }
            } catch (IOException var15) {
                if (this.executionContext.getClientExecutionTrackerTask().hasTimeoutExpired()) {
                    throw new InterruptedException();
                }

                if (requestAbortTaskTracker.httpRequestAborted()) {
                    if (var15 instanceof RequestAbortedException) {
                        Thread.interrupted();
                    }

                    throw new HttpRequestTimeoutException(var15);
                }

                throw var15;
            } finally {
                requestAbortTaskTracker.cancelTask();
                this.awsRequestMetrics.endEvent(Field.HttpRequestTime);
            }

            SDKProgressPublisher.publishProgress(listener, ProgressEventType.HTTP_REQUEST_COMPLETED_EVENT);
            StatusLine statusLine = execOneParams.apacheResponse.getStatusLine();
            int statusCode = statusLine == null ? -1 : statusLine.getStatusCode();
            return ApacheUtils.isRequestSuccessful(execOneParams.apacheResponse) ? this.handleSuccessResponse(execOneParams, localRequestContext, statusCode) : this.handleServiceErrorResponse(execOneParams, localRequestContext, statusCode);
        }

        private Response<Output> handleServiceErrorResponse(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams, HttpClientContext localRequestContext, int statusCode) throws IOException, InterruptedException {
            if (AmazonHttpClientTest.isTemporaryRedirect(execOneParams.apacheResponse)) {
                Header[] locationHeaders = execOneParams.apacheResponse.getHeaders("location");
                String redirectedLocation = locationHeaders[0].getValue();
                if (AmazonHttpClientTest.log.isDebugEnabled()) {
                    AmazonHttpClientTest.log.debug("Redirecting to: " + redirectedLocation);
                }

                execOneParams.redirectedURI = URI.create(redirectedLocation);
                this.awsRequestMetrics.addPropertyWith(Field.StatusCode, statusCode).addPropertyWith(Field.AWSRequestID, (Object)null);
                return null;
            } else {
                execOneParams.leaveHttpConnectionOpen = this.errorResponseHandler.needsConnectionLeftOpen();
                SdkBaseException exception = this.handleErrorResponse(execOneParams.apacheRequest, execOneParams.apacheResponse, localRequestContext);
                ClockSkewAdjustment clockSkewAdjustment = AmazonHttpClientTest.this.clockSkewAdjuster.getAdjustment((new AdjustmentRequest()).exception(exception).clientRequest(this.request).serviceResponse(execOneParams.apacheResponse));
                if (clockSkewAdjustment.shouldAdjustForSkew()) {
                    AmazonHttpClientTest.this.timeOffset = clockSkewAdjustment.inSeconds();
                    this.request.setTimeOffset(AmazonHttpClientTest.this.timeOffset);
                    SDKGlobalTime.setGlobalTimeOffset(AmazonHttpClientTest.this.timeOffset);
                }

                execOneParams.authRetryParam = null;
                AuthErrorRetryStrategy authRetry = this.executionContext.getAuthErrorRetryStrategy();
                if (authRetry != null && exception instanceof AmazonServiceException) {
                    com.amazonaws.http.HttpResponse httpResponse = ApacheUtils.createResponse(this.request, execOneParams.apacheRequest, execOneParams.apacheResponse, localRequestContext);
                    execOneParams.authRetryParam = authRetry.shouldRetryWithAuthParam(this.request, httpResponse, (AmazonServiceException)exception);
                }

                if (execOneParams.authRetryParam == null && !this.shouldRetry(execOneParams, exception)) {
                    throw exception;
                } else {
                    if (RetryUtils.isThrottlingException(exception)) {
                        this.awsRequestMetrics.incrementCounterWith(Field.ThrottleException).addProperty(Field.ThrottleException, exception);
                    }

                    execOneParams.retriedException = exception;
                    return null;
                }
            }
        }

        private Response<Output> handleSuccessResponse(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams, HttpClientContext localRequestContext, int statusCode) throws IOException, InterruptedException {
            this.awsRequestMetrics.addProperty(Field.StatusCode, statusCode);
            execOneParams.leaveHttpConnectionOpen = this.responseHandler.needsConnectionLeftOpen();
            com.amazonaws.http.HttpResponse httpResponse = ApacheUtils.createResponse(this.request, execOneParams.apacheRequest, execOneParams.apacheResponse, localRequestContext);
            Output response = this.handleResponse(httpResponse);
            if (execOneParams.isRetry() && this.executionContext.retryCapacityConsumed()) {
                AmazonHttpClientTest.this.retryCapacity.release(5);
            } else {
                AmazonHttpClientTest.this.retryCapacity.release();
            }

            return new Response(response, httpResponse);
        }

        private void resetRequestInputStream(Request<?> request, SdkBaseException retriedException) throws ResetException {
            InputStream requestInputStream = request.getContent();
            if (requestInputStream != null && requestInputStream.markSupported()) {
                try {
                    requestInputStream.reset();
                } catch (IOException var6) {
                    ResetException resetException = new ResetException("The request to the service failed with a retryable reason, but resetting the request input stream has failed. See exception.getExtraInfo or debug-level logging for the original failure that caused this retry.", var6);
                    resetException.setExtraInfo(retriedException.getMessage());
                    throw resetException;
                }
            }

        }

        private boolean shouldBufferHttpEntity(boolean needsConnectionLeftOpen, ExecutionContext execContext, AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execParams, HttpRequestAbortTaskTracker requestAbortTaskTracker) {
            return (execContext.getClientExecutionTrackerTask().isEnabled() || requestAbortTaskTracker.isEnabled()) && !needsConnectionLeftOpen && execParams.apacheResponse.getEntity() != null;
        }

        private void captureConnectionPoolMetrics() {
            if (this.awsRequestMetrics.isEnabled() && AmazonHttpClientTest.this.httpClient.getHttpClientConnectionManager() instanceof ConnPoolControl) {
                PoolStats stats = ((ConnPoolControl) AmazonHttpClientTest.this.httpClient.getHttpClientConnectionManager()).getTotalStats();
                this.awsRequestMetrics.withCounter(Field.HttpClientPoolAvailableCount, (long)stats.getAvailable()).withCounter(Field.HttpClientPoolLeasedCount, (long)stats.getLeased()).withCounter(Field.HttpClientPoolPendingCount, (long)stats.getPending());
            }

        }

        private <T extends Throwable> T captureExceptionMetrics(T t) {
            this.awsRequestMetrics.incrementCounterWith(Field.Exception).addProperty(Field.Exception, t);
            if (t instanceof AmazonServiceException) {
                AmazonServiceException ase = (AmazonServiceException)t;
                if (RetryUtils.isThrottlingException(ase)) {
                    this.awsRequestMetrics.incrementCounterWith(Field.ThrottleException).addProperty(Field.ThrottleException, ase);
                }
            }

            return t;
        }

        private void setSdkTransactionId(Request<?> request) {
            request.addHeader("amz-sdk-invocation-id", (new UUID(AmazonHttpClientTest.this.random.nextLong(),AmazonHttpClientTest.this.random.nextLong())).toString());
        }

        private void setUserAgent(Request<?> request) {
            RequestClientOptions opts = this.requestConfig.getRequestClientOptions();
            if (opts != null) {
                request.addHeader("User-Agent", RuntimeHttpUtils.getUserAgent(AmazonHttpClientTest.this.config, opts.getClientMarker(Marker.USER_AGENT)));
            } else {
                request.addHeader("User-Agent", RuntimeHttpUtils.getUserAgent(AmazonHttpClientTest.this.config, (String)null));
            }

        }

        private void updateRetryHeaderInfo(Request<?> request, AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneRequestParams) {
            int availableRetryCapacity = AmazonHttpClientTest.this.retryCapacity.availableCapacity();
            String headerValue = String.format("%s/%s/%s", execOneRequestParams.requestCount - 1, execOneRequestParams.lastBackoffDelay, availableRetryCapacity >= 0 ? availableRetryCapacity : "");
            request.addHeader("amz-sdk-retry", headerValue);
        }

        private boolean shouldRetry(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams params, SdkBaseException exception) {
            int retriesAttempted = params.requestCount - 1;
            HttpRequestBase method = params.apacheRequest;
            if (method instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest)method).getEntity();
                if (entity != null && !entity.isRepeatable()) {
                    if (AmazonHttpClientTest.log.isDebugEnabled()) {
                        AmazonHttpClientTest.log.debug("Entity not repeatable");
                    }

                    return false;
                }
            }

            RetryPolicyContext context = RetryPolicyContext.builder().request(this.request).originalRequest(this.requestConfig.getOriginalRequest()).exception(exception).retriesAttempted(retriesAttempted).httpStatusCode(params.getStatusCode()).build();
            if (!RetryUtils.isThrottlingException(exception)) {
                if (!AmazonHttpClientTest.this.retryCapacity.acquire(5)) {
                    this.awsRequestMetrics.incrementCounter(Field.ThrottledRetryCount);
                    this.reportMaxRetriesExceededIfRetryable(context);
                    return false;
                }

                this.executionContext.markRetryCapacityConsumed();
            }

            if (!AmazonHttpClientTest.this.retryPolicy.shouldRetry(context)) {
                if (this.executionContext.retryCapacityConsumed()) {
                    AmazonHttpClientTest.this.retryCapacity.release(5);
                }

                this.reportMaxRetriesExceededIfRetryable(context);
                return false;
            } else {
                return true;
            }
        }

        private void reportMaxRetriesExceededIfRetryable(RetryPolicyContext context) {
            if (AmazonHttpClientTest.this.retryPolicy instanceof RetryPolicyAdapter && ((RetryPolicyAdapter) AmazonHttpClientTest.this.retryPolicy).isRetryable(context)) {
                this.awsRequestMetrics.addPropertyWith(AwsClientSideMonitoringMetrics.MaxRetriesExceeded, true);
            }

        }

        private Output handleResponse(com.amazonaws.http.HttpResponse httpResponse) throws IOException, InterruptedException {
            ProgressListener listener = this.requestConfig.getProgressListener();

            try {
                CountingInputStream countingInputStream = null;
                InputStream is = httpResponse.getContent();
                if (is != null) {
                    if (System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null) {
                        is = countingInputStream = new CountingInputStream((InputStream)is);
                        httpResponse.setContent((InputStream)is);
                    }

                    httpResponse.setContent(ProgressInputStream.inputStreamForResponse((InputStream)is, listener));
                }

                Map<String, String> headers = httpResponse.getHeaders();
                String s = (String)headers.get("Content-Length");
                if (s != null) {
                    try {
                        long contentLength = Long.parseLong(s);
                        SDKProgressPublisher.publishResponseContentLength(listener, contentLength);
                    } catch (NumberFormatException var18) {
                        AmazonHttpClientTest.log.warn("Cannot parse the Content-Length header of the response.");
                    }
                }

                this.awsRequestMetrics.startEvent(Field.ResponseProcessingTime);
                SDKProgressPublisher.publishProgress(listener, ProgressEventType.HTTP_RESPONSE_STARTED_EVENT);

                Output awsResponse;
                try {
                    awsResponse = this.responseHandler.handle(this.beforeUnmarshalling(httpResponse));
                } finally {
                    this.awsRequestMetrics.endEvent(Field.ResponseProcessingTime);
                }

                SDKProgressPublisher.publishProgress(listener, ProgressEventType.HTTP_RESPONSE_COMPLETED_EVENT);
                if (countingInputStream != null) {
                    this.awsRequestMetrics.setCounter(Field.BytesProcessed, countingInputStream.getByteCount());
                }

                return awsResponse;
            } catch (CRC32MismatchException var19) {
                throw var19;
            } catch (IOException var20) {
                throw var20;
            } catch (AmazonClientException var21) {
                throw var21;
            } catch (InterruptedException var22) {
                throw var22;
            } catch (Exception var23) {
                String errorMessage = "Unable to unmarshall response (" + var23.getMessage() + "). Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText();
                throw new SdkClientException(errorMessage, var23);
            }
        }

        private com.amazonaws.http.HttpResponse beforeUnmarshalling(com.amazonaws.http.HttpResponse origHttpResponse) {
            com.amazonaws.http.HttpResponse toReturn = origHttpResponse;

            RequestHandler2 requestHandler;
            for(Iterator var3 = this.requestHandler2s.iterator(); var3.hasNext(); toReturn = requestHandler.beforeUnmarshalling(this.request, toReturn)) {
                requestHandler = (RequestHandler2)var3.next();
            }

            return toReturn;
        }

        private SdkBaseException handleErrorResponse(HttpRequestBase method, HttpResponse apacheHttpResponse, HttpContext context) throws IOException, InterruptedException {
            StatusLine statusLine = apacheHttpResponse.getStatusLine();
            int statusCode;
            String reasonPhrase;
            if (statusLine == null) {
                statusCode = -1;
                reasonPhrase = null;
            } else {
                statusCode = statusLine.getStatusCode();
                reasonPhrase = statusLine.getReasonPhrase();
            }

            com.amazonaws.http.HttpResponse response = ApacheUtils.createResponse(this.request, method, apacheHttpResponse, context);
            SdkBaseException exception;
            String statusText = response.getStatusText();
            //String result = IOUtils.toString(response.getContent());
            try {
                exception = (SdkBaseException)this.errorResponseHandler.handle(response);
                if (com.amazonaws.http.AmazonHttpClient.requestLog.isDebugEnabled()) {
                    com.amazonaws.http.AmazonHttpClient.requestLog.debug("Received error response: " + exception);
                }
            } catch (InterruptedException var11) {
                throw var11;
            } catch (Exception var12) {
                if (var12 instanceof IOException) {
                    throw (IOException)var12;
                }

                String errorMessage = "Unable to unmarshall error response (" + var12.getMessage() + "). Response Code: " + (statusLine == null ? "None" : statusCode) + ", Response Text: " + reasonPhrase;
                throw new SdkClientException(errorMessage, var12);
            }

            exception.fillInStackTrace();
            return exception;
        }

        private void pauseBeforeRetry(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams, ProgressListener listener) throws InterruptedException {
            SDKProgressPublisher.publishProgress(listener, ProgressEventType.CLIENT_REQUEST_RETRY_EVENT);
            this.awsRequestMetrics.startEvent(Field.RetryPauseTime);

            try {
                this.doPauseBeforeRetry(execOneParams);
            } finally {
                this.awsRequestMetrics.endEvent(Field.RetryPauseTime);
            }

        }

        private void doPauseBeforeRetry(AmazonHttpClientTest.RequestExecutor<Output>.ExecOneRequestParams execOneParams) throws InterruptedException {
            int retriesAttempted = execOneParams.requestCount - 2;
            RetryPolicyContext context = RetryPolicyContext.builder().request(this.request).originalRequest(this.requestConfig.getOriginalRequest()).retriesAttempted(retriesAttempted).exception(execOneParams.retriedException).build();
            if (context.exception() != null) {
                long delay = AmazonHttpClientTest.this.retryPolicy.computeDelayBeforeNextRetry(context);
                execOneParams.lastBackoffDelay = delay;
                if (AmazonHttpClientTest.log.isDebugEnabled()) {
                    AmazonHttpClientTest.log.debug("Retriable error detected, will retry in " + delay + "ms, attempt number: " + retriesAttempted);
                }

                Thread.sleep(delay);
            }

        }

        private int getRequestTimeout(RequestConfig requestConfig) {
            return requestConfig.getRequestTimeout() != null ? requestConfig.getRequestTimeout() : AmazonHttpClientTest.this.config.getRequestTimeout();
        }

        private int getClientExecutionTimeout(RequestConfig requestConfig) {
            return requestConfig.getClientExecutionTimeout() != null ? requestConfig.getClientExecutionTimeout() : AmazonHttpClientTest.this.config.getClientExecutionTimeout();
        }

        private class ExecOneRequestParams {
            int requestCount;
            long lastBackoffDelay;
            SdkBaseException retriedException;
            HttpRequestBase apacheRequest;
            HttpResponse apacheResponse;
            URI redirectedURI;
            AuthRetryParameters authRetryParam;
            boolean leaveHttpConnectionOpen;
            private Signer signer;
            private URI signerURI;

            private ExecOneRequestParams() {
                this.lastBackoffDelay = 0L;
            }

            boolean isRetry() {
                return this.requestCount > 1 || this.redirectedURI != null || this.authRetryParam != null;
            }

            void initPerRetry() {
                ++this.requestCount;
                this.apacheRequest = null;
                this.apacheResponse = null;
                this.leaveHttpConnectionOpen = false;
            }

            void newSigner(Request<?> request, ExecutionContext execContext) {
                com.amazonaws.internal.auth.SignerProviderContext.Builder signerProviderContext = SignerProviderContext.builder().withRequest(request).withRequestConfig(AmazonHttpClientTest.RequestExecutor.this.requestConfig);
                if (this.authRetryParam != null) {
                    this.signerURI = this.authRetryParam.getEndpointForRetry();
                    this.signer = this.authRetryParam.getSignerForRetry();
                    execContext.setSigner(this.signer);
                } else if (this.redirectedURI != null && !this.redirectedURI.equals(this.signerURI)) {
                    this.signerURI = this.redirectedURI;
                    this.signer = execContext.getSigner(signerProviderContext.withUri(this.signerURI).withIsRedirect(true).build());
                    if (this.signer instanceof AWS4Signer) {
                        String regionName = ((AWS4Signer)this.signer).getRegionName();
                        if (regionName != null) {
                            request.addHandlerContext(HandlerContextKey.SIGNING_REGION, regionName);
                        }
                    }
                } else if (this.signer == null) {
                    this.signerURI = request.getEndpoint();
                    this.signer = execContext.getSigner(signerProviderContext.withUri(this.signerURI).build());
                }

            }

            HttpRequestBase newApacheRequest(HttpRequestFactory<HttpRequestBase> httpRequestFactory, Request<?> request, HttpClientSettings options) throws IOException {
                this.apacheRequest = (HttpRequestBase)httpRequestFactory.create(request, options);
                if (this.redirectedURI != null) {
                    this.apacheRequest.setURI(this.redirectedURI);
                }

                return this.apacheRequest;
            }

            void resetBeforeHttpRequest() {
                this.retriedException = null;
                this.authRetryParam = null;
                this.redirectedURI = null;
            }

            private Integer getStatusCode() {
                return this.apacheResponse != null && this.apacheResponse.getStatusLine() != null ? this.apacheResponse.getStatusLine().getStatusCode() : null;
            }
        }
    }

    private class RequestExecutionBuilderImpl implements com.amazonaws.http.AmazonHttpClient.RequestExecutionBuilder {
        private Request<?> request;
        private RequestConfig requestConfig;
        private HttpResponseHandler<? extends SdkBaseException> errorResponseHandler;
        private ExecutionContext executionContext;

        private RequestExecutionBuilderImpl() {
            this.executionContext = new ExecutionContext();
        }

        public com.amazonaws.http.AmazonHttpClient.RequestExecutionBuilder request(Request<?> request) {
            this.request = request;
            return this;
        }

        public com.amazonaws.http.AmazonHttpClient.RequestExecutionBuilder errorResponseHandler(HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {
            this.errorResponseHandler = errorResponseHandler;
            return this;
        }

        public com.amazonaws.http.AmazonHttpClient.RequestExecutionBuilder executionContext(ExecutionContext executionContext) {
            this.executionContext = executionContext;
            return this;
        }

        public com.amazonaws.http.AmazonHttpClient.RequestExecutionBuilder requestConfig(RequestConfig requestConfig) {
            this.requestConfig = requestConfig;
            return this;
        }

        public <Output> Response<Output> execute(HttpResponseHandler<Output> responseHandler) {
            RequestConfig config = this.requestConfig != null ? this.requestConfig : new AmazonWebServiceRequestAdapter(this.request.getOriginalRequest());
            return (AmazonHttpClientTest.this.new RequestExecutor(this.request, (RequestConfig)config, AmazonHttpClientTest.this.getNonNullResponseHandler(this.errorResponseHandler), AmazonHttpClientTest.this.getNonNullResponseHandler(responseHandler), this.executionContext, this.getRequestHandlers())).execute();
        }

        public Response<Void> execute() {
            return this.execute((HttpResponseHandler)null);
        }

        private List<RequestHandler2> getRequestHandlers() {
            List<RequestHandler2> requestHandler2s = this.executionContext.getRequestHandler2s();
            return requestHandler2s == null ? Collections.emptyList() : requestHandler2s;
        }
    }



    public static class Builder {
        private ClientConfiguration clientConfig;
        private RetryPolicy retryPolicy;
        private RequestMetricCollector requestMetricCollector;
        private boolean useBrowserCompatibleHostNameVerifier;
        private boolean calculateCRC32FromCompressedData;

        private Builder() {
        }

        public AmazonHttpClientTest.Builder clientConfiguration(ClientConfiguration clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        public AmazonHttpClientTest.Builder retryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public AmazonHttpClientTest.Builder requestMetricCollector(RequestMetricCollector requestMetricCollector) {
            this.requestMetricCollector = requestMetricCollector;
            return this;
        }

        public AmazonHttpClientTest.Builder useBrowserCompatibleHostNameVerifier(boolean useBrowserCompatibleHostNameVerifier) {
            this.useBrowserCompatibleHostNameVerifier = useBrowserCompatibleHostNameVerifier;
            return this;
        }

        public AmazonHttpClientTest.Builder calculateCRC32FromCompressedData(boolean calculateCRC32FromCompressedData) {
            this.calculateCRC32FromCompressedData = calculateCRC32FromCompressedData;
            return this;
        }

        public AmazonHttpClientTest build() {
            return new AmazonHttpClientTest(this.clientConfig, this.retryPolicy, this.requestMetricCollector, this.useBrowserCompatibleHostNameVerifier, this.calculateCRC32FromCompressedData);
        }
    }
}
