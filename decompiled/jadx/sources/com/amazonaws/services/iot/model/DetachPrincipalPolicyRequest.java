package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetachPrincipalPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyName;
    private String principal;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetachPrincipalPolicyRequest)) {
            return false;
        }
        DetachPrincipalPolicyRequest detachPrincipalPolicyRequest = (DetachPrincipalPolicyRequest) obj;
        if ((detachPrincipalPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (detachPrincipalPolicyRequest.getPolicyName() != null && !detachPrincipalPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((detachPrincipalPolicyRequest.getPrincipal() == null) ^ (getPrincipal() == null)) {
            return false;
        }
        return detachPrincipalPolicyRequest.getPrincipal() == null || detachPrincipalPolicyRequest.getPrincipal().equals(getPrincipal());
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPrincipal() != null ? getPrincipal().hashCode() : 0);
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getPrincipal() != null) {
            sb.append("principal: " + getPrincipal());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DetachPrincipalPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public DetachPrincipalPolicyRequest withPrincipal(String str) {
        this.principal = str;
        return this;
    }
}
