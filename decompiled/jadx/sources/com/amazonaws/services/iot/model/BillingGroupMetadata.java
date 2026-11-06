package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BillingGroupMetadata implements Serializable {
    private Date creationDate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BillingGroupMetadata)) {
            return false;
        }
        BillingGroupMetadata billingGroupMetadata = (BillingGroupMetadata) obj;
        if ((billingGroupMetadata.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        return billingGroupMetadata.getCreationDate() == null || billingGroupMetadata.getCreationDate().equals(getCreationDate());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public int hashCode() {
        return 31 + (getCreationDate() == null ? 0 : getCreationDate().hashCode());
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public BillingGroupMetadata withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }
}
