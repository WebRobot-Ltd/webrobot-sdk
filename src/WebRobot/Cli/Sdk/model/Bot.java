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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Bot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bot implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<BotParametersElement> botParameters;

    private String code;

    private String createdTime;

    private String description;

    private String id;

    private String name;

    private String projectId;

    private String sparqlService;

    /**
     * @return
     */

    public java.util.List<BotParametersElement> getBotParameters() {
        return botParameters;
    }

    /**
     * @param botParameters
     */

    public void setBotParameters(java.util.Collection<BotParametersElement> botParameters) {
        if (botParameters == null) {
            this.botParameters = null;
            return;
        }

        this.botParameters = new java.util.ArrayList<BotParametersElement>(botParameters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotParameters(java.util.Collection)} or {@link #withBotParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param botParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot botParameters(BotParametersElement... botParameters) {
        if (this.botParameters == null) {
            setBotParameters(new java.util.ArrayList<BotParametersElement>(botParameters.length));
        }
        for (BotParametersElement ele : botParameters) {
            this.botParameters.add(ele);
        }
        return this;
    }

    /**
     * @param botParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot botParameters(java.util.Collection<BotParametersElement> botParameters) {
        setBotParameters(botParameters);
        return this;
    }

    /**
     * @param code
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot code(String code) {
        setCode(code);
        return this;
    }

    /**
     * @param createdTime
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @param createdTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot createdTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot description(String description) {
        setDescription(description);
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

    public Bot id(String id) {
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

    public Bot name(String name) {
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

    public Bot projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param sparqlService
     */

    public void setSparqlService(String sparqlService) {
        this.sparqlService = sparqlService;
    }

    /**
     * @return
     */

    public String getSparqlService() {
        return this.sparqlService;
    }

    /**
     * @param sparqlService
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot sparqlService(String sparqlService) {
        setSparqlService(sparqlService);
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
        if (getBotParameters() != null)
            sb.append("BotParameters: ").append(getBotParameters()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getSparqlService() != null)
            sb.append("SparqlService: ").append(getSparqlService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bot == false)
            return false;
        Bot other = (Bot) obj;
        if (other.getBotParameters() == null ^ this.getBotParameters() == null)
            return false;
        if (other.getBotParameters() != null && other.getBotParameters().equals(this.getBotParameters()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getSparqlService() == null ^ this.getSparqlService() == null)
            return false;
        if (other.getSparqlService() != null && other.getSparqlService().equals(this.getSparqlService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotParameters() == null) ? 0 : getBotParameters().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getSparqlService() == null) ? 0 : getSparqlService().hashCode());
        return hashCode;
    }

    @Override
    public Bot clone() {
        try {
            return (Bot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        WebRobot.Cli.Sdk.model.transform.BotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
