package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ConfirmDeviceResult implements Serializable {
    private Boolean userConfirmationNecessary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConfirmDeviceResult)) {
            return false;
        }
        ConfirmDeviceResult confirmDeviceResult = (ConfirmDeviceResult) obj;
        if ((confirmDeviceResult.getUserConfirmationNecessary() == null) ^ (getUserConfirmationNecessary() == null)) {
            return false;
        }
        return confirmDeviceResult.getUserConfirmationNecessary() == null || confirmDeviceResult.getUserConfirmationNecessary().equals(getUserConfirmationNecessary());
    }

    public Boolean getUserConfirmationNecessary() {
        return this.userConfirmationNecessary;
    }

    public int hashCode() {
        return 31 + (getUserConfirmationNecessary() == null ? 0 : getUserConfirmationNecessary().hashCode());
    }

    public Boolean isUserConfirmationNecessary() {
        return this.userConfirmationNecessary;
    }

    public void setUserConfirmationNecessary(Boolean bool) {
        this.userConfirmationNecessary = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserConfirmationNecessary() != null) {
            sb.append("UserConfirmationNecessary: " + getUserConfirmationNecessary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ConfirmDeviceResult withUserConfirmationNecessary(Boolean bool) {
        this.userConfirmationNecessary = bool;
        return this;
    }
}
