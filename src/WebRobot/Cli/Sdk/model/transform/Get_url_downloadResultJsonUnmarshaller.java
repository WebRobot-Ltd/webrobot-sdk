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
 * Get_url_downloadResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_url_downloadResultJsonUnmarshaller implements Unmarshaller<Get_url_downloadResult, JsonUnmarshallerContext> {

    public Get_url_downloadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_url_downloadResult get_url_downloadResult = new Get_url_downloadResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_url_downloadResult;
        }

        while (true) {
            if (token == null)
                break;

            get_url_downloadResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_url_downloadResult;
    }

    private static Get_url_downloadResultJsonUnmarshaller instance;

    public static Get_url_downloadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_url_downloadResultJsonUnmarshaller();
        return instance;
    }
}
