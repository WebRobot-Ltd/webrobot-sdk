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
 * Get_all_conceptsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_all_conceptsRequestProtocolMarshaller implements Marshaller<Request<Get_all_conceptsRequest>, Get_all_conceptsRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/test/webrobot/api/inductions/{projectId}/{botId}/concepts/type/{typeAttribute}").httpMethodName(HttpMethodName.GET)
            .hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("WebRobotCliSdk").build();

    private final ApiGatewayProtocolFactoryImplTest protocolFactory;

    public Get_all_conceptsRequestProtocolMarshaller(ApiGatewayProtocolFactoryImplTest protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Get_all_conceptsRequest> marshall(Get_all_conceptsRequest get_all_conceptsRequest) {

        if (get_all_conceptsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Get_all_conceptsRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    get_all_conceptsRequest);

            protocolMarshaller.startMarshalling();
            Get_all_conceptsRequestMarshaller.getInstance().marshall(get_all_conceptsRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
