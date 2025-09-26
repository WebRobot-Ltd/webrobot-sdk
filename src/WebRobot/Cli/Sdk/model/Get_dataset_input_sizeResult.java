/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_dataset_input_size" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_sizeResult extends BaseResultException {

    private DatasetSize datasetSize;

    /**
     * @param datasetSize
     */

    public void setDatasetSize(DatasetSize datasetSize) {
        this.datasetSize = datasetSize;
    }

    /**
     * @return
     */

    public DatasetSize getDatasetSize() {
        return this.datasetSize;
    }

    /**
     * @param datasetSize
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_input_sizeResult datasetSize(DatasetSize datasetSize) {
        setDatasetSize(datasetSize);
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
        if (getDatasetSize() != null)
            sb.append("DatasetSize: ").append(getDatasetSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_input_sizeResult == false)
            return false;
        Get_dataset_input_sizeResult other = (Get_dataset_input_sizeResult) obj;
        if (other.getDatasetSize() == null ^ this.getDatasetSize() == null)
            return false;
        if (other.getDatasetSize() != null && other.getDatasetSize().equals(this.getDatasetSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetSize() == null) ? 0 : getDatasetSize().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_input_sizeResult clone() {
        try {
            return (Get_dataset_input_sizeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
