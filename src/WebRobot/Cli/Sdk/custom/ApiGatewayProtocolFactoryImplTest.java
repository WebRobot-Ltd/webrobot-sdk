package WebRobot.Cli.Sdk.custom;
import com.amazonaws.SdkBaseException;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.opensdk.BaseResult;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayErrorResponseHandler;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayErrorUnmarshaller;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayResponseHandler;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonErrorShapeMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;
import com.amazonaws.protocol.json.JsonProtocolMarshallerBuilder;
import com.amazonaws.protocol.json.SdkJsonMarshallerFactory;
import com.amazonaws.protocol.json.SdkStructuredJsonFactory;
import com.amazonaws.protocol.json.SdkStructuredPlainJsonFactory;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.DateUtils;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static WebRobot.Cli.Sdk.custom.JsonProtocolMarshallerBuilderTest.standard;

public final class ApiGatewayProtocolFactoryImplTest implements SdkJsonMarshallerFactory {
    private static final SdkStructuredJsonFactory JSON_FACTORY;
    private static final String CONTENT_TYPE = "application/json";
    private final JsonClientMetadata metadata;


    public ApiGatewayProtocolFactoryImplTest(JsonClientMetadata metadata) {
        this.metadata = metadata;
    }

    public StructuredJsonGenerator createGenerator() {
        return JSON_FACTORY.createWriter("application/json");
    }

    public String getContentType() {
        return "application/json";
    }

    public <T> ProtocolRequestMarshaller<T> createProtocolMarshaller(OperationInfo operationInfo, T origRequest) {
        ProtocolRequestMarshaller protocolMarshaller =  JsonProtocolMarshallerBuilderTest.standard().jsonGenerator(operationInfo.hasPayloadMembers() ? this.createGenerator() : StructuredJsonGenerator.NO_OP).contentType(this.getContentType()).operationInfo(operationInfo).originalRequest(origRequest).sendExplicitNullForPayload(true).marshallerOverride(MarshallLocation.PAYLOAD, MarshallingType.DATE, (val, generator) -> {
            generator.writeValue(DateUtils.formatISO8601Date(val));
        }).build();
        return protocolMarshaller;
    }

    public <T extends BaseResult> HttpResponseHandler<T> createResponseHandler(JsonOperationMetadata operationMetadata, Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        JsonResponseHandler<T> responseHandler = JSON_FACTORY.createResponseHandler(operationMetadata, responseUnmarshaller);
        return new ApiGatewayResponseHandler(responseHandler);
    }

    public HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorResponseMetadata errorResponsMetadata) {
        return new ApiGatewayErrorResponseHandlerTest(this.createErrorUnmarshallers(errorResponsMetadata.getErrorShapes().stream()), SdkStructuredPlainJsonFactory.JSON_FACTORY);
    }

    private List<ApiGatewayErrorUnmarshallerTest> createErrorUnmarshallers(Stream<JsonErrorShapeMetadata> errorShapeMetadata) {
        List<ApiGatewayErrorUnmarshallerTest> errorUnmarshallers = (List)errorShapeMetadata.map(this::createErrorUnmarshaller).collect(Collectors.toList());

        Class<? extends RuntimeException>  exception =  this.metadata.getBaseServiceExceptionClass();
        errorUnmarshallers.add(new ApiGatewayErrorUnmarshallerTest(exception,Optional.empty()));
        return errorUnmarshallers;
    }

    private ApiGatewayErrorUnmarshallerTest createErrorUnmarshaller(JsonErrorShapeMetadata errorShape) {
        return new ApiGatewayErrorUnmarshallerTest(errorShape.getModeledClass(), Optional.of(errorShape.getHttpStatusCode()));
    }

    static {
        JSON_FACTORY = SdkStructuredPlainJsonFactory.SDK_JSON_FACTORY;
    }
}