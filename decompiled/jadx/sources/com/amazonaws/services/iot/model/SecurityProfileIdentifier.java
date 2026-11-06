package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SecurityProfileIdentifier implements Serializable {
    private String arn;
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SecurityProfileIdentifier)) {
            return false;
        }
        SecurityProfileIdentifier securityProfileIdentifier = (SecurityProfileIdentifier) obj;
        if ((securityProfileIdentifier.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (securityProfileIdentifier.getName() != null && !securityProfileIdentifier.getName().equals(getName())) {
            return false;
        }
        if ((securityProfileIdentifier.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        return securityProfileIdentifier.getArn() == null || securityProfileIdentifier.getArn().equals(getArn());
    }

    public String getArn() {
        return this.arn;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getArn() != null ? getArn().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("name: " + getName() + ",");
        }
        if (getArn() != null) {
            sb.append("arn: " + getArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SecurityProfileIdentifier withArn(String str) {
        this.arn = str;
        return this;
    }

    public SecurityProfileIdentifier withName(String str) {
        this.name = str;
        return this;
    }
}
