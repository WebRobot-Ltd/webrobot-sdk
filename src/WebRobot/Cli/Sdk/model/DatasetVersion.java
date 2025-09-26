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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/DatasetVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetVersion implements Serializable, Cloneable, StructuredPojo {

    private String apikey;

    private String botId;

    private String datasetId;

    private String errorMessage;

    private String id;

    private String inputdatabaseName;

    private java.util.List<AthenaField> inputfields;

    private String inputtableName;

    private String jobId;

    private String name;

    private String outputdatabaseName;

    private java.util.List<AthenaField> outputfields;

    private String outputtableName;

    private String projectId;

    private String status;

    private String targetPath;

    private String targetPathOutput;

    private String timePeriod;

    private String version;

    /**
     * @param apikey
     */

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     * @return
     */

    public String getApikey() {
        return this.apikey;
    }

    /**
     * @param apikey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion apikey(String apikey) {
        setApikey(apikey);
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

    public DatasetVersion botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param datasetId
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * @return
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @param datasetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion datasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * @param errorMessage
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @param errorMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion errorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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

    public DatasetVersion id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param inputdatabaseName
     */

    public void setInputdatabaseName(String inputdatabaseName) {
        this.inputdatabaseName = inputdatabaseName;
    }

    /**
     * @return
     */

    public String getInputdatabaseName() {
        return this.inputdatabaseName;
    }

    /**
     * @param inputdatabaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion inputdatabaseName(String inputdatabaseName) {
        setInputdatabaseName(inputdatabaseName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AthenaField> getInputfields() {
        return inputfields;
    }

    /**
     * @param inputfields
     */

    public void setInputfields(java.util.Collection<AthenaField> inputfields) {
        if (inputfields == null) {
            this.inputfields = null;
            return;
        }

        this.inputfields = new java.util.ArrayList<AthenaField>(inputfields);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputfields(java.util.Collection)} or {@link #withInputfields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputfields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion inputfields(AthenaField... inputfields) {
        if (this.inputfields == null) {
            setInputfields(new java.util.ArrayList<AthenaField>(inputfields.length));
        }
        for (AthenaField ele : inputfields) {
            this.inputfields.add(ele);
        }
        return this;
    }

    /**
     * @param inputfields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion inputfields(java.util.Collection<AthenaField> inputfields) {
        setInputfields(inputfields);
        return this;
    }

    /**
     * @param inputtableName
     */

    public void setInputtableName(String inputtableName) {
        this.inputtableName = inputtableName;
    }

    /**
     * @return
     */

    public String getInputtableName() {
        return this.inputtableName;
    }

    /**
     * @param inputtableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion inputtableName(String inputtableName) {
        setInputtableName(inputtableName);
        return this;
    }

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion jobId(String jobId) {
        setJobId(jobId);
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

    public DatasetVersion name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param outputdatabaseName
     */

    public void setOutputdatabaseName(String outputdatabaseName) {
        this.outputdatabaseName = outputdatabaseName;
    }

    /**
     * @return
     */

    public String getOutputdatabaseName() {
        return this.outputdatabaseName;
    }

    /**
     * @param outputdatabaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion outputdatabaseName(String outputdatabaseName) {
        setOutputdatabaseName(outputdatabaseName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AthenaField> getOutputfields() {
        return outputfields;
    }

    /**
     * @param outputfields
     */

    public void setOutputfields(java.util.Collection<AthenaField> outputfields) {
        if (outputfields == null) {
            this.outputfields = null;
            return;
        }

        this.outputfields = new java.util.ArrayList<AthenaField>(outputfields);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputfields(java.util.Collection)} or {@link #withOutputfields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputfields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion outputfields(AthenaField... outputfields) {
        if (this.outputfields == null) {
            setOutputfields(new java.util.ArrayList<AthenaField>(outputfields.length));
        }
        for (AthenaField ele : outputfields) {
            this.outputfields.add(ele);
        }
        return this;
    }

    /**
     * @param outputfields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion outputfields(java.util.Collection<AthenaField> outputfields) {
        setOutputfields(outputfields);
        return this;
    }

    /**
     * @param outputtableName
     */

    public void setOutputtableName(String outputtableName) {
        this.outputtableName = outputtableName;
    }

    /**
     * @return
     */

    public String getOutputtableName() {
        return this.outputtableName;
    }

    /**
     * @param outputtableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion outputtableName(String outputtableName) {
        setOutputtableName(outputtableName);
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

    public DatasetVersion projectId(String projectId) {
        setProjectId(projectId);
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

    public DatasetVersion status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param targetPath
     */

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    /**
     * @return
     */

    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * @param targetPath
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion targetPath(String targetPath) {
        setTargetPath(targetPath);
        return this;
    }

    /**
     * @param targetPathOutput
     */

    public void setTargetPathOutput(String targetPathOutput) {
        this.targetPathOutput = targetPathOutput;
    }

    /**
     * @return
     */

    public String getTargetPathOutput() {
        return this.targetPathOutput;
    }

    /**
     * @param targetPathOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion targetPathOutput(String targetPathOutput) {
        setTargetPathOutput(targetPathOutput);
        return this;
    }

    /**
     * @param timePeriod
     */

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return
     */

    public String getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @param timePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetVersion timePeriod(String timePeriod) {
        setTimePeriod(timePeriod);
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

    public DatasetVersion version(String version) {
        setVersion(version);
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
        if (getApikey() != null)
            sb.append("Apikey: ").append(getApikey()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInputdatabaseName() != null)
            sb.append("InputdatabaseName: ").append(getInputdatabaseName()).append(",");
        if (getInputfields() != null)
            sb.append("Inputfields: ").append(getInputfields()).append(",");
        if (getInputtableName() != null)
            sb.append("InputtableName: ").append(getInputtableName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputdatabaseName() != null)
            sb.append("OutputdatabaseName: ").append(getOutputdatabaseName()).append(",");
        if (getOutputfields() != null)
            sb.append("Outputfields: ").append(getOutputfields()).append(",");
        if (getOutputtableName() != null)
            sb.append("OutputtableName: ").append(getOutputtableName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetPath() != null)
            sb.append("TargetPath: ").append(getTargetPath()).append(",");
        if (getTargetPathOutput() != null)
            sb.append("TargetPathOutput: ").append(getTargetPathOutput()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetVersion == false)
            return false;
        DatasetVersion other = (DatasetVersion) obj;
        if (other.getApikey() == null ^ this.getApikey() == null)
            return false;
        if (other.getApikey() != null && other.getApikey().equals(this.getApikey()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputdatabaseName() == null ^ this.getInputdatabaseName() == null)
            return false;
        if (other.getInputdatabaseName() != null && other.getInputdatabaseName().equals(this.getInputdatabaseName()) == false)
            return false;
        if (other.getInputfields() == null ^ this.getInputfields() == null)
            return false;
        if (other.getInputfields() != null && other.getInputfields().equals(this.getInputfields()) == false)
            return false;
        if (other.getInputtableName() == null ^ this.getInputtableName() == null)
            return false;
        if (other.getInputtableName() != null && other.getInputtableName().equals(this.getInputtableName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputdatabaseName() == null ^ this.getOutputdatabaseName() == null)
            return false;
        if (other.getOutputdatabaseName() != null && other.getOutputdatabaseName().equals(this.getOutputdatabaseName()) == false)
            return false;
        if (other.getOutputfields() == null ^ this.getOutputfields() == null)
            return false;
        if (other.getOutputfields() != null && other.getOutputfields().equals(this.getOutputfields()) == false)
            return false;
        if (other.getOutputtableName() == null ^ this.getOutputtableName() == null)
            return false;
        if (other.getOutputtableName() != null && other.getOutputtableName().equals(this.getOutputtableName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetPath() == null ^ this.getTargetPath() == null)
            return false;
        if (other.getTargetPath() != null && other.getTargetPath().equals(this.getTargetPath()) == false)
            return false;
        if (other.getTargetPathOutput() == null ^ this.getTargetPathOutput() == null)
            return false;
        if (other.getTargetPathOutput() != null && other.getTargetPathOutput().equals(this.getTargetPathOutput()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApikey() == null) ? 0 : getApikey().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputdatabaseName() == null) ? 0 : getInputdatabaseName().hashCode());
        hashCode = prime * hashCode + ((getInputfields() == null) ? 0 : getInputfields().hashCode());
        hashCode = prime * hashCode + ((getInputtableName() == null) ? 0 : getInputtableName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputdatabaseName() == null) ? 0 : getOutputdatabaseName().hashCode());
        hashCode = prime * hashCode + ((getOutputfields() == null) ? 0 : getOutputfields().hashCode());
        hashCode = prime * hashCode + ((getOutputtableName() == null) ? 0 : getOutputtableName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetPath() == null) ? 0 : getTargetPath().hashCode());
        hashCode = prime * hashCode + ((getTargetPathOutput() == null) ? 0 : getTargetPathOutput().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DatasetVersion clone() {
        try {
            return (DatasetVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.DatasetVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
