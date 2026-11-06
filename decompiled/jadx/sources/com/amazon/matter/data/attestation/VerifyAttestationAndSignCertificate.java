package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressFBWarnings({"URF_UNREAD_FIELD"})
/* loaded from: classes5.dex */
public class VerifyAttestationAndSignCertificate {
    private String sessionId;
    private SignPeripheralCertificate signPeripheralCertificate;
    private VerifyAttestation verifyAttestation;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestationAndSignCertificate(VerifyAttestation verifyAttestation, SignPeripheralCertificate signPeripheralCertificate, String str) {
        this.verifyAttestation = verifyAttestation;
        this.signPeripheralCertificate = signPeripheralCertificate;
        this.sessionId = str;
    }
}
