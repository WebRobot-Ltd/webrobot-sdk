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
 * Get_output_file_paginationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_output_file_paginationResultJsonUnmarshaller implements Unmarshaller<Get_output_file_paginationResult, JsonUnmarshallerContext> {

    public Get_output_file_paginationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_output_file_paginationResult get_output_file_paginationResult = new Get_output_file_paginationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_output_file_paginationResult;
        }

        while (true) {
            if (token == null)
                break;

            get_output_file_paginationResult.setListRecords(ListRecordsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_output_file_paginationResult;
    }

    private static Get_output_file_paginationResultJsonUnmarshaller instance;

    public static Get_output_file_paginationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_output_file_paginationResultJsonUnmarshaller();
        return instance;
    }
}
