package WebRobot.Cli.Sdk.custom;

import com.amazonaws.SdkBaseException;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.SdkHttpMetadata;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.amazonaws.opensdk.SdkErrorHttpMetadata;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayErrorUnmarshaller;
import com.amazonaws.protocol.json.JsonContent;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SdkInternalApi
public class ApiGatewayErrorResponseHandlerTest implements HttpResponseHandler<SdkBaseException> {
    private static final Log LOG = LogFactory.getLog(ApiGatewayErrorResponseHandlerTest.class);
    private final List<ApiGatewayErrorUnmarshallerTest> unmarshallers;
    private final JsonFactory jsonFactory;
    private final JsonErrorMessageParser messageParser;

    public ApiGatewayErrorResponseHandlerTest(List<ApiGatewayErrorUnmarshallerTest> errorUnmarshallers, JsonFactory jsonFactory) {
        this.messageParser = JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER;
        this.unmarshallers = (List)ValidationUtils.assertNotNull(errorUnmarshallers, "errorUnmarshallers");
        this.jsonFactory = (JsonFactory)ValidationUtils.assertNotNull(jsonFactory, "jsonFactory");
    }

    public boolean needsConnectionLeftOpen() {
        return false;
    }

    public SdkBaseException handle(HttpResponse response) throws Exception {
        String errorContent = IOUtils.toString(response.getContent());
        JsonContent jsonContent = JsonContent.createJsonContent(response, this.jsonFactory);

        BaseException exception = this.createException(response.getStatusCode(), jsonContent);

        exception.sdkHttpMetadata(new SdkErrorHttpMetadata(SdkHttpMetadata.from(response), jsonContent.getRawContent()));
        jsonContent.getRawContent();
        exception.setMessage(errorContent);
        return (SdkBaseException)exception;
    }

    private BaseException createException(int httpStatusCode, JsonContent jsonContent) {
        return (BaseException)this.unmarshallers.stream().filter((u) -> {
            return u.matches(httpStatusCode);
        }).findFirst().map((u) -> {
            return this.safeUnmarshall(jsonContent, u);
        }).orElseThrow(this::createUnknownException);
    }

    private BaseException safeUnmarshall(JsonContent jsonContent, ApiGatewayErrorUnmarshallerTest unmarshaller) {
        try {
            return unmarshaller.unmarshall(jsonContent.getJsonNode());
        } catch (Exception var4) {
            LOG.info("Unable to unmarshall exception content", var4);
            throw new SdkClientException(var4.getCause());
        }
    }

    private SdkClientException createUnknownException() {
        return new SdkClientException("Unable to unmarshall exception response with the unmarshallers provided");
    }
}