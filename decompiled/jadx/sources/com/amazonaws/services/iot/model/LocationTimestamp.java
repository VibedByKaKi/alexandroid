package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LocationTimestamp implements Serializable {
    private String unit;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LocationTimestamp)) {
            return false;
        }
        LocationTimestamp locationTimestamp = (LocationTimestamp) obj;
        if ((locationTimestamp.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (locationTimestamp.getValue() != null && !locationTimestamp.getValue().equals(getValue())) {
            return false;
        }
        if ((locationTimestamp.getUnit() == null) ^ (getUnit() == null)) {
            return false;
        }
        return locationTimestamp.getUnit() == null || locationTimestamp.getUnit().equals(getUnit());
    }

    public String getUnit() {
        return this.unit;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getValue() == null ? 0 : getValue().hashCode()) + 31) * 31) + (getUnit() != null ? getUnit().hashCode() : 0);
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getValue() != null) {
            sb.append("value: " + getValue() + ",");
        }
        if (getUnit() != null) {
            sb.append("unit: " + getUnit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public LocationTimestamp withUnit(String str) {
        this.unit = str;
        return this;
    }

    public LocationTimestamp withValue(String str) {
        this.value = str;
        return this;
    }
}
