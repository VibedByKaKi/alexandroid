package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteAuditSuppressionRequest extends AmazonWebServiceRequest implements Serializable {
    private String checkName;
    private ResourceIdentifier resourceIdentifier;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteAuditSuppressionRequest)) {
            return false;
        }
        DeleteAuditSuppressionRequest deleteAuditSuppressionRequest = (DeleteAuditSuppressionRequest) obj;
        if ((deleteAuditSuppressionRequest.getCheckName() == null) ^ (getCheckName() == null)) {
            return false;
        }
        if (deleteAuditSuppressionRequest.getCheckName() != null && !deleteAuditSuppressionRequest.getCheckName().equals(getCheckName())) {
            return false;
        }
        if ((deleteAuditSuppressionRequest.getResourceIdentifier() == null) ^ (getResourceIdentifier() == null)) {
            return false;
        }
        return deleteAuditSuppressionRequest.getResourceIdentifier() == null || deleteAuditSuppressionRequest.getResourceIdentifier().equals(getResourceIdentifier());
    }

    public String getCheckName() {
        return this.checkName;
    }

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public int hashCode() {
        return (((getCheckName() == null ? 0 : getCheckName().hashCode()) + 31) * 31) + (getResourceIdentifier() != null ? getResourceIdentifier().hashCode() : 0);
    }

    public void setCheckName(String str) {
        this.checkName = str;
    }

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCheckName() != null) {
            sb.append("checkName: " + getCheckName() + ",");
        }
        if (getResourceIdentifier() != null) {
            sb.append("resourceIdentifier: " + getResourceIdentifier());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteAuditSuppressionRequest withCheckName(String str) {
        this.checkName = str;
        return this;
    }

    public DeleteAuditSuppressionRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
}
