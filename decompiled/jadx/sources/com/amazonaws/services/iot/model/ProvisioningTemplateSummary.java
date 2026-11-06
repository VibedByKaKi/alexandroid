package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ProvisioningTemplateSummary implements Serializable {
    private Date creationDate;
    private String description;
    private Boolean enabled;
    private Date lastModifiedDate;
    private String templateArn;
    private String templateName;
    private String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisioningTemplateSummary)) {
            return false;
        }
        ProvisioningTemplateSummary provisioningTemplateSummary = (ProvisioningTemplateSummary) obj;
        if ((provisioningTemplateSummary.getTemplateArn() == null) ^ (getTemplateArn() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getTemplateArn() != null && !provisioningTemplateSummary.getTemplateArn().equals(getTemplateArn())) {
            return false;
        }
        if ((provisioningTemplateSummary.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getTemplateName() != null && !provisioningTemplateSummary.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((provisioningTemplateSummary.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getDescription() != null && !provisioningTemplateSummary.getDescription().equals(getDescription())) {
            return false;
        }
        if ((provisioningTemplateSummary.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getCreationDate() != null && !provisioningTemplateSummary.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((provisioningTemplateSummary.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getLastModifiedDate() != null && !provisioningTemplateSummary.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((provisioningTemplateSummary.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (provisioningTemplateSummary.getEnabled() != null && !provisioningTemplateSummary.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((provisioningTemplateSummary.getType() == null) ^ (getType() == null)) {
            return false;
        }
        return provisioningTemplateSummary.getType() == null || provisioningTemplateSummary.getType().equals(getType());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getTemplateArn() {
        return this.templateArn;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((getTemplateArn() == null ? 0 : getTemplateArn().hashCode()) + 31) * 31) + (getTemplateName() == null ? 0 : getTemplateName().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getEnabled() == null ? 0 : getEnabled().hashCode())) * 31) + (getType() != null ? getType().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setTemplateArn(String str) {
        this.templateArn = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setType(TemplateType templateType) {
        this.type = templateType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateArn() != null) {
            sb.append("templateArn: " + getTemplateArn() + ",");
        }
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        }
        if (getEnabled() != null) {
            sb.append("enabled: " + getEnabled() + ",");
        }
        if (getType() != null) {
            sb.append("type: " + getType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ProvisioningTemplateSummary withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public ProvisioningTemplateSummary withDescription(String str) {
        this.description = str;
        return this;
    }

    public ProvisioningTemplateSummary withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public ProvisioningTemplateSummary withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public ProvisioningTemplateSummary withTemplateArn(String str) {
        this.templateArn = str;
        return this;
    }

    public ProvisioningTemplateSummary withTemplateName(String str) {
        this.templateName = str;
        return this;
    }

    public ProvisioningTemplateSummary withType(TemplateType templateType) {
        this.type = templateType.toString();
        return this;
    }

    public void setType(String str) {
        this.type = str;
    }

    public ProvisioningTemplateSummary withType(String str) {
        this.type = str;
        return this;
    }
}
