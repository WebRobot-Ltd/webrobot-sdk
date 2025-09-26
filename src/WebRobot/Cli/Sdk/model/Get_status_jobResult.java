/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_status_job" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_status_jobResult extends BaseResultException {

    private StatusJob statusJob;

    /**
     * @param statusJob
     */

    public void setStatusJob(StatusJob statusJob) {
        this.statusJob = statusJob;
    }

    /**
     * @return
     */

    public StatusJob getStatusJob() {
        return this.statusJob;
    }

    /**
     * @param statusJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_status_jobResult statusJob(StatusJob statusJob) {
        setStatusJob(statusJob);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatusJob() != null)
            sb.append("StatusJob: ").append(getStatusJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_status_jobResult == false)
            return false;
        Get_status_jobResult other = (Get_status_jobResult) obj;
        if (other.getStatusJob() == null ^ this.getStatusJob() == null)
            return false;
        if (other.getStatusJob() != null && other.getStatusJob().equals(this.getStatusJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusJob() == null) ? 0 : getStatusJob().hashCode());
        return hashCode;
    }

    @Override
    public Get_status_jobResult clone() {
        try {
            return (Get_status_jobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
