/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_url_upload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_url_uploadResult extends BaseResultException {

    private StringResult stringResult;

    /**
     * @param stringResult
     */

    public void setStringResult(StringResult stringResult) {
        this.stringResult = stringResult;
    }

    /**
     * @return
     */

    public StringResult getStringResult() {
        return this.stringResult;
    }

    /**
     * @param stringResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_url_uploadResult stringResult(StringResult stringResult) {
        setStringResult(stringResult);
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
        if (getStringResult() != null)
            sb.append("StringResult: ").append(getStringResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_url_uploadResult == false)
            return false;
        Get_url_uploadResult other = (Get_url_uploadResult) obj;
        if (other.getStringResult() == null ^ this.getStringResult() == null)
            return false;
        if (other.getStringResult() != null && other.getStringResult().equals(this.getStringResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringResult() == null) ? 0 : getStringResult().hashCode());
        return hashCode;
    }

    @Override
    public Get_url_uploadResult clone() {
        try {
            return (Get_url_uploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
