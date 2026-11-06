package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeletePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeletePolicyRequest)) {
            return false;
        }
        DeletePolicyRequest deletePolicyRequest = (DeletePolicyRequest) obj;
        if ((deletePolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        return deletePolicyRequest.getPolicyName() == null || deletePolicyRequest.getPolicyName().equals(getPolicyName());
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return 31 + (getPolicyName() == null ? 0 : getPolicyName().hashCode());
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeletePolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
