package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {
    private byte[] id;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr != null) {
            this.id = Arrays.clone(bArr);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("id string cannot be null");
            throw null;
        }
    }

    public byte[] getID() {
        return Arrays.clone(this.id);
    }
}
