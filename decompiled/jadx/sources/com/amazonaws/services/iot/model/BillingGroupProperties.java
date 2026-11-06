package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BillingGroupProperties implements Serializable {
    private String billingGroupDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BillingGroupProperties)) {
            return false;
        }
        BillingGroupProperties billingGroupProperties = (BillingGroupProperties) obj;
        if ((billingGroupProperties.getBillingGroupDescription() == null) ^ (getBillingGroupDescription() == null)) {
            return false;
        }
        return billingGroupProperties.getBillingGroupDescription() == null || billingGroupProperties.getBillingGroupDescription().equals(getBillingGroupDescription());
    }

    public String getBillingGroupDescription() {
        return this.billingGroupDescription;
    }

    public int hashCode() {
        return 31 + (getBillingGroupDescription() == null ? 0 : getBillingGroupDescription().hashCode());
    }

    public void setBillingGroupDescription(String str) {
        this.billingGroupDescription = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupDescription() != null) {
            sb.append("billingGroupDescription: " + getBillingGroupDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public BillingGroupProperties withBillingGroupDescription(String str) {
        this.billingGroupDescription = str;
        return this;
    }
}
