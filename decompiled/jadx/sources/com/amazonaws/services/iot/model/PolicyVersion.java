package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PolicyVersion implements Serializable {
    private Date createDate;
    private Boolean isDefaultVersion;
    private String versionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolicyVersion)) {
            return false;
        }
        PolicyVersion policyVersion = (PolicyVersion) obj;
        if ((policyVersion.getVersionId() == null) ^ (getVersionId() == null)) {
            return false;
        }
        if (policyVersion.getVersionId() != null && !policyVersion.getVersionId().equals(getVersionId())) {
            return false;
        }
        if ((policyVersion.getIsDefaultVersion() == null) ^ (getIsDefaultVersion() == null)) {
            return false;
        }
        if (policyVersion.getIsDefaultVersion() != null && !policyVersion.getIsDefaultVersion().equals(getIsDefaultVersion())) {
            return false;
        }
        if ((policyVersion.getCreateDate() == null) ^ (getCreateDate() == null)) {
            return false;
        }
        return policyVersion.getCreateDate() == null || policyVersion.getCreateDate().equals(getCreateDate());
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return (((((getVersionId() == null ? 0 : getVersionId().hashCode()) + 31) * 31) + (getIsDefaultVersion() == null ? 0 : getIsDefaultVersion().hashCode())) * 31) + (getCreateDate() != null ? getCreateDate().hashCode() : 0);
    }

    public Boolean isIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public void setCreateDate(Date date) {
        this.createDate = date;
    }

    public void setIsDefaultVersion(Boolean bool) {
        this.isDefaultVersion = bool;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getVersionId() != null) {
            sb.append("versionId: " + getVersionId() + ",");
        }
        if (getIsDefaultVersion() != null) {
            sb.append("isDefaultVersion: " + getIsDefaultVersion() + ",");
        }
        if (getCreateDate() != null) {
            sb.append("createDate: " + getCreateDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PolicyVersion withCreateDate(Date date) {
        this.createDate = date;
        return this;
    }

    public PolicyVersion withIsDefaultVersion(Boolean bool) {
        this.isDefaultVersion = bool;
        return this;
    }

    public PolicyVersion withVersionId(String str) {
        this.versionId = str;
        return this;
    }
}
