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
 * Update_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_projectResultJsonUnmarshaller implements Unmarshaller<Update_projectResult, JsonUnmarshallerContext> {

    public Update_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_projectResult update_projectResult = new Update_projectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_projectResult;
        }

        while (true) {
            if (token == null)
                break;

            update_projectResult.setProject(ProjectJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_projectResult;
    }

    private static Update_projectResultJsonUnmarshaller instance;

    public static Update_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_projectResultJsonUnmarshaller();
        return instance;
    }
}
