package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RevokeTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientId;
    private String clientSecret;
    private String token;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RevokeTokenRequest)) {
            return false;
        }
        RevokeTokenRequest revokeTokenRequest = (RevokeTokenRequest) obj;
        if ((revokeTokenRequest.getToken() == null) ^ (getToken() == null)) {
            return false;
        }
        if (revokeTokenRequest.getToken() != null && !revokeTokenRequest.getToken().equals(getToken())) {
            return false;
        }
        if ((revokeTokenRequest.getClientId() == null) ^ (getClientId() == null)) {
            return false;
        }
        if (revokeTokenRequest.getClientId() != null && !revokeTokenRequest.getClientId().equals(getClientId())) {
            return false;
        }
        if ((revokeTokenRequest.getClientSecret() == null) ^ (getClientSecret() == null)) {
            return false;
        }
        return revokeTokenRequest.getClientSecret() == null || revokeTokenRequest.getClientSecret().equals(getClientSecret());
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((getToken() == null ? 0 : getToken().hashCode()) + 31) * 31) + (getClientId() == null ? 0 : getClientId().hashCode())) * 31) + (getClientSecret() != null ? getClientSecret().hashCode() : 0);
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientSecret(String str) {
        this.clientSecret = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getToken() != null) {
            sb.append("Token: " + getToken() + ",");
        }
        if (getClientId() != null) {
            sb.append("ClientId: " + getClientId() + ",");
        }
        if (getClientSecret() != null) {
            sb.append("ClientSecret: " + getClientSecret());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RevokeTokenRequest withClientId(String str) {
        this.clientId = str;
        return this;
    }

    public RevokeTokenRequest withClientSecret(String str) {
        this.clientSecret = str;
        return this;
    }

    public RevokeTokenRequest withToken(String str) {
        this.token = str;
        return this;
    }
}
