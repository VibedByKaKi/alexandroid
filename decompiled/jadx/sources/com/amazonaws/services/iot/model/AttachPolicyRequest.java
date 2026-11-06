package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AttachPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyName;
    private String target;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AttachPolicyRequest)) {
            return false;
        }
        AttachPolicyRequest attachPolicyRequest = (AttachPolicyRequest) obj;
        if ((attachPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (attachPolicyRequest.getPolicyName() != null && !attachPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((attachPolicyRequest.getTarget() == null) ^ (getTarget() == null)) {
            return false;
        }
        return attachPolicyRequest.getTarget() == null || attachPolicyRequest.getTarget().equals(getTarget());
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getTarget() != null ? getTarget().hashCode() : 0);
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getTarget() != null) {
            sb.append("target: " + getTarget());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AttachPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public AttachPolicyRequest withTarget(String str) {
        this.target = str;
        return this;
    }
}
