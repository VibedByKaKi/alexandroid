package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssetPropertyVariant implements Serializable {
    private String booleanValue;
    private String doubleValue;
    private String integerValue;
    private String stringValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssetPropertyVariant)) {
            return false;
        }
        AssetPropertyVariant assetPropertyVariant = (AssetPropertyVariant) obj;
        if ((assetPropertyVariant.getStringValue() == null) ^ (getStringValue() == null)) {
            return false;
        }
        if (assetPropertyVariant.getStringValue() != null && !assetPropertyVariant.getStringValue().equals(getStringValue())) {
            return false;
        }
        if ((assetPropertyVariant.getIntegerValue() == null) ^ (getIntegerValue() == null)) {
            return false;
        }
        if (assetPropertyVariant.getIntegerValue() != null && !assetPropertyVariant.getIntegerValue().equals(getIntegerValue())) {
            return false;
        }
        if ((assetPropertyVariant.getDoubleValue() == null) ^ (getDoubleValue() == null)) {
            return false;
        }
        if (assetPropertyVariant.getDoubleValue() != null && !assetPropertyVariant.getDoubleValue().equals(getDoubleValue())) {
            return false;
        }
        if ((assetPropertyVariant.getBooleanValue() == null) ^ (getBooleanValue() == null)) {
            return false;
        }
        return assetPropertyVariant.getBooleanValue() == null || assetPropertyVariant.getBooleanValue().equals(getBooleanValue());
    }

    public String getBooleanValue() {
        return this.booleanValue;
    }

    public String getDoubleValue() {
        return this.doubleValue;
    }

    public String getIntegerValue() {
        return this.integerValue;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int hashCode() {
        return (((((((getStringValue() == null ? 0 : getStringValue().hashCode()) + 31) * 31) + (getIntegerValue() == null ? 0 : getIntegerValue().hashCode())) * 31) + (getDoubleValue() == null ? 0 : getDoubleValue().hashCode())) * 31) + (getBooleanValue() != null ? getBooleanValue().hashCode() : 0);
    }

    public void setBooleanValue(String str) {
        this.booleanValue = str;
    }

    public void setDoubleValue(String str) {
        this.doubleValue = str;
    }

    public void setIntegerValue(String str) {
        this.integerValue = str;
    }

    public void setStringValue(String str) {
        this.stringValue = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStringValue() != null) {
            sb.append("stringValue: " + getStringValue() + ",");
        }
        if (getIntegerValue() != null) {
            sb.append("integerValue: " + getIntegerValue() + ",");
        }
        if (getDoubleValue() != null) {
            sb.append("doubleValue: " + getDoubleValue() + ",");
        }
        if (getBooleanValue() != null) {
            sb.append("booleanValue: " + getBooleanValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AssetPropertyVariant withBooleanValue(String str) {
        this.booleanValue = str;
        return this;
    }

    public AssetPropertyVariant withDoubleValue(String str) {
        this.doubleValue = str;
        return this;
    }

    public AssetPropertyVariant withIntegerValue(String str) {
        this.integerValue = str;
        return this;
    }

    public AssetPropertyVariant withStringValue(String str) {
        this.stringValue = str;
        return this;
    }
}
