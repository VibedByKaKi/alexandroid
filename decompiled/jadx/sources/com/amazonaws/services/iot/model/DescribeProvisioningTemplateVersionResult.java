package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeProvisioningTemplateVersionResult implements Serializable {
    private Date creationDate;
    private Boolean isDefaultVersion;
    private String templateBody;
    private Integer versionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProvisioningTemplateVersionResult)) {
            return false;
        }
        DescribeProvisioningTemplateVersionResult describeProvisioningTemplateVersionResult = (DescribeProvisioningTemplateVersionResult) obj;
        if ((describeProvisioningTemplateVersionResult.getVersionId() == null) ^ (getVersionId() == null)) {
            return false;
        }
        if (describeProvisioningTemplateVersionResult.getVersionId() != null && !describeProvisioningTemplateVersionResult.getVersionId().equals(getVersionId())) {
            return false;
        }
        if ((describeProvisioningTemplateVersionResult.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (describeProvisioningTemplateVersionResult.getCreationDate() != null && !describeProvisioningTemplateVersionResult.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((describeProvisioningTemplateVersionResult.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (describeProvisioningTemplateVersionResult.getTemplateBody() != null && !describeProvisioningTemplateVersionResult.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((describeProvisioningTemplateVersionResult.getIsDefaultVersion() == null) ^ (getIsDefaultVersion() == null)) {
            return false;
        }
        return describeProvisioningTemplateVersionResult.getIsDefaultVersion() == null || describeProvisioningTemplateVersionResult.getIsDefaultVersion().equals(getIsDefaultVersion());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public Integer getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return (((((((getVersionId() == null ? 0 : getVersionId().hashCode()) + 31) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getTemplateBody() == null ? 0 : getTemplateBody().hashCode())) * 31) + (getIsDefaultVersion() != null ? getIsDefaultVersion().hashCode() : 0);
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

    public void setTemplateBody(String str) {
        this.templateBody = str;
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
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getIsDefaultVersion() != null) {
            sb.append("isDefaultVersion: " + getIsDefaultVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeProvisioningTemplateVersionResult withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public DescribeProvisioningTemplateVersionResult withIsDefaultVersion(Boolean bool) {
        this.isDefaultVersion = bool;
        return this;
    }

    public DescribeProvisioningTemplateVersionResult withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }

    public DescribeProvisioningTemplateVersionResult withVersionId(Integer num) {
        this.versionId = num;
        return this;
    }
}
