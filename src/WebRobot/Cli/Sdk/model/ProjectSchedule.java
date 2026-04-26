/**
 * Project ETL CronJob schedule (Jersey {@code ProjectScheduleRequest} / {@code ProjectScheduleResponse}).
 */
package WebRobot.Cli.Sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.ProtocolMarshaller;
import com.amazonaws.protocol.StructuredPojo;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSchedule implements Serializable, Cloneable, StructuredPojo {

    private String projectId;
    private String cronSchedule;
    private Boolean enabled;
    private String timezone;
    private String nextExecution;
    private String jobId;
    private String cronJobName;
    private Boolean cronJobActive;
    private String executionRequestJson;
    private String message;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProjectSchedule projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    public String getCronSchedule() {
        return cronSchedule;
    }

    public void setCronSchedule(String cronSchedule) {
        this.cronSchedule = cronSchedule;
    }

    public ProjectSchedule cronSchedule(String cronSchedule) {
        setCronSchedule(cronSchedule);
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ProjectSchedule enabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ProjectSchedule timezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    public String getNextExecution() {
        return nextExecution;
    }

    public void setNextExecution(String nextExecution) {
        this.nextExecution = nextExecution;
    }

    public ProjectSchedule nextExecution(String nextExecution) {
        setNextExecution(nextExecution);
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ProjectSchedule jobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    public String getCronJobName() {
        return cronJobName;
    }

    public void setCronJobName(String cronJobName) {
        this.cronJobName = cronJobName;
    }

    public ProjectSchedule cronJobName(String cronJobName) {
        setCronJobName(cronJobName);
        return this;
    }

    public Boolean getCronJobActive() {
        return cronJobActive;
    }

    public void setCronJobActive(Boolean cronJobActive) {
        this.cronJobActive = cronJobActive;
    }

    public ProjectSchedule cronJobActive(Boolean cronJobActive) {
        setCronJobActive(cronJobActive);
        return this;
    }

    public String getExecutionRequestJson() {
        return executionRequestJson;
    }

    public void setExecutionRequestJson(String executionRequestJson) {
        this.executionRequestJson = executionRequestJson;
    }

    public ProjectSchedule executionRequestJson(String executionRequestJson) {
        setExecutionRequestJson(executionRequestJson);
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProjectSchedule message(String message) {
        setMessage(message);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getCronSchedule() != null)
            sb.append("CronSchedule: ").append(getCronSchedule()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getNextExecution() != null)
            sb.append("NextExecution: ").append(getNextExecution()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getCronJobName() != null)
            sb.append("CronJobName: ").append(getCronJobName()).append(",");
        if (getCronJobActive() != null)
            sb.append("CronJobActive: ").append(getCronJobActive()).append(",");
        if (getExecutionRequestJson() != null)
            sb.append("ExecutionRequestJson: ").append(getExecutionRequestJson()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof ProjectSchedule))
            return false;
        ProjectSchedule o = (ProjectSchedule) obj;
        return java.util.Objects.equals(projectId, o.projectId) && java.util.Objects.equals(cronSchedule, o.cronSchedule)
                && java.util.Objects.equals(enabled, o.enabled) && java.util.Objects.equals(timezone, o.timezone)
                && java.util.Objects.equals(nextExecution, o.nextExecution) && java.util.Objects.equals(jobId, o.jobId)
                && java.util.Objects.equals(cronJobName, o.cronJobName) && java.util.Objects.equals(cronJobActive, o.cronJobActive)
                && java.util.Objects.equals(executionRequestJson, o.executionRequestJson) && java.util.Objects.equals(message, o.message);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(projectId, cronSchedule, enabled, timezone, nextExecution, jobId, cronJobName, cronJobActive,
                executionRequestJson, message);
    }

    @Override
    public ProjectSchedule clone() {
        try {
            return (ProjectSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ProjectScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
