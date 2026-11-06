package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPrincipalTagAttributeMapRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityPoolId;
    private String identityProviderName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPrincipalTagAttributeMapRequest)) {
            return false;
        }
        GetPrincipalTagAttributeMapRequest getPrincipalTagAttributeMapRequest = (GetPrincipalTagAttributeMapRequest) obj;
        if ((getPrincipalTagAttributeMapRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (getPrincipalTagAttributeMapRequest.getIdentityPoolId() != null && !getPrincipalTagAttributeMapRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((getPrincipalTagAttributeMapRequest.getIdentityProviderName() == null) ^ (getIdentityProviderName() == null)) {
            return false;
        }
        return getPrincipalTagAttributeMapRequest.getIdentityProviderName() == null || getPrincipalTagAttributeMapRequest.getIdentityProviderName().equals(getIdentityProviderName());
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public int hashCode() {
        return (((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityProviderName() != null ? getIdentityProviderName().hashCode() : 0);
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setIdentityProviderName(String str) {
        this.identityProviderName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityProviderName() != null) {
            sb.append("IdentityProviderName: " + getIdentityProviderName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetPrincipalTagAttributeMapRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public GetPrincipalTagAttributeMapRequest withIdentityProviderName(String str) {
        this.identityProviderName = str;
        return this;
    }
}
