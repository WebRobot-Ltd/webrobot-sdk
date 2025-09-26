/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import WebRobot.Cli.Sdk.model.Get_output_fileRequest;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.*;

import javax.annotation.Generated;

/**
 * Get_output_fileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Get_output_fileRequestMarshaller {

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

    private static final Get_output_fileRequestMarshaller instance = new Get_output_fileRequestMarshaller();

    public static Get_output_fileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Get_output_fileRequest get_output_fileRequest, ProtocolMarshaller protocolMarshaller) {

        if (get_output_fileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(get_output_fileRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(get_output_fileRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(get_output_fileRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(get_output_fileRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(get_output_fileRequest.getTimePeriod(), TIMEPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
