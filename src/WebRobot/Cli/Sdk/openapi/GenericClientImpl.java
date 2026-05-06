package WebRobot.Cli.Sdk.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import eu.webrobot.openapi.client.ApiClient;
import eu.webrobot.openapi.client.ApiException;
import eu.webrobot.openapi.client.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Default {@link GenericClient} implementation wrapping an {@link ApiClient}.
 * Package-private — instantiate via {@link OpenApiSdkAdapter#generic()}.
 */
final class GenericClientImpl implements GenericClient {

    private static final Pattern PATH_PLACEHOLDER = Pattern.compile("\\{([a-zA-Z0-9_]+)}");
    private static final TypeReference<JsonNode> JSON_NODE_REF = new TypeReference<JsonNode>() {};
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final ApiClient apiClient;

    GenericClientImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    // ── HTTP verbs ────────────────────────────────────────────────────────────

    @Override
    public JsonNode get(String path, Map<String, Object> queryParams) {
        return invokeJson("GET", path, queryParams, null);
    }

    @Override
    public JsonNode post(String path, Object body) {
        return invokeJson("POST", path, Collections.emptyMap(), body);
    }

    @Override
    public JsonNode put(String path, Object body) {
        return invokeJson("PUT", path, Collections.emptyMap(), body);
    }

    @Override
    public JsonNode patch(String path, Object body) {
        return invokeJson("PATCH", path, Collections.emptyMap(), body);
    }

    @Override
    public JsonNode delete(String path) {
        return invokeJson("DELETE", path, Collections.emptyMap(), null);
    }

    @Override
    public Stream<JsonNode> stream(String path, Map<String, Object> queryParams) {
        // The OpenAPI-generated ApiClient doesn't natively support streaming.
        // Emit the full payload as a single-element stream so callers writing
        // against this contract today degrade gracefully; a true SSE/NDJSON
        // backend can replace this without changing the public surface.
        JsonNode whole = get(path, queryParams);
        return Stream.of(whole);
    }

    @Override
    public <T> T get(String path, Map<String, Object> queryParams, Class<T> type) {
        JsonNode body = invokeJson("GET", path, queryParams, null);
        return MAPPER.convertValue(body, type);
    }

    @Override
    public <T> List<T> getList(String path, Map<String, Object> queryParams, Class<T> type) {
        JsonNode body = invokeJson("GET", path, queryParams, null);
        CollectionType listType = TypeFactory.defaultInstance().constructCollectionType(List.class, type);
        return MAPPER.convertValue(body, listType);
    }

    // ── Internals ─────────────────────────────────────────────────────────────

    private JsonNode invokeJson(String method, String rawPath, Map<String, Object> params, Object body) {
        // 1) Path templating: {key} substitutions consume entries from `params`
        Map<String, Object> remaining = new HashMap<>(params == null ? Collections.emptyMap() : params);
        String path = substitutePath(rawPath, remaining);

        // 2) Remaining params become query parameters
        List<Pair> queryParams = toPairs(remaining);

        try {
            return apiClient.invokeAPI(
                path,
                method,
                queryParams,
                /* collectionQueryParams */ Collections.emptyList(),
                /* urlQuery              */ "",
                body,
                /* headerParams          */ new HashMap<>(),
                /* cookieParams          */ new HashMap<>(),
                /* formParams            */ new HashMap<>(),
                /* accept                */ "application/json",
                /* contentType           */ "application/json",
                /* authNames             */ null,
                /* returnType            */ JSON_NODE_REF
            );
        } catch (ApiException e) {
            throw new GenericApiException(e.getCode(), e.getResponseBody(), e.getResponseHeaders(),
                    extractRequestId(e), e.getMessage(), e);
        }
    }

    private String substitutePath(String path, Map<String, Object> params) {
        Matcher m = PATH_PLACEHOLDER.matcher(path);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String key = m.group(1);
            Object value = params.remove(key);
            if (value == null) {
                throw new IllegalArgumentException(
                    "Missing value for path placeholder {" + key + "} in " + path);
            }
            m.appendReplacement(sb, Matcher.quoteReplacement(value.toString()));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private List<Pair> toPairs(Map<String, Object> params) {
        List<Pair> out = new ArrayList<>();
        if (params == null) return out;
        for (Map.Entry<String, Object> e : params.entrySet()) {
            if (e.getValue() == null) continue;
            out.addAll(apiClient.parameterToPair(e.getKey(), e.getValue()));
        }
        return out;
    }

    private static String extractRequestId(ApiException e) {
        try {
            Map<String, List<String>> hdrs = e.getResponseHeaders();
            if (hdrs == null) return null;
            List<String> ids = hdrs.get("X-Request-Id");
            if (ids == null) ids = hdrs.get("x-request-id");
            return (ids == null || ids.isEmpty()) ? null : ids.get(0);
        } catch (Throwable t) {
            return null;
        }
    }
}
