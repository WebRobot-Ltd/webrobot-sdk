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
 * Add_attributesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Add_attributesResultJsonUnmarshaller implements Unmarshaller<Add_attributesResult, JsonUnmarshallerContext> {

    public Add_attributesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Add_attributesResult add_attributesResult = new Add_attributesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return add_attributesResult;
        }

        while (true) {
            if (token == null)
                break;

            add_attributesResult.setConceptAttribute(ConceptAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return add_attributesResult;
    }

    private static Add_attributesResultJsonUnmarshaller instance;

    public static Add_attributesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Add_attributesResultJsonUnmarshaller();
        return instance;
    }
}
