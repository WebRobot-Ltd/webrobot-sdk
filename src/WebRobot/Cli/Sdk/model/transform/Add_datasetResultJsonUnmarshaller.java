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
 * Add_datasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Add_datasetResultJsonUnmarshaller implements Unmarshaller<Add_datasetResult, JsonUnmarshallerContext> {

    public Add_datasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Add_datasetResult add_datasetResult = new Add_datasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return add_datasetResult;
        }

        while (true) {
            if (token == null)
                break;

            add_datasetResult.setDataset(DatasetJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return add_datasetResult;
    }

    private static Add_datasetResultJsonUnmarshaller instance;

    public static Add_datasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Add_datasetResultJsonUnmarshaller();
        return instance;
    }
}
