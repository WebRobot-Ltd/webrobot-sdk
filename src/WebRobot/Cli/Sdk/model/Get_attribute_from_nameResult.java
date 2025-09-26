/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_attribute_from_name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_attribute_from_nameResult extends BaseResultException {

    private ConceptAttribute conceptAttribute;

    /**
     * @param conceptAttribute
     */

    public void setConceptAttribute(ConceptAttribute conceptAttribute) {
        this.conceptAttribute = conceptAttribute;
    }

    /**
     * @return
     */

    public ConceptAttribute getConceptAttribute() {
        return this.conceptAttribute;
    }

    /**
     * @param conceptAttribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_attribute_from_nameResult conceptAttribute(ConceptAttribute conceptAttribute) {
        setConceptAttribute(conceptAttribute);
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
        if (getConceptAttribute() != null)
            sb.append("ConceptAttribute: ").append(getConceptAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_attribute_from_nameResult == false)
            return false;
        Get_attribute_from_nameResult other = (Get_attribute_from_nameResult) obj;
        if (other.getConceptAttribute() == null ^ this.getConceptAttribute() == null)
            return false;
        if (other.getConceptAttribute() != null && other.getConceptAttribute().equals(this.getConceptAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConceptAttribute() == null) ? 0 : getConceptAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Get_attribute_from_nameResult clone() {
        try {
            return (Get_attribute_from_nameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
