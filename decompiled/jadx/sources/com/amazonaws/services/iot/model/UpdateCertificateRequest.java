package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;
    private String newStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateCertificateRequest)) {
            return false;
        }
        UpdateCertificateRequest updateCertificateRequest = (UpdateCertificateRequest) obj;
        if ((updateCertificateRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (updateCertificateRequest.getCertificateId() != null && !updateCertificateRequest.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((updateCertificateRequest.getNewStatus() == null) ^ (getNewStatus() == null)) {
            return false;
        }
        return updateCertificateRequest.getNewStatus() == null || updateCertificateRequest.getNewStatus().equals(getNewStatus());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public String getNewStatus() {
        return this.newStatus;
    }

    public int hashCode() {
        return (((getCertificateId() == null ? 0 : getCertificateId().hashCode()) + 31) * 31) + (getNewStatus() != null ? getNewStatus().hashCode() : 0);
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setNewStatus(CertificateStatus certificateStatus) {
        this.newStatus = certificateStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getNewStatus() != null) {
            sb.append("newStatus: " + getNewStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateCertificateRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public UpdateCertificateRequest withNewStatus(CertificateStatus certificateStatus) {
        this.newStatus = certificateStatus.toString();
        return this;
    }

    public void setNewStatus(String str) {
        this.newStatus = str;
    }

    public UpdateCertificateRequest withNewStatus(String str) {
        this.newStatus = str;
        return this;
    }
}
