package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateKeysAndCertificateResult implements Serializable {
    private String certificateArn;
    private String certificateId;
    private String certificatePem;
    private KeyPair keyPair;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateKeysAndCertificateResult)) {
            return false;
        }
        CreateKeysAndCertificateResult createKeysAndCertificateResult = (CreateKeysAndCertificateResult) obj;
        if ((createKeysAndCertificateResult.getCertificateArn() == null) ^ (getCertificateArn() == null)) {
            return false;
        }
        if (createKeysAndCertificateResult.getCertificateArn() != null && !createKeysAndCertificateResult.getCertificateArn().equals(getCertificateArn())) {
            return false;
        }
        if ((createKeysAndCertificateResult.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (createKeysAndCertificateResult.getCertificateId() != null && !createKeysAndCertificateResult.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((createKeysAndCertificateResult.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        if (createKeysAndCertificateResult.getCertificatePem() != null && !createKeysAndCertificateResult.getCertificatePem().equals(getCertificatePem())) {
            return false;
        }
        if ((createKeysAndCertificateResult.getKeyPair() == null) ^ (getKeyPair() == null)) {
            return false;
        }
        return createKeysAndCertificateResult.getKeyPair() == null || createKeysAndCertificateResult.getKeyPair().equals(getKeyPair());
    }

    public String getCertificateArn() {
        return this.certificateArn;
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public String getCertificatePem() {
        return this.certificatePem;
    }

    public KeyPair getKeyPair() {
        return this.keyPair;
    }

    public int hashCode() {
        return (((((((getCertificateArn() == null ? 0 : getCertificateArn().hashCode()) + 31) * 31) + (getCertificateId() == null ? 0 : getCertificateId().hashCode())) * 31) + (getCertificatePem() == null ? 0 : getCertificatePem().hashCode())) * 31) + (getKeyPair() != null ? getKeyPair().hashCode() : 0);
    }

    public void setCertificateArn(String str) {
        this.certificateArn = str;
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setCertificatePem(String str) {
        this.certificatePem = str;
    }

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateArn() != null) {
            sb.append("certificateArn: " + getCertificateArn() + ",");
        }
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem() + ",");
        }
        if (getKeyPair() != null) {
            sb.append("keyPair: " + getKeyPair());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateKeysAndCertificateResult withCertificateArn(String str) {
        this.certificateArn = str;
        return this;
    }

    public CreateKeysAndCertificateResult withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public CreateKeysAndCertificateResult withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }

    public CreateKeysAndCertificateResult withKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
        return this;
    }
}
