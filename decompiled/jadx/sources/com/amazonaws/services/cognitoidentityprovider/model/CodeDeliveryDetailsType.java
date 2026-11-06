package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CodeDeliveryDetailsType implements Serializable {
    private String attributeName;
    private String deliveryMedium;
    private String destination;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CodeDeliveryDetailsType)) {
            return false;
        }
        CodeDeliveryDetailsType codeDeliveryDetailsType = (CodeDeliveryDetailsType) obj;
        if ((codeDeliveryDetailsType.getDestination() == null) ^ (getDestination() == null)) {
            return false;
        }
        if (codeDeliveryDetailsType.getDestination() != null && !codeDeliveryDetailsType.getDestination().equals(getDestination())) {
            return false;
        }
        if ((codeDeliveryDetailsType.getDeliveryMedium() == null) ^ (getDeliveryMedium() == null)) {
            return false;
        }
        if (codeDeliveryDetailsType.getDeliveryMedium() != null && !codeDeliveryDetailsType.getDeliveryMedium().equals(getDeliveryMedium())) {
            return false;
        }
        if ((codeDeliveryDetailsType.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        return codeDeliveryDetailsType.getAttributeName() == null || codeDeliveryDetailsType.getAttributeName().equals(getAttributeName());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public String getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return (((((getDestination() == null ? 0 : getDestination().hashCode()) + 31) * 31) + (getDeliveryMedium() == null ? 0 : getDeliveryMedium().hashCode())) * 31) + (getAttributeName() != null ? getAttributeName().hashCode() : 0);
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setDeliveryMedium(DeliveryMediumType deliveryMediumType) {
        this.deliveryMedium = deliveryMediumType.toString();
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestination() != null) {
            sb.append("Destination: " + getDestination() + ",");
        }
        if (getDeliveryMedium() != null) {
            sb.append("DeliveryMedium: " + getDeliveryMedium() + ",");
        }
        if (getAttributeName() != null) {
            sb.append("AttributeName: " + getAttributeName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CodeDeliveryDetailsType withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public CodeDeliveryDetailsType withDeliveryMedium(DeliveryMediumType deliveryMediumType) {
        this.deliveryMedium = deliveryMediumType.toString();
        return this;
    }

    public CodeDeliveryDetailsType withDestination(String str) {
        this.destination = str;
        return this;
    }

    public void setDeliveryMedium(String str) {
        this.deliveryMedium = str;
    }

    public CodeDeliveryDetailsType withDeliveryMedium(String str) {
        this.deliveryMedium = str;
        return this;
    }
}
