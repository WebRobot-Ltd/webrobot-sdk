/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import WebRobot.Cli.Sdk.custom.ApiGatewayProtocolFactoryImplTest;
import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import WebRobot.Cli.Sdk.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Add_scriptRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Add_scriptRequestProtocolMarshaller implements Marshaller<Request<Add_scriptRequest>, Add_scriptRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/test/webrobot/api/scripts/{projectId}/{botId}").httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(true)
            .hasPayloadMembers(true).serviceName("WebRobotCliSdk").build();

    private final ApiGatewayProtocolFactoryImplTest protocolFactory;

    public Add_scriptRequestProtocolMarshaller(ApiGatewayProtocolFactoryImplTest protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Add_scriptRequest> marshall(Add_scriptRequest add_scriptRequest) {

        if (add_scriptRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Add_scriptRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    add_scriptRequest);

            protocolMarshaller.startMarshalling();
            Add_scriptRequestMarshaller.getInstance().marshall(add_scriptRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
