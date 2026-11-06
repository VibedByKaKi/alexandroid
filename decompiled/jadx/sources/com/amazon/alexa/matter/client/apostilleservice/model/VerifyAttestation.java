package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class VerifyAttestation {
    private final List<Certificate> attestationCertificateChain;
    private final String certificateDeclaration;
    private final String firmwareInformation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class VerifyAttestationBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Certificate> attestationCertificateChain;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String certificateDeclaration;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String firmwareInformation;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationBuilder attestationCertificateChain(List<Certificate> list) {
            this.attestationCertificateChain = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestation build() {
            return new VerifyAttestation(this.attestationCertificateChain, this.firmwareInformation, this.certificateDeclaration);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationBuilder certificateDeclaration(String str) {
            this.certificateDeclaration = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public VerifyAttestationBuilder firmwareInformation(String str) {
            this.firmwareInformation = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("VerifyAttestation.VerifyAttestationBuilder(attestationCertificateChain=");
            sb.append(this.attestationCertificateChain);
            sb.append(", firmwareInformation=");
            sb.append(this.firmwareInformation);
            sb.append(", certificateDeclaration=");
            return a$$ExternalSyntheticOutline0.m(sb, this.certificateDeclaration, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private VerifyAttestation() {
        this.attestationCertificateChain = null;
        this.firmwareInformation = null;
        this.certificateDeclaration = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static VerifyAttestationBuilder builder() {
        return new VerifyAttestationBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyAttestation)) {
            return false;
        }
        VerifyAttestation verifyAttestation = (VerifyAttestation) obj;
        List<Certificate> attestationCertificateChain = getAttestationCertificateChain();
        List<Certificate> attestationCertificateChain2 = verifyAttestation.getAttestationCertificateChain();
        if (attestationCertificateChain != null ? !attestationCertificateChain.equals(attestationCertificateChain2) : attestationCertificateChain2 != null) {
            return false;
        }
        String firmwareInformation = getFirmwareInformation();
        String firmwareInformation2 = verifyAttestation.getFirmwareInformation();
        if (firmwareInformation != null ? !firmwareInformation.equals(firmwareInformation2) : firmwareInformation2 != null) {
            return false;
        }
        String certificateDeclaration = getCertificateDeclaration();
        String certificateDeclaration2 = verifyAttestation.getCertificateDeclaration();
        return certificateDeclaration != null ? certificateDeclaration.equals(certificateDeclaration2) : certificateDeclaration2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Certificate> getAttestationCertificateChain() {
        return this.attestationCertificateChain;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCertificateDeclaration() {
        return this.certificateDeclaration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getFirmwareInformation() {
        return this.firmwareInformation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<Certificate> attestationCertificateChain = getAttestationCertificateChain();
        int hashCode = attestationCertificateChain == null ? 43 : attestationCertificateChain.hashCode();
        String firmwareInformation = getFirmwareInformation();
        int i = (hashCode + 59) * 59;
        int hashCode2 = firmwareInformation == null ? 43 : firmwareInformation.hashCode();
        String certificateDeclaration = getCertificateDeclaration();
        return ((i + hashCode2) * 59) + (certificateDeclaration != null ? certificateDeclaration.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "VerifyAttestation(attestationCertificateChain=" + getAttestationCertificateChain() + ", firmwareInformation=" + getFirmwareInformation() + ", certificateDeclaration=" + getCertificateDeclaration() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation withAttestationCertificateChain(List<Certificate> list) {
        return this.attestationCertificateChain == list ? this : new VerifyAttestation(list, this.firmwareInformation, this.certificateDeclaration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation withCertificateDeclaration(String str) {
        return this.certificateDeclaration == str ? this : new VerifyAttestation(this.attestationCertificateChain, this.firmwareInformation, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation withFirmwareInformation(String str) {
        return this.firmwareInformation == str ? this : new VerifyAttestation(this.attestationCertificateChain, str, this.certificateDeclaration);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation(List<Certificate> list, String str, String str2) {
        this.attestationCertificateChain = list;
        this.firmwareInformation = str;
        this.certificateDeclaration = str2;
    }
}
