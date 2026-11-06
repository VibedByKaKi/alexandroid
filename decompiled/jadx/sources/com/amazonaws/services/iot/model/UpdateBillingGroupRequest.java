package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupName;
    private BillingGroupProperties billingGroupProperties;
    private Long expectedVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateBillingGroupRequest)) {
            return false;
        }
        UpdateBillingGroupRequest updateBillingGroupRequest = (UpdateBillingGroupRequest) obj;
        if ((updateBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (updateBillingGroupRequest.getBillingGroupName() != null && !updateBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((updateBillingGroupRequest.getBillingGroupProperties() == null) ^ (getBillingGroupProperties() == null)) {
            return false;
        }
        if (updateBillingGroupRequest.getBillingGroupProperties() != null && !updateBillingGroupRequest.getBillingGroupProperties().equals(getBillingGroupProperties())) {
            return false;
        }
        if ((updateBillingGroupRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return updateBillingGroupRequest.getExpectedVersion() == null || updateBillingGroupRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public BillingGroupProperties getBillingGroupProperties() {
        return this.billingGroupProperties;
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public int hashCode() {
        return (((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getBillingGroupProperties() == null ? 0 : getBillingGroupProperties().hashCode())) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getBillingGroupProperties() != null) {
            sb.append("billingGroupProperties: " + getBillingGroupProperties() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public UpdateBillingGroupRequest withBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
        return this;
    }

    public UpdateBillingGroupRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }
}
