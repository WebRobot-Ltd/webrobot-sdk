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
 * Get_output_sizeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_output_sizeResultJsonUnmarshaller implements Unmarshaller<Get_output_sizeResult, JsonUnmarshallerContext> {

    public Get_output_sizeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_output_sizeResult get_output_sizeResult = new Get_output_sizeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_output_sizeResult;
        }

        while (true) {
            if (token == null)
                break;

            get_output_sizeResult.setDatasetSize(DatasetSizeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_output_sizeResult;
    }

    private static Get_output_sizeResultJsonUnmarshaller instance;

    public static Get_output_sizeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_output_sizeResultJsonUnmarshaller();
        return instance;
    }
}
