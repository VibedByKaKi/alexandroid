package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningTemplateResult implements Serializable {
    private Integer defaultVersionId;
    private String templateArn;
    private String templateName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProvisioningTemplateResult)) {
            return false;
        }
        CreateProvisioningTemplateResult createProvisioningTemplateResult = (CreateProvisioningTemplateResult) obj;
        if ((createProvisioningTemplateResult.getTemplateArn() == null) ^ (getTemplateArn() == null)) {
            return false;
        }
        if (createProvisioningTemplateResult.getTemplateArn() != null && !createProvisioningTemplateResult.getTemplateArn().equals(getTemplateArn())) {
            return false;
        }
        if ((createProvisioningTemplateResult.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (createProvisioningTemplateResult.getTemplateName() != null && !createProvisioningTemplateResult.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((createProvisioningTemplateResult.getDefaultVersionId() == null) ^ (getDefaultVersionId() == null)) {
            return false;
        }
        return createProvisioningTemplateResult.getDefaultVersionId() == null || createProvisioningTemplateResult.getDefaultVersionId().equals(getDefaultVersionId());
    }

    public Integer getDefaultVersionId() {
        return this.defaultVersionId;
    }

    public String getTemplateArn() {
        return this.templateArn;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((getTemplateArn() == null ? 0 : getTemplateArn().hashCode()) + 31) * 31) + (getTemplateName() == null ? 0 : getTemplateName().hashCode())) * 31) + (getDefaultVersionId() != null ? getDefaultVersionId().hashCode() : 0);
    }

    public void setDefaultVersionId(Integer num) {
        this.defaultVersionId = num;
    }

    public void setTemplateArn(String str) {
        this.templateArn = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateArn() != null) {
            sb.append("templateArn: " + getTemplateArn() + ",");
        }
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getDefaultVersionId() != null) {
            sb.append("defaultVersionId: " + getDefaultVersionId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateProvisioningTemplateResult withDefaultVersionId(Integer num) {
        this.defaultVersionId = num;
        return this;
    }

    public CreateProvisioningTemplateResult withTemplateArn(String str) {
        this.templateArn = str;
        return this;
    }

    public CreateProvisioningTemplateResult withTemplateName(String str) {
        this.templateName = str;
        return this;
    }
}
