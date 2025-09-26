/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_attribute_from_page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_attribute_from_pageResult extends BaseResultException {

    private PageAttribute pageAttribute;

    /**
     * @param pageAttribute
     */

    public void setPageAttribute(PageAttribute pageAttribute) {
        this.pageAttribute = pageAttribute;
    }

    /**
     * @return
     */

    public PageAttribute getPageAttribute() {
        return this.pageAttribute;
    }

    /**
     * @param pageAttribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_attribute_from_pageResult pageAttribute(PageAttribute pageAttribute) {
        setPageAttribute(pageAttribute);
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
        if (getPageAttribute() != null)
            sb.append("PageAttribute: ").append(getPageAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_attribute_from_pageResult == false)
            return false;
        Get_attribute_from_pageResult other = (Get_attribute_from_pageResult) obj;
        if (other.getPageAttribute() == null ^ this.getPageAttribute() == null)
            return false;
        if (other.getPageAttribute() != null && other.getPageAttribute().equals(this.getPageAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageAttribute() == null) ? 0 : getPageAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Get_attribute_from_pageResult clone() {
        try {
            return (Get_attribute_from_pageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
