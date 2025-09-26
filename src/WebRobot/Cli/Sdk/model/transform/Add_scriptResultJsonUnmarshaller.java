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
 * Add_scriptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Add_scriptResultJsonUnmarshaller implements Unmarshaller<Add_scriptResult, JsonUnmarshallerContext> {

    public Add_scriptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Add_scriptResult add_scriptResult = new Add_scriptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return add_scriptResult;
        }

        while (true) {
            if (token == null)
                break;

            add_scriptResult.setBotScript(BotScriptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return add_scriptResult;
    }

    private static Add_scriptResultJsonUnmarshaller instance;

    public static Add_scriptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Add_scriptResultJsonUnmarshaller();
        return instance;
    }
}
