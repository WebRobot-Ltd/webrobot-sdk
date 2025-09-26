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
 * ListProjects JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectsJsonUnmarshaller implements Unmarshaller<ListProjects, JsonUnmarshallerContext> {

    public ListProjects unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListProjects listProjects = new ListProjects();

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
                if (context.testExpression("projects", targetDepth)) {
                    context.nextToken();
                    listProjects.setProjects(new ListUnmarshaller<Project>(ProjectJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listProjects;
    }

    private static ListProjectsJsonUnmarshaller instance;

    public static ListProjectsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListProjectsJsonUnmarshaller();
        return instance;
    }
}
