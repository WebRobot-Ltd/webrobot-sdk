package WebRobot.Cli.Sdk.agentic;

import org.json.JSONObject;
import org.json.JSONArray;
import org.apache.commons.io.IOUtils;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Minimal HTTP client to interact with the Agentic FastAPI backend
 * providing start/resume conversation capabilities.
 */
public class AgenticClient {

    public interface AuthProvider {
        Map<String, String> getHeaders();
    }

    public static class Builder {
        private String baseUrl;
        private String apiKey;
        private String bearerToken;
        private Map<String, String> extraHeaders = new HashMap<>();

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder bearerToken(String bearerToken) {
            this.bearerToken = bearerToken;
            return this;
        }

        public Builder header(String name, String value) {
            if (name != null && value != null) {
                this.extraHeaders.put(name, value);
            }
            return this;
        }

        public AgenticClient build() {
            if (this.baseUrl == null || this.baseUrl.isEmpty()) {
                throw new IllegalArgumentException("baseUrl is required");
            }
            Map<String, String> headers = new HashMap<>();
            if (this.apiKey != null && !this.apiKey.isEmpty()) {
                headers.put("X-API-Key", this.apiKey);
                headers.put("Authorization", "ApiKey " + this.apiKey);
            }
            if (this.bearerToken != null && !this.bearerToken.isEmpty()) {
                headers.put("Authorization", "Bearer " + this.bearerToken);
            }
            headers.putAll(this.extraHeaders);
            return new AgenticClient(this.baseUrl, headers);
        }
    }

    private final String baseUrl;
    private final Map<String, String> defaultHeaders;

    public AgenticClient(String baseUrl, Map<String, String> defaultHeaders) {
        this.baseUrl = baseUrl;
        this.defaultHeaders = defaultHeaders == null ? Collections.emptyMap() : new HashMap<>(defaultHeaders);
    }

    public static Builder builder() { return new Builder(); }

    public AgenticStartResponse start(AgenticStartRequest request) throws Exception {
        String url = this.baseUrl.endsWith("/") ? this.baseUrl + "agentic/start" : this.baseUrl + "/agentic/start";
        JSONObject payload = new JSONObject();
        payload.put("message", request.getMessage());
        payload.put("sessionId", request.getSessionId());
        if (request.getUserId() != null) payload.put("userId", request.getUserId());
        if (request.getMessages() != null) payload.put("messages", new JSONArray(request.getMessages()));
        if (request.getContext() != null) payload.put("context", new JSONObject(request.getContext()));
        String raw = postJson(url, payload.toString());
        return AgenticStartResponse.fromJson(raw);
    }

    public AgenticResumeResponse resume(AgenticResumeRequest request) throws Exception {
        String url = this.baseUrl.endsWith("/") ? this.baseUrl + "agentic/resume" : this.baseUrl + "/agentic/resume";
        JSONObject payload = new JSONObject();
        payload.put("execution_id", request.getExecutionId());
        payload.put("user_input", request.getUserInput());
        String raw = postJson(url, payload.toString());
        return AgenticResumeResponse.fromJson(raw);
    }

    private String postJson(String urlStr, String body) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        for (Map.Entry<String, String> e : defaultHeaders.entrySet()) {
            connection.setRequestProperty(e.getKey(), e.getValue());
        }
        try (OutputStream out = connection.getOutputStream()) {
            out.write(body.getBytes(StandardCharsets.UTF_8));
        }
        int code = connection.getResponseCode();
        String resp = IOUtils.toString(
                (code >= 200 && code < 300) ? connection.getInputStream() : connection.getErrorStream(),
                StandardCharsets.UTF_8
        );
        if (code < 200 || code >= 300) {
            throw new RuntimeException(resp);
        }
        return resp;
    }
}


