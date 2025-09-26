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
 * Export_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Export_projectResultJsonUnmarshaller implements Unmarshaller<Export_projectResult, JsonUnmarshallerContext> {

    public Export_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Export_projectResult export_projectResult = new Export_projectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return export_projectResult;
        }

        while (true) {
            if (token == null)
                break;

            export_projectResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return export_projectResult;
    }

    private static Export_projectResultJsonUnmarshaller instance;

    public static Export_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Export_projectResultJsonUnmarshaller();
        return instance;
    }
}
