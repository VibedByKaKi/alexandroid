package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Field implements Serializable {
    private String name;
    private String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        if ((field.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (field.getName() != null && !field.getName().equals(getName())) {
            return false;
        }
        if ((field.getType() == null) ^ (getType() == null)) {
            return false;
        }
        return field.getType() == null || field.getType().equals(getType());
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getType() != null ? getType().hashCode() : 0);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(FieldType fieldType) {
        this.type = fieldType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("name: " + getName() + ",");
        }
        if (getType() != null) {
            sb.append("type: " + getType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Field withName(String str) {
        this.name = str;
        return this;
    }

    public Field withType(FieldType fieldType) {
        this.type = fieldType.toString();
        return this;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Field withType(String str) {
        this.type = str;
        return this;
    }
}
