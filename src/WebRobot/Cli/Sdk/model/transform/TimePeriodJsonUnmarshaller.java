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
 * TimePeriod JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimePeriodJsonUnmarshaller implements Unmarshaller<TimePeriod, JsonUnmarshallerContext> {

    public TimePeriod unmarshall(JsonUnmarshallerContext context) throws Exception {
        TimePeriod timePeriod = new TimePeriod();

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
                if (context.testExpression("endTimePeriod", targetDepth)) {
                    context.nextToken();
                    timePeriod.setEndTimePeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTimePeriod", targetDepth)) {
                    context.nextToken();
                    timePeriod.setStartTimePeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return timePeriod;
    }

    private static TimePeriodJsonUnmarshaller instance;

    public static TimePeriodJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TimePeriodJsonUnmarshaller();
        return instance;
    }
}
