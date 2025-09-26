package WebRobot.Cli.Sdk.custom;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;

@SdkInternalApi
class AwsErrorResponseHandlerTest implements HttpResponseHandler<AmazonServiceException> {
    private final HttpResponseHandler<AmazonServiceException> delegate;
    private final AWSRequestMetrics awsRequestMetrics;

    AwsErrorResponseHandlerTest(HttpResponseHandler<AmazonServiceException> errorResponseHandler, AWSRequestMetrics awsRequestMetrics) {
        this.delegate = errorResponseHandler;
        this.awsRequestMetrics = awsRequestMetrics;
    }

    public AmazonServiceException handle(HttpResponse response) throws Exception {
        AmazonServiceException ase = this.handleAse(response);
        ase.setStatusCode(response.getStatusCode());
        ase.setServiceName(response.getRequest().getServiceName());
        this.awsRequestMetrics.addPropertyWith(Field.AWSRequestID, ase.getRequestId()).addPropertyWith(Field.AWSErrorCode, ase.getErrorCode()).addPropertyWith(Field.StatusCode, ase.getStatusCode());
        return ase;
    }

    private AmazonServiceException handleAse(HttpResponse response) throws Exception {
        int statusCode = response.getStatusCode();

        try {
            return (AmazonServiceException)this.delegate.handle(response);
        } catch (InterruptedException var5) {
            throw var5;
        } catch (Exception var6) {
            AmazonServiceException exception;
            if (statusCode == 413) {
                exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(response.getRequest().getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Client);
                exception.setErrorCode("Request entity too large");
                return exception;
            } else if (statusCode >= 500 && statusCode < 600) {
                exception = new AmazonServiceException(response.getStatusText());
                exception.setServiceName(response.getRequest().getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(ErrorType.Service);
                exception.setErrorCode(response.getStatusText());
                return exception;
            } else {
                throw var6;
            }
        }
    }

    public boolean needsConnectionLeftOpen() {
        return this.delegate.needsConnectionLeftOpen();
    }
}
