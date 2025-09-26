/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import WebRobot.Cli.Sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetVersionMarshaller {

    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apikey").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> INPUTDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputdatabaseName").build();
    private static final MarshallingInfo<List> INPUTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputfields").build();
    private static final MarshallingInfo<String> INPUTTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputtableName").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OUTPUTDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputdatabaseName").build();
    private static final MarshallingInfo<List> OUTPUTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputfields").build();
    private static final MarshallingInfo<String> OUTPUTTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputtableName").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TARGETPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetPath").build();
    private static final MarshallingInfo<String> TARGETPATHOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetPathOutput").build();
    private static final MarshallingInfo<String> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timePeriod").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final DatasetVersionMarshaller instance = new DatasetVersionMarshaller();

    public static DatasetVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetVersion datasetVersion, ProtocolMarshaller protocolMarshaller) {

        if (datasetVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetVersion.getApikey(), APIKEY_BINDING);
            protocolMarshaller.marshall(datasetVersion.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(datasetVersion.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(datasetVersion.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(datasetVersion.getId(), ID_BINDING);
            protocolMarshaller.marshall(datasetVersion.getInputdatabaseName(), INPUTDATABASENAME_BINDING);
            protocolMarshaller.marshall(datasetVersion.getInputfields(), INPUTFIELDS_BINDING);
            protocolMarshaller.marshall(datasetVersion.getInputtableName(), INPUTTABLENAME_BINDING);
            protocolMarshaller.marshall(datasetVersion.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(datasetVersion.getName(), NAME_BINDING);
            protocolMarshaller.marshall(datasetVersion.getOutputdatabaseName(), OUTPUTDATABASENAME_BINDING);
            protocolMarshaller.marshall(datasetVersion.getOutputfields(), OUTPUTFIELDS_BINDING);
            protocolMarshaller.marshall(datasetVersion.getOutputtableName(), OUTPUTTABLENAME_BINDING);
            protocolMarshaller.marshall(datasetVersion.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(datasetVersion.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(datasetVersion.getTargetPath(), TARGETPATH_BINDING);
            protocolMarshaller.marshall(datasetVersion.getTargetPathOutput(), TARGETPATHOUTPUT_BINDING);
            protocolMarshaller.marshall(datasetVersion.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(datasetVersion.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
