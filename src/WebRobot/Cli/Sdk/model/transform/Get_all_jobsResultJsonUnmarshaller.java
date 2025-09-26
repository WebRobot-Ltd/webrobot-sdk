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
 * Get_all_jobsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_jobsResultJsonUnmarshaller implements Unmarshaller<Get_all_jobsResult, JsonUnmarshallerContext> {

    public Get_all_jobsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_jobsResult get_all_jobsResult = new Get_all_jobsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_jobsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_jobsResult.setListJobs(ListJobsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_all_jobsResult;
    }

    private static Get_all_jobsResultJsonUnmarshaller instance;

    public static Get_all_jobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_jobsResultJsonUnmarshaller();
        return instance;
    }
}
