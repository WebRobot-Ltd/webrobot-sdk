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
 * Import_projectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Import_projectResultJsonUnmarshaller implements Unmarshaller<Import_projectResult, JsonUnmarshallerContext> {

    public Import_projectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Import_projectResult import_projectResult = new Import_projectResult();

        return import_projectResult;
    }

    private static Import_projectResultJsonUnmarshaller instance;

    public static Import_projectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Import_projectResultJsonUnmarshaller();
        return instance;
    }
}
