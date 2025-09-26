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
 * ListRecords JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecordsJsonUnmarshaller implements Unmarshaller<ListRecords, JsonUnmarshallerContext> {

    public ListRecords unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRecords listRecords = new ListRecords();

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
                if (context.testExpression("records", targetDepth)) {
                    context.nextToken();
                    listRecords.setRecords(new ListUnmarshaller<DatasetRecord>(DatasetRecordJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listRecords;
    }

    private static ListRecordsJsonUnmarshaller instance;

    public static ListRecordsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRecordsJsonUnmarshaller();
        return instance;
    }
}
