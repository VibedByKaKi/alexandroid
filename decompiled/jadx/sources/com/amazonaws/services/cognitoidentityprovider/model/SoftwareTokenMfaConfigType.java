package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SoftwareTokenMfaConfigType implements Serializable {
    private Boolean enabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SoftwareTokenMfaConfigType)) {
            return false;
        }
        SoftwareTokenMfaConfigType softwareTokenMfaConfigType = (SoftwareTokenMfaConfigType) obj;
        if ((softwareTokenMfaConfigType.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        return softwareTokenMfaConfigType.getEnabled() == null || softwareTokenMfaConfigType.getEnabled().equals(getEnabled());
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return 31 + (getEnabled() == null ? 0 : getEnabled().hashCode());
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEnabled() != null) {
            sb.append("Enabled: " + getEnabled());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SoftwareTokenMfaConfigType withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }
}
