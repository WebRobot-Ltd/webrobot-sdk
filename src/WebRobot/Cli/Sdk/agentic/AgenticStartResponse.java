package WebRobot.Cli.Sdk.agentic;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AgenticStartResponse {
    public boolean success;
    public String response;
    public String sessionId;
    public String timestamp;
    public List<Object> suggestions = new ArrayList<>();
    public boolean pipeline_ready;
    public String yaml_pipeline;
    public String spark_job_code;
    public String model_used;
    public JSONObject budget_status;
    public boolean needs_human_input;
    public String human_input_prompt;
    public String execution_id;

    public static AgenticStartResponse fromJson(String raw) {
        JSONObject o = new JSONObject(raw);
        AgenticStartResponse r = new AgenticStartResponse();
        r.success = o.optBoolean("success");
        r.response = o.optString("response", "");
        r.sessionId = o.optString("sessionId", null);
        r.timestamp = o.optString("timestamp", null);
        JSONArray arr = o.optJSONArray("suggestions");
        if (arr != null) for (int i=0;i<arr.length();i++) r.suggestions.add(arr.get(i));
        r.pipeline_ready = o.optBoolean("pipeline_ready");
        r.yaml_pipeline = o.optString("yaml_pipeline", "");
        r.spark_job_code = o.optString("spark_job_code", "");
        r.model_used = o.optString("model_used", "");
        r.budget_status = o.optJSONObject("budget_status");
        r.needs_human_input = o.optBoolean("needs_human_input");
        r.human_input_prompt = o.optString("human_input_prompt", null);
        r.execution_id = o.optString("execution_id", null);
        return r;
    }
}


