/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import WebRobot.Cli.Sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Add_attributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Add_attributesRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<StructuredPojo> CONCEPTATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> CONCEPTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("conceptId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();

    private static final Add_attributesRequestMarshaller instance = new Add_attributesRequestMarshaller();

    public static Add_attributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Add_attributesRequest add_attributesRequest, ProtocolMarshaller protocolMarshaller) {

        if (add_attributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(add_attributesRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(add_attributesRequest.getConceptAttribute(), CONCEPTATTRIBUTE_BINDING);
            protocolMarshaller.marshall(add_attributesRequest.getConceptId(), CONCEPTID_BINDING);
            protocolMarshaller.marshall(add_attributesRequest.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
