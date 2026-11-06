package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RemoveThingFromBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupArn;
    private String billingGroupName;
    private String thingArn;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RemoveThingFromBillingGroupRequest)) {
            return false;
        }
        RemoveThingFromBillingGroupRequest removeThingFromBillingGroupRequest = (RemoveThingFromBillingGroupRequest) obj;
        if ((removeThingFromBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (removeThingFromBillingGroupRequest.getBillingGroupName() != null && !removeThingFromBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((removeThingFromBillingGroupRequest.getBillingGroupArn() == null) ^ (getBillingGroupArn() == null)) {
            return false;
        }
        if (removeThingFromBillingGroupRequest.getBillingGroupArn() != null && !removeThingFromBillingGroupRequest.getBillingGroupArn().equals(getBillingGroupArn())) {
            return false;
        }
        if ((removeThingFromBillingGroupRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (removeThingFromBillingGroupRequest.getThingName() != null && !removeThingFromBillingGroupRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((removeThingFromBillingGroupRequest.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        return removeThingFromBillingGroupRequest.getThingArn() == null || removeThingFromBillingGroupRequest.getThingArn().equals(getThingArn());
    }

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getBillingGroupArn() == null ? 0 : getBillingGroupArn().hashCode())) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getThingArn() != null ? getThingArn().hashCode() : 0);
    }

    public void setBillingGroupArn(String str) {
        this.billingGroupArn = str;
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getBillingGroupArn() != null) {
            sb.append("billingGroupArn: " + getBillingGroupArn() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RemoveThingFromBillingGroupRequest withBillingGroupArn(String str) {
        this.billingGroupArn = str;
        return this;
    }

    public RemoveThingFromBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public RemoveThingFromBillingGroupRequest withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public RemoveThingFromBillingGroupRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
