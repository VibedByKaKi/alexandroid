package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminDisableProviderForUserRequest extends AmazonWebServiceRequest implements Serializable {
    private ProviderUserIdentifierType user;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminDisableProviderForUserRequest)) {
            return false;
        }
        AdminDisableProviderForUserRequest adminDisableProviderForUserRequest = (AdminDisableProviderForUserRequest) obj;
        if ((adminDisableProviderForUserRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (adminDisableProviderForUserRequest.getUserPoolId() != null && !adminDisableProviderForUserRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((adminDisableProviderForUserRequest.getUser() == null) ^ (getUser() == null)) {
            return false;
        }
        return adminDisableProviderForUserRequest.getUser() == null || adminDisableProviderForUserRequest.getUser().equals(getUser());
    }

    public ProviderUserIdentifierType getUser() {
        return this.user;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getUser() != null ? getUser().hashCode() : 0);
    }

    public void setUser(ProviderUserIdentifierType providerUserIdentifierType) {
        this.user = providerUserIdentifierType;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getUser() != null) {
            sb.append("User: " + getUser());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminDisableProviderForUserRequest withUser(ProviderUserIdentifierType providerUserIdentifierType) {
        this.user = providerUserIdentifierType;
        return this;
    }

    public AdminDisableProviderForUserRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
