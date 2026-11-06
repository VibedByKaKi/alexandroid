package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyName;
    private String policyVersionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPolicyVersionRequest)) {
            return false;
        }
        GetPolicyVersionRequest getPolicyVersionRequest = (GetPolicyVersionRequest) obj;
        if ((getPolicyVersionRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (getPolicyVersionRequest.getPolicyName() != null && !getPolicyVersionRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((getPolicyVersionRequest.getPolicyVersionId() == null) ^ (getPolicyVersionId() == null)) {
            return false;
        }
        return getPolicyVersionRequest.getPolicyVersionId() == null || getPolicyVersionRequest.getPolicyVersionId().equals(getPolicyVersionId());
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public String getPolicyVersionId() {
        return this.policyVersionId;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyVersionId() != null ? getPolicyVersionId().hashCode() : 0);
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setPolicyVersionId(String str) {
        this.policyVersionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getPolicyVersionId() != null) {
            sb.append("policyVersionId: " + getPolicyVersionId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetPolicyVersionRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public GetPolicyVersionRequest withPolicyVersionId(String str) {
        this.policyVersionId = str;
        return this;
    }
}
