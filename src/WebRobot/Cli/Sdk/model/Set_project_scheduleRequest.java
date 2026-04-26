/**
 * PUT /webrobot/api/projects/id/{projectId}/schedule
 */
package WebRobot.Cli.Sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Set_project_scheduleRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String projectId;
    private ProjectSchedule schedule;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public Set_project_scheduleRequest projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    public void setSchedule(ProjectSchedule schedule) {
        this.schedule = schedule;
    }

    public ProjectSchedule getSchedule() {
        return this.schedule;
    }

    public Set_project_scheduleRequest schedule(ProjectSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Set_project_scheduleRequest))
            return false;
        Set_project_scheduleRequest o = (Set_project_scheduleRequest) obj;
        return java.util.Objects.equals(projectId, o.projectId) && java.util.Objects.equals(schedule, o.schedule);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(projectId, schedule);
    }

    @Override
    public Set_project_scheduleRequest clone() {
        return (Set_project_scheduleRequest) super.clone();
    }

    public Set_project_scheduleRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }
}
