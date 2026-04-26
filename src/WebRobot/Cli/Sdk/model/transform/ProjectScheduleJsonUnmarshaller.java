/**
 * JSON Unmarshaller for {@link WebRobot.Cli.Sdk.model.ProjectSchedule}.
 */
package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import WebRobot.Cli.Sdk.model.ProjectSchedule;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectScheduleJsonUnmarshaller implements Unmarshaller<ProjectSchedule, JsonUnmarshallerContext> {

    public ProjectSchedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProjectSchedule s = new ProjectSchedule();
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
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    s.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cronSchedule", targetDepth)) {
                    context.nextToken();
                    s.setCronSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    s.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("timezone", targetDepth)) {
                    context.nextToken();
                    s.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nextExecution", targetDepth)) {
                    context.nextToken();
                    s.setNextExecution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    s.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cronJobName", targetDepth)) {
                    context.nextToken();
                    s.setCronJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cronJobActive", targetDepth)) {
                    context.nextToken();
                    s.setCronJobActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("executionRequestJson", targetDepth)) {
                    context.nextToken();
                    s.setExecutionRequestJson(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    s.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s;
    }

    private static ProjectScheduleJsonUnmarshaller instance;

    public static ProjectScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectScheduleJsonUnmarshaller();
        return instance;
    }
}
