package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingRequest extends AmazonWebServiceRequest implements Serializable {
    private AttributePayload attributePayload;
    private String billingGroupName;
    private String thingName;
    private String thingTypeName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingRequest)) {
            return false;
        }
        CreateThingRequest createThingRequest = (CreateThingRequest) obj;
        if ((createThingRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (createThingRequest.getThingName() != null && !createThingRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((createThingRequest.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (createThingRequest.getThingTypeName() != null && !createThingRequest.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((createThingRequest.getAttributePayload() == null) ^ (getAttributePayload() == null)) {
            return false;
        }
        if (createThingRequest.getAttributePayload() != null && !createThingRequest.getAttributePayload().equals(getAttributePayload())) {
            return false;
        }
        if ((createThingRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        return createThingRequest.getBillingGroupName() == null || createThingRequest.getBillingGroupName().equals(getBillingGroupName());
    }

    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public int hashCode() {
        return (((((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getThingTypeName() == null ? 0 : getThingTypeName().hashCode())) * 31) + (getAttributePayload() == null ? 0 : getAttributePayload().hashCode())) * 31) + (getBillingGroupName() != null ? getBillingGroupName().hashCode() : 0);
    }

    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getAttributePayload() != null) {
            sb.append("attributePayload: " + getAttributePayload() + ",");
        }
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingRequest withAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
        return this;
    }

    public CreateThingRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public CreateThingRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public CreateThingRequest withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }
}
