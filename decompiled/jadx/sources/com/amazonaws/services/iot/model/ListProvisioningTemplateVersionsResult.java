package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListProvisioningTemplateVersionsResult implements Serializable {
    private String nextToken;
    private List<ProvisioningTemplateVersionSummary> versions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListProvisioningTemplateVersionsResult)) {
            return false;
        }
        ListProvisioningTemplateVersionsResult listProvisioningTemplateVersionsResult = (ListProvisioningTemplateVersionsResult) obj;
        if ((listProvisioningTemplateVersionsResult.getVersions() == null) ^ (getVersions() == null)) {
            return false;
        }
        if (listProvisioningTemplateVersionsResult.getVersions() != null && !listProvisioningTemplateVersionsResult.getVersions().equals(getVersions())) {
            return false;
        }
        if ((listProvisioningTemplateVersionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listProvisioningTemplateVersionsResult.getNextToken() == null || listProvisioningTemplateVersionsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ProvisioningTemplateVersionSummary> getVersions() {
        return this.versions;
    }

    public int hashCode() {
        return (((getVersions() == null ? 0 : getVersions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setVersions(Collection<ProvisioningTemplateVersionSummary> collection) {
        if (collection == null) {
            this.versions = null;
        } else {
            this.versions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getVersions() != null) {
            sb.append("versions: " + getVersions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListProvisioningTemplateVersionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListProvisioningTemplateVersionsResult withVersions(ProvisioningTemplateVersionSummary... provisioningTemplateVersionSummaryArr) {
        if (getVersions() == null) {
            this.versions = new ArrayList(provisioningTemplateVersionSummaryArr.length);
        }
        for (ProvisioningTemplateVersionSummary provisioningTemplateVersionSummary : provisioningTemplateVersionSummaryArr) {
            this.versions.add(provisioningTemplateVersionSummary);
        }
        return this;
    }

    public ListProvisioningTemplateVersionsResult withVersions(Collection<ProvisioningTemplateVersionSummary> collection) {
        setVersions(collection);
        return this;
    }
}
