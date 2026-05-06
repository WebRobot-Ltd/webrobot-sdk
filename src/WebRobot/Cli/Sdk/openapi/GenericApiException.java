package WebRobot.Cli.Sdk.openapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Internal exception thrown by {@link GenericClient} when the underlying
 * {@link eu.webrobot.openapi.client.ApiException} fails. The CLI host translates
 * this into the public {@code eu.webrobot.cli.sdk.WebroApiException} hierarchy
 * before exposing it to partner plugins.
 *
 * @since 0.3.13
 */
public class GenericApiException extends RuntimeException {

    private final int statusCode;
    private final String errorBody;
    private final Map<String, List<String>> headers;
    private final String requestId;

    public GenericApiException(int statusCode, String errorBody,
                               Map<String, List<String>> headers, String requestId,
                               String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.errorBody  = errorBody;
        this.headers    = headers == null ? Collections.emptyMap() : headers;
        this.requestId  = requestId;
    }

    public int statusCode()                      { return statusCode; }
    public String errorBody()                    { return errorBody; }
    public Map<String, List<String>> headers()   { return headers; }
    public String requestId()                    { return requestId; }
}
