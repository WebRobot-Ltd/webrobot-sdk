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
 * Get_list_versions_job_intervalRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_list_versions_job_intervalRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("version").build();

    private static final Get_list_versions_job_intervalRequestMarshaller instance = new Get_list_versions_job_intervalRequestMarshaller();

    public static Get_list_versions_job_intervalRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Get_list_versions_job_intervalRequest get_list_versions_job_intervalRequest, ProtocolMarshaller protocolMarshaller) {

        if (get_list_versions_job_intervalRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(get_list_versions_job_intervalRequest.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
