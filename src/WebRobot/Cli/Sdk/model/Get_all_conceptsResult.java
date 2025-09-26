/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_all_concepts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_conceptsResult extends BaseResultException {

    private ListConcepts listConcepts;

    /**
     * @param listConcepts
     */

    public void setListConcepts(ListConcepts listConcepts) {
        this.listConcepts = listConcepts;
    }

    /**
     * @return
     */

    public ListConcepts getListConcepts() {
        return this.listConcepts;
    }

    /**
     * @param listConcepts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_conceptsResult listConcepts(ListConcepts listConcepts) {
        setListConcepts(listConcepts);
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
        if (getListConcepts() != null)
            sb.append("ListConcepts: ").append(getListConcepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_conceptsResult == false)
            return false;
        Get_all_conceptsResult other = (Get_all_conceptsResult) obj;
        if (other.getListConcepts() == null ^ this.getListConcepts() == null)
            return false;
        if (other.getListConcepts() != null && other.getListConcepts().equals(this.getListConcepts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListConcepts() == null) ? 0 : getListConcepts().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_conceptsResult clone() {
        try {
            return (Get_all_conceptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
