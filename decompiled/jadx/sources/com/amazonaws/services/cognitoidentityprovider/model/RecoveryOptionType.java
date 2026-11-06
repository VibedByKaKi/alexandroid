package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RecoveryOptionType implements Serializable {
    private String name;
    private Integer priority;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RecoveryOptionType)) {
            return false;
        }
        RecoveryOptionType recoveryOptionType = (RecoveryOptionType) obj;
        if ((recoveryOptionType.getPriority() == null) ^ (getPriority() == null)) {
            return false;
        }
        if (recoveryOptionType.getPriority() != null && !recoveryOptionType.getPriority().equals(getPriority())) {
            return false;
        }
        if ((recoveryOptionType.getName() == null) ^ (getName() == null)) {
            return false;
        }
        return recoveryOptionType.getName() == null || recoveryOptionType.getName().equals(getName());
    }

    public String getName() {
        return this.name;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return (((getPriority() == null ? 0 : getPriority().hashCode()) + 31) * 31) + (getName() != null ? getName().hashCode() : 0);
    }

    public void setName(RecoveryOptionNameType recoveryOptionNameType) {
        this.name = recoveryOptionNameType.toString();
    }

    public void setPriority(Integer num) {
        this.priority = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPriority() != null) {
            sb.append("Priority: " + getPriority() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RecoveryOptionType withName(RecoveryOptionNameType recoveryOptionNameType) {
        this.name = recoveryOptionNameType.toString();
        return this;
    }

    public RecoveryOptionType withPriority(Integer num) {
        this.priority = num;
        return this;
    }

    public void setName(String str) {
        this.name = str;
    }

    public RecoveryOptionType withName(String str) {
        this.name = str;
        return this;
    }
}
