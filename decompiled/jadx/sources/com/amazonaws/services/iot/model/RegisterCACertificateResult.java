package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterCACertificateResult implements Serializable {
    private String certificateArn;
    private String certificateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterCACertificateResult)) {
            return false;
        }
        RegisterCACertificateResult registerCACertificateResult = (RegisterCACertificateResult) obj;
        if ((registerCACertificateResult.getCertificateArn() == null) ^ (getCertificateArn() == null)) {
            return false;
        }
        if (registerCACertificateResult.getCertificateArn() != null && !registerCACertificateResult.getCertificateArn().equals(getCertificateArn())) {
            return false;
        }
        if ((registerCACertificateResult.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        return registerCACertificateResult.getCertificateId() == null || registerCACertificateResult.getCertificateId().equals(getCertificateId());
    }

    public String getCertificateArn() {
        return this.certificateArn;
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public int hashCode() {
        return (((getCertificateArn() == null ? 0 : getCertificateArn().hashCode()) + 31) * 31) + (getCertificateId() != null ? getCertificateId().hashCode() : 0);
    }

    public void setCertificateArn(String str) {
        this.certificateArn = str;
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateArn() != null) {
            sb.append("certificateArn: " + getCertificateArn() + ",");
        }
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterCACertificateResult withCertificateArn(String str) {
        this.certificateArn = str;
        return this;
    }

    public RegisterCACertificateResult withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }
}
