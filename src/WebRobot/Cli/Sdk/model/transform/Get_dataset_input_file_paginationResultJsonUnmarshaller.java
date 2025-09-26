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
 * Get_dataset_input_file_paginationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_file_paginationResultJsonUnmarshaller implements Unmarshaller<Get_dataset_input_file_paginationResult, JsonUnmarshallerContext> {

    public Get_dataset_input_file_paginationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_dataset_input_file_paginationResult get_dataset_input_file_paginationResult = new Get_dataset_input_file_paginationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_dataset_input_file_paginationResult;
        }

        while (true) {
            if (token == null)
                break;

            get_dataset_input_file_paginationResult.setListRecords(ListRecordsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_dataset_input_file_paginationResult;
    }

    private static Get_dataset_input_file_paginationResultJsonUnmarshaller instance;

    public static Get_dataset_input_file_paginationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_dataset_input_file_paginationResultJsonUnmarshaller();
        return instance;
    }
}
