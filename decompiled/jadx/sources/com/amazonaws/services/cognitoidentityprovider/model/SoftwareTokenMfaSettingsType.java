package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SoftwareTokenMfaSettingsType implements Serializable {
    private Boolean enabled;
    private Boolean preferredMfa;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SoftwareTokenMfaSettingsType)) {
            return false;
        }
        SoftwareTokenMfaSettingsType softwareTokenMfaSettingsType = (SoftwareTokenMfaSettingsType) obj;
        if ((softwareTokenMfaSettingsType.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (softwareTokenMfaSettingsType.getEnabled() != null && !softwareTokenMfaSettingsType.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((softwareTokenMfaSettingsType.getPreferredMfa() == null) ^ (getPreferredMfa() == null)) {
            return false;
        }
        return softwareTokenMfaSettingsType.getPreferredMfa() == null || softwareTokenMfaSettingsType.getPreferredMfa().equals(getPreferredMfa());
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getPreferredMfa() {
        return this.preferredMfa;
    }

    public int hashCode() {
        return (((getEnabled() == null ? 0 : getEnabled().hashCode()) + 31) * 31) + (getPreferredMfa() != null ? getPreferredMfa().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public Boolean isPreferredMfa() {
        return this.preferredMfa;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setPreferredMfa(Boolean bool) {
        this.preferredMfa = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEnabled() != null) {
            sb.append("Enabled: " + getEnabled() + ",");
        }
        if (getPreferredMfa() != null) {
            sb.append("PreferredMfa: " + getPreferredMfa());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SoftwareTokenMfaSettingsType withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public SoftwareTokenMfaSettingsType withPreferredMfa(Boolean bool) {
        this.preferredMfa = bool;
        return this;
    }
}
