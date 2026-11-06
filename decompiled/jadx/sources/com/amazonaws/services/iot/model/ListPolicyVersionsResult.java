package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPolicyVersionsResult implements Serializable {
    private List<PolicyVersion> policyVersions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPolicyVersionsResult)) {
            return false;
        }
        ListPolicyVersionsResult listPolicyVersionsResult = (ListPolicyVersionsResult) obj;
        if ((listPolicyVersionsResult.getPolicyVersions() == null) ^ (getPolicyVersions() == null)) {
            return false;
        }
        return listPolicyVersionsResult.getPolicyVersions() == null || listPolicyVersionsResult.getPolicyVersions().equals(getPolicyVersions());
    }

    public List<PolicyVersion> getPolicyVersions() {
        return this.policyVersions;
    }

    public int hashCode() {
        return 31 + (getPolicyVersions() == null ? 0 : getPolicyVersions().hashCode());
    }

    public void setPolicyVersions(Collection<PolicyVersion> collection) {
        if (collection == null) {
            this.policyVersions = null;
        } else {
            this.policyVersions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyVersions() != null) {
            sb.append("policyVersions: " + getPolicyVersions());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListPolicyVersionsResult withPolicyVersions(PolicyVersion... policyVersionArr) {
        if (getPolicyVersions() == null) {
            this.policyVersions = new ArrayList(policyVersionArr.length);
        }
        for (PolicyVersion policyVersion : policyVersionArr) {
            this.policyVersions.add(policyVersion);
        }
        return this;
    }

    public ListPolicyVersionsResult withPolicyVersions(Collection<PolicyVersion> collection) {
        setPolicyVersions(collection);
        return this;
    }
}
