/**
 * Result of set_project_schedule (Jersey {@code ProjectScheduleResponse}).
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Set_project_scheduleResult extends BaseResultException {

    private ProjectSchedule schedule;

    public void setSchedule(ProjectSchedule schedule) {
        this.schedule = schedule;
    }

    public ProjectSchedule getSchedule() {
        return this.schedule;
    }

    public Set_project_scheduleResult schedule(ProjectSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Set_project_scheduleResult))
            return false;
        return java.util.Objects.equals(schedule, ((Set_project_scheduleResult) obj).schedule);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(schedule);
    }

    @Override
    public Set_project_scheduleResult clone() {
        try {
            return (Set_project_scheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }
}
