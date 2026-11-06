package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAttachedPoliciesResult implements Serializable {
    private String nextMarker;
    private List<Policy> policies;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAttachedPoliciesResult)) {
            return false;
        }
        ListAttachedPoliciesResult listAttachedPoliciesResult = (ListAttachedPoliciesResult) obj;
        if ((listAttachedPoliciesResult.getPolicies() == null) ^ (getPolicies() == null)) {
            return false;
        }
        if (listAttachedPoliciesResult.getPolicies() != null && !listAttachedPoliciesResult.getPolicies().equals(getPolicies())) {
            return false;
        }
        if ((listAttachedPoliciesResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listAttachedPoliciesResult.getNextMarker() == null || listAttachedPoliciesResult.getNextMarker().equals(getNextMarker());
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public List<Policy> getPolicies() {
        return this.policies;
    }

    public int hashCode() {
        return (((getPolicies() == null ? 0 : getPolicies().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public void setPolicies(Collection<Policy> collection) {
        if (collection == null) {
            this.policies = null;
        } else {
            this.policies = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicies() != null) {
            sb.append("policies: " + getPolicies() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAttachedPoliciesResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListAttachedPoliciesResult withPolicies(Policy... policyArr) {
        if (getPolicies() == null) {
            this.policies = new ArrayList(policyArr.length);
        }
        for (Policy policy : policyArr) {
            this.policies.add(policy);
        }
        return this;
    }

    public ListAttachedPoliciesResult withPolicies(Collection<Policy> collection) {
        setPolicies(collection);
        return this;
    }
}
