/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/TimePeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimePeriod implements Serializable, Cloneable, StructuredPojo {

    private String endTimePeriod;

    private String startTimePeriod;

    /**
     * @param endTimePeriod
     */

    public void setEndTimePeriod(String endTimePeriod) {
        this.endTimePeriod = endTimePeriod;
    }

    /**
     * @return
     */

    public String getEndTimePeriod() {
        return this.endTimePeriod;
    }

    /**
     * @param endTimePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimePeriod endTimePeriod(String endTimePeriod) {
        setEndTimePeriod(endTimePeriod);
        return this;
    }

    /**
     * @param startTimePeriod
     */

    public void setStartTimePeriod(String startTimePeriod) {
        this.startTimePeriod = startTimePeriod;
    }

    /**
     * @return
     */

    public String getStartTimePeriod() {
        return this.startTimePeriod;
    }

    /**
     * @param startTimePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimePeriod startTimePeriod(String startTimePeriod) {
        setStartTimePeriod(startTimePeriod);
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
        if (getEndTimePeriod() != null)
            sb.append("EndTimePeriod: ").append(getEndTimePeriod()).append(",");
        if (getStartTimePeriod() != null)
            sb.append("StartTimePeriod: ").append(getStartTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimePeriod == false)
            return false;
        TimePeriod other = (TimePeriod) obj;
        if (other.getEndTimePeriod() == null ^ this.getEndTimePeriod() == null)
            return false;
        if (other.getEndTimePeriod() != null && other.getEndTimePeriod().equals(this.getEndTimePeriod()) == false)
            return false;
        if (other.getStartTimePeriod() == null ^ this.getStartTimePeriod() == null)
            return false;
        if (other.getStartTimePeriod() != null && other.getStartTimePeriod().equals(this.getStartTimePeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTimePeriod() == null) ? 0 : getEndTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTimePeriod() == null) ? 0 : getStartTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public TimePeriod clone() {
        try {
            return (TimePeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.TimePeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
