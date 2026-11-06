package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ProvisioningTemplateVersionSummary implements Serializable {
    private Date creationDate;
    private Boolean isDefaultVersion;
    private Integer versionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisioningTemplateVersionSummary)) {
            return false;
        }
        ProvisioningTemplateVersionSummary provisioningTemplateVersionSummary = (ProvisioningTemplateVersionSummary) obj;
        if ((provisioningTemplateVersionSummary.getVersionId() == null) ^ (getVersionId() == null)) {
            return false;
        }
        if (provisioningTemplateVersionSummary.getVersionId() != null && !provisioningTemplateVersionSummary.getVersionId().equals(getVersionId())) {
            return false;
        }
        if ((provisioningTemplateVersionSummary.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (provisioningTemplateVersionSummary.getCreationDate() != null && !provisioningTemplateVersionSummary.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((provisioningTemplateVersionSummary.getIsDefaultVersion() == null) ^ (getIsDefaultVersion() == null)) {
            return false;
        }
        return provisioningTemplateVersionSummary.getIsDefaultVersion() == null || provisioningTemplateVersionSummary.getIsDefaultVersion().equals(getIsDefaultVersion());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public Integer getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return (((((getVersionId() == null ? 0 : getVersionId().hashCode()) + 31) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getIsDefaultVersion() != null ? getIsDefaultVersion().hashCode() : 0);
    }

    public Boolean isIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setIsDefaultVersion(Boolean bool) {
        this.isDefaultVersion = bool;
    }

    public void setVersionId(Integer num) {
        this.versionId = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getVersionId() != null) {
            sb.append("versionId: " + getVersionId() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getIsDefaultVersion() != null) {
            sb.append("isDefaultVersion: " + getIsDefaultVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ProvisioningTemplateVersionSummary withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public ProvisioningTemplateVersionSummary withIsDefaultVersion(Boolean bool) {
        this.isDefaultVersion = bool;
        return this;
    }

    public ProvisioningTemplateVersionSummary withVersionId(Integer num) {
        this.versionId = num;
        return this;
    }
}
