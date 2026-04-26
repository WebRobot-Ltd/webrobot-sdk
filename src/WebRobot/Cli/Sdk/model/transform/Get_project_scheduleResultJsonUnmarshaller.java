package WebRobot.Cli.Sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import WebRobot.Cli.Sdk.model.Get_project_scheduleResult;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_project_scheduleResultJsonUnmarshaller implements Unmarshaller<Get_project_scheduleResult, JsonUnmarshallerContext> {

    public Get_project_scheduleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_project_scheduleResult result = new Get_project_scheduleResult();
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

    private static Get_project_scheduleResultJsonUnmarshaller instance;

    public static Get_project_scheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_project_scheduleResultJsonUnmarshaller();
        return instance;
    }
}
