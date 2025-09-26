/**
 * null
 */
package WebRobot.Cli.Sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import WebRobot.Cli.Sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Delete_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_projectResultJsonUnmarshaller implements Unmarshaller<Delete_projectResult, JsonUnmarshallerContext> {

    public Delete_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_projectResult delete_projectResult = new Delete_projectResult();

        return delete_projectResult;
    }

    private static Delete_projectResultJsonUnmarshaller instance;

    public static Delete_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_projectResultJsonUnmarshaller();
        return instance;
    }
}
