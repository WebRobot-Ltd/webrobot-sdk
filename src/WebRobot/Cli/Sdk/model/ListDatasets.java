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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListDatasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasets implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Dataset> datasets;

    /**
     * @return
     */

    public java.util.List<Dataset> getDatasets() {
        return datasets;
    }

    /**
     * @param datasets
     */

    public void setDatasets(java.util.Collection<Dataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<Dataset>(datasets);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasets datasets(Dataset... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<Dataset>(datasets.length));
        }
        for (Dataset ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * @param datasets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasets datasets(java.util.Collection<Dataset> datasets) {
        setDatasets(datasets);
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
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasets == false)
            return false;
        ListDatasets other = (ListDatasets) obj;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasets clone() {
        try {
            return (ListDatasets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListDatasetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
