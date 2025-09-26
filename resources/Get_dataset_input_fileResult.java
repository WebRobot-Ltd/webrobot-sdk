/**
 * null
 */

import javax.annotation.Generated;
import java.io.InputStream;
import java.io.Serializable;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_dataset_input_file" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_fileResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private InputStream stream;


    /**
     * @param name
     */

    public void setInputStream(InputStream stream) {
        this.stream = stream;
    }

    /**
     * @return
     */

    public InputStream getInputStream() {
        return this.stream;
    }




    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_input_fileResult == false)
            return false;
        Get_dataset_input_fileResult other = (Get_dataset_input_fileResult) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public Get_dataset_input_fileResult clone() {
        try {
            return (Get_dataset_input_fileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
