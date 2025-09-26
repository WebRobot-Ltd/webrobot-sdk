/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import WebRobot.Cli.Sdk.model.Get_output_fileResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;

import javax.annotation.Generated;

import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * Get_output_fileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_output_fileResultJsonUnmarshaller implements Unmarshaller<Get_output_fileResult, JsonUnmarshallerContext> {

    public Get_output_fileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_output_fileResult get_output_fileResult = new Get_output_fileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_output_fileResult;
        }

        while (true) {
            if (token == null)
                break;

            get_output_fileResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_output_fileResult;
    }

    private static Get_output_fileResultJsonUnmarshaller instance;

    public static Get_output_fileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_output_fileResultJsonUnmarshaller();
        return instance;
    }
}
