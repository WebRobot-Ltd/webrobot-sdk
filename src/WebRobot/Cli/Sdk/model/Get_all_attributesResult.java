/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_all_attributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_attributesResult extends BaseResultException {

    private ListAttributes listAttributes;

    /**
     * @param listAttributes
     */

    public void setListAttributes(ListAttributes listAttributes) {
        this.listAttributes = listAttributes;
    }

    /**
     * @return
     */

    public ListAttributes getListAttributes() {
        return this.listAttributes;
    }

    /**
     * @param listAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_attributesResult listAttributes(ListAttributes listAttributes) {
        setListAttributes(listAttributes);
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
        if (getListAttributes() != null)
            sb.append("ListAttributes: ").append(getListAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_attributesResult == false)
            return false;
        Get_all_attributesResult other = (Get_all_attributesResult) obj;
        if (other.getListAttributes() == null ^ this.getListAttributes() == null)
            return false;
        if (other.getListAttributes() != null && other.getListAttributes().equals(this.getListAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListAttributes() == null) ? 0 : getListAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_attributesResult clone() {
        try {
            return (Get_all_attributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
