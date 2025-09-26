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
 * Get_all_datasetsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_datasetsResultJsonUnmarshaller implements Unmarshaller<Get_all_datasetsResult, JsonUnmarshallerContext> {

    public Get_all_datasetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_all_datasetsResult get_all_datasetsResult = new Get_all_datasetsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_all_datasetsResult;
        }

        while (true) {
            if (token == null)
                break;

            get_all_datasetsResult.setListDatasets(ListDatasetsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_all_datasetsResult;
    }

    private static Get_all_datasetsResultJsonUnmarshaller instance;

    public static Get_all_datasetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_all_datasetsResultJsonUnmarshaller();
        return instance;
    }
}
