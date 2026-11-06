package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AcceptCertificateTransferRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;
    private Boolean setAsActive;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AcceptCertificateTransferRequest)) {
            return false;
        }
        AcceptCertificateTransferRequest acceptCertificateTransferRequest = (AcceptCertificateTransferRequest) obj;
        if ((acceptCertificateTransferRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (acceptCertificateTransferRequest.getCertificateId() != null && !acceptCertificateTransferRequest.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((acceptCertificateTransferRequest.getSetAsActive() == null) ^ (getSetAsActive() == null)) {
            return false;
        }
        return acceptCertificateTransferRequest.getSetAsActive() == null || acceptCertificateTransferRequest.getSetAsActive().equals(getSetAsActive());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    public int hashCode() {
        return (((getCertificateId() == null ? 0 : getCertificateId().hashCode()) + 31) * 31) + (getSetAsActive() != null ? getSetAsActive().hashCode() : 0);
    }

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setSetAsActive(Boolean bool) {
        this.setAsActive = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getSetAsActive() != null) {
            sb.append("setAsActive: " + getSetAsActive());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AcceptCertificateTransferRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public AcceptCertificateTransferRequest withSetAsActive(Boolean bool) {
        this.setAsActive = bool;
        return this;
    }
}
