/**
 * Marshaller for {@link WebRobot.Cli.Sdk.model.ProjectSchedule} (Jersey schedule JSON body).
 */
package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.ProtocolMarshaller;

import WebRobot.Cli.Sdk.model.ProjectSchedule;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectScheduleMarshaller {

    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> CRONSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cronSchedule").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enabled").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timezone").build();
    private static final MarshallingInfo<String> NEXTEXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextExecution").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> CRONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cronJobName").build();
    private static final MarshallingInfo<Boolean> CRONJOBACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cronJobActive").build();
    private static final MarshallingInfo<String> EXECUTIONREQUESTJSON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRequestJson").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("message").build();

    private static final ProjectScheduleMarshaller instance = new ProjectScheduleMarshaller();

    public static ProjectScheduleMarshaller getInstance() {
        return instance;
    }

    public void marshall(ProjectSchedule schedule, ProtocolMarshaller protocolMarshaller) {
        if (schedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }
        try {
            protocolMarshaller.marshall(schedule.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(schedule.getCronSchedule(), CRONSCHEDULE_BINDING);
            protocolMarshaller.marshall(schedule.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(schedule.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(schedule.getNextExecution(), NEXTEXECUTION_BINDING);
            protocolMarshaller.marshall(schedule.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(schedule.getCronJobName(), CRONJOBNAME_BINDING);
            protocolMarshaller.marshall(schedule.getCronJobActive(), CRONJOBACTIVE_BINDING);
            protocolMarshaller.marshall(schedule.getExecutionRequestJson(), EXECUTIONREQUESTJSON_BINDING);
            protocolMarshaller.marshall(schedule.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }
}
