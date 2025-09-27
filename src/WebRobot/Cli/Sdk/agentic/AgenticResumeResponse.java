package WebRobot.Cli.Sdk.agentic;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AgenticResumeResponse {
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

    public static AgenticResumeResponse fromJson(String raw) {
        JSONObject o = new JSONObject(raw);
        AgenticResumeResponse r = new AgenticResumeResponse();
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
        return r;
    }
}


