package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCACertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String certificateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCACertificateRequest)) {
            return false;
        }
        DescribeCACertificateRequest describeCACertificateRequest = (DescribeCACertificateRequest) obj;
        if ((describeCACertificateRequest.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        return describeCACertificateRequest.getCertificateId() == null || describeCACertificateRequest.getCertificateId().equals(getCertificateId());
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public int hashCode() {
        return 31 + (getCertificateId() == null ? 0 : getCertificateId().hashCode());
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeCACertificateRequest withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }
}
