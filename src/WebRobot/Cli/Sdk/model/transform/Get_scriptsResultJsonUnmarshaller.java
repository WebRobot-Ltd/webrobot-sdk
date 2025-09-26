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
 * Get_scriptsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_scriptsResultJsonUnmarshaller implements Unmarshaller<Get_scriptsResult, JsonUnmarshallerContext> {

    public Get_scriptsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_scriptsResult get_scriptsResult = new Get_scriptsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_scriptsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_scriptsResult.setListScripts(ListScriptsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_scriptsResult;
    }

    private static Get_scriptsResultJsonUnmarshaller instance;

    public static Get_scriptsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_scriptsResultJsonUnmarshaller();
        return instance;
    }
}
