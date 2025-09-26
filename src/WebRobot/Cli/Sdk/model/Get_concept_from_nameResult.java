/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_concept_from_name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_concept_from_nameResult extends BaseResultException {

    private Concept concept;

    /**
     * @param concept
     */

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    /**
     * @return
     */

    public Concept getConcept() {
        return this.concept;
    }

    /**
     * @param concept
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_concept_from_nameResult concept(Concept concept) {
        setConcept(concept);
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
        if (getConcept() != null)
            sb.append("Concept: ").append(getConcept());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_concept_from_nameResult == false)
            return false;
        Get_concept_from_nameResult other = (Get_concept_from_nameResult) obj;
        if (other.getConcept() == null ^ this.getConcept() == null)
            return false;
        if (other.getConcept() != null && other.getConcept().equals(this.getConcept()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcept() == null) ? 0 : getConcept().hashCode());
        return hashCode;
    }

    @Override
    public Get_concept_from_nameResult clone() {
        try {
            return (Get_concept_from_nameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
