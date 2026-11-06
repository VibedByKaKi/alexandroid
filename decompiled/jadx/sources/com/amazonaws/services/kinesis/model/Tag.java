package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Tag implements Serializable {
    private String key;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if ((tag.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (tag.getKey() != null && !tag.getKey().equals(getKey())) {
            return false;
        }
        if ((tag.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        return tag.getValue() == null || tag.getValue().equals(getValue());
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getKey() == null ? 0 : getKey().hashCode()) + 31) * 31) + (getValue() != null ? getValue().hashCode() : 0);
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKey() != null) {
            sb.append("Key: " + getKey() + ",");
        }
        if (getValue() != null) {
            sb.append("Value: " + getValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Tag withKey(String str) {
        this.key = str;
        return this;
    }

    public Tag withValue(String str) {
        this.value = str;
        return this;
    }
}
