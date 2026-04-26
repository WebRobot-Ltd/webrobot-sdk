package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import WebRobot.Cli.Sdk.model.Set_project_scheduleResult;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Set_project_scheduleResultJsonUnmarshaller implements Unmarshaller<Set_project_scheduleResult, JsonUnmarshallerContext> {

    public Set_project_scheduleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Set_project_scheduleResult result = new Set_project_scheduleResult();
        com.fasterxml.jackson.core.JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return result;
        }
        while (true) {
            if (token == null)
                break;
            result.setSchedule(ProjectScheduleJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }
        return result;
    }

    private static Set_project_scheduleResultJsonUnmarshaller instance;

    public static Set_project_scheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Set_project_scheduleResultJsonUnmarshaller();
        return instance;
    }
}
