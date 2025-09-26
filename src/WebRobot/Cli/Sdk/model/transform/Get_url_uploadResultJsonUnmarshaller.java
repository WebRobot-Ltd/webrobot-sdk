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
 * Get_url_uploadResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_url_uploadResultJsonUnmarshaller implements Unmarshaller<Get_url_uploadResult, JsonUnmarshallerContext> {

    public Get_url_uploadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_url_uploadResult get_url_uploadResult = new Get_url_uploadResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_url_uploadResult;
        }

        while (true) {
            if (token == null)
                break;

            get_url_uploadResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_url_uploadResult;
    }

    private static Get_url_uploadResultJsonUnmarshaller instance;

    public static Get_url_uploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_url_uploadResultJsonUnmarshaller();
        return instance;
    }
}
