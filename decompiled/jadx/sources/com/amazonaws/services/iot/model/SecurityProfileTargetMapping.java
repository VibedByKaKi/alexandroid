package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SecurityProfileTargetMapping implements Serializable {
    private SecurityProfileIdentifier securityProfileIdentifier;
    private SecurityProfileTarget target;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SecurityProfileTargetMapping)) {
            return false;
        }
        SecurityProfileTargetMapping securityProfileTargetMapping = (SecurityProfileTargetMapping) obj;
        if ((securityProfileTargetMapping.getSecurityProfileIdentifier() == null) ^ (getSecurityProfileIdentifier() == null)) {
            return false;
        }
        if (securityProfileTargetMapping.getSecurityProfileIdentifier() != null && !securityProfileTargetMapping.getSecurityProfileIdentifier().equals(getSecurityProfileIdentifier())) {
            return false;
        }
        if ((securityProfileTargetMapping.getTarget() == null) ^ (getTarget() == null)) {
            return false;
        }
        return securityProfileTargetMapping.getTarget() == null || securityProfileTargetMapping.getTarget().equals(getTarget());
    }

    public SecurityProfileIdentifier getSecurityProfileIdentifier() {
        return this.securityProfileIdentifier;
    }

    public SecurityProfileTarget getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((getSecurityProfileIdentifier() == null ? 0 : getSecurityProfileIdentifier().hashCode()) + 31) * 31) + (getTarget() != null ? getTarget().hashCode() : 0);
    }

    public void setSecurityProfileIdentifier(SecurityProfileIdentifier securityProfileIdentifier) {
        this.securityProfileIdentifier = securityProfileIdentifier;
    }

    public void setTarget(SecurityProfileTarget securityProfileTarget) {
        this.target = securityProfileTarget;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileIdentifier() != null) {
            sb.append("securityProfileIdentifier: " + getSecurityProfileIdentifier() + ",");
        }
        if (getTarget() != null) {
            sb.append("target: " + getTarget());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SecurityProfileTargetMapping withSecurityProfileIdentifier(SecurityProfileIdentifier securityProfileIdentifier) {
        this.securityProfileIdentifier = securityProfileIdentifier;
        return this;
    }

    public SecurityProfileTargetMapping withTarget(SecurityProfileTarget securityProfileTarget) {
        this.target = securityProfileTarget;
        return this;
    }
}
