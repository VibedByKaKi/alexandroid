package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CodeSigningCertificateChain implements Serializable {
    private String certificateName;
    private String inlineDocument;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CodeSigningCertificateChain)) {
            return false;
        }
        CodeSigningCertificateChain codeSigningCertificateChain = (CodeSigningCertificateChain) obj;
        if ((codeSigningCertificateChain.getCertificateName() == null) ^ (getCertificateName() == null)) {
            return false;
        }
        if (codeSigningCertificateChain.getCertificateName() != null && !codeSigningCertificateChain.getCertificateName().equals(getCertificateName())) {
            return false;
        }
        if ((codeSigningCertificateChain.getInlineDocument() == null) ^ (getInlineDocument() == null)) {
            return false;
        }
        return codeSigningCertificateChain.getInlineDocument() == null || codeSigningCertificateChain.getInlineDocument().equals(getInlineDocument());
    }

    public String getCertificateName() {
        return this.certificateName;
    }

    public String getInlineDocument() {
        return this.inlineDocument;
    }

    public int hashCode() {
        return (((getCertificateName() == null ? 0 : getCertificateName().hashCode()) + 31) * 31) + (getInlineDocument() != null ? getInlineDocument().hashCode() : 0);
    }

    public void setCertificateName(String str) {
        this.certificateName = str;
    }

    public void setInlineDocument(String str) {
        this.inlineDocument = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateName() != null) {
            sb.append("certificateName: " + getCertificateName() + ",");
        }
        if (getInlineDocument() != null) {
            sb.append("inlineDocument: " + getInlineDocument());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CodeSigningCertificateChain withCertificateName(String str) {
        this.certificateName = str;
        return this;
    }

    public CodeSigningCertificateChain withInlineDocument(String str) {
        this.inlineDocument = str;
        return this;
    }
}
