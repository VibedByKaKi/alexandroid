package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRegistrationCodeResult implements Serializable {
    private String registrationCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRegistrationCodeResult)) {
            return false;
        }
        GetRegistrationCodeResult getRegistrationCodeResult = (GetRegistrationCodeResult) obj;
        if ((getRegistrationCodeResult.getRegistrationCode() == null) ^ (getRegistrationCode() == null)) {
            return false;
        }
        return getRegistrationCodeResult.getRegistrationCode() == null || getRegistrationCodeResult.getRegistrationCode().equals(getRegistrationCode());
    }

    public String getRegistrationCode() {
        return this.registrationCode;
    }

    public int hashCode() {
        return 31 + (getRegistrationCode() == null ? 0 : getRegistrationCode().hashCode());
    }

    public void setRegistrationCode(String str) {
        this.registrationCode = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRegistrationCode() != null) {
            sb.append("registrationCode: " + getRegistrationCode());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetRegistrationCodeResult withRegistrationCode(String str) {
        this.registrationCode = str;
        return this;
    }
}
