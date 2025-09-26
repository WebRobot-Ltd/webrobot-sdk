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
 * Get_page_from_idResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_page_from_idResultJsonUnmarshaller implements Unmarshaller<Get_page_from_idResult, JsonUnmarshallerContext> {

    public Get_page_from_idResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_page_from_idResult get_page_from_idResult = new Get_page_from_idResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_page_from_idResult;
        }

        while (true) {
            if (token == null)
                break;

            get_page_from_idResult.setPage(PageJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_page_from_idResult;
    }

    private static Get_page_from_idResultJsonUnmarshaller instance;

    public static Get_page_from_idResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_page_from_idResultJsonUnmarshaller();
        return instance;
    }
}
