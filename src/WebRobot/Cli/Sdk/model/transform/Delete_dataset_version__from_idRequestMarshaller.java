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
 * Delete_dataset_version__from_idRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Delete_dataset_version__from_idRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> VERSIONSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("versionsetId").build();

    private static final Delete_dataset_version__from_idRequestMarshaller instance = new Delete_dataset_version__from_idRequestMarshaller();

    public static Delete_dataset_version__from_idRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Delete_dataset_version__from_idRequest delete_dataset_version__from_idRequest, ProtocolMarshaller protocolMarshaller) {

        if (delete_dataset_version__from_idRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(delete_dataset_version__from_idRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(delete_dataset_version__from_idRequest.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(delete_dataset_version__from_idRequest.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(delete_dataset_version__from_idRequest.getVersionsetId(), VERSIONSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
