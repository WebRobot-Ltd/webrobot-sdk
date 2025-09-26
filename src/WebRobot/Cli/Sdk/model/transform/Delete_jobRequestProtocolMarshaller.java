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
 * Delete_jobRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Delete_jobRequestProtocolMarshaller implements Marshaller<Request<Delete_jobRequest>, Delete_jobRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/test/webrobot/api/jobs/{projectId}/{botId}/{datasetId}/{jobId}").httpMethodName(HttpMethodName.DELETE)
            .hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("WebRobotCliSdk").build();

    private final ApiGatewayProtocolFactoryImplTest protocolFactory;

    public Delete_jobRequestProtocolMarshaller(ApiGatewayProtocolFactoryImplTest protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Delete_jobRequest> marshall(Delete_jobRequest delete_jobRequest) {

        if (delete_jobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Delete_jobRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    delete_jobRequest);

            protocolMarshaller.startMarshalling();
            Delete_jobRequestMarshaller.getInstance().marshall(delete_jobRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
