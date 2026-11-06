package com.amazon.alexa.matter.commissioner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Arrays;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class NOCChain {

    @NonNull
    private final AttestationResult attestationResult;

    @Nullable
    private final byte[] intermediateCertificate;

    @Nullable
    private final byte[] operationalCertificate;

    @Nullable
    private final byte[] rootCertificate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class NOCChainBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private AttestationResult attestationResult;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private byte[] intermediateCertificate;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private byte[] operationalCertificate;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private byte[] rootCertificate;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChainBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChainBuilder attestationResult(@NonNull AttestationResult attestationResult) {
            if (attestationResult != null) {
                this.attestationResult = attestationResult;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("attestationResult is marked non-null but is null");
            return null;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChain build() {
            return new NOCChain(this.attestationResult, this.rootCertificate, this.intermediateCertificate, this.operationalCertificate);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChainBuilder intermediateCertificate(@Nullable byte[] bArr) {
            this.intermediateCertificate = bArr;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChainBuilder operationalCertificate(@Nullable byte[] bArr) {
            this.operationalCertificate = bArr;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NOCChainBuilder rootCertificate(@Nullable byte[] bArr) {
            this.rootCertificate = bArr;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "NOCChain.NOCChainBuilder(attestationResult=" + this.attestationResult + ", rootCertificate=" + Arrays.toString(this.rootCertificate) + ", intermediateCertificate=" + Arrays.toString(this.intermediateCertificate) + ", operationalCertificate=" + Arrays.toString(this.operationalCertificate) + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NOCChain(@NonNull AttestationResult attestationResult, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        if (attestationResult == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("attestationResult is marked non-null but is null");
            throw null;
        }
        this.attestationResult = attestationResult;
        this.rootCertificate = bArr;
        this.intermediateCertificate = bArr2;
        this.operationalCertificate = bArr3;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static NOCChainBuilder builder() {
        return new NOCChainBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NOCChain)) {
            return false;
        }
        NOCChain nOCChain = (NOCChain) obj;
        AttestationResult attestationResult = getAttestationResult();
        AttestationResult attestationResult2 = nOCChain.getAttestationResult();
        if (attestationResult != null ? attestationResult.equals(attestationResult2) : attestationResult2 == null) {
            return Arrays.equals(getRootCertificate(), nOCChain.getRootCertificate()) && Arrays.equals(getIntermediateCertificate(), nOCChain.getIntermediateCertificate()) && Arrays.equals(getOperationalCertificate(), nOCChain.getOperationalCertificate());
        }
        return false;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResult getAttestationResult() {
        return this.attestationResult;
    }

    @Nullable
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public byte[] getIntermediateCertificate() {
        return this.intermediateCertificate;
    }

    @Nullable
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public byte[] getOperationalCertificate() {
        return this.operationalCertificate;
    }

    @Nullable
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public byte[] getRootCertificate() {
        return this.rootCertificate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        AttestationResult attestationResult = getAttestationResult();
        return Arrays.hashCode(getOperationalCertificate()) + ((Arrays.hashCode(getIntermediateCertificate()) + ((Arrays.hashCode(getRootCertificate()) + (((attestationResult == null ? 43 : attestationResult.hashCode()) + 59) * 59)) * 59)) * 59);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "NOCChain(attestationResult=" + getAttestationResult() + ", rootCertificate=" + Arrays.toString(getRootCertificate()) + ", intermediateCertificate=" + Arrays.toString(getIntermediateCertificate()) + ", operationalCertificate=" + Arrays.toString(getOperationalCertificate()) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
