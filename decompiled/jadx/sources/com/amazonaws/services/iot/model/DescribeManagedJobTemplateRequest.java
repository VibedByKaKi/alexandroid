package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeManagedJobTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    private String templateName;
    private String templateVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeManagedJobTemplateRequest)) {
            return false;
        }
        DescribeManagedJobTemplateRequest describeManagedJobTemplateRequest = (DescribeManagedJobTemplateRequest) obj;
        if ((describeManagedJobTemplateRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (describeManagedJobTemplateRequest.getTemplateName() != null && !describeManagedJobTemplateRequest.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((describeManagedJobTemplateRequest.getTemplateVersion() == null) ^ (getTemplateVersion() == null)) {
            return false;
        }
        return describeManagedJobTemplateRequest.getTemplateVersion() == null || describeManagedJobTemplateRequest.getTemplateVersion().equals(getTemplateVersion());
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public int hashCode() {
        return (((getTemplateName() == null ? 0 : getTemplateName().hashCode()) + 31) * 31) + (getTemplateVersion() != null ? getTemplateVersion().hashCode() : 0);
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTemplateVersion(String str) {
        this.templateVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getTemplateVersion() != null) {
            sb.append("templateVersion: " + getTemplateVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeManagedJobTemplateRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }

    public DescribeManagedJobTemplateRequest withTemplateVersion(String str) {
        this.templateVersion = str;
        return this;
    }
}
