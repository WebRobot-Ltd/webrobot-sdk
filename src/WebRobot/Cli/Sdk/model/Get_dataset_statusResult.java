/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_dataset_status" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_statusResult extends BaseResultException {

    private DatasetStatus datasetStatus;

    /**
     * @param datasetStatus
     */

    public void setDatasetStatus(DatasetStatus datasetStatus) {
        this.datasetStatus = datasetStatus;
    }

    /**
     * @return
     */

    public DatasetStatus getDatasetStatus() {
        return this.datasetStatus;
    }

    /**
     * @param datasetStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_statusResult datasetStatus(DatasetStatus datasetStatus) {
        setDatasetStatus(datasetStatus);
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
        if (getDatasetStatus() != null)
            sb.append("DatasetStatus: ").append(getDatasetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_statusResult == false)
            return false;
        Get_dataset_statusResult other = (Get_dataset_statusResult) obj;
        if (other.getDatasetStatus() == null ^ this.getDatasetStatus() == null)
            return false;
        if (other.getDatasetStatus() != null && other.getDatasetStatus().equals(this.getDatasetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetStatus() == null) ? 0 : getDatasetStatus().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_statusResult clone() {
        try {
            return (Get_dataset_statusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
