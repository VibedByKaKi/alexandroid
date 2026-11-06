package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes11.dex */
public interface GCMExponentiator {
    void exponentiateX(long j, byte[] bArr);

    void init(byte[] bArr);
}
