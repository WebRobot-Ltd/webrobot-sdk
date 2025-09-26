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
 * Get_all_attributesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_all_attributesRequestProtocolMarshaller implements Marshaller<Request<Get_all_attributesRequest>, Get_all_attributesRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/test/webrobot/api/inductions/{projectId}/{botId}/concepts/{conceptId}/attributes/type/{typeAttribute}")
            .httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("WebRobotCliSdk").build();

    private final ApiGatewayProtocolFactoryImplTest protocolFactory;

    public Get_all_attributesRequestProtocolMarshaller(ApiGatewayProtocolFactoryImplTest protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<Get_all_attributesRequest> marshall(Get_all_attributesRequest get_all_attributesRequest) {

        if (get_all_attributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<Get_all_attributesRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    get_all_attributesRequest);

            protocolMarshaller.startMarshalling();
            Get_all_attributesRequestMarshaller.getInstance().marshall(get_all_attributesRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
