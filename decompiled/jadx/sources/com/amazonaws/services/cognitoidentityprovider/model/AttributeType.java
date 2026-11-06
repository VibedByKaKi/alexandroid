package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AttributeType implements Serializable {
    private String name;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AttributeType)) {
            return false;
        }
        AttributeType attributeType = (AttributeType) obj;
        if ((attributeType.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (attributeType.getName() != null && !attributeType.getName().equals(getName())) {
            return false;
        }
        if ((attributeType.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        return attributeType.getValue() == null || attributeType.getValue().equals(getValue());
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getValue() != null ? getValue().hashCode() : 0);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getValue() != null) {
            sb.append("Value: " + getValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AttributeType withName(String str) {
        this.name = str;
        return this;
    }

    public AttributeType withValue(String str) {
        this.value = str;
        return this;
    }
}
