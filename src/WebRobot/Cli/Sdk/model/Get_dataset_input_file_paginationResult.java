/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_dataset_input_file_pagination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_dataset_input_file_paginationResult extends BaseResultException {

    private ListRecords listRecords;

    /**
     * @param listRecords
     */

    public void setListRecords(ListRecords listRecords) {
        this.listRecords = listRecords;
    }

    /**
     * @return
     */

    public ListRecords getListRecords() {
        return this.listRecords;
    }

    /**
     * @param listRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_dataset_input_file_paginationResult listRecords(ListRecords listRecords) {
        setListRecords(listRecords);
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
        if (getListRecords() != null)
            sb.append("ListRecords: ").append(getListRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_dataset_input_file_paginationResult == false)
            return false;
        Get_dataset_input_file_paginationResult other = (Get_dataset_input_file_paginationResult) obj;
        if (other.getListRecords() == null ^ this.getListRecords() == null)
            return false;
        if (other.getListRecords() != null && other.getListRecords().equals(this.getListRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListRecords() == null) ? 0 : getListRecords().hashCode());
        return hashCode;
    }

    @Override
    public Get_dataset_input_file_paginationResult clone() {
        try {
            return (Get_dataset_input_file_paginationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
