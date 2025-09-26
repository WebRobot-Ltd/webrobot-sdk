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
 * Upload_fileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Upload_fileResultJsonUnmarshaller implements Unmarshaller<Upload_fileResult, JsonUnmarshallerContext> {

    public Upload_fileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Upload_fileResult upload_fileResult = new Upload_fileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return upload_fileResult;
        }

        while (true) {
            if (token == null)
                break;

            upload_fileResult.setStringResult(StringResultJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return upload_fileResult;
    }

    private static Upload_fileResultJsonUnmarshaller instance;

    public static Upload_fileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Upload_fileResultJsonUnmarshaller();
        return instance;
    }
}
