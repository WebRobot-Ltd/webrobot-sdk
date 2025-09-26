/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/GetScript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScriptResult extends BaseResultException {

    private BotScript botScript;

    /**
     * @param botScript
     */

    public void setBotScript(BotScript botScript) {
        this.botScript = botScript;
    }

    /**
     * @return
     */

    public BotScript getBotScript() {
        return this.botScript;
    }

    /**
     * @param botScript
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScriptResult botScript(BotScript botScript) {
        setBotScript(botScript);
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
        if (getBotScript() != null)
            sb.append("BotScript: ").append(getBotScript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScriptResult == false)
            return false;
        GetScriptResult other = (GetScriptResult) obj;
        if (other.getBotScript() == null ^ this.getBotScript() == null)
            return false;
        if (other.getBotScript() != null && other.getBotScript().equals(this.getBotScript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotScript() == null) ? 0 : getBotScript().hashCode());
        return hashCode;
    }

    @Override
    public GetScriptResult clone() {
        try {
            return (GetScriptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
