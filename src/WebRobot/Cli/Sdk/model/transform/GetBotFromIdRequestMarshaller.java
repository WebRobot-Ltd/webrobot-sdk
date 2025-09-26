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
 * GetBotFromIdRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetBotFromIdRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();

    private static final GetBotFromIdRequestMarshaller instance = new GetBotFromIdRequestMarshaller();

    public static GetBotFromIdRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetBotFromIdRequest getBotFromIdRequest, ProtocolMarshaller protocolMarshaller) {

        if (getBotFromIdRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getBotFromIdRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(getBotFromIdRequest.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
