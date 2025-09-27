package WebRobot.Cli.Sdk.agentic;

import java.util.List;
import java.util.Map;

public class AgenticStartRequest {
    private String message;
    private String sessionId;
    private String userId;
    private List<Object> messages;
    private Map<String, Object> context;

    public String getMessage() { return message; }
    public AgenticStartRequest setMessage(String message) { this.message = message; return this; }

    public String getSessionId() { return sessionId; }
    public AgenticStartRequest setSessionId(String sessionId) { this.sessionId = sessionId; return this; }

    public String getUserId() { return userId; }
    public AgenticStartRequest setUserId(String userId) { this.userId = userId; return this; }

    public List<Object> getMessages() { return messages; }
    public AgenticStartRequest setMessages(List<Object> messages) { this.messages = messages; return this; }

    public Map<String, Object> getContext() { return context; }
    public AgenticStartRequest setContext(Map<String, Object> context) { this.context = context; return this; }
}


