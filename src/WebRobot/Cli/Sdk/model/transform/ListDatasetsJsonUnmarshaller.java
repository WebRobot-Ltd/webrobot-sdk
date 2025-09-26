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
 * ListDatasets JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetsJsonUnmarshaller implements Unmarshaller<ListDatasets, JsonUnmarshallerContext> {

    public ListDatasets unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListDatasets listDatasets = new ListDatasets();

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
                if (context.testExpression("datasets", targetDepth)) {
                    context.nextToken();
                    listDatasets.setDatasets(new ListUnmarshaller<Dataset>(DatasetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listDatasets;
    }

    private static ListDatasetsJsonUnmarshaller instance;

    public static ListDatasetsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListDatasetsJsonUnmarshaller();
        return instance;
    }
}
