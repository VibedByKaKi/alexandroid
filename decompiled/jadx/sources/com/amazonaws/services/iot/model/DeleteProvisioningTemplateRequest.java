package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteProvisioningTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    private String templateName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteProvisioningTemplateRequest)) {
            return false;
        }
        DeleteProvisioningTemplateRequest deleteProvisioningTemplateRequest = (DeleteProvisioningTemplateRequest) obj;
        if ((deleteProvisioningTemplateRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        return deleteProvisioningTemplateRequest.getTemplateName() == null || deleteProvisioningTemplateRequest.getTemplateName().equals(getTemplateName());
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return 31 + (getTemplateName() == null ? 0 : getTemplateName().hashCode());
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteProvisioningTemplateRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }
}
