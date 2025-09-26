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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/AthenaField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaField implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String tipo;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaField name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param tipo
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return
     */

    public String getTipo() {
        return this.tipo;
    }

    /**
     * @param tipo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaField tipo(String tipo) {
        setTipo(tipo);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTipo() != null)
            sb.append("Tipo: ").append(getTipo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AthenaField == false)
            return false;
        AthenaField other = (AthenaField) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTipo() == null ^ this.getTipo() == null)
            return false;
        if (other.getTipo() != null && other.getTipo().equals(this.getTipo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTipo() == null) ? 0 : getTipo().hashCode());
        return hashCode;
    }

    @Override
    public AthenaField clone() {
        try {
            return (AthenaField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.AthenaFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
