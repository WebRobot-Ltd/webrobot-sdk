/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_all_pages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_pagesResult extends BaseResultException {

    private ListPages listPages;

    /**
     * @param listPages
     */

    public void setListPages(ListPages listPages) {
        this.listPages = listPages;
    }

    /**
     * @return
     */

    public ListPages getListPages() {
        return this.listPages;
    }

    /**
     * @param listPages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_pagesResult listPages(ListPages listPages) {
        setListPages(listPages);
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
        if (getListPages() != null)
            sb.append("ListPages: ").append(getListPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_pagesResult == false)
            return false;
        Get_all_pagesResult other = (Get_all_pagesResult) obj;
        if (other.getListPages() == null ^ this.getListPages() == null)
            return false;
        if (other.getListPages() != null && other.getListPages().equals(this.getListPages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListPages() == null) ? 0 : getListPages().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_pagesResult clone() {
        try {
            return (Get_all_pagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
