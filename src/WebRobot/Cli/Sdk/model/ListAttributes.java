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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttributes implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<PageAttribute> attributes;

    /**
     * @return
     */

    public java.util.List<PageAttribute> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     */

    public void setAttributes(java.util.Collection<PageAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<PageAttribute>(attributes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributes attributes(PageAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<PageAttribute>(attributes.length));
        }
        for (PageAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * @param attributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttributes attributes(java.util.Collection<PageAttribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttributes == false)
            return false;
        ListAttributes other = (ListAttributes) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ListAttributes clone() {
        try {
            return (ListAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
