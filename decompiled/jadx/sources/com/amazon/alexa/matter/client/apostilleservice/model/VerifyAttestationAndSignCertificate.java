package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class VerifyAttestationAndSignCertificate {
    private final String sessionId;
    private final SignPeripheralCertificate signPeripheralCertificate;
    private final VerifyAttestation verifyAttestation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class VerifyAttestationAndSignCertificateBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String sessionId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private SignPeripheralCertificate signPeripheralCertificate;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private VerifyAttestation verifyAttestation;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationAndSignCertificateBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationAndSignCertificate build() {
            return new VerifyAttestationAndSignCertificate(this.verifyAttestation, this.signPeripheralCertificate, this.sessionId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationAndSignCertificateBuilder sessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationAndSignCertificateBuilder signPeripheralCertificate(SignPeripheralCertificate signPeripheralCertificate) {
            this.signPeripheralCertificate = signPeripheralCertificate;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("VerifyAttestationAndSignCertificate.VerifyAttestationAndSignCertificateBuilder(verifyAttestation=");
            sb.append(this.verifyAttestation);
            sb.append(", signPeripheralCertificate=");
            sb.append(this.signPeripheralCertificate);
            sb.append(", sessionId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.sessionId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationAndSignCertificateBuilder verifyAttestation(VerifyAttestation verifyAttestation) {
            this.verifyAttestation = verifyAttestation;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private VerifyAttestationAndSignCertificate() {
        this.verifyAttestation = null;
        this.signPeripheralCertificate = null;
        this.sessionId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static VerifyAttestationAndSignCertificateBuilder builder() {
        return new VerifyAttestationAndSignCertificateBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyAttestationAndSignCertificate)) {
            return false;
        }
        VerifyAttestationAndSignCertificate verifyAttestationAndSignCertificate = (VerifyAttestationAndSignCertificate) obj;
        VerifyAttestation verifyAttestation = getVerifyAttestation();
        VerifyAttestation verifyAttestation2 = verifyAttestationAndSignCertificate.getVerifyAttestation();
        if (verifyAttestation != null ? !verifyAttestation.equals(verifyAttestation2) : verifyAttestation2 != null) {
            return false;
        }
        SignPeripheralCertificate signPeripheralCertificate = getSignPeripheralCertificate();
        SignPeripheralCertificate signPeripheralCertificate2 = verifyAttestationAndSignCertificate.getSignPeripheralCertificate();
        if (signPeripheralCertificate != null ? !signPeripheralCertificate.equals(signPeripheralCertificate2) : signPeripheralCertificate2 != null) {
            return false;
        }
        String sessionId = getSessionId();
        String sessionId2 = verifyAttestationAndSignCertificate.getSessionId();
        return sessionId != null ? sessionId.equals(sessionId2) : sessionId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SignPeripheralCertificate getSignPeripheralCertificate() {
        return this.signPeripheralCertificate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation getVerifyAttestation() {
        return this.verifyAttestation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        VerifyAttestation verifyAttestation = getVerifyAttestation();
        int hashCode = verifyAttestation == null ? 43 : verifyAttestation.hashCode();
        SignPeripheralCertificate signPeripheralCertificate = getSignPeripheralCertificate();
        int i = (hashCode + 59) * 59;
        int hashCode2 = signPeripheralCertificate == null ? 43 : signPeripheralCertificate.hashCode();
        String sessionId = getSessionId();
        return ((i + hashCode2) * 59) + (sessionId != null ? sessionId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "VerifyAttestationAndSignCertificate(verifyAttestation=" + getVerifyAttestation() + ", signPeripheralCertificate=" + getSignPeripheralCertificate() + ", sessionId=" + getSessionId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestationAndSignCertificate withSessionId(String str) {
        return this.sessionId == str ? this : new VerifyAttestationAndSignCertificate(this.verifyAttestation, this.signPeripheralCertificate, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestationAndSignCertificate withSignPeripheralCertificate(SignPeripheralCertificate signPeripheralCertificate) {
        return this.signPeripheralCertificate == signPeripheralCertificate ? this : new VerifyAttestationAndSignCertificate(this.verifyAttestation, signPeripheralCertificate, this.sessionId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestationAndSignCertificate withVerifyAttestation(VerifyAttestation verifyAttestation) {
        return this.verifyAttestation == verifyAttestation ? this : new VerifyAttestationAndSignCertificate(verifyAttestation, this.signPeripheralCertificate, this.sessionId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestationAndSignCertificate(VerifyAttestation verifyAttestation, SignPeripheralCertificate signPeripheralCertificate, String str) {
        this.verifyAttestation = verifyAttestation;
        this.signPeripheralCertificate = signPeripheralCertificate;
        this.sessionId = str;
    }
}
