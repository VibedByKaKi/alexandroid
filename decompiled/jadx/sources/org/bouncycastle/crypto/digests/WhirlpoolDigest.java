package org.bouncycastle.crypto.digests;

import com.facebook.imageutils.JfifUtil;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* loaded from: classes11.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, TelnetCommand.AO, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, TelnetCommand.DONT, 87, 21, 119, 55, FTPReply.ENTERING_EPSV_MODE, 159, 240, 74, JfifUtil.MARKER_SOS, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, TelnetCommand.IP, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, JfifUtil.MARKER_SOI, 251, TelnetCommand.ABORT, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, JfifUtil.MARKER_EOI, 242, FTPReply.ENTERING_PASSIVE_MODE, 91, 136, 154, 38, 50, 176, 233, 15, FTPReply.FILE_STATUS, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, TelnetCommand.NOP, 115, 18, 64, 8, 195, TelnetCommand.EOF, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, TelnetCommand.BREAK, 48, TelnetCommand.EOR, 63, 85, 162, FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, 101, 186, 47, 192, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 28, TelnetCommand.DO, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, FTPReply.DIRECTORY_STATUS, 168, 150, TelnetCommand.GA, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, FTPReply.CLOSING_DATA_CONNECTION, 97, 179, 33, 156, 30, 67, 199, TelnetCommand.WONT, 4, 81, 153, 109, 13, 250, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, TelnetCommand.EC, 185, 19, 44, 211, 231, 110, ByteCodes.wide, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, TelnetCommand.AYT, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, JfifUtil.MARKER_RST0, TelnetCommand.SUSP, 204, 66, 152, 164, 40, 92, TelnetCommand.EL, 134};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.bouncycastle.crypto.digests.WhirlpoolDigest] */
    public WhirlpoolDigest() {
        ?? obj = new Object();
        obj._rc = new long[11];
        obj._buffer = new byte[64];
        obj._bufferPos = 0;
        obj._bitCount = new short[32];
        obj._hash = new long[8];
        obj._K = new long[8];
        obj._L = new long[8];
        obj._block = new long[8];
        obj._state = new long[8];
        int i = 0;
        WhirlpoolDigest whirlpoolDigest = obj;
        while (i < 256) {
            int i2 = SBOX[i];
            int maskWithReductionPolynomial = whirlpoolDigest.maskWithReductionPolynomial(i2 << 1);
            int maskWithReductionPolynomial2 = whirlpoolDigest.maskWithReductionPolynomial(maskWithReductionPolynomial << 1);
            int i3 = maskWithReductionPolynomial2 ^ i2;
            int maskWithReductionPolynomial3 = whirlpoolDigest.maskWithReductionPolynomial(maskWithReductionPolynomial2 << 1);
            int i4 = maskWithReductionPolynomial3 ^ i2;
            C0[i] = whirlpoolDigest.packIntoLong(i2, i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4);
            C1[i] = packIntoLong(i4, i2, i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial);
            C2[i] = packIntoLong(maskWithReductionPolynomial, i4, i2, i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3);
            C3[i] = packIntoLong(i3, maskWithReductionPolynomial, i4, i2, i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3);
            C4[i] = packIntoLong(maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i2, i2, maskWithReductionPolynomial2, i2);
            C5[i] = packIntoLong(i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i2, i2, maskWithReductionPolynomial2);
            C6[i] = packIntoLong(maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i2, i2);
            WhirlpoolDigest whirlpoolDigest2 = this;
            C7[i] = whirlpoolDigest2.packIntoLong(i2, maskWithReductionPolynomial2, i2, maskWithReductionPolynomial3, i3, maskWithReductionPolynomial, i4, i2);
            i++;
            whirlpoolDigest = whirlpoolDigest2;
        }
        whirlpoolDigest._rc[0] = 0;
        for (int i5 = 1; i5 <= 10; i5++) {
            int i6 = (i5 - 1) * 8;
            whirlpoolDigest._rc[i5] = (((((((C0[i6] & (-72057594037927936L)) ^ (C1[i6 + 1] & 71776119061217280L)) ^ (C2[i6 + 2] & 280375465082880L)) ^ (C3[i6 + 3] & 1095216660480L)) ^ (C4[i6 + 4] & 4278190080L)) ^ (C5[i6 + 5] & 16711680)) ^ (C6[i6 + 6] & 65280)) ^ (C7[i6 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    private void convertLongToByteArray(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((j >> (56 - (i2 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this._bitCount[i] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        int i2 = i + 1;
        this._bufferPos = i2;
        bArr[i] = (byte) (bArr[i] | 128);
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i2 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i) {
        return ((long) i) >= 256 ? i ^ REDUCTION_POLYNOMIAL : i;
    }

    private long packIntoLong(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((i << 56) ^ (i2 << 48)) ^ (i3 << 40)) ^ (i4 << 32)) ^ (i5 << 24)) ^ (i6 << 16)) ^ (i7 << 8)) ^ i8;
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this._state.length; i2++) {
            this._block[i2] = bytesToLongFromBuffer(this._buffer, i2 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        for (int i2 = 0; i2 < 8; i2++) {
            convertLongToByteArray(this._hash[i2], bArr, (i2 * 8) + i);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        long[] jArr;
        long[] jArr2;
        for (int i = 0; i < 8; i++) {
            long[] jArr3 = this._state;
            long j = this._block[i];
            long[] jArr4 = this._K;
            long j2 = this._hash[i];
            jArr4[i] = j2;
            jArr3[i] = j ^ j2;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            int i3 = 0;
            while (true) {
                jArr = this._L;
                if (i3 >= 8) {
                    break;
                }
                jArr[i3] = 0;
                long[] jArr5 = C0;
                long[] jArr6 = this._K;
                long j3 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255];
                jArr[i3] = j3;
                long j4 = C1[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr[i3] = j4;
                long j5 = j4 ^ C2[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr[i3] = j5;
                long j6 = j5 ^ C3[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr[i3] = j6;
                long j7 = j6 ^ C4[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr[i3] = j7;
                long j8 = j7 ^ C5[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr[i3] = j8;
                long j9 = j8 ^ C6[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr[i3] = j9;
                jArr[i3] = j9 ^ C7[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
            }
            long[] jArr7 = this._K;
            System.arraycopy(jArr, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i2];
            int i4 = 0;
            while (true) {
                jArr2 = this._L;
                if (i4 < 8) {
                    long j10 = this._K[i4];
                    jArr2[i4] = j10;
                    long[] jArr9 = C0;
                    long[] jArr10 = this._state;
                    long j11 = j10 ^ jArr9[((int) (jArr10[i4 & 7] >>> 56)) & 255];
                    jArr2[i4] = j11;
                    long j12 = j11 ^ C1[((int) (jArr10[(i4 - 1) & 7] >>> 48)) & 255];
                    jArr2[i4] = j12;
                    long j13 = j12 ^ C2[((int) (jArr10[(i4 - 2) & 7] >>> 40)) & 255];
                    jArr2[i4] = j13;
                    long j14 = j13 ^ C3[((int) (jArr10[(i4 - 3) & 7] >>> 32)) & 255];
                    jArr2[i4] = j14;
                    long j15 = j14 ^ C4[((int) (jArr10[(i4 - 4) & 7] >>> 24)) & 255];
                    jArr2[i4] = j15;
                    long j16 = j15 ^ C5[((int) (jArr10[(i4 - 5) & 7] >>> 16)) & 255];
                    jArr2[i4] = j16;
                    long j17 = j16 ^ C6[((int) (jArr10[(i4 - 6) & 7] >>> 8)) & 255];
                    jArr2[i4] = j17;
                    jArr2[i4] = j17 ^ C7[((int) jArr10[(i4 - 7) & 7]) & 255];
                    i4++;
                }
            }
            long[] jArr11 = this._state;
            System.arraycopy(jArr2, 0, jArr11, 0, jArr11.length);
        }
        for (int i5 = 0; i5 < 8; i5++) {
            long[] jArr12 = this._hash;
            jArr12[i5] = jArr12[i5] ^ (this._state[i5] ^ this._block[i5]);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b;
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }
}
