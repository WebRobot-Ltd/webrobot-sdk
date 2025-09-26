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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/ListRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecords implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<DatasetRecord> records;

    /**
     * @return
     */

    public java.util.List<DatasetRecord> getRecords() {
        return records;
    }

    /**
     * @param records
     */

    public void setRecords(java.util.Collection<DatasetRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<DatasetRecord>(records);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecords records(DatasetRecord... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<DatasetRecord>(records.length));
        }
        for (DatasetRecord ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * @param records
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecords records(java.util.Collection<DatasetRecord> records) {
        setRecords(records);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecords == false)
            return false;
        ListRecords other = (ListRecords) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public ListRecords clone() {
        try {
            return (ListRecords) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.ListRecordsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
