/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_scripts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_scriptsResult extends BaseResultException {

    private ListScripts listScripts;

    /**
     * @param listScripts
     */

    public void setListScripts(ListScripts listScripts) {
        this.listScripts = listScripts;
    }

    /**
     * @return
     */

    public ListScripts getListScripts() {
        return this.listScripts;
    }

    /**
     * @param listScripts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_scriptsResult listScripts(ListScripts listScripts) {
        setListScripts(listScripts);
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
        if (getListScripts() != null)
            sb.append("ListScripts: ").append(getListScripts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_scriptsResult == false)
            return false;
        Get_scriptsResult other = (Get_scriptsResult) obj;
        if (other.getListScripts() == null ^ this.getListScripts() == null)
            return false;
        if (other.getListScripts() != null && other.getListScripts().equals(this.getListScripts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListScripts() == null) ? 0 : getListScripts().hashCode());
        return hashCode;
    }

    @Override
    public Get_scriptsResult clone() {
        try {
            return (Get_scriptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
