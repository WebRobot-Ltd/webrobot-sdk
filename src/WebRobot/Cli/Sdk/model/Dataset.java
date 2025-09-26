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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dataset implements Serializable, Cloneable, StructuredPojo {

    private String apiKey;

    private String attachmentName;

    private String botId;

    private String comments;

    private String headerline;

    private String id;

    private String name;

    private String projectId;

    private String sourcePath;

    private String status;

    private String version;

    private java.util.List<DatasetVersion> versions;

    /**
     * @param apiKey
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @param apiKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * @param attachmentName
     */

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * @return
     */

    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * @param attachmentName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset attachmentName(String attachmentName) {
        setAttachmentName(attachmentName);
        return this;
    }

    /**
     * @param botId
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * @return
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * @param botId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param comments
     */

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return
     */

    public String getComments() {
        return this.comments;
    }

    /**
     * @param comments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset comments(String comments) {
        setComments(comments);
        return this;
    }

    /**
     * @param headerline
     */

    public void setHeaderline(String headerline) {
        this.headerline = headerline;
    }

    /**
     * @return
     */

    public String getHeaderline() {
        return this.headerline;
    }

    /**
     * @param headerline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset headerline(String headerline) {
        setHeaderline(headerline);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param projectId
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @param projectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param sourcePath
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * @return
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * @param sourcePath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset sourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param version
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset version(String version) {
        setVersion(version);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<DatasetVersion> getVersions() {
        return versions;
    }

    /**
     * @param versions
     */

    public void setVersions(java.util.Collection<DatasetVersion> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<DatasetVersion>(versions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset versions(DatasetVersion... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<DatasetVersion>(versions.length));
        }
        for (DatasetVersion ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * @param versions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset versions(java.util.Collection<DatasetVersion> versions) {
        setVersions(versions);
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
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getAttachmentName() != null)
            sb.append("AttachmentName: ").append(getAttachmentName()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments()).append(",");
        if (getHeaderline() != null)
            sb.append("Headerline: ").append(getHeaderline()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dataset == false)
            return false;
        Dataset other = (Dataset) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getAttachmentName() == null ^ this.getAttachmentName() == null)
            return false;
        if (other.getAttachmentName() != null && other.getAttachmentName().equals(this.getAttachmentName()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        if (other.getHeaderline() == null ^ this.getHeaderline() == null)
            return false;
        if (other.getHeaderline() != null && other.getHeaderline().equals(this.getHeaderline()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode + ((getHeaderline() == null) ? 0 : getHeaderline().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public Dataset clone() {
        try {
            return (Dataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.DatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
