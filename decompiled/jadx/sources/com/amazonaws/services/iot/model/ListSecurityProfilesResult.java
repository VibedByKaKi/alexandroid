package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListSecurityProfilesResult implements Serializable {
    private String nextToken;
    private List<SecurityProfileIdentifier> securityProfileIdentifiers;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListSecurityProfilesResult)) {
            return false;
        }
        ListSecurityProfilesResult listSecurityProfilesResult = (ListSecurityProfilesResult) obj;
        if ((listSecurityProfilesResult.getSecurityProfileIdentifiers() == null) ^ (getSecurityProfileIdentifiers() == null)) {
            return false;
        }
        if (listSecurityProfilesResult.getSecurityProfileIdentifiers() != null && !listSecurityProfilesResult.getSecurityProfileIdentifiers().equals(getSecurityProfileIdentifiers())) {
            return false;
        }
        if ((listSecurityProfilesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listSecurityProfilesResult.getNextToken() == null || listSecurityProfilesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<SecurityProfileIdentifier> getSecurityProfileIdentifiers() {
        return this.securityProfileIdentifiers;
    }

    public int hashCode() {
        return (((getSecurityProfileIdentifiers() == null ? 0 : getSecurityProfileIdentifiers().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSecurityProfileIdentifiers(Collection<SecurityProfileIdentifier> collection) {
        if (collection == null) {
            this.securityProfileIdentifiers = null;
        } else {
            this.securityProfileIdentifiers = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileIdentifiers() != null) {
            sb.append("securityProfileIdentifiers: " + getSecurityProfileIdentifiers() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListSecurityProfilesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListSecurityProfilesResult withSecurityProfileIdentifiers(SecurityProfileIdentifier... securityProfileIdentifierArr) {
        if (getSecurityProfileIdentifiers() == null) {
            this.securityProfileIdentifiers = new ArrayList(securityProfileIdentifierArr.length);
        }
        for (SecurityProfileIdentifier securityProfileIdentifier : securityProfileIdentifierArr) {
            this.securityProfileIdentifiers.add(securityProfileIdentifier);
        }
        return this;
    }

    public ListSecurityProfilesResult withSecurityProfileIdentifiers(Collection<SecurityProfileIdentifier> collection) {
        setSecurityProfileIdentifiers(collection);
        return this;
    }
}
