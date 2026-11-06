package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;
    private Boolean forceDelete;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteCertificateRequest)) {
            return false;
        }
        DeleteCertificateRequest deleteCertificateRequest = (DeleteCertificateRequest) obj;
        if ((deleteCertificateRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (deleteCertificateRequest.getCertificateId() != null && !deleteCertificateRequest.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((deleteCertificateRequest.getForceDelete() == null) ^ (getForceDelete() == null)) {
            return false;
        }
        return deleteCertificateRequest.getForceDelete() == null || deleteCertificateRequest.getForceDelete().equals(getForceDelete());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public int hashCode() {
        return (((getCertificateId() == null ? 0 : getCertificateId().hashCode()) + 31) * 31) + (getForceDelete() != null ? getForceDelete().hashCode() : 0);
    }

    public Boolean isForceDelete() {
        return this.forceDelete;
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setForceDelete(Boolean bool) {
        this.forceDelete = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getForceDelete() != null) {
            sb.append("forceDelete: " + getForceDelete());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteCertificateRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public DeleteCertificateRequest withForceDelete(Boolean bool) {
        this.forceDelete = bool;
        return this;
    }
}
