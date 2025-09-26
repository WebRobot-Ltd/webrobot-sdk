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
 * Start_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Start_jobResultJsonUnmarshaller implements Unmarshaller<Start_jobResult, JsonUnmarshallerContext> {

    public Start_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Start_jobResult start_jobResult = new Start_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return start_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            start_jobResult.setJob(JobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return start_jobResult;
    }

    private static Start_jobResultJsonUnmarshaller instance;

    public static Start_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Start_jobResultJsonUnmarshaller();
        return instance;
    }
}
