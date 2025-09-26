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
 * ListConcepts JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConceptsJsonUnmarshaller implements Unmarshaller<ListConcepts, JsonUnmarshallerContext> {

    public ListConcepts unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListConcepts listConcepts = new ListConcepts();

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
                if (context.testExpression("concepts", targetDepth)) {
                    context.nextToken();
                    listConcepts.setConcepts(new ListUnmarshaller<Concept>(ConceptJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listConcepts;
    }

    private static ListConceptsJsonUnmarshaller instance;

    public static ListConceptsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListConceptsJsonUnmarshaller();
        return instance;
    }
}
