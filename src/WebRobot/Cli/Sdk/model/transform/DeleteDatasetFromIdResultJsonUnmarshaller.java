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
 * DeleteDatasetFromIdResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatasetFromIdResultJsonUnmarshaller implements Unmarshaller<DeleteDatasetFromIdResult, JsonUnmarshallerContext> {

    public DeleteDatasetFromIdResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteDatasetFromIdResult deleteDatasetFromIdResult = new DeleteDatasetFromIdResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteDatasetFromIdResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteDatasetFromIdResult.setDataset(DatasetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteDatasetFromIdResult;
    }

    private static DeleteDatasetFromIdResultJsonUnmarshaller instance;

    public static DeleteDatasetFromIdResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteDatasetFromIdResultJsonUnmarshaller();
        return instance;
    }
}
