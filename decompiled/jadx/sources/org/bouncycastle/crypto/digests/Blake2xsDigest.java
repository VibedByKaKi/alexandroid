package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.openjdk.tools.javac.code.Flags;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class Blake2xsDigest implements Xof {
    private static final int DIGEST_LENGTH = 32;
    private static final long MAX_NUMBER_BLOCKS = 4294967296L;
    public static final int UNKNOWN_DIGEST_LENGTH = 65535;
    private long blockPos;
    private byte[] buf;
    private int bufPos;
    private int digestLength;
    private int digestPos;
    private byte[] h0;
    private Blake2sDigest hash;
    private long nodeOffset;

    public Blake2xsDigest(Blake2xsDigest blake2xsDigest) {
        this.h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.digestLength = blake2xsDigest.digestLength;
        this.hash = new Blake2sDigest(blake2xsDigest.hash);
        this.h0 = Arrays.clone(blake2xsDigest.h0);
        this.buf = Arrays.clone(blake2xsDigest.buf);
        this.bufPos = blake2xsDigest.bufPos;
        this.digestPos = blake2xsDigest.digestPos;
        this.blockPos = blake2xsDigest.blockPos;
        this.nodeOffset = blake2xsDigest.nodeOffset;
    }

    private long computeNodeOffset() {
        return this.digestLength * MAX_NUMBER_BLOCKS;
    }

    private int computeStepLength() {
        int i = this.digestLength;
        if (i == 65535) {
            return 32;
        }
        return Math.min(32, i - this.digestPos);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        int doOutput = doOutput(bArr, i, i2);
        reset();
        return doOutput;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // org.bouncycastle.crypto.Xof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doOutput(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            byte[] r8 = r6.h0
            r0 = 0
            if (r8 != 0) goto L14
            org.bouncycastle.crypto.digests.Blake2sDigest r8 = r6.hash
            int r8 = r8.getDigestSize()
            byte[] r8 = new byte[r8]
            r6.h0 = r8
            org.bouncycastle.crypto.digests.Blake2sDigest r1 = r6.hash
            r1.doFinal(r8, r0)
        L14:
            int r8 = r6.digestLength
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r8 == r1) goto L28
            int r1 = r6.digestPos
            int r1 = r1 + r9
            if (r1 > r8) goto L21
            goto L34
        L21:
            java.lang.String r6 = "Output length is above the digest length"
        L23:
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r6)
            r6 = 0
            return r6
        L28:
            long r1 = r6.blockPos
            r8 = 5
            long r1 = r1 << r8
            long r3 = r6.getUnknownMaxLength()
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L7c
        L34:
            r8 = r0
        L35:
            if (r8 >= r9) goto L7b
            int r1 = r6.bufPos
            r2 = 32
            if (r1 < r2) goto L66
            org.bouncycastle.crypto.digests.Blake2sDigest r1 = new org.bouncycastle.crypto.digests.Blake2sDigest
            int r3 = r6.computeStepLength()
            long r4 = r6.nodeOffset
            r1.<init>(r3, r2, r4)
            byte[] r2 = r6.h0
            int r3 = r2.length
            r1.update(r2, r0, r3)
            byte[] r2 = r6.buf
            org.bouncycastle.util.Arrays.fill(r2, r0)
            byte[] r2 = r6.buf
            r1.doFinal(r2, r0)
            r6.bufPos = r0
            long r1 = r6.nodeOffset
            r3 = 1
            long r1 = r1 + r3
            r6.nodeOffset = r1
            long r1 = r6.blockPos
            long r1 = r1 + r3
            r6.blockPos = r1
        L66:
            byte[] r1 = r6.buf
            int r2 = r6.bufPos
            r1 = r1[r2]
            r7[r8] = r1
            int r2 = r2 + 1
            r6.bufPos = r2
            int r1 = r6.digestPos
            int r1 = r1 + 1
            r6.digestPos = r1
            int r8 = r8 + 1
            goto L35
        L7b:
            return r9
        L7c:
            java.lang.String r6 = "Maximum length is 2^32 blocks of 32 bytes"
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.digests.Blake2xsDigest.doOutput(byte[], int, int):int");
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2xs";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.hash.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    public long getUnknownMaxLength() {
        return Flags.HYPOTHETICAL;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.hash.reset();
        this.h0 = null;
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.nodeOffset = computeNodeOffset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.hash.update(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.hash.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, bArr.length);
    }

    public Blake2xsDigest(int i) {
        this(i, null, null, null);
    }

    public Blake2xsDigest(int i, byte[] bArr) {
        this(i, bArr, null, null);
    }

    public Blake2xsDigest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        if (i < 1 || i > 65535) {
            Single$$ExternalSyntheticBUOutline0.m$3("BLAKE2xs digest length must be between 1 and 2^16-1");
            throw null;
        }
        this.digestLength = i;
        long computeNodeOffset = computeNodeOffset();
        this.nodeOffset = computeNodeOffset;
        this.hash = new Blake2sDigest(32, bArr, bArr2, bArr3, computeNodeOffset);
    }

    public Blake2xsDigest() {
        this(65535);
    }
}
