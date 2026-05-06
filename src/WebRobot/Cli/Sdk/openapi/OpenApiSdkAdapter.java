package WebRobot.Cli.Sdk.openapi;

import eu.webrobot.openapi.client.ApiClient;
import eu.webrobot.openapi.client.api.DefaultApi;

/**
 * Facade for the OpenAPI-generated client (Jersey-aligned REST API).
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

    /**
     * Generic, endpoint-agnostic JSON client. Use this to call any REST endpoint
     * without a typed wrapper — the CLI host wires this into its public CLI
     * plugin SDK so partner plugins can call any platform endpoint without
     * pulling proprietary types.
     *
     * @since 0.3.13
     */
    public GenericClient generic() {
        return new GenericClientImpl(this.apiClient);
    }
}
