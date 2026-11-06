package com.amazonaws.services.kms.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetKeyRotationStatusResult implements Serializable {
    private Boolean keyRotationEnabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetKeyRotationStatusResult)) {
            return false;
        }
        GetKeyRotationStatusResult getKeyRotationStatusResult = (GetKeyRotationStatusResult) obj;
        if ((getKeyRotationStatusResult.getKeyRotationEnabled() == null) ^ (getKeyRotationEnabled() == null)) {
            return false;
        }
        return getKeyRotationStatusResult.getKeyRotationEnabled() == null || getKeyRotationStatusResult.getKeyRotationEnabled().equals(getKeyRotationEnabled());
    }

    public Boolean getKeyRotationEnabled() {
        return this.keyRotationEnabled;
    }

    public int hashCode() {
        return 31 + (getKeyRotationEnabled() == null ? 0 : getKeyRotationEnabled().hashCode());
    }

    public Boolean isKeyRotationEnabled() {
        return this.keyRotationEnabled;
    }

    public void setKeyRotationEnabled(Boolean bool) {
        this.keyRotationEnabled = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyRotationEnabled() != null) {
            sb.append("KeyRotationEnabled: " + getKeyRotationEnabled());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean bool) {
        this.keyRotationEnabled = bool;
        return this;
    }
}
