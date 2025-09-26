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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListConcepts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConcepts implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Concept> concepts;

    /**
     * @return
     */

    public java.util.List<Concept> getConcepts() {
        return concepts;
    }

    /**
     * @param concepts
     */

    public void setConcepts(java.util.Collection<Concept> concepts) {
        if (concepts == null) {
            this.concepts = null;
            return;
        }

        this.concepts = new java.util.ArrayList<Concept>(concepts);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConcepts(java.util.Collection)} or {@link #withConcepts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param concepts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConcepts concepts(Concept... concepts) {
        if (this.concepts == null) {
            setConcepts(new java.util.ArrayList<Concept>(concepts.length));
        }
        for (Concept ele : concepts) {
            this.concepts.add(ele);
        }
        return this;
    }

    /**
     * @param concepts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConcepts concepts(java.util.Collection<Concept> concepts) {
        setConcepts(concepts);
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
        if (getConcepts() != null)
            sb.append("Concepts: ").append(getConcepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConcepts == false)
            return false;
        ListConcepts other = (ListConcepts) obj;
        if (other.getConcepts() == null ^ this.getConcepts() == null)
            return false;
        if (other.getConcepts() != null && other.getConcepts().equals(this.getConcepts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConcepts() == null) ? 0 : getConcepts().hashCode());
        return hashCode;
    }

    @Override
    public ListConcepts clone() {
        try {
            return (ListConcepts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListConceptsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
