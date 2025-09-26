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
 * Update_scriptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_scriptResultJsonUnmarshaller implements Unmarshaller<Update_scriptResult, JsonUnmarshallerContext> {

    public Update_scriptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_scriptResult update_scriptResult = new Update_scriptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_scriptResult;
        }

        while (true) {
            if (token == null)
                break;

            update_scriptResult.setBotScript(BotScriptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_scriptResult;
    }

    private static Update_scriptResultJsonUnmarshaller instance;

    public static Update_scriptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_scriptResultJsonUnmarshaller();
        return instance;
    }
}
