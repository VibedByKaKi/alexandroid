package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateCertificateFromCsrRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateSigningRequest;
    private Boolean setAsActive;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCertificateFromCsrRequest)) {
            return false;
        }
        CreateCertificateFromCsrRequest createCertificateFromCsrRequest = (CreateCertificateFromCsrRequest) obj;
        if ((createCertificateFromCsrRequest.getCertificateSigningRequest() == null) ^ (getCertificateSigningRequest() == null)) {
            return false;
        }
        if (createCertificateFromCsrRequest.getCertificateSigningRequest() != null && !createCertificateFromCsrRequest.getCertificateSigningRequest().equals(getCertificateSigningRequest())) {
            return false;
        }
        if ((createCertificateFromCsrRequest.getSetAsActive() == null) ^ (getSetAsActive() == null)) {
            return false;
        }
        return createCertificateFromCsrRequest.getSetAsActive() == null || createCertificateFromCsrRequest.getSetAsActive().equals(getSetAsActive());
    }

    public String getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    public int hashCode() {
        return (((getCertificateSigningRequest() == null ? 0 : getCertificateSigningRequest().hashCode()) + 31) * 31) + (getSetAsActive() != null ? getSetAsActive().hashCode() : 0);
    }

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    public void setCertificateSigningRequest(String str) {
        this.certificateSigningRequest = str;
    }

    public void setSetAsActive(Boolean bool) {
        this.setAsActive = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateSigningRequest() != null) {
            sb.append("certificateSigningRequest: " + getCertificateSigningRequest() + ",");
        }
        if (getSetAsActive() != null) {
            sb.append("setAsActive: " + getSetAsActive());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateCertificateFromCsrRequest withCertificateSigningRequest(String str) {
        this.certificateSigningRequest = str;
        return this;
    }

    public CreateCertificateFromCsrRequest withSetAsActive(Boolean bool) {
        this.setAsActive = bool;
        return this;
    }
}
