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
 * Import_allResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Import_allResultJsonUnmarshaller implements Unmarshaller<Import_allResult, JsonUnmarshallerContext> {

    public Import_allResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Import_allResult import_allResult = new Import_allResult();

        return import_allResult;
    }

    private static Import_allResultJsonUnmarshaller instance;

    public static Import_allResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Import_allResultJsonUnmarshaller();
        return instance;
    }
}
