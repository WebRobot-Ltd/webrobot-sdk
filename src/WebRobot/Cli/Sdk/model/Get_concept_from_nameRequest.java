/**
 * null
 */
package WebRobot.Cli.Sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.auth.RequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rgodb61otb-1.0.0/Get_concept_from_name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get_concept_from_nameRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String botId;

    private String conceptName;

    private String projectId;

    private String typeAttribute;

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

    public Get_concept_from_nameRequest botId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * @param conceptName
     */

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

    /**
     * @return
     */

    public String getConceptName() {
        return this.conceptName;
    }

    /**
     * @param conceptName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_concept_from_nameRequest conceptName(String conceptName) {
        setConceptName(conceptName);
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

    public Get_concept_from_nameRequest projectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param typeAttribute
     */

    public void setTypeAttribute(String typeAttribute) {
        this.typeAttribute = typeAttribute;
    }

    /**
     * @return
     */

    public String getTypeAttribute() {
        return this.typeAttribute;
    }

    /**
     * @param typeAttribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get_concept_from_nameRequest typeAttribute(String typeAttribute) {
        setTypeAttribute(typeAttribute);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getConceptName() != null)
            sb.append("ConceptName: ").append(getConceptName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getTypeAttribute() != null)
            sb.append("TypeAttribute: ").append(getTypeAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get_concept_from_nameRequest == false)
            return false;
        Get_concept_from_nameRequest other = (Get_concept_from_nameRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getConceptName() == null ^ this.getConceptName() == null)
            return false;
        if (other.getConceptName() != null && other.getConceptName().equals(this.getConceptName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getTypeAttribute() == null ^ this.getTypeAttribute() == null)
            return false;
        if (other.getTypeAttribute() != null && other.getTypeAttribute().equals(this.getTypeAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getConceptName() == null) ? 0 : getConceptName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getTypeAttribute() == null) ? 0 : getTypeAttribute().hashCode());
        return hashCode;
    }

    @Override
    public Get_concept_from_nameRequest clone() {
        return (Get_concept_from_nameRequest) super.clone();
    }


    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public Get_concept_from_nameRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
