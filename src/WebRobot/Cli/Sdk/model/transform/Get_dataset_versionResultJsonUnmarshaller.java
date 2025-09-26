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
 * Get_dataset_versionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_versionResultJsonUnmarshaller implements Unmarshaller<Get_dataset_versionResult, JsonUnmarshallerContext> {

    public Get_dataset_versionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_versionResult get_dataset_versionResult = new Get_dataset_versionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_versionResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_versionResult.setDatasetVersion(DatasetVersionJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_versionResult;
    }

    private static Get_dataset_versionResultJsonUnmarshaller instance;

    public static Get_dataset_versionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_versionResultJsonUnmarshaller();
        return instance;
    }
}
