/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/DeleteDatasetFromId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatasetFromIdResult extends BaseResultException {

    private Dataset dataset;

    /**
     * @param dataset
     */

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * @return
     */

    public Dataset getDataset() {
        return this.dataset;
    }

    /**
     * @param dataset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatasetFromIdResult dataset(Dataset dataset) {
        setDataset(dataset);
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
        if (getDataset() != null)
            sb.append("Dataset: ").append(getDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDatasetFromIdResult == false)
            return false;
        DeleteDatasetFromIdResult other = (DeleteDatasetFromIdResult) obj;
        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatasetFromIdResult clone() {
        try {
            return (DeleteDatasetFromIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
