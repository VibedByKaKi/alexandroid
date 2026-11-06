package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteUserPoolDomainRequest extends AmazonWebServiceRequest implements Serializable {
    private String domain;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteUserPoolDomainRequest)) {
            return false;
        }
        DeleteUserPoolDomainRequest deleteUserPoolDomainRequest = (DeleteUserPoolDomainRequest) obj;
        if ((deleteUserPoolDomainRequest.getDomain() == null) ^ (getDomain() == null)) {
            return false;
        }
        if (deleteUserPoolDomainRequest.getDomain() != null && !deleteUserPoolDomainRequest.getDomain().equals(getDomain())) {
            return false;
        }
        if ((deleteUserPoolDomainRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        return deleteUserPoolDomainRequest.getUserPoolId() == null || deleteUserPoolDomainRequest.getUserPoolId().equals(getUserPoolId());
    }

    public String getDomain() {
        return this.domain;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getDomain() == null ? 0 : getDomain().hashCode()) + 31) * 31) + (getUserPoolId() != null ? getUserPoolId().hashCode() : 0);
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
            sb.append("UserPoolId: " + getUserPoolId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteUserPoolDomainRequest withDomain(String str) {
        this.domain = str;
        return this;
    }

    public DeleteUserPoolDomainRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
