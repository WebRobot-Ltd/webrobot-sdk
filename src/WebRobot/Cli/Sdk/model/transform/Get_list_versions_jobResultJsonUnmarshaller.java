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
 * Get_list_versions_jobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_list_versions_jobResultJsonUnmarshaller implements Unmarshaller<Get_list_versions_jobResult, JsonUnmarshallerContext> {

    public Get_list_versions_jobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        Get_list_versions_jobResult get_list_versions_jobResult = new Get_list_versions_jobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return get_list_versions_jobResult;
        }

        while (true) {
            if (token == null)
                break;

            get_list_versions_jobResult.setListDatasetVersions(ListDatasetVersionsJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return get_list_versions_jobResult;
    }

    private static Get_list_versions_jobResultJsonUnmarshaller instance;

    public static Get_list_versions_jobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Get_list_versions_jobResultJsonUnmarshaller();
        return instance;
    }
}
