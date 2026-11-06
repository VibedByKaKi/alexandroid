package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MFAOptionType implements Serializable {
    private String attributeName;
    private String deliveryMedium;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MFAOptionType)) {
            return false;
        }
        MFAOptionType mFAOptionType = (MFAOptionType) obj;
        if ((mFAOptionType.getDeliveryMedium() == null) ^ (getDeliveryMedium() == null)) {
            return false;
        }
        if (mFAOptionType.getDeliveryMedium() != null && !mFAOptionType.getDeliveryMedium().equals(getDeliveryMedium())) {
            return false;
        }
        if ((mFAOptionType.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        return mFAOptionType.getAttributeName() == null || mFAOptionType.getAttributeName().equals(getAttributeName());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public int hashCode() {
        return (((getDeliveryMedium() == null ? 0 : getDeliveryMedium().hashCode()) + 31) * 31) + (getAttributeName() != null ? getAttributeName().hashCode() : 0);
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setDeliveryMedium(DeliveryMediumType deliveryMediumType) {
        this.deliveryMedium = deliveryMediumType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeliveryMedium() != null) {
            sb.append("DeliveryMedium: " + getDeliveryMedium() + ",");
        }
        if (getAttributeName() != null) {
            sb.append("AttributeName: " + getAttributeName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MFAOptionType withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public MFAOptionType withDeliveryMedium(DeliveryMediumType deliveryMediumType) {
        this.deliveryMedium = deliveryMediumType.toString();
        return this;
    }

    public void setDeliveryMedium(String str) {
        this.deliveryMedium = str;
    }

    public MFAOptionType withDeliveryMedium(String str) {
        this.deliveryMedium = str;
        return this;
    }
}
