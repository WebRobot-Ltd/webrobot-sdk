/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_dataset_version_from_id" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_version_from_idResult extends BaseResultException {

    private DatasetVersion datasetVersion;

    /**
     * @param datasetVersion
     */

    public void setDatasetVersion(DatasetVersion datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    /**
     * @return
     */

    public DatasetVersion getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @param datasetVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_version_from_idResult datasetVersion(DatasetVersion datasetVersion) {
        setDatasetVersion(datasetVersion);
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
        if (getDatasetVersion() != null)
            sb.append("DatasetVersion: ").append(getDatasetVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_version_from_idResult == false)
            return false;
        Get_dataset_version_from_idResult other = (Get_dataset_version_from_idResult) obj;
        if (other.getDatasetVersion() == null ^ this.getDatasetVersion() == null)
            return false;
        if (other.getDatasetVersion() != null && other.getDatasetVersion().equals(this.getDatasetVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetVersion() == null) ? 0 : getDatasetVersion().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_version_from_idResult clone() {
        try {
            return (Get_dataset_version_from_idResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
