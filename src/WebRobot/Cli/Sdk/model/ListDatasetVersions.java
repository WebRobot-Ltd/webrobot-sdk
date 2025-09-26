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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListDatasetVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetVersions implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<DatasetVersion> versions;

    /**
     * @return
     */

    public java.util.List<DatasetVersion> getVersions() {
        return versions;
    }

    /**
     * @param versions
     */

    public void setVersions(java.util.Collection<DatasetVersion> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<DatasetVersion>(versions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetVersions versions(DatasetVersion... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<DatasetVersion>(versions.length));
        }
        for (DatasetVersion ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * @param versions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetVersions versions(java.util.Collection<DatasetVersion> versions) {
        setVersions(versions);
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
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetVersions == false)
            return false;
        ListDatasetVersions other = (ListDatasetVersions) obj;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetVersions clone() {
        try {
            return (ListDatasetVersions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListDatasetVersionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
