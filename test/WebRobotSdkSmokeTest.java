import eu.webrobot.openapi.client.api.DefaultApi;
import org.junit.Assert;
import org.junit.Test;
import WebRobot.Cli.Sdk.openapi.OpenApiSdkAdapter;

/** Sanity check: OpenAPI client + adapter compile and wire after legacy removal. */
public class WebRobotSdkSmokeTest {

    @Test
    public void openApiAdapterExposesDefaultApi() {
        OpenApiSdkAdapter adapter = new OpenApiSdkAdapter("https://api.webrobot.eu");
        DefaultApi api = adapter.api();
        Assert.assertNotNull(api);
    }
}
