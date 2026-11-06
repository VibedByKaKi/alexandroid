package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
class LmsUtils {
    public static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }

    public static int calculateStrength(LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("lmsParameters cannot be null");
            return 0;
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return lMSigParam.getM() * (1 << lMSigParam.getH());
    }

    public static void u16str(short s, Digest digest) {
        digest.update((byte) (s >>> 8));
        digest.update((byte) s);
    }

    public static void u32str(int i, Digest digest) {
        digest.update((byte) (i >>> 24));
        digest.update((byte) (i >>> 16));
        digest.update((byte) (i >>> 8));
        digest.update((byte) i);
    }

    public static void byteArray(byte[] bArr, int i, int i2, Digest digest) {
        digest.update(bArr, i, i2);
    }
}
