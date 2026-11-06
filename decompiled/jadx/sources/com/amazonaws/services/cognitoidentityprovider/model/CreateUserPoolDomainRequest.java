package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateUserPoolDomainRequest extends AmazonWebServiceRequest implements Serializable {
    private CustomDomainConfigType customDomainConfig;
    private String domain;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateUserPoolDomainRequest)) {
            return false;
        }
        CreateUserPoolDomainRequest createUserPoolDomainRequest = (CreateUserPoolDomainRequest) obj;
        if ((createUserPoolDomainRequest.getDomain() == null) ^ (getDomain() == null)) {
            return false;
        }
        if (createUserPoolDomainRequest.getDomain() != null && !createUserPoolDomainRequest.getDomain().equals(getDomain())) {
            return false;
        }
        if ((createUserPoolDomainRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (createUserPoolDomainRequest.getUserPoolId() != null && !createUserPoolDomainRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((createUserPoolDomainRequest.getCustomDomainConfig() == null) ^ (getCustomDomainConfig() == null)) {
            return false;
        }
        return createUserPoolDomainRequest.getCustomDomainConfig() == null || createUserPoolDomainRequest.getCustomDomainConfig().equals(getCustomDomainConfig());
    }

    public CustomDomainConfigType getCustomDomainConfig() {
        return this.customDomainConfig;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((((getDomain() == null ? 0 : getDomain().hashCode()) + 31) * 31) + (getUserPoolId() == null ? 0 : getUserPoolId().hashCode())) * 31) + (getCustomDomainConfig() != null ? getCustomDomainConfig().hashCode() : 0);
    }

    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfigType) {
        this.customDomainConfig = customDomainConfigType;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomain() != null) {
            sb.append("Domain: " + getDomain() + ",");
        }
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getCustomDomainConfig() != null) {
            sb.append("CustomDomainConfig: " + getCustomDomainConfig());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateUserPoolDomainRequest withCustomDomainConfig(CustomDomainConfigType customDomainConfigType) {
        this.customDomainConfig = customDomainConfigType;
        return this;
    }

    public CreateUserPoolDomainRequest withDomain(String str) {
        this.domain = str;
        return this;
    }

    public CreateUserPoolDomainRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
