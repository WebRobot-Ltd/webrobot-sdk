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
 * Stop_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stop_jobResultJsonUnmarshaller implements Unmarshaller<Stop_jobResult, JsonUnmarshallerContext> {

    public Stop_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stop_jobResult stop_jobResult = new Stop_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return stop_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            stop_jobResult.setJob(JobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return stop_jobResult;
    }

    private static Stop_jobResultJsonUnmarshaller instance;

    public static Stop_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Stop_jobResultJsonUnmarshaller();
        return instance;
    }
}
