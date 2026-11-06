package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationName;
    private String roleArn;
    private String targetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutDestinationRequest)) {
            return false;
        }
        PutDestinationRequest putDestinationRequest = (PutDestinationRequest) obj;
        if ((putDestinationRequest.getDestinationName() == null) ^ (getDestinationName() == null)) {
            return false;
        }
        if (putDestinationRequest.getDestinationName() != null && !putDestinationRequest.getDestinationName().equals(getDestinationName())) {
            return false;
        }
        if ((putDestinationRequest.getTargetArn() == null) ^ (getTargetArn() == null)) {
            return false;
        }
        if (putDestinationRequest.getTargetArn() != null && !putDestinationRequest.getTargetArn().equals(getTargetArn())) {
            return false;
        }
        if ((putDestinationRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return putDestinationRequest.getRoleArn() == null || putDestinationRequest.getRoleArn().equals(getRoleArn());
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTargetArn() {
        return this.targetArn;
    }

    public int hashCode() {
        return (((((getDestinationName() == null ? 0 : getDestinationName().hashCode()) + 31) * 31) + (getTargetArn() == null ? 0 : getTargetArn().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setDestinationName(String str) {
        this.destinationName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTargetArn(String str) {
        this.targetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationName() != null) {
            sb.append("destinationName: " + getDestinationName() + ",");
        }
        if (getTargetArn() != null) {
            sb.append("targetArn: " + getTargetArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutDestinationRequest withDestinationName(String str) {
        this.destinationName = str;
        return this;
    }

    public PutDestinationRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public PutDestinationRequest withTargetArn(String str) {
        this.targetArn = str;
        return this;
    }
}
