package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import WebRobot.Cli.Sdk.custom.ApiGatewayProtocolFactoryImplTest;
import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.transform.Marshaller;

import WebRobot.Cli.Sdk.model.Get_project_scheduleRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_project_scheduleRequestProtocolMarshaller implements Marshaller<Request<Get_project_scheduleRequest>, Get_project_scheduleRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/test/webrobot/api/projects/id/{projectId}/schedule").httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(false)
            .hasPayloadMembers(false).serviceName("WebRobotCliSdk").build();

    private final ApiGatewayProtocolFactoryImplTest protocolFactory;

    public Get_project_scheduleRequestProtocolMarshaller(ApiGatewayProtocolFactoryImplTest protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Get_project_scheduleRequest> marshall(Get_project_scheduleRequest request) {
        if (request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }
        try {
            final ProtocolRequestMarshaller<Get_project_scheduleRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    request);
            protocolMarshaller.startMarshalling();
            Get_project_scheduleRequestMarshaller.getInstance().marshall(request, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }
}
