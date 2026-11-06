package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeBillingGroupRequest)) {
            return false;
        }
        DescribeBillingGroupRequest describeBillingGroupRequest = (DescribeBillingGroupRequest) obj;
        if ((describeBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        return describeBillingGroupRequest.getBillingGroupName() == null || describeBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName());
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public int hashCode() {
        return 31 + (getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode());
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }
}
