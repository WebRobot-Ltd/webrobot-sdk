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
 * Get_dataset_input_sizeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_sizeResultJsonUnmarshaller implements Unmarshaller<Get_dataset_input_sizeResult, JsonUnmarshallerContext> {

    public Get_dataset_input_sizeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_input_sizeResult get_dataset_input_sizeResult = new Get_dataset_input_sizeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_input_sizeResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_input_sizeResult.setDatasetSize(DatasetSizeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_input_sizeResult;
    }

    private static Get_dataset_input_sizeResultJsonUnmarshaller instance;

    public static Get_dataset_input_sizeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_input_sizeResultJsonUnmarshaller();
        return instance;
    }
}
