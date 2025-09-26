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
 * Export_allResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Export_allResultJsonUnmarshaller implements Unmarshaller<Export_allResult, JsonUnmarshallerContext> {

    public Export_allResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Export_allResult export_allResult = new Export_allResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return export_allResult;
        }

        while (true) {
            if (token == null)
                break;

            export_allResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return export_allResult;
    }

    private static Export_allResultJsonUnmarshaller instance;

    public static Export_allResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Export_allResultJsonUnmarshaller();
        return instance;
    }
}
