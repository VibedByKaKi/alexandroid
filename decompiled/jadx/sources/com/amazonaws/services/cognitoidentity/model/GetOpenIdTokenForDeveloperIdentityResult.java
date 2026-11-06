package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetOpenIdTokenForDeveloperIdentityResult implements Serializable {
    private String identityId;
    private String token;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenForDeveloperIdentityResult)) {
            return false;
        }
        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = (GetOpenIdTokenForDeveloperIdentityResult) obj;
        if ((getOpenIdTokenForDeveloperIdentityResult.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityResult.getIdentityId() != null && !getOpenIdTokenForDeveloperIdentityResult.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((getOpenIdTokenForDeveloperIdentityResult.getToken() == null) ^ (getToken() == null)) {
            return false;
        }
        return getOpenIdTokenForDeveloperIdentityResult.getToken() == null || getOpenIdTokenForDeveloperIdentityResult.getToken().equals(getToken());
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((getIdentityId() == null ? 0 : getIdentityId().hashCode()) + 31) * 31) + (getToken() != null ? getToken().hashCode() : 0);
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getToken() != null) {
            sb.append("Token: " + getToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetOpenIdTokenForDeveloperIdentityResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityResult withToken(String str) {
        this.token = str;
        return this;
    }
}
