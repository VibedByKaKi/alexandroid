package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RejectCertificateTransferRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;
    private String rejectReason;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RejectCertificateTransferRequest)) {
            return false;
        }
        RejectCertificateTransferRequest rejectCertificateTransferRequest = (RejectCertificateTransferRequest) obj;
        if ((rejectCertificateTransferRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (rejectCertificateTransferRequest.getCertificateId() != null && !rejectCertificateTransferRequest.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((rejectCertificateTransferRequest.getRejectReason() == null) ^ (getRejectReason() == null)) {
            return false;
        }
        return rejectCertificateTransferRequest.getRejectReason() == null || rejectCertificateTransferRequest.getRejectReason().equals(getRejectReason());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public String getRejectReason() {
        return this.rejectReason;
    }

    public int hashCode() {
        return (((getCertificateId() == null ? 0 : getCertificateId().hashCode()) + 31) * 31) + (getRejectReason() != null ? getRejectReason().hashCode() : 0);
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setRejectReason(String str) {
        this.rejectReason = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getRejectReason() != null) {
            sb.append("rejectReason: " + getRejectReason());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RejectCertificateTransferRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public RejectCertificateTransferRequest withRejectReason(String str) {
        this.rejectReason = str;
        return this;
    }
}
