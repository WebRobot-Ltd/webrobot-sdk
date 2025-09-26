package WebRobot.Cli.Sdk.custom;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.RequestConfig;
import com.amazonaws.Response;
import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.CredentialUtils;
import com.amazonaws.util.AWSRequestMetrics.Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.rmi.activation.Activator;
import java.util.Iterator;
import java.util.List;

@Immutable
@ThreadSafe
@SdkProtectedApi
public class ClientHandlerImplTest extends ClientHandler {
    private final AWSCredentialsProvider awsCredentialsProvider;
    private final SignerProvider signerProvider;
    private final URI endpoint;
    private final List<RequestHandler2> requestHandler2s;
    private final RequestMetricCollector clientLevelMetricCollector;
    private final AmazonHttpClientTest client;

    public ClientHandlerImplTest(ClientHandlerParams handlerParams) {
        this.signerProvider = handlerParams.getClientParams().getSignerProvider();
        this.endpoint = handlerParams.getClientParams().getEndpoint();
        this.awsCredentialsProvider = handlerParams.getClientParams().getCredentialsProvider();
        this.requestHandler2s = handlerParams.getClientParams().getRequestHandlers();
        this.clientLevelMetricCollector = handlerParams.getClientParams().getRequestMetricCollector();
        this.client = this.buildHttpClient(handlerParams);
    }

    private AmazonHttpClientTest buildHttpClient(ClientHandlerParams handlerParams) {
        AwsSyncClientParams clientParams = handlerParams.getClientParams();
        return AmazonHttpClientTest.builder().clientConfiguration(clientParams.getClientConfiguration()).retryPolicy(clientParams.getRetryPolicy()).requestMetricCollector(clientParams.getRequestMetricCollector()).useBrowserCompatibleHostNameVerifier(handlerParams.isDisableStrictHostnameVerification()).build();
    }

    public <Input, Output> Output execute(ClientExecutionParams<Input, Output> executionParams)  {
        Input input = executionParams.getInput();
        ExecutionContext executionContext = this.createExecutionContext(executionParams.getRequestConfig());
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<Input> request = null;
        Response<Output> response = null;

        Output var7 = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);

            try {
                request = (Request)executionParams.getMarshaller().marshall(input);
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = this.invoke(request, executionParams.getRequestConfig(), executionContext, executionParams.getResponseHandler(), executionParams.getErrorResponseHandler());
            var7 = response.getAwsResponse();

        }
        catch(Exception ex) {
                this.endClientExecution(awsRequestMetrics, executionParams.getRequestConfig(), request, response);
                throw ex;
        }

        return var7;
    }

    public void shutdown() {
        this.client.shutdown();
    }

    private ExecutionContext createExecutionContext(RequestConfig requestConfig) {
        boolean isMetricsEnabled = this.isRequestMetricsEnabled(requestConfig);
        return ExecutionContext.builder().withRequestHandler2s(this.requestHandler2s).withUseRequestMetrics(isMetricsEnabled).withSignerProvider(this.signerProvider).build();
    }

    private boolean isRequestMetricsEnabled(RequestConfig requestConfig) {
        return this.hasRequestMetricsCollector(requestConfig) || this.isRMCEnabledAtClientOrSdkLevel();
    }

    private boolean hasRequestMetricsCollector(RequestConfig requestConfig) {
        return requestConfig.getRequestMetricsCollector() != null && requestConfig.getRequestMetricsCollector().isEnabled();
    }

    private boolean isRMCEnabledAtClientOrSdkLevel() {
        RequestMetricCollector collector = this.requestMetricCollector();
        return collector != null && collector.isEnabled();
    }

    private RequestMetricCollector requestMetricCollector() {
        return this.clientLevelMetricCollector != null ? this.clientLevelMetricCollector : AwsSdkMetrics.getRequestMetricCollector();
    }

    protected final <T extends AmazonWebServiceRequest> AmazonWebServiceRequest beforeMarshalling(AmazonWebServiceRequest request) {
        AmazonWebServiceRequest local = request;

        RequestHandler2 handler;
        for(Iterator var3 = this.requestHandler2s.iterator(); var3.hasNext(); local = handler.beforeMarshalling(local)) {
            handler = (RequestHandler2)var3.next();
        }

        return local;
    }

    private <Output, Input> Response<Output> invoke(Request<Input> request, RequestConfig requestConfig, ExecutionContext executionContext, HttpResponseHandler<Output> responseHandler, HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {
        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(requestConfig, this.awsCredentialsProvider));
        return this.doInvoke(request, requestConfig, executionContext, responseHandler, errorResponseHandler);
    }

    private <Output, Input> Response<Output> doInvoke(Request<Input> request, RequestConfig requestConfig, ExecutionContext executionContext, HttpResponseHandler<Output> responseHandler, HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {
        request.setEndpoint(this.endpoint);
        return this.client.requestExecutionBuilder().request(request).requestConfig(requestConfig).executionContext(executionContext).errorResponseHandler(errorResponseHandler).execute(responseHandler);
    }

    private void endClientExecution(AWSRequestMetrics awsRequestMetrics, RequestConfig requestConfig, Request<?> request, Response<?> response) {
        if (request != null) {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            awsRequestMetrics.getTimingInfo().endTiming();
            RequestMetricCollector metricCollector = this.findRequestMetricCollector(requestConfig);
            metricCollector.collectMetrics(request, response);
            awsRequestMetrics.log();
        }

    }

    private RequestMetricCollector findRequestMetricCollector(RequestConfig requestConfig) {
        RequestMetricCollector reqLevelMetricsCollector = requestConfig.getRequestMetricsCollector();
        if (reqLevelMetricsCollector != null) {
            return reqLevelMetricsCollector;
        } else {
            return this.clientLevelMetricCollector != null ? this.clientLevelMetricCollector : AwsSdkMetrics.getRequestMetricCollector();
        }
    }
}