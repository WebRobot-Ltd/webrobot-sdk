/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import WebRobot.Cli.Sdk.custom.BaseResultException;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_list_versions_job_interval"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_list_versions_job_intervalResult extends BaseResultException {

    private ListDatasetVersions listDatasetVersions;

    /**
     * @param listDatasetVersions
     */

    public void setListDatasetVersions(ListDatasetVersions listDatasetVersions) {
        this.listDatasetVersions = listDatasetVersions;
    }

    /**
     * @return
     */

    public ListDatasetVersions getListDatasetVersions() {
        return this.listDatasetVersions;
    }

    /**
     * @param listDatasetVersions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_list_versions_job_intervalResult listDatasetVersions(ListDatasetVersions listDatasetVersions) {
        setListDatasetVersions(listDatasetVersions);
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
        if (getListDatasetVersions() != null)
            sb.append("ListDatasetVersions: ").append(getListDatasetVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_list_versions_job_intervalResult == false)
            return false;
        Get_list_versions_job_intervalResult other = (Get_list_versions_job_intervalResult) obj;
        if (other.getListDatasetVersions() == null ^ this.getListDatasetVersions() == null)
            return false;
        if (other.getListDatasetVersions() != null && other.getListDatasetVersions().equals(this.getListDatasetVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListDatasetVersions() == null) ? 0 : getListDatasetVersions().hashCode());
        return hashCode;
    }

    @Override
    public Get_list_versions_job_intervalResult clone() {
        try {
            return (Get_list_versions_job_intervalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
