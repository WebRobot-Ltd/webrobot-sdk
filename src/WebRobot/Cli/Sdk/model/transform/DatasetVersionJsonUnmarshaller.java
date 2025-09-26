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
 * DatasetVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetVersionJsonUnmarshaller implements Unmarshaller<DatasetVersion, JsonUnmarshallerContext> {

    public DatasetVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatasetVersion datasetVersion = new DatasetVersion();

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
                if (context.testExpression("apikey", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setApikey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputdatabaseName", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setInputdatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputfields", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setInputfields(new ListUnmarshaller<AthenaField>(AthenaFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("inputtableName", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setInputtableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputdatabaseName", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setOutputdatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputfields", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setOutputfields(new ListUnmarshaller<AthenaField>(AthenaFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("outputtableName", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setOutputtableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetPath", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setTargetPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetPathOutput", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setTargetPathOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timePeriod", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setTimePeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    datasetVersion.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return datasetVersion;
    }

    private static DatasetVersionJsonUnmarshaller instance;

    public static DatasetVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetVersionJsonUnmarshaller();
        return instance;
    }
}
