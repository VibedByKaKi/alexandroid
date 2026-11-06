package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class Blake3Parameters implements CipherParameters {
    private static final int KEYLEN = 32;
    private byte[] theContext;
    private byte[] theKey;

    public static Blake3Parameters context(byte[] bArr) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid context");
            return null;
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theContext = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public static Blake3Parameters key(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid keyLength");
            return null;
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theKey = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public void clearKey() {
        Arrays.fill(this.theKey, (byte) 0);
    }

    public byte[] getContext() {
        return Arrays.clone(this.theContext);
    }

    public byte[] getKey() {
        return Arrays.clone(this.theKey);
    }
}
