package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeUserPoolDomainResult implements Serializable {
    private DomainDescriptionType domainDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeUserPoolDomainResult)) {
            return false;
        }
        DescribeUserPoolDomainResult describeUserPoolDomainResult = (DescribeUserPoolDomainResult) obj;
        if ((describeUserPoolDomainResult.getDomainDescription() == null) ^ (getDomainDescription() == null)) {
            return false;
        }
        return describeUserPoolDomainResult.getDomainDescription() == null || describeUserPoolDomainResult.getDomainDescription().equals(getDomainDescription());
    }

    public DomainDescriptionType getDomainDescription() {
        return this.domainDescription;
    }

    public int hashCode() {
        return 31 + (getDomainDescription() == null ? 0 : getDomainDescription().hashCode());
    }

    public void setDomainDescription(DomainDescriptionType domainDescriptionType) {
        this.domainDescription = domainDescriptionType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomainDescription() != null) {
            sb.append("DomainDescription: " + getDomainDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeUserPoolDomainResult withDomainDescription(DomainDescriptionType domainDescriptionType) {
        this.domainDescription = domainDescriptionType;
        return this;
    }
}
