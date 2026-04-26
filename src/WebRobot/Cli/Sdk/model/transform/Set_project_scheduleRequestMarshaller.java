package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.ProtocolMarshaller;
import com.amazonaws.protocol.StructuredPojo;

import WebRobot.Cli.Sdk.model.Set_project_scheduleRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Set_project_scheduleRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("projectId").build();

    private static final Set_project_scheduleRequestMarshaller instance = new Set_project_scheduleRequestMarshaller();

    public static Set_project_scheduleRequestMarshaller getInstance() {
        return instance;
    }

    public void marshall(Set_project_scheduleRequest request, ProtocolMarshaller protocolMarshaller) {
        if (request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }
        try {
            protocolMarshaller.marshall(request.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(request.getProjectId(), PROJECTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }
}
