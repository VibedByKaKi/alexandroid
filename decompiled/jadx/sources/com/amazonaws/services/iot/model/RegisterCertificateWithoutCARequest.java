package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterCertificateWithoutCARequest extends AmazonWebServiceRequest implements Serializable {
    private String certificatePem;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterCertificateWithoutCARequest)) {
            return false;
        }
        RegisterCertificateWithoutCARequest registerCertificateWithoutCARequest = (RegisterCertificateWithoutCARequest) obj;
        if ((registerCertificateWithoutCARequest.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        if (registerCertificateWithoutCARequest.getCertificatePem() != null && !registerCertificateWithoutCARequest.getCertificatePem().equals(getCertificatePem())) {
            return false;
        }
        if ((registerCertificateWithoutCARequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return registerCertificateWithoutCARequest.getStatus() == null || registerCertificateWithoutCARequest.getStatus().equals(getStatus());
    }

    public String getCertificatePem() {
        return this.certificatePem;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((getCertificatePem() == null ? 0 : getCertificatePem().hashCode()) + 31) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public void setCertificatePem(String str) {
        this.certificatePem = str;
    }

    public void setStatus(CertificateStatus certificateStatus) {
        this.status = certificateStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterCertificateWithoutCARequest withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }

    public RegisterCertificateWithoutCARequest withStatus(CertificateStatus certificateStatus) {
        this.status = certificateStatus.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public RegisterCertificateWithoutCARequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
