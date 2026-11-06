package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ManagedJobTemplateSummary implements Serializable {
    private String description;
    private List<String> environments;
    private String templateArn;
    private String templateName;
    private String templateVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ManagedJobTemplateSummary)) {
            return false;
        }
        ManagedJobTemplateSummary managedJobTemplateSummary = (ManagedJobTemplateSummary) obj;
        if ((managedJobTemplateSummary.getTemplateArn() == null) ^ (getTemplateArn() == null)) {
            return false;
        }
        if (managedJobTemplateSummary.getTemplateArn() != null && !managedJobTemplateSummary.getTemplateArn().equals(getTemplateArn())) {
            return false;
        }
        if ((managedJobTemplateSummary.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (managedJobTemplateSummary.getTemplateName() != null && !managedJobTemplateSummary.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((managedJobTemplateSummary.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (managedJobTemplateSummary.getDescription() != null && !managedJobTemplateSummary.getDescription().equals(getDescription())) {
            return false;
        }
        if ((managedJobTemplateSummary.getEnvironments() == null) ^ (getEnvironments() == null)) {
            return false;
        }
        if (managedJobTemplateSummary.getEnvironments() != null && !managedJobTemplateSummary.getEnvironments().equals(getEnvironments())) {
            return false;
        }
        if ((managedJobTemplateSummary.getTemplateVersion() == null) ^ (getTemplateVersion() == null)) {
            return false;
        }
        return managedJobTemplateSummary.getTemplateVersion() == null || managedJobTemplateSummary.getTemplateVersion().equals(getTemplateVersion());
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getEnvironments() {
        return this.environments;
    }

    public String getTemplateArn() {
        return this.templateArn;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public int hashCode() {
        return (((((((((getTemplateArn() == null ? 0 : getTemplateArn().hashCode()) + 31) * 31) + (getTemplateName() == null ? 0 : getTemplateName().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getEnvironments() == null ? 0 : getEnvironments().hashCode())) * 31) + (getTemplateVersion() != null ? getTemplateVersion().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEnvironments(Collection<String> collection) {
        if (collection == null) {
            this.environments = null;
        } else {
            this.environments = new ArrayList(collection);
        }
    }

    public void setTemplateArn(String str) {
        this.templateArn = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTemplateVersion(String str) {
        this.templateVersion = str;
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
        if (getEnvironments() != null) {
            sb.append("environments: " + getEnvironments() + ",");
        }
        if (getTemplateVersion() != null) {
            sb.append("templateVersion: " + getTemplateVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ManagedJobTemplateSummary withDescription(String str) {
        this.description = str;
        return this;
    }

    public ManagedJobTemplateSummary withEnvironments(String... strArr) {
        if (getEnvironments() == null) {
            this.environments = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.environments.add(str);
        }
        return this;
    }

    public ManagedJobTemplateSummary withTemplateArn(String str) {
        this.templateArn = str;
        return this;
    }

    public ManagedJobTemplateSummary withTemplateName(String str) {
        this.templateName = str;
        return this;
    }

    public ManagedJobTemplateSummary withTemplateVersion(String str) {
        this.templateVersion = str;
        return this;
    }

    public ManagedJobTemplateSummary withEnvironments(Collection<String> collection) {
        setEnvironments(collection);
        return this;
    }
}
