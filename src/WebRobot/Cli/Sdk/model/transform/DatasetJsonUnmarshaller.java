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
 * Dataset JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetJsonUnmarshaller implements Unmarshaller<Dataset, JsonUnmarshallerContext> {

    public Dataset unmarshall(JsonUnmarshallerContext context) throws Exception {
        Dataset dataset = new Dataset();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiKey", targetDepth)) {
                    context.nextToken();
                    dataset.setApiKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attachmentName", targetDepth)) {
                    context.nextToken();
                    dataset.setAttachmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    dataset.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comments", targetDepth)) {
                    context.nextToken();
                    dataset.setComments(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("headerline", targetDepth)) {
                    context.nextToken();
                    dataset.setHeaderline(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    dataset.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    dataset.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    dataset.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourcePath", targetDepth)) {
                    context.nextToken();
                    dataset.setSourcePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    dataset.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    dataset.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versions", targetDepth)) {
                    context.nextToken();
                    dataset.setVersions(new ListUnmarshaller<DatasetVersion>(DatasetVersionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataset;
    }

    private static DatasetJsonUnmarshaller instance;

    public static DatasetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonUnmarshaller();
        return instance;
    }
}
