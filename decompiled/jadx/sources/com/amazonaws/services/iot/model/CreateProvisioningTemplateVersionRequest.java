package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningTemplateVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean setAsDefault;
    private String templateBody;
    private String templateName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProvisioningTemplateVersionRequest)) {
            return false;
        }
        CreateProvisioningTemplateVersionRequest createProvisioningTemplateVersionRequest = (CreateProvisioningTemplateVersionRequest) obj;
        if ((createProvisioningTemplateVersionRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (createProvisioningTemplateVersionRequest.getTemplateName() != null && !createProvisioningTemplateVersionRequest.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((createProvisioningTemplateVersionRequest.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (createProvisioningTemplateVersionRequest.getTemplateBody() != null && !createProvisioningTemplateVersionRequest.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((createProvisioningTemplateVersionRequest.getSetAsDefault() == null) ^ (getSetAsDefault() == null)) {
            return false;
        }
        return createProvisioningTemplateVersionRequest.getSetAsDefault() == null || createProvisioningTemplateVersionRequest.getSetAsDefault().equals(getSetAsDefault());
    }

    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((getTemplateName() == null ? 0 : getTemplateName().hashCode()) + 31) * 31) + (getTemplateBody() == null ? 0 : getTemplateBody().hashCode())) * 31) + (getSetAsDefault() != null ? getSetAsDefault().hashCode() : 0);
    }

    public Boolean isSetAsDefault() {
        return this.setAsDefault;
    }

    public void setSetAsDefault(Boolean bool) {
        this.setAsDefault = bool;
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getSetAsDefault() != null) {
            sb.append("setAsDefault: " + getSetAsDefault());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateProvisioningTemplateVersionRequest withSetAsDefault(Boolean bool) {
        this.setAsDefault = bool;
        return this;
    }

    public CreateProvisioningTemplateVersionRequest withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }

    public CreateProvisioningTemplateVersionRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }
}
