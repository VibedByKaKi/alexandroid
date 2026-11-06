package org.bouncycastle.crypto.digests;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes11.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    private int g(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.X[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.H1;
        int i4 = this.H2;
        int i5 = this.H3;
        int i6 = this.H4;
        int i7 = this.H5;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int m$1 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + f(i4, i5, i6), this.X[i8], Y1, i7);
            int i10 = (i4 >>> 2) | (i4 << 30);
            int m$12 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$1 << 5) | (m$1 >>> 27)) + f(i3, i10, i5), this.X[i8 + 1], Y1, i6);
            int i11 = (i3 >>> 2) | (i3 << 30);
            int m$13 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$12 << 5) | (m$12 >>> 27)) + f(m$1, i11, i10), this.X[i8 + 2], Y1, i5);
            i7 = (m$1 >>> 2) | (m$1 << 30);
            int i12 = i8 + 4;
            i4 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$13 << 5) | (m$13 >>> 27)) + f(m$12, i7, i11), this.X[i8 + 3], Y1, i10);
            i6 = (m$12 >>> 2) | (m$12 << 30);
            i8 += 5;
            i3 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + f(m$13, i6, i7), this.X[i12], Y1, i11);
            i5 = (m$13 >>> 2) | (m$13 << 30);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int m$14 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y2, i7);
            int i14 = (i4 >>> 2) | (i4 << 30);
            int m$15 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$14 << 5) | (m$14 >>> 27)) + h(i3, i14, i5), this.X[i8 + 1], Y2, i6);
            int i15 = (i3 >>> 2) | (i3 << 30);
            int m$16 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$15 << 5) | (m$15 >>> 27)) + h(m$14, i15, i14), this.X[i8 + 2], Y2, i5);
            i7 = (m$14 >>> 2) | (m$14 << 30);
            int i16 = i8 + 4;
            i4 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$16 << 5) | (m$16 >>> 27)) + h(m$15, i7, i15), this.X[i8 + 3], Y2, i14);
            i6 = (m$15 >>> 2) | (m$15 << 30);
            i8 += 5;
            i3 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + h(m$16, i6, i7), this.X[i16], Y2, i15);
            i5 = (m$16 >>> 2) | (m$16 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int m$17 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + g(i4, i5, i6), this.X[i8], Y3, i7);
            int i18 = (i4 >>> 2) | (i4 << 30);
            int m$18 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$17 << 5) | (m$17 >>> 27)) + g(i3, i18, i5), this.X[i8 + 1], Y3, i6);
            int i19 = (i3 >>> 2) | (i3 << 30);
            int m$19 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$18 << 5) | (m$18 >>> 27)) + g(m$17, i19, i18), this.X[i8 + 2], Y3, i5);
            i7 = (m$17 >>> 2) | (m$17 << 30);
            int i20 = i8 + 4;
            i4 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$19 << 5) | (m$19 >>> 27)) + g(m$18, i7, i19), this.X[i8 + 3], Y3, i18);
            i6 = (m$18 >>> 2) | (m$18 << 30);
            i8 += 5;
            i3 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + g(m$19, i6, i7), this.X[i20], Y3, i19);
            i5 = (m$19 >>> 2) | (m$19 << 30);
        }
        for (int i21 = 0; i21 <= 3; i21++) {
            int m$110 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i3 << 5) | (i3 >>> 27)) + h(i4, i5, i6), this.X[i8], Y4, i7);
            int i22 = (i4 >>> 2) | (i4 << 30);
            int m$111 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$110 << 5) | (m$110 >>> 27)) + h(i3, i22, i5), this.X[i8 + 1], Y4, i6);
            int i23 = (i3 >>> 2) | (i3 << 30);
            int m$112 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$111 << 5) | (m$111 >>> 27)) + h(m$110, i23, i22), this.X[i8 + 2], Y4, i5);
            i7 = (m$110 >>> 2) | (m$110 << 30);
            int i24 = i8 + 4;
            i4 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((m$112 << 5) | (m$112 >>> 27)) + h(m$111, i7, i23), this.X[i8 + 3], Y4, i22);
            i6 = (m$111 >>> 2) | (m$111 << 30);
            i8 += 5;
            i3 = ErrorUtils$$ExternalSyntheticOutline0.m$1(((i4 << 5) | (i4 >>> 27)) + h(m$112, i6, i7), this.X[i24], Y4, i23);
            i5 = (m$112 >>> 2) | (m$112 << 30);
        }
        this.H1 += i3;
        this.H2 += i4;
        this.H3 += i5;
        this.H4 += i6;
        this.H5 += i7;
        this.xOff = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            this.X[i25] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.X;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        copyIn(sHA1Digest);
    }

    public SHA1Digest() {
        this.X = new int[80];
        reset();
    }
}
