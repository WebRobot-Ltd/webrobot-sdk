package WebRobot.Cli.Sdk.custom;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.protocol.json.JsonProtocolMarshallerBuilder;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.amazonaws.protocol.json.StructuredJsonMarshaller;
import com.amazonaws.protocol.json.internal.JsonProtocolMarshaller;
import com.amazonaws.protocol.json.internal.MarshallerRegistry;
import com.amazonaws.protocol.json.internal.NullAsEmptyBodyProtocolRequestMarshaller;
import com.amazonaws.protocol.json.internal.SimpleTypeJsonMarshallers;
import com.amazonaws.protocol.json.internal.MarshallerRegistry.Builder;

@SdkProtectedApi
public class JsonProtocolMarshallerBuilderTest<T> extends JsonProtocolMarshallerBuilder<T> {
    private StructuredJsonGenerator jsonGenerator;
    private String contentType;
    private OperationInfo operationInfo;
    private boolean sendExplicitNullForPayload;
    private T originalRequest;
    private Builder marshallerRegistry;

    public JsonProtocolMarshallerBuilderTest() {
    }

    public static <T> JsonProtocolMarshallerBuilderTest<T> standard() {
        return new JsonProtocolMarshallerBuilderTest();
    }

    public JsonProtocolMarshallerBuilderTest<T> jsonGenerator(StructuredJsonGenerator jsonGenerator) {
        this.jsonGenerator = jsonGenerator;
        return this;
    }

    public JsonProtocolMarshallerBuilderTest<T> contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public JsonProtocolMarshallerBuilderTest<T> operationInfo(OperationInfo operationInfo) {
        this.operationInfo = operationInfo;
        return this;
    }

    public JsonProtocolMarshallerBuilderTest<T> sendExplicitNullForPayload(boolean sendExplicitNullForPayload) {
        this.sendExplicitNullForPayload = sendExplicitNullForPayload;
        return this;
    }

    public JsonProtocolMarshallerBuilderTest<T> originalRequest(T originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }

    public <MarshallT> JsonProtocolMarshallerBuilderTest<T> marshallerOverride(MarshallLocation marshallLocation, MarshallingType<MarshallT> marshallingType, StructuredJsonMarshaller<MarshallT> marshaller) {
        if (this.marshallerRegistry == null) {
            this.marshallerRegistry = MarshallerRegistry.builder();
        }

        this.marshallerRegistry.addMarshaller(marshallLocation, marshallingType, SimpleTypeJsonMarshallers.adapt(marshaller));
        return this;
    }

    public ProtocolRequestMarshaller<T> build() {
        ProtocolRequestMarshaller<T> protocolMarshaller = new JsonProtocolMarshaller<T>(this.jsonGenerator, this.contentType, this.operationInfo, this.originalRequest, this.marshallerRegistry);
        return (ProtocolRequestMarshaller<T>)(this.sendExplicitNullForPayload ? protocolMarshaller : new NullAsEmptyBodyProtocolRequestMarshaller(protocolMarshaller));
    }
}
