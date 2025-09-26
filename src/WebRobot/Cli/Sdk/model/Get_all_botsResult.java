/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_all_bots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_botsResult extends BaseResultException {

    private ListBots listBots;

    /**
     * @param listBots
     */

    public void setListBots(ListBots listBots) {
        this.listBots = listBots;
    }

    /**
     * @return
     */

    public ListBots getListBots() {
        return this.listBots;
    }

    /**
     * @param listBots
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_botsResult listBots(ListBots listBots) {
        setListBots(listBots);
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
        if (getListBots() != null)
            sb.append("ListBots: ").append(getListBots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_botsResult == false)
            return false;
        Get_all_botsResult other = (Get_all_botsResult) obj;
        if (other.getListBots() == null ^ this.getListBots() == null)
            return false;
        if (other.getListBots() != null && other.getListBots().equals(this.getListBots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListBots() == null) ? 0 : getListBots().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_botsResult clone() {
        try {
            return (Get_all_botsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
