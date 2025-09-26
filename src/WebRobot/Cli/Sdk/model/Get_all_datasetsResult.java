/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_all_datasets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_all_datasetsResult extends BaseResultException {

    private ListDatasets listDatasets;

    /**
     * @param listDatasets
     */

    public void setListDatasets(ListDatasets listDatasets) {
        this.listDatasets = listDatasets;
    }

    /**
     * @return
     */

    public ListDatasets getListDatasets() {
        return this.listDatasets;
    }

    /**
     * @param listDatasets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_all_datasetsResult listDatasets(ListDatasets listDatasets) {
        setListDatasets(listDatasets);
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
        if (getListDatasets() != null)
            sb.append("ListDatasets: ").append(getListDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_all_datasetsResult == false)
            return false;
        Get_all_datasetsResult other = (Get_all_datasetsResult) obj;
        if (other.getListDatasets() == null ^ this.getListDatasets() == null)
            return false;
        if (other.getListDatasets() != null && other.getListDatasets().equals(this.getListDatasets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListDatasets() == null) ? 0 : getListDatasets().hashCode());
        return hashCode;
    }

    @Override
    public Get_all_datasetsResult clone() {
        try {
            return (Get_all_datasetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
