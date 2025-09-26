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
 * GetScriptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScriptResultJsonUnmarshaller implements Unmarshaller<GetScriptResult, JsonUnmarshallerContext> {

    public GetScriptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetScriptResult getScriptResult = new GetScriptResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getScriptResult;
        }

        while (true) {
            if (token == null)
                break;

            getScriptResult.setBotScript(BotScriptJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getScriptResult;
    }

    private static GetScriptResultJsonUnmarshaller instance;

    public static GetScriptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetScriptResultJsonUnmarshaller();
        return instance;
    }
}
