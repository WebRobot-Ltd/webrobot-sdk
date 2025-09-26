package WebRobot.Cli.Sdk.custom;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;

@SdkInternalApi
@ThreadSafe
public class ApiGatewayErrorUnmarshallerTest implements Unmarshaller<BaseException, JsonNode> {
    private static final ObjectMapper MAPPER;
    private final Class<? extends BaseException> exceptionClass;
    private final Optional<Integer> httpStatusCode;

    public ApiGatewayErrorUnmarshallerTest(Class<? extends RuntimeException> exceptionClass, Optional<Integer> httpStatusCode) {
        this.exceptionClass = (Class)ValidationUtils.assertNotNull(exceptionClass, "exceptionClass");
        this.httpStatusCode = (Optional)ValidationUtils.assertNotNull(httpStatusCode, "httpStatusCode");
    }

    public BaseException unmarshall(JsonNode jsonContent) throws Exception {
        return (BaseException)MAPPER.treeToValue(jsonContent, this.exceptionClass);
    }

    boolean matches(int actualHttpStatusCode) {
        return (Boolean)this.httpStatusCode.map((sc) -> {
            return sc == actualHttpStatusCode;
        }).orElse(true);
    }

    static {
        MAPPER = (new ObjectMapper()).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }
}