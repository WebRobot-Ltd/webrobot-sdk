/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import WebRobot.Cli.Sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Get_dataset_version_of_tasksResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_version_of_tasksResultJsonUnmarshaller implements Unmarshaller<Get_dataset_version_of_tasksResult, JsonUnmarshallerContext> {

    public Get_dataset_version_of_tasksResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_version_of_tasksResult get_dataset_version_of_tasksResult = new Get_dataset_version_of_tasksResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_version_of_tasksResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_version_of_tasksResult.setListDatasetVersions(ListDatasetVersionsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_version_of_tasksResult;
    }

    private static Get_dataset_version_of_tasksResultJsonUnmarshaller instance;

    public static Get_dataset_version_of_tasksResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_version_of_tasksResultJsonUnmarshaller();
        return instance;
    }
}
