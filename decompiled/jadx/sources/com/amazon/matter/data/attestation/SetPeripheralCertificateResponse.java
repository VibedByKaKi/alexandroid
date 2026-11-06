package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SetPeripheralCertificateResponse {
    private long certificateExpiryTimestamp;
    private List<CertificateChain> signedOperationalCertificateChain;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetPeripheralCertificateResponse(List<CertificateChain> list, long j) {
        this.signedOperationalCertificateChain = list;
        this.certificateExpiryTimestamp = j;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getCertificateExpiryTimestamp() {
        return this.certificateExpiryTimestamp;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<CertificateChain> getSignedOperationalCertificateChain() {
        return this.signedOperationalCertificateChain;
    }
}
