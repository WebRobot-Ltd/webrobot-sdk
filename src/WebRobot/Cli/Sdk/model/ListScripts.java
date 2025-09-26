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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListScripts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScripts implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<BotScript> scripts;

    /**
     * @return
     */

    public java.util.List<BotScript> getScripts() {
        return scripts;
    }

    /**
     * @param scripts
     */

    public void setScripts(java.util.Collection<BotScript> scripts) {
        if (scripts == null) {
            this.scripts = null;
            return;
        }

        this.scripts = new java.util.ArrayList<BotScript>(scripts);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScripts(java.util.Collection)} or {@link #withScripts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param scripts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScripts scripts(BotScript... scripts) {
        if (this.scripts == null) {
            setScripts(new java.util.ArrayList<BotScript>(scripts.length));
        }
        for (BotScript ele : scripts) {
            this.scripts.add(ele);
        }
        return this;
    }

    /**
     * @param scripts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScripts scripts(java.util.Collection<BotScript> scripts) {
        setScripts(scripts);
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
        if (getScripts() != null)
            sb.append("Scripts: ").append(getScripts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScripts == false)
            return false;
        ListScripts other = (ListScripts) obj;
        if (other.getScripts() == null ^ this.getScripts() == null)
            return false;
        if (other.getScripts() != null && other.getScripts().equals(this.getScripts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScripts() == null) ? 0 : getScripts().hashCode());
        return hashCode;
    }

    @Override
    public ListScripts clone() {
        try {
            return (ListScripts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListScriptsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
