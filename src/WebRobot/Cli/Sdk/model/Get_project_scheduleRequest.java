/**
 * GET /webrobot/api/projects/id/{projectId}/schedule
 */
package WebRobot.Cli.Sdk.model;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_project_scheduleRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String projectId;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public Get_project_scheduleRequest projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Get_project_scheduleRequest))
            return false;
        Get_project_scheduleRequest other = (Get_project_scheduleRequest) obj;
        return java.util.Objects.equals(projectId, other.projectId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(projectId);
    }

    @Override
    public Get_project_scheduleRequest clone() {
        return (Get_project_scheduleRequest) super.clone();
    }

    public Get_project_scheduleRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }
}
