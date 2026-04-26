package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.ProtocolMarshaller;

import WebRobot.Cli.Sdk.model.Get_project_scheduleRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_project_scheduleRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("projectId").build();

    private static final Get_project_scheduleRequestMarshaller instance = new Get_project_scheduleRequestMarshaller();

    public static Get_project_scheduleRequestMarshaller getInstance() {
        return instance;
    }

    public void marshall(Get_project_scheduleRequest request, ProtocolMarshaller protocolMarshaller) {
        if (request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }
        try {
            protocolMarshaller.marshall(request.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }
}
