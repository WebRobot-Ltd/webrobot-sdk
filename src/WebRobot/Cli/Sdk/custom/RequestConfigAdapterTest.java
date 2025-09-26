package WebRobot.Cli.Sdk.custom;

import com.amazonaws.RequestClientOptions;
import com.amazonaws.RequestConfig;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.opensdk.BaseRequest;
import com.amazonaws.opensdk.SdkRequestConfig;
import java.util.List;
import java.util.Map;

@SdkProtectedApi
class RequestConfigAdapterTest extends RequestConfig {
    private final BaseRequest request;
    private final SdkRequestConfig sdkRequestConfig;
    private final RequestClientOptions clientOptions = new RequestClientOptions();

    public RequestConfigAdapterTest(BaseRequest request) {
        this.request = request;
        this.sdkRequestConfig = request.sdkRequestConfig();
    }

    public ProgressListener getProgressListener() {
        return ProgressListener.NOOP;
    }

    public RequestMetricCollector getRequestMetricsCollector() {
        return RequestMetricCollector.NONE;
    }

    public AWSCredentialsProvider getCredentialsProvider() {
        return null;
    }

    public Map<String, String> getCustomRequestHeaders() {
        return this.sdkRequestConfig.getCustomHeaders();
    }

    public Map<String, List<String>> getCustomQueryParameters() {
        return this.sdkRequestConfig.getCustomQueryParams();
    }

    public Integer getRequestTimeout() {
        return this.sdkRequestConfig.getHttpRequestTimeout();
    }

    public Integer getClientExecutionTimeout() {
        return this.sdkRequestConfig.getTotalExecutionTimeout();
    }

    public RequestClientOptions getRequestClientOptions() {
        return this.clientOptions;
    }

    public String getRequestType() {
        return this.request.getClass().getSimpleName();
    }

    public Object getOriginalRequest() {
        return this.request;
    }
}