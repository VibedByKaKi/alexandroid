package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {
    private final String format;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        super(bArr);
        String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                Single$$ExternalSyntheticBUOutline0.m$3("unknown byte encoding");
                throw null;
            }
            str = "OpenSSH";
        }
        this.format = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.format;
    }
}
