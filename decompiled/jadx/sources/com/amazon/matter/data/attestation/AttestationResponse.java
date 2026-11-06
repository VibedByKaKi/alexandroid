package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AttestationResponse {
    private List<AttestationFailureReason> reason;
    private AttestationResult result;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResponse(AttestationResult attestationResult, List<AttestationFailureReason> list) {
        this.result = attestationResult;
        this.reason = list;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<AttestationFailureReason> getReason() {
        return this.reason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResult getResult() {
        return this.result;
    }
}
