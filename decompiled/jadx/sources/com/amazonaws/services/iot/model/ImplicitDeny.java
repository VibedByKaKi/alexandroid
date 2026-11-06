package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ImplicitDeny implements Serializable {
    private List<Policy> policies;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ImplicitDeny)) {
            return false;
        }
        ImplicitDeny implicitDeny = (ImplicitDeny) obj;
        if ((implicitDeny.getPolicies() == null) ^ (getPolicies() == null)) {
            return false;
        }
        return implicitDeny.getPolicies() == null || implicitDeny.getPolicies().equals(getPolicies());
    }

    public List<Policy> getPolicies() {
        return this.policies;
    }

    public int hashCode() {
        return 31 + (getPolicies() == null ? 0 : getPolicies().hashCode());
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
            sb.append("policies: " + getPolicies());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ImplicitDeny withPolicies(Policy... policyArr) {
        if (getPolicies() == null) {
            this.policies = new ArrayList(policyArr.length);
        }
        for (Policy policy : policyArr) {
            this.policies.add(policy);
        }
        return this;
    }

    public ImplicitDeny withPolicies(Collection<Policy> collection) {
        setPolicies(collection);
        return this;
    }
}
