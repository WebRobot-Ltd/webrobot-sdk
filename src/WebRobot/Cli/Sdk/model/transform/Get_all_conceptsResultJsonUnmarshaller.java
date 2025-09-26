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
 * Get_all_conceptsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_conceptsResultJsonUnmarshaller implements Unmarshaller<Get_all_conceptsResult, JsonUnmarshallerContext> {

    public Get_all_conceptsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_conceptsResult get_all_conceptsResult = new Get_all_conceptsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_conceptsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_conceptsResult.setListConcepts(ListConceptsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_all_conceptsResult;
    }

    private static Get_all_conceptsResultJsonUnmarshaller instance;

    public static Get_all_conceptsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_conceptsResultJsonUnmarshaller();
        return instance;
    }
}
