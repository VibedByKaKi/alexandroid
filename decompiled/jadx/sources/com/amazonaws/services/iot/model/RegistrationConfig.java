package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegistrationConfig implements Serializable {
    private String roleArn;
    private String templateBody;
    private String templateName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegistrationConfig)) {
            return false;
        }
        RegistrationConfig registrationConfig = (RegistrationConfig) obj;
        if ((registrationConfig.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (registrationConfig.getTemplateBody() != null && !registrationConfig.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((registrationConfig.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (registrationConfig.getRoleArn() != null && !registrationConfig.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((registrationConfig.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        return registrationConfig.getTemplateName() == null || registrationConfig.getTemplateName().equals(getTemplateName());
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((getTemplateBody() == null ? 0 : getTemplateBody().hashCode()) + 31) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getTemplateName() != null ? getTemplateName().hashCode() : 0);
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegistrationConfig withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public RegistrationConfig withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }

    public RegistrationConfig withTemplateName(String str) {
        this.templateName = str;
        return this;
    }
}
