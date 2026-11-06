package com.amazonaws.services.kms.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GrantConstraints implements Serializable {
    private Map<String, String> encryptionContextSubset = new HashMap();
    private Map<String, String> encryptionContextEquals = new HashMap();

    public GrantConstraints addEncryptionContextEqualsEntry(String str, String str2) {
        if (this.encryptionContextEquals == null) {
            this.encryptionContextEquals = new HashMap();
        }
        if (this.encryptionContextEquals.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.encryptionContextEquals.put(str, str2);
        return this;
    }

    public GrantConstraints addEncryptionContextSubsetEntry(String str, String str2) {
        if (this.encryptionContextSubset == null) {
            this.encryptionContextSubset = new HashMap();
        }
        if (this.encryptionContextSubset.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.encryptionContextSubset.put(str, str2);
        return this;
    }

    public GrantConstraints clearEncryptionContextEqualsEntries() {
        this.encryptionContextEquals = null;
        return this;
    }

    public GrantConstraints clearEncryptionContextSubsetEntries() {
        this.encryptionContextSubset = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GrantConstraints)) {
            return false;
        }
        GrantConstraints grantConstraints = (GrantConstraints) obj;
        if ((grantConstraints.getEncryptionContextSubset() == null) ^ (getEncryptionContextSubset() == null)) {
            return false;
        }
        if (grantConstraints.getEncryptionContextSubset() != null && !grantConstraints.getEncryptionContextSubset().equals(getEncryptionContextSubset())) {
            return false;
        }
        if ((grantConstraints.getEncryptionContextEquals() == null) ^ (getEncryptionContextEquals() == null)) {
            return false;
        }
        return grantConstraints.getEncryptionContextEquals() == null || grantConstraints.getEncryptionContextEquals().equals(getEncryptionContextEquals());
    }

    public Map<String, String> getEncryptionContextEquals() {
        return this.encryptionContextEquals;
    }

    public Map<String, String> getEncryptionContextSubset() {
        return this.encryptionContextSubset;
    }

    public int hashCode() {
        return (((getEncryptionContextSubset() == null ? 0 : getEncryptionContextSubset().hashCode()) + 31) * 31) + (getEncryptionContextEquals() != null ? getEncryptionContextEquals().hashCode() : 0);
    }

    public void setEncryptionContextEquals(Map<String, String> map) {
        this.encryptionContextEquals = map;
    }

    public void setEncryptionContextSubset(Map<String, String> map) {
        this.encryptionContextSubset = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEncryptionContextSubset() != null) {
            sb.append("EncryptionContextSubset: " + getEncryptionContextSubset() + ",");
        }
        if (getEncryptionContextEquals() != null) {
            sb.append("EncryptionContextEquals: " + getEncryptionContextEquals());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GrantConstraints withEncryptionContextEquals(Map<String, String> map) {
        this.encryptionContextEquals = map;
        return this;
    }

    public GrantConstraints withEncryptionContextSubset(Map<String, String> map) {
        this.encryptionContextSubset = map;
        return this;
    }
}
