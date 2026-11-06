package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateAuditSuppressionRequest extends AmazonWebServiceRequest implements Serializable {
    private String checkName;
    private String description;
    private Date expirationDate;
    private ResourceIdentifier resourceIdentifier;
    private Boolean suppressIndefinitely;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateAuditSuppressionRequest)) {
            return false;
        }
        UpdateAuditSuppressionRequest updateAuditSuppressionRequest = (UpdateAuditSuppressionRequest) obj;
        if ((updateAuditSuppressionRequest.getCheckName() == null) ^ (getCheckName() == null)) {
            return false;
        }
        if (updateAuditSuppressionRequest.getCheckName() != null && !updateAuditSuppressionRequest.getCheckName().equals(getCheckName())) {
            return false;
        }
        if ((updateAuditSuppressionRequest.getResourceIdentifier() == null) ^ (getResourceIdentifier() == null)) {
            return false;
        }
        if (updateAuditSuppressionRequest.getResourceIdentifier() != null && !updateAuditSuppressionRequest.getResourceIdentifier().equals(getResourceIdentifier())) {
            return false;
        }
        if ((updateAuditSuppressionRequest.getExpirationDate() == null) ^ (getExpirationDate() == null)) {
            return false;
        }
        if (updateAuditSuppressionRequest.getExpirationDate() != null && !updateAuditSuppressionRequest.getExpirationDate().equals(getExpirationDate())) {
            return false;
        }
        if ((updateAuditSuppressionRequest.getSuppressIndefinitely() == null) ^ (getSuppressIndefinitely() == null)) {
            return false;
        }
        if (updateAuditSuppressionRequest.getSuppressIndefinitely() != null && !updateAuditSuppressionRequest.getSuppressIndefinitely().equals(getSuppressIndefinitely())) {
            return false;
        }
        if ((updateAuditSuppressionRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        return updateAuditSuppressionRequest.getDescription() == null || updateAuditSuppressionRequest.getDescription().equals(getDescription());
    }

    public String getCheckName() {
        return this.checkName;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public Boolean getSuppressIndefinitely() {
        return this.suppressIndefinitely;
    }

    public int hashCode() {
        return (((((((((getCheckName() == null ? 0 : getCheckName().hashCode()) + 31) * 31) + (getResourceIdentifier() == null ? 0 : getResourceIdentifier().hashCode())) * 31) + (getExpirationDate() == null ? 0 : getExpirationDate().hashCode())) * 31) + (getSuppressIndefinitely() == null ? 0 : getSuppressIndefinitely().hashCode())) * 31) + (getDescription() != null ? getDescription().hashCode() : 0);
    }

    public Boolean isSuppressIndefinitely() {
        return this.suppressIndefinitely;
    }

    public void setCheckName(String str) {
        this.checkName = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExpirationDate(Date date) {
        this.expirationDate = date;
    }

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public void setSuppressIndefinitely(Boolean bool) {
        this.suppressIndefinitely = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCheckName() != null) {
            sb.append("checkName: " + getCheckName() + ",");
        }
        if (getResourceIdentifier() != null) {
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        }
        if (getExpirationDate() != null) {
            sb.append("expirationDate: " + getExpirationDate() + ",");
        }
        if (getSuppressIndefinitely() != null) {
            sb.append("suppressIndefinitely: " + getSuppressIndefinitely() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateAuditSuppressionRequest withCheckName(String str) {
        this.checkName = str;
        return this;
    }

    public UpdateAuditSuppressionRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateAuditSuppressionRequest withExpirationDate(Date date) {
        this.expirationDate = date;
        return this;
    }

    public UpdateAuditSuppressionRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    public UpdateAuditSuppressionRequest withSuppressIndefinitely(Boolean bool) {
        this.suppressIndefinitely = bool;
        return this;
    }
}
