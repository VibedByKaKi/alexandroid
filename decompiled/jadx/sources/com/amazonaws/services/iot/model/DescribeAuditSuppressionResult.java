package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeAuditSuppressionResult implements Serializable {
    private String checkName;
    private String description;
    private Date expirationDate;
    private ResourceIdentifier resourceIdentifier;
    private Boolean suppressIndefinitely;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeAuditSuppressionResult)) {
            return false;
        }
        DescribeAuditSuppressionResult describeAuditSuppressionResult = (DescribeAuditSuppressionResult) obj;
        if ((describeAuditSuppressionResult.getCheckName() == null) ^ (getCheckName() == null)) {
            return false;
        }
        if (describeAuditSuppressionResult.getCheckName() != null && !describeAuditSuppressionResult.getCheckName().equals(getCheckName())) {
            return false;
        }
        if ((describeAuditSuppressionResult.getResourceIdentifier() == null) ^ (getResourceIdentifier() == null)) {
            return false;
        }
        if (describeAuditSuppressionResult.getResourceIdentifier() != null && !describeAuditSuppressionResult.getResourceIdentifier().equals(getResourceIdentifier())) {
            return false;
        }
        if ((describeAuditSuppressionResult.getExpirationDate() == null) ^ (getExpirationDate() == null)) {
            return false;
        }
        if (describeAuditSuppressionResult.getExpirationDate() != null && !describeAuditSuppressionResult.getExpirationDate().equals(getExpirationDate())) {
            return false;
        }
        if ((describeAuditSuppressionResult.getSuppressIndefinitely() == null) ^ (getSuppressIndefinitely() == null)) {
            return false;
        }
        if (describeAuditSuppressionResult.getSuppressIndefinitely() != null && !describeAuditSuppressionResult.getSuppressIndefinitely().equals(getSuppressIndefinitely())) {
            return false;
        }
        if ((describeAuditSuppressionResult.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        return describeAuditSuppressionResult.getDescription() == null || describeAuditSuppressionResult.getDescription().equals(getDescription());
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

    public DescribeAuditSuppressionResult withCheckName(String str) {
        this.checkName = str;
        return this;
    }

    public DescribeAuditSuppressionResult withDescription(String str) {
        this.description = str;
        return this;
    }

    public DescribeAuditSuppressionResult withExpirationDate(Date date) {
        this.expirationDate = date;
        return this;
    }

    public DescribeAuditSuppressionResult withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    public DescribeAuditSuppressionResult withSuppressIndefinitely(Boolean bool) {
        this.suppressIndefinitely = bool;
        return this;
    }
}
