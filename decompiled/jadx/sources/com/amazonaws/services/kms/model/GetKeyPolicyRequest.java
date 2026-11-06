package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetKeyPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetKeyPolicyRequest)) {
            return false;
        }
        GetKeyPolicyRequest getKeyPolicyRequest = (GetKeyPolicyRequest) obj;
        if ((getKeyPolicyRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (getKeyPolicyRequest.getKeyId() != null && !getKeyPolicyRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((getKeyPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        return getKeyPolicyRequest.getPolicyName() == null || getKeyPolicyRequest.getPolicyName().equals(getPolicyName());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPolicyName() != null ? getPolicyName().hashCode() : 0);
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getPolicyName() != null) {
            sb.append("PolicyName: " + getPolicyName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetKeyPolicyRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public GetKeyPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
