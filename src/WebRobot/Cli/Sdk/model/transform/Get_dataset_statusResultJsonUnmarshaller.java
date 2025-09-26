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
 * Get_dataset_statusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_statusResultJsonUnmarshaller implements Unmarshaller<Get_dataset_statusResult, JsonUnmarshallerContext> {

    public Get_dataset_statusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_statusResult get_dataset_statusResult = new Get_dataset_statusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_statusResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_statusResult.setDatasetStatus(DatasetStatusJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_statusResult;
    }

    private static Get_dataset_statusResultJsonUnmarshaller instance;

    public static Get_dataset_statusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_statusResultJsonUnmarshaller();
        return instance;
    }
}
