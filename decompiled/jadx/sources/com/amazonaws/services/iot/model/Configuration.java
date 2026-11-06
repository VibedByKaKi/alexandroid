package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Configuration implements Serializable {
    private Boolean enabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        if ((configuration.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        return configuration.getEnabled() == null || configuration.getEnabled().equals(getEnabled());
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

    public Configuration withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }
}
