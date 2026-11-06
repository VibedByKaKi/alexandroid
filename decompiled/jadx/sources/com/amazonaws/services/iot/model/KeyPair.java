package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class KeyPair implements Serializable {
    private String privateKey;
    private String publicKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KeyPair)) {
            return false;
        }
        KeyPair keyPair = (KeyPair) obj;
        if ((keyPair.getPublicKey() == null) ^ (getPublicKey() == null)) {
            return false;
        }
        if (keyPair.getPublicKey() != null && !keyPair.getPublicKey().equals(getPublicKey())) {
            return false;
        }
        if ((keyPair.getPrivateKey() == null) ^ (getPrivateKey() == null)) {
            return false;
        }
        return keyPair.getPrivateKey() == null || keyPair.getPrivateKey().equals(getPrivateKey());
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((getPublicKey() == null ? 0 : getPublicKey().hashCode()) + 31) * 31) + (getPrivateKey() != null ? getPrivateKey().hashCode() : 0);
    }

    public void setPrivateKey(String str) {
        this.privateKey = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPublicKey() != null) {
            sb.append("PublicKey: " + getPublicKey() + ",");
        }
        if (getPrivateKey() != null) {
            sb.append("PrivateKey: " + getPrivateKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public KeyPair withPrivateKey(String str) {
        this.privateKey = str;
        return this;
    }

    public KeyPair withPublicKey(String str) {
        this.publicKey = str;
        return this;
    }
}
