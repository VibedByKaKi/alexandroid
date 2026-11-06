package org.bouncycastle.crypto.digests;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes11.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            T[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        reset();
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    private int P0(int i) {
        return (((i << 9) | (i >>> 23)) ^ i) ^ ((i << 17) | (i >>> 15));
    }

    private int P1(int i) {
        return (((i << 15) | (i >>> 17)) ^ i) ^ ((i << 23) | (i >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            i = 16;
            if (i2 >= 16) {
                break;
            }
            this.W[i2] = this.inwords[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.W;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            iArr[i3] = (P1(((i4 >>> 17) | (i4 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i5 >>> 25) | (i5 << 7))) ^ this.W[i3 - 6];
        }
        int[] iArr2 = this.V;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        char c = 3;
        int i9 = iArr2[3];
        char c2 = 4;
        int i10 = iArr2[4];
        char c3 = 5;
        int i11 = iArr2[5];
        char c4 = 6;
        int i12 = iArr2[6];
        int i13 = iArr2[7];
        int i14 = i12;
        int i15 = 0;
        while (i15 < i) {
            int i16 = (i6 << 12) | (i6 >>> 20);
            int i17 = i16 + i10 + T[i15];
            int i18 = (i17 << 7) | (i17 >>> 25);
            char c5 = c;
            int i19 = i18 ^ i16;
            char c6 = c2;
            int[] iArr3 = this.W;
            char c7 = c3;
            int i20 = iArr3[i15];
            int m$1 = ErrorUtils$$ExternalSyntheticOutline0.m$1(FF0(i6, i7, i8), i9, i19, iArr3[i15 + 4] ^ i20);
            int m$12 = ErrorUtils$$ExternalSyntheticOutline0.m$1(GG0(i10, i11, i14), i13, i18, i20);
            int i21 = (i7 << 9) | (i7 >>> 23);
            int i22 = (i11 << 19) | (i11 >>> 13);
            i15++;
            i9 = i8;
            i11 = i10;
            c2 = c6;
            c3 = c7;
            c4 = c4;
            i10 = P0(m$12);
            i8 = i21;
            i13 = i14;
            i14 = i22;
            i = 16;
            i7 = i6;
            i6 = m$1;
            c = c5;
        }
        char c8 = c;
        char c9 = c2;
        char c10 = c3;
        char c11 = c4;
        int i23 = i13;
        int i24 = i14;
        int i25 = i6;
        int i26 = 16;
        while (i26 < 64) {
            int i27 = (i25 << 12) | (i25 >>> 20);
            int i28 = i27 + i10 + T[i26];
            int i29 = (i28 >>> 25) | (i28 << 7);
            int[] iArr4 = this.W;
            int i30 = iArr4[i26];
            int m$13 = ErrorUtils$$ExternalSyntheticOutline0.m$1(FF1(i25, i7, i8), i9, i27 ^ i29, iArr4[i26 + 4] ^ i30);
            int m$14 = ErrorUtils$$ExternalSyntheticOutline0.m$1(GG1(i10, i11, i24), i23, i29, i30);
            int i31 = (i11 << 19) | (i11 >>> 13);
            i26++;
            i9 = i8;
            i11 = i10;
            i10 = P0(m$14);
            i8 = (i7 >>> 23) | (i7 << 9);
            i23 = i24;
            i7 = i25;
            i25 = m$13;
            i24 = i31;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i25 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i7;
        iArr5[2] = iArr5[2] ^ i8;
        iArr5[c8] = iArr5[c8] ^ i9;
        iArr5[c9] = iArr5[c9] ^ i10;
        iArr5[c10] = iArr5[c10] ^ i11;
        iArr5[c11] = i24 ^ iArr5[c11];
        iArr5[7] = iArr5[7] ^ i23;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            int[] iArr = this.inwords;
            if (i2 >= 14) {
                int i3 = i2 + 1;
                this.xOff = i3;
                iArr[i2] = (int) (j >>> 32);
                this.xOff = i2 + 2;
                iArr[i3] = (int) j;
                return;
            }
            iArr[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.inwords;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        copyIn(sM3Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
