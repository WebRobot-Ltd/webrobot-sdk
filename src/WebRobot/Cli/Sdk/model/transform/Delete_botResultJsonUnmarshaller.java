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
 * Delete_botResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_botResultJsonUnmarshaller implements Unmarshaller<Delete_botResult, JsonUnmarshallerContext> {

    public Delete_botResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_botResult delete_botResult = new Delete_botResult();

        return delete_botResult;
    }

    private static Delete_botResultJsonUnmarshaller instance;

    public static Delete_botResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_botResultJsonUnmarshaller();
        return instance;
    }
}
