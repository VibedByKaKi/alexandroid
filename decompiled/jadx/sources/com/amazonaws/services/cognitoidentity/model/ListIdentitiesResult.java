package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListIdentitiesResult implements Serializable {
    private List<IdentityDescription> identities;
    private String identityPoolId;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentitiesResult)) {
            return false;
        }
        ListIdentitiesResult listIdentitiesResult = (ListIdentitiesResult) obj;
        if ((listIdentitiesResult.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (listIdentitiesResult.getIdentityPoolId() != null && !listIdentitiesResult.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((listIdentitiesResult.getIdentities() == null) ^ (getIdentities() == null)) {
            return false;
        }
        if (listIdentitiesResult.getIdentities() != null && !listIdentitiesResult.getIdentities().equals(getIdentities())) {
            return false;
        }
        if ((listIdentitiesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listIdentitiesResult.getNextToken() == null || listIdentitiesResult.getNextToken().equals(getNextToken());
    }

    public List<IdentityDescription> getIdentities() {
        return this.identities;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentities() == null ? 0 : getIdentities().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setIdentities(Collection<IdentityDescription> collection) {
        if (collection == null) {
            this.identities = null;
        } else {
            this.identities = new ArrayList(collection);
        }
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentities() != null) {
            sb.append("Identities: " + getIdentities() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListIdentitiesResult withIdentities(IdentityDescription... identityDescriptionArr) {
        if (getIdentities() == null) {
            this.identities = new ArrayList(identityDescriptionArr.length);
        }
        for (IdentityDescription identityDescription : identityDescriptionArr) {
            this.identities.add(identityDescription);
        }
        return this;
    }

    public ListIdentitiesResult withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public ListIdentitiesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListIdentitiesResult withIdentities(Collection<IdentityDescription> collection) {
        setIdentities(collection);
        return this;
    }
}
