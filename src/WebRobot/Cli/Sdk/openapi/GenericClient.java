package WebRobot.Cli.Sdk.openapi;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Generic, endpoint-agnostic HTTP facade over the OpenAPI-generated
 * {@link eu.webrobot.openapi.client.ApiClient}. Hides JAX-RS / Pair / TypeReference
 * details so callers (CLI host, partner CLI plugins via the public CLI SDK,
 * ad-hoc Java consumers) work in plain JSON.
 *
 * <p>Shape-identical to {@code eu.webrobot.cli.sdk.WebroApiClient} in the public
 * CLI plugin SDK so the CLI host can implement the public interface by
 * one-line-delegating to a {@code GenericClient} instance.
 *
 * <h3>Path templating</h3>
 * Path placeholders {@code {name}} are substituted from {@code queryParams}
 * before the request is sent; matching keys are removed from the query string.
 *
 * @since 0.3.13
 */
public interface GenericClient {

    JsonNode get(String path, Map<String, Object> queryParams);

    JsonNode post(String path, Object body);

    JsonNode put(String path, Object body);

    JsonNode patch(String path, Object body);

    JsonNode delete(String path);

    /**
     * Streaming GET for SSE / NDJSON responses.
     * Closing the returned stream cancels the underlying request.
     */
    Stream<JsonNode> stream(String path, Map<String, Object> queryParams);

    /** Typed sugar — Jackson maps the response body to {@code type}. */
    <T> T get(String path, Map<String, Object> queryParams, Class<T> type);

    /** Typed sugar for endpoints returning a JSON array. */
    <T> List<T> getList(String path, Map<String, Object> queryParams, Class<T> type);
}
