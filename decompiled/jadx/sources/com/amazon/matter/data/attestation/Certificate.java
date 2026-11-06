package com.amazon.matter.data.attestation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Certificate {
    private final CertificateEncoding encoding;
    private final CertificateType type;
    private final String value;

    public Certificate(CertificateType certificateType, CertificateEncoding certificateEncoding, String str) {
        this.type = certificateType;
        this.encoding = certificateEncoding;
        this.value = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateEncoding getEncoding() {
        return this.encoding;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CertificateType getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getValue() {
        return this.value;
    }
}
