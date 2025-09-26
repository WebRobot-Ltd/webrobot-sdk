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
 * Delete_dataset_version__from_idResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delete_dataset_version__from_idResultJsonUnmarshaller implements Unmarshaller<Delete_dataset_version__from_idResult, JsonUnmarshallerContext> {

    public Delete_dataset_version__from_idResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delete_dataset_version__from_idResult delete_dataset_version__from_idResult = new Delete_dataset_version__from_idResult();

        return delete_dataset_version__from_idResult;
    }

    private static Delete_dataset_version__from_idResultJsonUnmarshaller instance;

    public static Delete_dataset_version__from_idResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Delete_dataset_version__from_idResultJsonUnmarshaller();
        return instance;
    }
}
