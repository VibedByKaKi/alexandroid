package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateBillingGroupResult implements Serializable {
    private String billingGroupArn;
    private String billingGroupId;
    private String billingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateBillingGroupResult)) {
            return false;
        }
        CreateBillingGroupResult createBillingGroupResult = (CreateBillingGroupResult) obj;
        if ((createBillingGroupResult.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (createBillingGroupResult.getBillingGroupName() != null && !createBillingGroupResult.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((createBillingGroupResult.getBillingGroupArn() == null) ^ (getBillingGroupArn() == null)) {
            return false;
        }
        if (createBillingGroupResult.getBillingGroupArn() != null && !createBillingGroupResult.getBillingGroupArn().equals(getBillingGroupArn())) {
            return false;
        }
        if ((createBillingGroupResult.getBillingGroupId() == null) ^ (getBillingGroupId() == null)) {
            return false;
        }
        return createBillingGroupResult.getBillingGroupId() == null || createBillingGroupResult.getBillingGroupId().equals(getBillingGroupId());
    }

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    public String getBillingGroupId() {
        return this.billingGroupId;
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public int hashCode() {
        return (((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getBillingGroupArn() == null ? 0 : getBillingGroupArn().hashCode())) * 31) + (getBillingGroupId() != null ? getBillingGroupId().hashCode() : 0);
    }

    public void setBillingGroupArn(String str) {
        this.billingGroupArn = str;
    }

    public void setBillingGroupId(String str) {
        this.billingGroupId = str;
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getBillingGroupArn() != null) {
            sb.append("billingGroupArn: " + getBillingGroupArn() + ",");
        }
        if (getBillingGroupId() != null) {
            sb.append("billingGroupId: " + getBillingGroupId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateBillingGroupResult withBillingGroupArn(String str) {
        this.billingGroupArn = str;
        return this;
    }

    public CreateBillingGroupResult withBillingGroupId(String str) {
        this.billingGroupId = str;
        return this;
    }

    public CreateBillingGroupResult withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }
}
