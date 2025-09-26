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
 * Get_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_datasetResultJsonUnmarshaller implements Unmarshaller<Get_datasetResult, JsonUnmarshallerContext> {

    public Get_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_datasetResult get_datasetResult = new Get_datasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_datasetResult;
        }

        while (true) {
            if (token == null)
                break;

            get_datasetResult.setDataset(DatasetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_datasetResult;
    }

    private static Get_datasetResultJsonUnmarshaller instance;

    public static Get_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_datasetResultJsonUnmarshaller();
        return instance;
    }
}
