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
 * AthenaField JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaFieldJsonUnmarshaller implements Unmarshaller<AthenaField, JsonUnmarshallerContext> {

    public AthenaField unmarshall(JsonUnmarshallerContext context) throws Exception {
        AthenaField athenaField = new AthenaField();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    athenaField.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tipo", targetDepth)) {
                    context.nextToken();
                    athenaField.setTipo(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return athenaField;
    }

    private static AthenaFieldJsonUnmarshaller instance;

    public static AthenaFieldJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AthenaFieldJsonUnmarshaller();
        return instance;
    }
}
