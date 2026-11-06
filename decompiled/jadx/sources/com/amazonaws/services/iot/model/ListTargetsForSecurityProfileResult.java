package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTargetsForSecurityProfileResult implements Serializable {
    private String nextToken;
    private List<SecurityProfileTarget> securityProfileTargets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTargetsForSecurityProfileResult)) {
            return false;
        }
        ListTargetsForSecurityProfileResult listTargetsForSecurityProfileResult = (ListTargetsForSecurityProfileResult) obj;
        if ((listTargetsForSecurityProfileResult.getSecurityProfileTargets() == null) ^ (getSecurityProfileTargets() == null)) {
            return false;
        }
        if (listTargetsForSecurityProfileResult.getSecurityProfileTargets() != null && !listTargetsForSecurityProfileResult.getSecurityProfileTargets().equals(getSecurityProfileTargets())) {
            return false;
        }
        if ((listTargetsForSecurityProfileResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTargetsForSecurityProfileResult.getNextToken() == null || listTargetsForSecurityProfileResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<SecurityProfileTarget> getSecurityProfileTargets() {
        return this.securityProfileTargets;
    }

    public int hashCode() {
        return (((getSecurityProfileTargets() == null ? 0 : getSecurityProfileTargets().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSecurityProfileTargets(Collection<SecurityProfileTarget> collection) {
        if (collection == null) {
            this.securityProfileTargets = null;
        } else {
            this.securityProfileTargets = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileTargets() != null) {
            sb.append("securityProfileTargets: " + getSecurityProfileTargets() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTargetsForSecurityProfileResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(SecurityProfileTarget... securityProfileTargetArr) {
        if (getSecurityProfileTargets() == null) {
            this.securityProfileTargets = new ArrayList(securityProfileTargetArr.length);
        }
        for (SecurityProfileTarget securityProfileTarget : securityProfileTargetArr) {
            this.securityProfileTargets.add(securityProfileTarget);
        }
        return this;
    }

    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(Collection<SecurityProfileTarget> collection) {
        setSecurityProfileTargets(collection);
        return this;
    }
}
