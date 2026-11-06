package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class SetPeripheralCertificateResponse {
    private final long certificateExpiryTimestamp;
    private final List<Certificate> signedOperationalCertificateChain;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SetPeripheralCertificateResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long certificateExpiryTimestamp;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Certificate> signedOperationalCertificateChain;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetPeripheralCertificateResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetPeripheralCertificateResponse build() {
            return new SetPeripheralCertificateResponse(this.signedOperationalCertificateChain, this.certificateExpiryTimestamp);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetPeripheralCertificateResponseBuilder certificateExpiryTimestamp(long j) {
            this.certificateExpiryTimestamp = j;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetPeripheralCertificateResponseBuilder signedOperationalCertificateChain(List<Certificate> list) {
            this.signedOperationalCertificateChain = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("SetPeripheralCertificateResponse.SetPeripheralCertificateResponseBuilder(signedOperationalCertificateChain=");
            sb.append(this.signedOperationalCertificateChain);
            sb.append(", certificateExpiryTimestamp=");
            return a$$ExternalSyntheticOutline0.m(this.certificateExpiryTimestamp, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private SetPeripheralCertificateResponse() {
        this.signedOperationalCertificateChain = null;
        this.certificateExpiryTimestamp = 0L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SetPeripheralCertificateResponseBuilder builder() {
        return new SetPeripheralCertificateResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPeripheralCertificateResponse)) {
            return false;
        }
        SetPeripheralCertificateResponse setPeripheralCertificateResponse = (SetPeripheralCertificateResponse) obj;
        if (getCertificateExpiryTimestamp() != setPeripheralCertificateResponse.getCertificateExpiryTimestamp()) {
            return false;
        }
        List<Certificate> signedOperationalCertificateChain = getSignedOperationalCertificateChain();
        List<Certificate> signedOperationalCertificateChain2 = setPeripheralCertificateResponse.getSignedOperationalCertificateChain();
        return signedOperationalCertificateChain != null ? signedOperationalCertificateChain.equals(signedOperationalCertificateChain2) : signedOperationalCertificateChain2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getCertificateExpiryTimestamp() {
        return this.certificateExpiryTimestamp;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Certificate> getSignedOperationalCertificateChain() {
        return this.signedOperationalCertificateChain;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long certificateExpiryTimestamp = getCertificateExpiryTimestamp();
        List<Certificate> signedOperationalCertificateChain = getSignedOperationalCertificateChain();
        return ((((int) (certificateExpiryTimestamp ^ (certificateExpiryTimestamp >>> 32))) + 59) * 59) + (signedOperationalCertificateChain == null ? 43 : signedOperationalCertificateChain.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SetPeripheralCertificateResponse(signedOperationalCertificateChain=" + getSignedOperationalCertificateChain() + ", certificateExpiryTimestamp=" + getCertificateExpiryTimestamp() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetPeripheralCertificateResponse withCertificateExpiryTimestamp(long j) {
        return this.certificateExpiryTimestamp == j ? this : new SetPeripheralCertificateResponse(this.signedOperationalCertificateChain, j);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetPeripheralCertificateResponse withSignedOperationalCertificateChain(List<Certificate> list) {
        return this.signedOperationalCertificateChain == list ? this : new SetPeripheralCertificateResponse(list, this.certificateExpiryTimestamp);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetPeripheralCertificateResponse(List<Certificate> list, long j) {
        this.signedOperationalCertificateChain = list;
        this.certificateExpiryTimestamp = j;
    }
}
