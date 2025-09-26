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
 * Update_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update_jobResultJsonUnmarshaller implements Unmarshaller<Update_jobResult, JsonUnmarshallerContext> {

    public Update_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Update_jobResult update_jobResult = new Update_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return update_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            update_jobResult.setJob(JobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return update_jobResult;
    }

    private static Update_jobResultJsonUnmarshaller instance;

    public static Update_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Update_jobResultJsonUnmarshaller();
        return instance;
    }
}
