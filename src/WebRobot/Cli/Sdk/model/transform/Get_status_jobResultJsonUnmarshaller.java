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
 * Get_status_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_status_jobResultJsonUnmarshaller implements Unmarshaller<Get_status_jobResult, JsonUnmarshallerContext> {

    public Get_status_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_status_jobResult get_status_jobResult = new Get_status_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_status_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            get_status_jobResult.setStatusJob(StatusJobJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_status_jobResult;
    }

    private static Get_status_jobResultJsonUnmarshaller instance;

    public static Get_status_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_status_jobResultJsonUnmarshaller();
        return instance;
    }
}
