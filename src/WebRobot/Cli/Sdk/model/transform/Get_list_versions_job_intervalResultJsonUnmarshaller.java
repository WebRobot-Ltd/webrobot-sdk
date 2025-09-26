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
 * Get_list_versions_job_intervalResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_list_versions_job_intervalResultJsonUnmarshaller implements Unmarshaller<Get_list_versions_job_intervalResult, JsonUnmarshallerContext> {

    public Get_list_versions_job_intervalResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_list_versions_job_intervalResult get_list_versions_job_intervalResult = new Get_list_versions_job_intervalResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_list_versions_job_intervalResult;
        }

        while (true) {
            if (token == null)
                break;

            get_list_versions_job_intervalResult.setListDatasetVersions(ListDatasetVersionsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_list_versions_job_intervalResult;
    }

    private static Get_list_versions_job_intervalResultJsonUnmarshaller instance;

    public static Get_list_versions_job_intervalResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_list_versions_job_intervalResultJsonUnmarshaller();
        return instance;
    }
}
