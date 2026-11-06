package com.amazon.alexa.matter.client.apostilleservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AttestationAndSetPeripheralCertificateResponse {
    private final AttestationResponse attestationResponse;
    private final String sessionId;
    private final SetPeripheralCertificateResponse setPeripheralCertificateResponse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class AttestationAndSetPeripheralCertificateResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private AttestationResponse attestationResponse;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String sessionId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private SetPeripheralCertificateResponse setPeripheralCertificateResponse;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationAndSetPeripheralCertificateResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationAndSetPeripheralCertificateResponseBuilder attestationResponse(AttestationResponse attestationResponse) {
            this.attestationResponse = attestationResponse;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationAndSetPeripheralCertificateResponse build() {
            return new AttestationAndSetPeripheralCertificateResponse(this.attestationResponse, this.setPeripheralCertificateResponse, this.sessionId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationAndSetPeripheralCertificateResponseBuilder sessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationAndSetPeripheralCertificateResponseBuilder setPeripheralCertificateResponse(SetPeripheralCertificateResponse setPeripheralCertificateResponse) {
            this.setPeripheralCertificateResponse = setPeripheralCertificateResponse;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("AttestationAndSetPeripheralCertificateResponse.AttestationAndSetPeripheralCertificateResponseBuilder(attestationResponse=");
            sb.append(this.attestationResponse);
            sb.append(", setPeripheralCertificateResponse=");
            sb.append(this.setPeripheralCertificateResponse);
            sb.append(", sessionId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.sessionId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private AttestationAndSetPeripheralCertificateResponse() {
        this.attestationResponse = null;
        this.setPeripheralCertificateResponse = null;
        this.sessionId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static AttestationAndSetPeripheralCertificateResponseBuilder builder() {
        return new AttestationAndSetPeripheralCertificateResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttestationAndSetPeripheralCertificateResponse)) {
            return false;
        }
        AttestationAndSetPeripheralCertificateResponse attestationAndSetPeripheralCertificateResponse = (AttestationAndSetPeripheralCertificateResponse) obj;
        AttestationResponse attestationResponse = getAttestationResponse();
        AttestationResponse attestationResponse2 = attestationAndSetPeripheralCertificateResponse.getAttestationResponse();
        if (attestationResponse != null ? !attestationResponse.equals(attestationResponse2) : attestationResponse2 != null) {
            return false;
        }
        SetPeripheralCertificateResponse setPeripheralCertificateResponse = getSetPeripheralCertificateResponse();
        SetPeripheralCertificateResponse setPeripheralCertificateResponse2 = attestationAndSetPeripheralCertificateResponse.getSetPeripheralCertificateResponse();
        if (setPeripheralCertificateResponse != null ? !setPeripheralCertificateResponse.equals(setPeripheralCertificateResponse2) : setPeripheralCertificateResponse2 != null) {
            return false;
        }
        String sessionId = getSessionId();
        String sessionId2 = attestationAndSetPeripheralCertificateResponse.getSessionId();
        return sessionId != null ? sessionId.equals(sessionId2) : sessionId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResponse getAttestationResponse() {
        return this.attestationResponse;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetPeripheralCertificateResponse getSetPeripheralCertificateResponse() {
        return this.setPeripheralCertificateResponse;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        AttestationResponse attestationResponse = getAttestationResponse();
        int hashCode = attestationResponse == null ? 43 : attestationResponse.hashCode();
        SetPeripheralCertificateResponse setPeripheralCertificateResponse = getSetPeripheralCertificateResponse();
        int i = (hashCode + 59) * 59;
        int hashCode2 = setPeripheralCertificateResponse == null ? 43 : setPeripheralCertificateResponse.hashCode();
        String sessionId = getSessionId();
        return ((i + hashCode2) * 59) + (sessionId != null ? sessionId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "AttestationAndSetPeripheralCertificateResponse(attestationResponse=" + getAttestationResponse() + ", setPeripheralCertificateResponse=" + getSetPeripheralCertificateResponse() + ", sessionId=" + getSessionId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationAndSetPeripheralCertificateResponse withAttestationResponse(AttestationResponse attestationResponse) {
        return this.attestationResponse == attestationResponse ? this : new AttestationAndSetPeripheralCertificateResponse(attestationResponse, this.setPeripheralCertificateResponse, this.sessionId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationAndSetPeripheralCertificateResponse withSessionId(String str) {
        return this.sessionId == str ? this : new AttestationAndSetPeripheralCertificateResponse(this.attestationResponse, this.setPeripheralCertificateResponse, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationAndSetPeripheralCertificateResponse withSetPeripheralCertificateResponse(SetPeripheralCertificateResponse setPeripheralCertificateResponse) {
        return this.setPeripheralCertificateResponse == setPeripheralCertificateResponse ? this : new AttestationAndSetPeripheralCertificateResponse(this.attestationResponse, setPeripheralCertificateResponse, this.sessionId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationAndSetPeripheralCertificateResponse(AttestationResponse attestationResponse, SetPeripheralCertificateResponse setPeripheralCertificateResponse, String str) {
        this.attestationResponse = attestationResponse;
        this.setPeripheralCertificateResponse = setPeripheralCertificateResponse;
        this.sessionId = str;
    }
}
