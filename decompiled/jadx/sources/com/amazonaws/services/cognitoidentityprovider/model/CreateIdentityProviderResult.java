package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateIdentityProviderResult implements Serializable {
    private IdentityProviderType identityProvider;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateIdentityProviderResult)) {
            return false;
        }
        CreateIdentityProviderResult createIdentityProviderResult = (CreateIdentityProviderResult) obj;
        if ((createIdentityProviderResult.getIdentityProvider() == null) ^ (getIdentityProvider() == null)) {
            return false;
        }
        return createIdentityProviderResult.getIdentityProvider() == null || createIdentityProviderResult.getIdentityProvider().equals(getIdentityProvider());
    }

    public IdentityProviderType getIdentityProvider() {
        return this.identityProvider;
    }

    public int hashCode() {
        return 31 + (getIdentityProvider() == null ? 0 : getIdentityProvider().hashCode());
    }

    public void setIdentityProvider(IdentityProviderType identityProviderType) {
        this.identityProvider = identityProviderType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityProvider() != null) {
            sb.append("IdentityProvider: " + getIdentityProvider());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateIdentityProviderResult withIdentityProvider(IdentityProviderType identityProviderType) {
        this.identityProvider = identityProviderType;
        return this;
    }
}
