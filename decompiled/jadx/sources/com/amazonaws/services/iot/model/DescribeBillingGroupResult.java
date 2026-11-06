package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeBillingGroupResult implements Serializable {
    private String billingGroupArn;
    private String billingGroupId;
    private BillingGroupMetadata billingGroupMetadata;
    private String billingGroupName;
    private BillingGroupProperties billingGroupProperties;
    private Long version;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeBillingGroupResult)) {
            return false;
        }
        DescribeBillingGroupResult describeBillingGroupResult = (DescribeBillingGroupResult) obj;
        if ((describeBillingGroupResult.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (describeBillingGroupResult.getBillingGroupName() != null && !describeBillingGroupResult.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((describeBillingGroupResult.getBillingGroupId() == null) ^ (getBillingGroupId() == null)) {
            return false;
        }
        if (describeBillingGroupResult.getBillingGroupId() != null && !describeBillingGroupResult.getBillingGroupId().equals(getBillingGroupId())) {
            return false;
        }
        if ((describeBillingGroupResult.getBillingGroupArn() == null) ^ (getBillingGroupArn() == null)) {
            return false;
        }
        if (describeBillingGroupResult.getBillingGroupArn() != null && !describeBillingGroupResult.getBillingGroupArn().equals(getBillingGroupArn())) {
            return false;
        }
        if ((describeBillingGroupResult.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        if (describeBillingGroupResult.getVersion() != null && !describeBillingGroupResult.getVersion().equals(getVersion())) {
            return false;
        }
        if ((describeBillingGroupResult.getBillingGroupProperties() == null) ^ (getBillingGroupProperties() == null)) {
            return false;
        }
        if (describeBillingGroupResult.getBillingGroupProperties() != null && !describeBillingGroupResult.getBillingGroupProperties().equals(getBillingGroupProperties())) {
            return false;
        }
        if ((describeBillingGroupResult.getBillingGroupMetadata() == null) ^ (getBillingGroupMetadata() == null)) {
            return false;
        }
        return describeBillingGroupResult.getBillingGroupMetadata() == null || describeBillingGroupResult.getBillingGroupMetadata().equals(getBillingGroupMetadata());
    }

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    public String getBillingGroupId() {
        return this.billingGroupId;
    }

    public BillingGroupMetadata getBillingGroupMetadata() {
        return this.billingGroupMetadata;
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public BillingGroupProperties getBillingGroupProperties() {
        return this.billingGroupProperties;
    }

    public Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getBillingGroupId() == null ? 0 : getBillingGroupId().hashCode())) * 31) + (getBillingGroupArn() == null ? 0 : getBillingGroupArn().hashCode())) * 31) + (getVersion() == null ? 0 : getVersion().hashCode())) * 31) + (getBillingGroupProperties() == null ? 0 : getBillingGroupProperties().hashCode())) * 31) + (getBillingGroupMetadata() != null ? getBillingGroupMetadata().hashCode() : 0);
    }

    public void setBillingGroupArn(String str) {
        this.billingGroupArn = str;
    }

    public void setBillingGroupId(String str) {
        this.billingGroupId = str;
    }

    public void setBillingGroupMetadata(BillingGroupMetadata billingGroupMetadata) {
        this.billingGroupMetadata = billingGroupMetadata;
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getBillingGroupId() != null) {
            sb.append("billingGroupId: " + getBillingGroupId() + ",");
        }
        if (getBillingGroupArn() != null) {
            sb.append("billingGroupArn: " + getBillingGroupArn() + ",");
        }
        if (getVersion() != null) {
            sb.append("version: " + getVersion() + ",");
        }
        if (getBillingGroupProperties() != null) {
            sb.append("billingGroupProperties: " + getBillingGroupProperties() + ",");
        }
        if (getBillingGroupMetadata() != null) {
            sb.append("billingGroupMetadata: " + getBillingGroupMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeBillingGroupResult withBillingGroupArn(String str) {
        this.billingGroupArn = str;
        return this;
    }

    public DescribeBillingGroupResult withBillingGroupId(String str) {
        this.billingGroupId = str;
        return this;
    }

    public DescribeBillingGroupResult withBillingGroupMetadata(BillingGroupMetadata billingGroupMetadata) {
        this.billingGroupMetadata = billingGroupMetadata;
        return this;
    }

    public DescribeBillingGroupResult withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public DescribeBillingGroupResult withBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
        return this;
    }

    public DescribeBillingGroupResult withVersion(Long l) {
        this.version = l;
        return this;
    }
}
