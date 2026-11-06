package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeviceSecretVerifierConfigType implements Serializable {
    private String passwordVerifier;
    private String salt;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeviceSecretVerifierConfigType)) {
            return false;
        }
        DeviceSecretVerifierConfigType deviceSecretVerifierConfigType = (DeviceSecretVerifierConfigType) obj;
        if ((deviceSecretVerifierConfigType.getPasswordVerifier() == null) ^ (getPasswordVerifier() == null)) {
            return false;
        }
        if (deviceSecretVerifierConfigType.getPasswordVerifier() != null && !deviceSecretVerifierConfigType.getPasswordVerifier().equals(getPasswordVerifier())) {
            return false;
        }
        if ((deviceSecretVerifierConfigType.getSalt() == null) ^ (getSalt() == null)) {
            return false;
        }
        return deviceSecretVerifierConfigType.getSalt() == null || deviceSecretVerifierConfigType.getSalt().equals(getSalt());
    }

    public String getPasswordVerifier() {
        return this.passwordVerifier;
    }

    public String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return (((getPasswordVerifier() == null ? 0 : getPasswordVerifier().hashCode()) + 31) * 31) + (getSalt() != null ? getSalt().hashCode() : 0);
    }

    public void setPasswordVerifier(String str) {
        this.passwordVerifier = str;
    }

    public void setSalt(String str) {
        this.salt = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPasswordVerifier() != null) {
            sb.append("PasswordVerifier: " + getPasswordVerifier() + ",");
        }
        if (getSalt() != null) {
            sb.append("Salt: " + getSalt());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeviceSecretVerifierConfigType withPasswordVerifier(String str) {
        this.passwordVerifier = str;
        return this;
    }

    public DeviceSecretVerifierConfigType withSalt(String str) {
        this.salt = str;
        return this;
    }
}
