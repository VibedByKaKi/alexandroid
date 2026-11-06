package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String caCertificatePem;
    private String certificatePem;
    private Boolean setAsActive;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterCertificateRequest)) {
            return false;
        }
        RegisterCertificateRequest registerCertificateRequest = (RegisterCertificateRequest) obj;
        if ((registerCertificateRequest.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        if (registerCertificateRequest.getCertificatePem() != null && !registerCertificateRequest.getCertificatePem().equals(getCertificatePem())) {
            return false;
        }
        if ((registerCertificateRequest.getCaCertificatePem() == null) ^ (getCaCertificatePem() == null)) {
            return false;
        }
        if (registerCertificateRequest.getCaCertificatePem() != null && !registerCertificateRequest.getCaCertificatePem().equals(getCaCertificatePem())) {
            return false;
        }
        if ((registerCertificateRequest.getSetAsActive() == null) ^ (getSetAsActive() == null)) {
            return false;
        }
        if (registerCertificateRequest.getSetAsActive() != null && !registerCertificateRequest.getSetAsActive().equals(getSetAsActive())) {
            return false;
        }
        if ((registerCertificateRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return registerCertificateRequest.getStatus() == null || registerCertificateRequest.getStatus().equals(getStatus());
    }

    public String getCaCertificatePem() {
        return this.caCertificatePem;
    }

    public String getCertificatePem() {
        return this.certificatePem;
    }

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((getCertificatePem() == null ? 0 : getCertificatePem().hashCode()) + 31) * 31) + (getCaCertificatePem() == null ? 0 : getCaCertificatePem().hashCode())) * 31) + (getSetAsActive() == null ? 0 : getSetAsActive().hashCode())) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    public void setCaCertificatePem(String str) {
        this.caCertificatePem = str;
    }

    public void setCertificatePem(String str) {
        this.certificatePem = str;
    }

    public void setSetAsActive(Boolean bool) {
        this.setAsActive = bool;
    }

    public void setStatus(CertificateStatus certificateStatus) {
        this.status = certificateStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem() + ",");
        }
        if (getCaCertificatePem() != null) {
            sb.append("caCertificatePem: " + getCaCertificatePem() + ",");
        }
        if (getSetAsActive() != null) {
            sb.append("setAsActive: " + getSetAsActive() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterCertificateRequest withCaCertificatePem(String str) {
        this.caCertificatePem = str;
        return this;
    }

    public RegisterCertificateRequest withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }

    public RegisterCertificateRequest withSetAsActive(Boolean bool) {
        this.setAsActive = bool;
        return this;
    }

    public RegisterCertificateRequest withStatus(CertificateStatus certificateStatus) {
        this.status = certificateStatus.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public RegisterCertificateRequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
