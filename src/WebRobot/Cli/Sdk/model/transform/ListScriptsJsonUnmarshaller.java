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
 * ListScripts JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScriptsJsonUnmarshaller implements Unmarshaller<ListScripts, JsonUnmarshallerContext> {

    public ListScripts unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListScripts listScripts = new ListScripts();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("scripts", targetDepth)) {
                    context.nextToken();
                    listScripts.setScripts(new ListUnmarshaller<BotScript>(BotScriptJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listScripts;
    }

    private static ListScriptsJsonUnmarshaller instance;

    public static ListScriptsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListScriptsJsonUnmarshaller();
        return instance;
    }
}
