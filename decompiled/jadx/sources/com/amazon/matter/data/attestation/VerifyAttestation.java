package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressFBWarnings({"URF_UNREAD_FIELD"})
/* loaded from: classes5.dex */
public class VerifyAttestation {
    private List<CertificateChain> attestationCertificateChain;
    private String certificateDeclaration;
    private String firmwareInformation;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public VerifyAttestation(List<CertificateChain> list, String str, String str2) {
        this.attestationCertificateChain = list;
        this.firmwareInformation = str;
        this.certificateDeclaration = str2;
    }
}
