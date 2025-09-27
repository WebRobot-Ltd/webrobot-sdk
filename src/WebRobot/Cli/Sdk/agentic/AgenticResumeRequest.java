package WebRobot.Cli.Sdk.agentic;

public class AgenticResumeRequest {
    private String executionId;
    private String userInput;

    public String getExecutionId() { return executionId; }
    public AgenticResumeRequest setExecutionId(String executionId) { this.executionId = executionId; return this; }

    public String getUserInput() { return userInput; }
    public AgenticResumeRequest setUserInput(String userInput) { this.userInput = userInput; return this; }
}


