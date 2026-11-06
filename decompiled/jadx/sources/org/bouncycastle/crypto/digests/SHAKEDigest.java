package org.bouncycastle.crypto.digests;

import defpackage.a$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.Xof;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest(int i) {
        super(checkBitLength(i));
    }

    private static int checkBitLength(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "'bitLength' ", " not supported for SHAKE"));
        return 0;
    }

    public int doFinal(byte[] bArr, int i, int i2, byte b, int i3) {
        if (i3 < 0 || i3 > 7) {
            Single$$ExternalSyntheticBUOutline0.m$3("'partialBits' must be in the range [0,7]");
            return 0;
        }
        int i4 = (b & ((1 << i3) - 1)) | (15 << i3);
        int i5 = i3 + 4;
        if (i5 >= 8) {
            absorb((byte) i4);
            i5 = i3 - 4;
            i4 >>>= 8;
        }
        if (i5 > 0) {
            absorbBits(i4, i5);
        }
        squeeze(bArr, i, i2 * 8);
        reset();
        return i2;
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i, i2 * 8);
        return i2;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public SHAKEDigest() {
        this(128);
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        return doFinal(bArr, i, getDigestSize(), b, i2);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        int doOutput = doOutput(bArr, i, i2);
        reset();
        return doOutput;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }
}
