package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListProvisioningTemplatesResult implements Serializable {
    private String nextToken;
    private List<ProvisioningTemplateSummary> templates;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListProvisioningTemplatesResult)) {
            return false;
        }
        ListProvisioningTemplatesResult listProvisioningTemplatesResult = (ListProvisioningTemplatesResult) obj;
        if ((listProvisioningTemplatesResult.getTemplates() == null) ^ (getTemplates() == null)) {
            return false;
        }
        if (listProvisioningTemplatesResult.getTemplates() != null && !listProvisioningTemplatesResult.getTemplates().equals(getTemplates())) {
            return false;
        }
        if ((listProvisioningTemplatesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listProvisioningTemplatesResult.getNextToken() == null || listProvisioningTemplatesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ProvisioningTemplateSummary> getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        return (((getTemplates() == null ? 0 : getTemplates().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setTemplates(Collection<ProvisioningTemplateSummary> collection) {
        if (collection == null) {
            this.templates = null;
        } else {
            this.templates = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplates() != null) {
            sb.append("templates: " + getTemplates() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListProvisioningTemplatesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListProvisioningTemplatesResult withTemplates(ProvisioningTemplateSummary... provisioningTemplateSummaryArr) {
        if (getTemplates() == null) {
            this.templates = new ArrayList(provisioningTemplateSummaryArr.length);
        }
        for (ProvisioningTemplateSummary provisioningTemplateSummary : provisioningTemplateSummaryArr) {
            this.templates.add(provisioningTemplateSummary);
        }
        return this;
    }

    public ListProvisioningTemplatesResult withTemplates(Collection<ProvisioningTemplateSummary> collection) {
        setTemplates(collection);
        return this;
    }
}
