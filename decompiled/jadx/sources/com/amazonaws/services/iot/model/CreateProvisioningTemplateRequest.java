package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    private String description;
    private Boolean enabled;
    private ProvisioningHook preProvisioningHook;
    private String provisioningRoleArn;
    private List<Tag> tags;
    private String templateBody;
    private String templateName;
    private String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProvisioningTemplateRequest)) {
            return false;
        }
        CreateProvisioningTemplateRequest createProvisioningTemplateRequest = (CreateProvisioningTemplateRequest) obj;
        if ((createProvisioningTemplateRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getTemplateName() != null && !createProvisioningTemplateRequest.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getDescription() != null && !createProvisioningTemplateRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getTemplateBody() != null && !createProvisioningTemplateRequest.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getEnabled() != null && !createProvisioningTemplateRequest.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getProvisioningRoleArn() == null) ^ (getProvisioningRoleArn() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getProvisioningRoleArn() != null && !createProvisioningTemplateRequest.getProvisioningRoleArn().equals(getProvisioningRoleArn())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getPreProvisioningHook() == null) ^ (getPreProvisioningHook() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getPreProvisioningHook() != null && !createProvisioningTemplateRequest.getPreProvisioningHook().equals(getPreProvisioningHook())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (createProvisioningTemplateRequest.getTags() != null && !createProvisioningTemplateRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((createProvisioningTemplateRequest.getType() == null) ^ (getType() == null)) {
            return false;
        }
        return createProvisioningTemplateRequest.getType() == null || createProvisioningTemplateRequest.getType().equals(getType());
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

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((getTemplateName() == null ? 0 : getTemplateName().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getTemplateBody() == null ? 0 : getTemplateBody().hashCode())) * 31) + (getEnabled() == null ? 0 : getEnabled().hashCode())) * 31) + (getProvisioningRoleArn() == null ? 0 : getProvisioningRoleArn().hashCode())) * 31) + (getPreProvisioningHook() == null ? 0 : getPreProvisioningHook().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getType() != null ? getType().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
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

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setType(TemplateType templateType) {
        this.type = templateType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getEnabled() != null) {
            sb.append("enabled: " + getEnabled() + ",");
        }
        if (getProvisioningRoleArn() != null) {
            sb.append("provisioningRoleArn: " + getProvisioningRoleArn() + ",");
        }
        if (getPreProvisioningHook() != null) {
            sb.append("preProvisioningHook: " + getPreProvisioningHook() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags() + ",");
        }
        if (getType() != null) {
            sb.append("type: " + getType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateProvisioningTemplateRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public CreateProvisioningTemplateRequest withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public CreateProvisioningTemplateRequest withPreProvisioningHook(ProvisioningHook provisioningHook) {
        this.preProvisioningHook = provisioningHook;
        return this;
    }

    public CreateProvisioningTemplateRequest withProvisioningRoleArn(String str) {
        this.provisioningRoleArn = str;
        return this;
    }

    public CreateProvisioningTemplateRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateProvisioningTemplateRequest withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }

    public CreateProvisioningTemplateRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }

    public CreateProvisioningTemplateRequest withType(TemplateType templateType) {
        this.type = templateType.toString();
        return this;
    }

    public void setType(String str) {
        this.type = str;
    }

    public CreateProvisioningTemplateRequest withType(String str) {
        this.type = str;
        return this;
    }

    public CreateProvisioningTemplateRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
