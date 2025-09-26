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
 * ListJobs JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsJsonUnmarshaller implements Unmarshaller<ListJobs, JsonUnmarshallerContext> {

    public ListJobs unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListJobs listJobs = new ListJobs();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("jobs", targetDepth)) {
                    context.nextToken();
                    listJobs.setJobs(new ListUnmarshaller<Job>(JobJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listJobs;
    }

    private static ListJobsJsonUnmarshaller instance;

    public static ListJobsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListJobsJsonUnmarshaller();
        return instance;
    }
}
