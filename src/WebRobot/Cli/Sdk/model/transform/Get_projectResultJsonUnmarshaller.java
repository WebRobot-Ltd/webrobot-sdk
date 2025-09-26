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
 * Get_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_projectResultJsonUnmarshaller implements Unmarshaller<Get_projectResult, JsonUnmarshallerContext> {

    public Get_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_projectResult get_projectResult = new Get_projectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_projectResult;
        }

        while (true) {
            if (token == null)
                break;

            get_projectResult.setProject(ProjectJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_projectResult;
    }

    private static Get_projectResultJsonUnmarshaller instance;

    public static Get_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_projectResultJsonUnmarshaller();
        return instance;
    }
}
