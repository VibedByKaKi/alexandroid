package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetSigningCertificateResult implements Serializable {
    private String certificate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSigningCertificateResult)) {
            return false;
        }
        GetSigningCertificateResult getSigningCertificateResult = (GetSigningCertificateResult) obj;
        if ((getSigningCertificateResult.getCertificate() == null) ^ (getCertificate() == null)) {
            return false;
        }
        return getSigningCertificateResult.getCertificate() == null || getSigningCertificateResult.getCertificate().equals(getCertificate());
    }

    public String getCertificate() {
        return this.certificate;
    }

    public int hashCode() {
        return 31 + (getCertificate() == null ? 0 : getCertificate().hashCode());
    }

    public void setCertificate(String str) {
        this.certificate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificate() != null) {
            sb.append("Certificate: " + getCertificate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetSigningCertificateResult withCertificate(String str) {
        this.certificate = str;
        return this;
    }
}
