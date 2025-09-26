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
 * GetBotFromNameResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotFromNameResultJsonUnmarshaller implements Unmarshaller<GetBotFromNameResult, JsonUnmarshallerContext> {

    public GetBotFromNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBotFromNameResult getBotFromNameResult = new GetBotFromNameResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBotFromNameResult;
        }

        while (true) {
            if (token == null)
                break;

            getBotFromNameResult.setBot(BotJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getBotFromNameResult;
    }

    private static GetBotFromNameResultJsonUnmarshaller instance;

    public static GetBotFromNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBotFromNameResultJsonUnmarshaller();
        return instance;
    }
}
