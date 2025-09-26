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
 * GetBotFromIdResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotFromIdResultJsonUnmarshaller implements Unmarshaller<GetBotFromIdResult, JsonUnmarshallerContext> {

    public GetBotFromIdResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBotFromIdResult getBotFromIdResult = new GetBotFromIdResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBotFromIdResult;
        }

        while (true) {
            if (token == null)
                break;

            getBotFromIdResult.setBot(BotJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getBotFromIdResult;
    }

    private static GetBotFromIdResultJsonUnmarshaller instance;

    public static GetBotFromIdResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBotFromIdResultJsonUnmarshaller();
        return instance;
    }
}
