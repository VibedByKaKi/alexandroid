package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AttestationAndSetPeripheralCertificateResponse {
    private AttestationResponse attestationResponse;
    private String sessionId;
    private SetPeripheralCertificateResponse setPeripheralCertificateResponse;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationAndSetPeripheralCertificateResponse(AttestationResponse attestationResponse, SetPeripheralCertificateResponse setPeripheralCertificateResponse, String str) {
        this.attestationResponse = attestationResponse;
        this.setPeripheralCertificateResponse = setPeripheralCertificateResponse;
        this.sessionId = str;
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
}
