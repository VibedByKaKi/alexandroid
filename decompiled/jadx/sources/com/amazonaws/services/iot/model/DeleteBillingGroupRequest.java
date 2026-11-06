package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupName;
    private Long expectedVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteBillingGroupRequest)) {
            return false;
        }
        DeleteBillingGroupRequest deleteBillingGroupRequest = (DeleteBillingGroupRequest) obj;
        if ((deleteBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (deleteBillingGroupRequest.getBillingGroupName() != null && !deleteBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((deleteBillingGroupRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return deleteBillingGroupRequest.getExpectedVersion() == null || deleteBillingGroupRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public int hashCode() {
        return (((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public DeleteBillingGroupRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }
}
