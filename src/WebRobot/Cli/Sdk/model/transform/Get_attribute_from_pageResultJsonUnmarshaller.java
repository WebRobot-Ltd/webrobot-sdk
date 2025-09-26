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
 * Get_attribute_from_pageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_attribute_from_pageResultJsonUnmarshaller implements Unmarshaller<Get_attribute_from_pageResult, JsonUnmarshallerContext> {

    public Get_attribute_from_pageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_attribute_from_pageResult get_attribute_from_pageResult = new Get_attribute_from_pageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_attribute_from_pageResult;
        }

        while (true) {
            if (token == null)
                break;

            get_attribute_from_pageResult.setPageAttribute(PageAttributeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_attribute_from_pageResult;
    }

    private static Get_attribute_from_pageResultJsonUnmarshaller instance;

    public static Get_attribute_from_pageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_attribute_from_pageResultJsonUnmarshaller();
        return instance;
    }
}
