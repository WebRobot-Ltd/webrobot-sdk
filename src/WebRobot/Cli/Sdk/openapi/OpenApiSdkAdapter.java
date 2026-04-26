package WebRobot.Cli.Sdk.openapi;

import eu.webrobot.openapi.client.ApiClient;
import eu.webrobot.openapi.client.api.DefaultApi;

/**
 * Facade for the OpenAPI-generated client (Jersey-aligned). Legacy calls remain on {@link WebRobot.Cli.Sdk.WebRobotCliSdk}.
 * <p>
 * Base URL defaults to production {@code https://api.webrobot.eu}.
 */
public class OpenApiSdkAdapter {

    private final ApiClient apiClient;
    private final DefaultApi defaultApi;

    public OpenApiSdkAdapter() {
        this("https://api.webrobot.eu");
    }

    public OpenApiSdkAdapter(String basePath) {
        this.apiClient = new ApiClient();
        this.apiClient.setBasePath(basePath);
        this.defaultApi = new DefaultApi(this.apiClient);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /** All operations from the sanitized spec (single generated API class). */
    public DefaultApi api() {
        return defaultApi;
    }

    /** Set API key (or Bearer) as an HTTP default header (e.g. {@code X-API-Key}). */
    public OpenApiSdkAdapter withApiKey(String headerName, String apiKey) {
        apiClient.addDefaultHeader(headerName, apiKey);
        return this;
    }
}
