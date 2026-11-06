package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateProvisioningTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer defaultVersionId;
    private String description;
    private Boolean enabled;
    private ProvisioningHook preProvisioningHook;
    private String provisioningRoleArn;
    private Boolean removePreProvisioningHook;
    private String templateName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateProvisioningTemplateRequest)) {
            return false;
        }
        UpdateProvisioningTemplateRequest updateProvisioningTemplateRequest = (UpdateProvisioningTemplateRequest) obj;
        if ((updateProvisioningTemplateRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getTemplateName() != null && !updateProvisioningTemplateRequest.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getDescription() != null && !updateProvisioningTemplateRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getEnabled() != null && !updateProvisioningTemplateRequest.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getDefaultVersionId() == null) ^ (getDefaultVersionId() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getDefaultVersionId() != null && !updateProvisioningTemplateRequest.getDefaultVersionId().equals(getDefaultVersionId())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getProvisioningRoleArn() == null) ^ (getProvisioningRoleArn() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getProvisioningRoleArn() != null && !updateProvisioningTemplateRequest.getProvisioningRoleArn().equals(getProvisioningRoleArn())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getPreProvisioningHook() == null) ^ (getPreProvisioningHook() == null)) {
            return false;
        }
        if (updateProvisioningTemplateRequest.getPreProvisioningHook() != null && !updateProvisioningTemplateRequest.getPreProvisioningHook().equals(getPreProvisioningHook())) {
            return false;
        }
        if ((updateProvisioningTemplateRequest.getRemovePreProvisioningHook() == null) ^ (getRemovePreProvisioningHook() == null)) {
            return false;
        }
        return updateProvisioningTemplateRequest.getRemovePreProvisioningHook() == null || updateProvisioningTemplateRequest.getRemovePreProvisioningHook().equals(getRemovePreProvisioningHook());
    }

    public Integer getDefaultVersionId() {
        return this.defaultVersionId;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ProvisioningHook getPreProvisioningHook() {
        return this.preProvisioningHook;
    }

    public String getProvisioningRoleArn() {
        return this.provisioningRoleArn;
    }

    public Boolean getRemovePreProvisioningHook() {
        return this.removePreProvisioningHook;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((((((((((getTemplateName() == null ? 0 : getTemplateName().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getEnabled() == null ? 0 : getEnabled().hashCode())) * 31) + (getDefaultVersionId() == null ? 0 : getDefaultVersionId().hashCode())) * 31) + (getProvisioningRoleArn() == null ? 0 : getProvisioningRoleArn().hashCode())) * 31) + (getPreProvisioningHook() == null ? 0 : getPreProvisioningHook().hashCode())) * 31) + (getRemovePreProvisioningHook() != null ? getRemovePreProvisioningHook().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public Boolean isRemovePreProvisioningHook() {
        return this.removePreProvisioningHook;
    }

    public void setDefaultVersionId(Integer num) {
        this.defaultVersionId = num;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setPreProvisioningHook(ProvisioningHook provisioningHook) {
        this.preProvisioningHook = provisioningHook;
    }

    public void setProvisioningRoleArn(String str) {
        this.provisioningRoleArn = str;
    }

    public void setRemovePreProvisioningHook(Boolean bool) {
        this.removePreProvisioningHook = bool;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getEnabled() != null) {
            sb.append("enabled: " + getEnabled() + ",");
        }
        if (getDefaultVersionId() != null) {
            sb.append("defaultVersionId: " + getDefaultVersionId() + ",");
        }
        if (getProvisioningRoleArn() != null) {
            sb.append("provisioningRoleArn: " + getProvisioningRoleArn() + ",");
        }
        if (getPreProvisioningHook() != null) {
            sb.append("preProvisioningHook: " + getPreProvisioningHook() + ",");
        }
        if (getRemovePreProvisioningHook() != null) {
            sb.append("removePreProvisioningHook: " + getRemovePreProvisioningHook());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateProvisioningTemplateRequest withDefaultVersionId(Integer num) {
        this.defaultVersionId = num;
        return this;
    }

    public UpdateProvisioningTemplateRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateProvisioningTemplateRequest withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public UpdateProvisioningTemplateRequest withPreProvisioningHook(ProvisioningHook provisioningHook) {
        this.preProvisioningHook = provisioningHook;
        return this;
    }

    public UpdateProvisioningTemplateRequest withProvisioningRoleArn(String str) {
        this.provisioningRoleArn = str;
        return this;
    }

    public UpdateProvisioningTemplateRequest withRemovePreProvisioningHook(Boolean bool) {
        this.removePreProvisioningHook = bool;
        return this;
    }

    public UpdateProvisioningTemplateRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }
}
