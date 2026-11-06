package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCertificateResult implements Serializable {
    private CertificateDescription certificateDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCertificateResult)) {
            return false;
        }
        DescribeCertificateResult describeCertificateResult = (DescribeCertificateResult) obj;
        if ((describeCertificateResult.getCertificateDescription() == null) ^ (getCertificateDescription() == null)) {
            return false;
        }
        return describeCertificateResult.getCertificateDescription() == null || describeCertificateResult.getCertificateDescription().equals(getCertificateDescription());
    }

    public CertificateDescription getCertificateDescription() {
        return this.certificateDescription;
    }

    public int hashCode() {
        return 31 + (getCertificateDescription() == null ? 0 : getCertificateDescription().hashCode());
    }

    public void setCertificateDescription(CertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateDescription() != null) {
            sb.append("certificateDescription: " + getCertificateDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeCertificateResult withCertificateDescription(CertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
        return this;
    }
}
