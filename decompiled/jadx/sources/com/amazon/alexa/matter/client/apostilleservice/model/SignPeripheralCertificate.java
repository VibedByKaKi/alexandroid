package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class SignPeripheralCertificate {
    private final CertificateSigningRequestObject operationalCertificateSigningRequest;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SignPeripheralCertificateBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CertificateSigningRequestObject operationalCertificateSigningRequest;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SignPeripheralCertificateBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SignPeripheralCertificate build() {
            return new SignPeripheralCertificate(this.operationalCertificateSigningRequest);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SignPeripheralCertificateBuilder operationalCertificateSigningRequest(CertificateSigningRequestObject certificateSigningRequestObject) {
            this.operationalCertificateSigningRequest = certificateSigningRequestObject;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "SignPeripheralCertificate.SignPeripheralCertificateBuilder(operationalCertificateSigningRequest=" + this.operationalCertificateSigningRequest + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private SignPeripheralCertificate() {
        this.operationalCertificateSigningRequest = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SignPeripheralCertificateBuilder builder() {
        return new SignPeripheralCertificateBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignPeripheralCertificate)) {
            return false;
        }
        CertificateSigningRequestObject operationalCertificateSigningRequest = getOperationalCertificateSigningRequest();
        CertificateSigningRequestObject operationalCertificateSigningRequest2 = ((SignPeripheralCertificate) obj).getOperationalCertificateSigningRequest();
        return operationalCertificateSigningRequest != null ? operationalCertificateSigningRequest.equals(operationalCertificateSigningRequest2) : operationalCertificateSigningRequest2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateSigningRequestObject getOperationalCertificateSigningRequest() {
        return this.operationalCertificateSigningRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        CertificateSigningRequestObject operationalCertificateSigningRequest = getOperationalCertificateSigningRequest();
        return 59 + (operationalCertificateSigningRequest == null ? 43 : operationalCertificateSigningRequest.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SignPeripheralCertificate(operationalCertificateSigningRequest=" + getOperationalCertificateSigningRequest() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SignPeripheralCertificate withOperationalCertificateSigningRequest(CertificateSigningRequestObject certificateSigningRequestObject) {
        return this.operationalCertificateSigningRequest == certificateSigningRequestObject ? this : new SignPeripheralCertificate(certificateSigningRequestObject);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SignPeripheralCertificate(CertificateSigningRequestObject certificateSigningRequestObject) {
        this.operationalCertificateSigningRequest = certificateSigningRequestObject;
    }
}
