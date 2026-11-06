package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateUserPoolDomainResult implements Serializable {
    private String cloudFrontDomain;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateUserPoolDomainResult)) {
            return false;
        }
        CreateUserPoolDomainResult createUserPoolDomainResult = (CreateUserPoolDomainResult) obj;
        if ((createUserPoolDomainResult.getCloudFrontDomain() == null) ^ (getCloudFrontDomain() == null)) {
            return false;
        }
        return createUserPoolDomainResult.getCloudFrontDomain() == null || createUserPoolDomainResult.getCloudFrontDomain().equals(getCloudFrontDomain());
    }

    public String getCloudFrontDomain() {
        return this.cloudFrontDomain;
    }

    public int hashCode() {
        return 31 + (getCloudFrontDomain() == null ? 0 : getCloudFrontDomain().hashCode());
    }

    public void setCloudFrontDomain(String str) {
        this.cloudFrontDomain = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCloudFrontDomain() != null) {
            sb.append("CloudFrontDomain: " + getCloudFrontDomain());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateUserPoolDomainResult withCloudFrontDomain(String str) {
        this.cloudFrontDomain = str;
        return this;
    }
}
