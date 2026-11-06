package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetEffectivePoliciesResult implements Serializable {
    private List<EffectivePolicy> effectivePolicies;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetEffectivePoliciesResult)) {
            return false;
        }
        GetEffectivePoliciesResult getEffectivePoliciesResult = (GetEffectivePoliciesResult) obj;
        if ((getEffectivePoliciesResult.getEffectivePolicies() == null) ^ (getEffectivePolicies() == null)) {
            return false;
        }
        return getEffectivePoliciesResult.getEffectivePolicies() == null || getEffectivePoliciesResult.getEffectivePolicies().equals(getEffectivePolicies());
    }

    public List<EffectivePolicy> getEffectivePolicies() {
        return this.effectivePolicies;
    }

    public int hashCode() {
        return 31 + (getEffectivePolicies() == null ? 0 : getEffectivePolicies().hashCode());
    }

    public void setEffectivePolicies(Collection<EffectivePolicy> collection) {
        if (collection == null) {
            this.effectivePolicies = null;
        } else {
            this.effectivePolicies = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEffectivePolicies() != null) {
            sb.append("effectivePolicies: " + getEffectivePolicies());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetEffectivePoliciesResult withEffectivePolicies(EffectivePolicy... effectivePolicyArr) {
        if (getEffectivePolicies() == null) {
            this.effectivePolicies = new ArrayList(effectivePolicyArr.length);
        }
        for (EffectivePolicy effectivePolicy : effectivePolicyArr) {
            this.effectivePolicies.add(effectivePolicy);
        }
        return this;
    }

    public GetEffectivePoliciesResult withEffectivePolicies(Collection<EffectivePolicy> collection) {
        setEffectivePolicies(collection);
        return this;
    }
}
