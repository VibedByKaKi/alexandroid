package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutDestinationPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessPolicy;
    private String destinationName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutDestinationPolicyRequest)) {
            return false;
        }
        PutDestinationPolicyRequest putDestinationPolicyRequest = (PutDestinationPolicyRequest) obj;
        if ((putDestinationPolicyRequest.getDestinationName() == null) ^ (getDestinationName() == null)) {
            return false;
        }
        if (putDestinationPolicyRequest.getDestinationName() != null && !putDestinationPolicyRequest.getDestinationName().equals(getDestinationName())) {
            return false;
        }
        if ((putDestinationPolicyRequest.getAccessPolicy() == null) ^ (getAccessPolicy() == null)) {
            return false;
        }
        return putDestinationPolicyRequest.getAccessPolicy() == null || putDestinationPolicyRequest.getAccessPolicy().equals(getAccessPolicy());
    }

    public String getAccessPolicy() {
        return this.accessPolicy;
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public int hashCode() {
        return (((getDestinationName() == null ? 0 : getDestinationName().hashCode()) + 31) * 31) + (getAccessPolicy() != null ? getAccessPolicy().hashCode() : 0);
    }

    public void setAccessPolicy(String str) {
        this.accessPolicy = str;
    }

    public void setDestinationName(String str) {
        this.destinationName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationName() != null) {
            sb.append("destinationName: " + getDestinationName() + ",");
        }
        if (getAccessPolicy() != null) {
            sb.append("accessPolicy: " + getAccessPolicy());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutDestinationPolicyRequest withAccessPolicy(String str) {
        this.accessPolicy = str;
        return this;
    }

    public PutDestinationPolicyRequest withDestinationName(String str) {
        this.destinationName = str;
        return this;
    }
}
