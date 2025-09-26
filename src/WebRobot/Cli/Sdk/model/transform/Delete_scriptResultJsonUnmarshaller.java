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
 * Delete_scriptResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_scriptResultJsonUnmarshaller implements Unmarshaller<Delete_scriptResult, JsonUnmarshallerContext> {

    public Delete_scriptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_scriptResult delete_scriptResult = new Delete_scriptResult();

        return delete_scriptResult;
    }

    private static Delete_scriptResultJsonUnmarshaller instance;

    public static Delete_scriptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_scriptResultJsonUnmarshaller();
        return instance;
    }
}
