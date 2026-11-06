package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateCertificateFromCsrResult implements Serializable {
    private String certificateArn;
    private String certificateId;
    private String certificatePem;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCertificateFromCsrResult)) {
            return false;
        }
        CreateCertificateFromCsrResult createCertificateFromCsrResult = (CreateCertificateFromCsrResult) obj;
        if ((createCertificateFromCsrResult.getCertificateArn() == null) ^ (getCertificateArn() == null)) {
            return false;
        }
        if (createCertificateFromCsrResult.getCertificateArn() != null && !createCertificateFromCsrResult.getCertificateArn().equals(getCertificateArn())) {
            return false;
        }
        if ((createCertificateFromCsrResult.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (createCertificateFromCsrResult.getCertificateId() != null && !createCertificateFromCsrResult.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((createCertificateFromCsrResult.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        return createCertificateFromCsrResult.getCertificatePem() == null || createCertificateFromCsrResult.getCertificatePem().equals(getCertificatePem());
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

    public int hashCode() {
        return (((((getCertificateArn() == null ? 0 : getCertificateArn().hashCode()) + 31) * 31) + (getCertificateId() == null ? 0 : getCertificateId().hashCode())) * 31) + (getCertificatePem() != null ? getCertificatePem().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateArn() != null) {
            sb.append("certificateArn: " + getCertificateArn() + ",");
        }
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateCertificateFromCsrResult withCertificateArn(String str) {
        this.certificateArn = str;
        return this;
    }

    public CreateCertificateFromCsrResult withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public CreateCertificateFromCsrResult withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }
}
