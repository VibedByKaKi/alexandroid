package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetIdentityProviderByIdentifierRequest extends AmazonWebServiceRequest implements Serializable {
    private String idpIdentifier;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdentityProviderByIdentifierRequest)) {
            return false;
        }
        GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest = (GetIdentityProviderByIdentifierRequest) obj;
        if ((getIdentityProviderByIdentifierRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (getIdentityProviderByIdentifierRequest.getUserPoolId() != null && !getIdentityProviderByIdentifierRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((getIdentityProviderByIdentifierRequest.getIdpIdentifier() == null) ^ (getIdpIdentifier() == null)) {
            return false;
        }
        return getIdentityProviderByIdentifierRequest.getIdpIdentifier() == null || getIdentityProviderByIdentifierRequest.getIdpIdentifier().equals(getIdpIdentifier());
    }

    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getIdpIdentifier() != null ? getIdpIdentifier().hashCode() : 0);
    }

    public void setIdpIdentifier(String str) {
        this.idpIdentifier = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getIdpIdentifier() != null) {
            sb.append("IdpIdentifier: " + getIdpIdentifier());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetIdentityProviderByIdentifierRequest withIdpIdentifier(String str) {
        this.idpIdentifier = str;
        return this;
    }

    public GetIdentityProviderByIdentifierRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
