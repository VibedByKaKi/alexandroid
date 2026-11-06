package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeProvisioningTemplateVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String templateName;
    private Integer versionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeProvisioningTemplateVersionRequest)) {
            return false;
        }
        DescribeProvisioningTemplateVersionRequest describeProvisioningTemplateVersionRequest = (DescribeProvisioningTemplateVersionRequest) obj;
        if ((describeProvisioningTemplateVersionRequest.getTemplateName() == null) ^ (getTemplateName() == null)) {
            return false;
        }
        if (describeProvisioningTemplateVersionRequest.getTemplateName() != null && !describeProvisioningTemplateVersionRequest.getTemplateName().equals(getTemplateName())) {
            return false;
        }
        if ((describeProvisioningTemplateVersionRequest.getVersionId() == null) ^ (getVersionId() == null)) {
            return false;
        }
        return describeProvisioningTemplateVersionRequest.getVersionId() == null || describeProvisioningTemplateVersionRequest.getVersionId().equals(getVersionId());
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public Integer getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return (((getTemplateName() == null ? 0 : getTemplateName().hashCode()) + 31) * 31) + (getVersionId() != null ? getVersionId().hashCode() : 0);
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setVersionId(Integer num) {
        this.versionId = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateName() != null) {
            sb.append("templateName: " + getTemplateName() + ",");
        }
        if (getVersionId() != null) {
            sb.append("versionId: " + getVersionId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeProvisioningTemplateVersionRequest withTemplateName(String str) {
        this.templateName = str;
        return this;
    }

    public DescribeProvisioningTemplateVersionRequest withVersionId(Integer num) {
        this.versionId = num;
        return this;
    }
}
