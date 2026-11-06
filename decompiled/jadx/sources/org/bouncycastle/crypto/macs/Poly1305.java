package org.bouncycastle.crypto.macs;

import androidx.compose.ui.spatial.RectListKt;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;
    private int h0;
    private int h1;
    private int h2;
    private int h3;
    private int h4;
    private int k0;
    private int k1;
    private int k2;
    private int k3;
    private int r0;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private final byte[] singleByte;

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() == 16) {
            this.cipher = blockCipher;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Poly1305 requires a 128 bit block cipher.");
            throw null;
        }
    }

    private static final long mul32x32_64(int i, int i2) {
        return (i & 4294967295L) * i2;
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j = littleEndianToInt & 4294967295L;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & 4294967295L;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & 4294967295L;
        long littleEndianToInt4 = 4294967295L & Pack.littleEndianToInt(this.currentBlock, 12);
        int i3 = (int) (this.h0 + (littleEndianToInt & 67108863));
        this.h0 = i3;
        this.h1 = (int) (this.h1 + ((((littleEndianToInt2 << 32) | j) >>> 26) & 67108863));
        this.h2 = (int) (this.h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.h3 = (int) (this.h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i4 = (int) (this.h4 + (littleEndianToInt4 >>> 8));
        this.h4 = i4;
        if (this.currentBlockOffset == 16) {
            this.h4 = i4 + 16777216;
        }
        long mul32x32_64 = mul32x32_64(i3, this.r0) + mul32x32_64(this.h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long mul32x32_642 = mul32x32_64(this.h0, this.r1) + mul32x32_64(this.h1, this.r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.h4, this.s2);
        long mul32x32_643 = mul32x32_64(this.h0, this.r2) + mul32x32_64(this.h1, this.r1) + mul32x32_64(this.h2, this.r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.h4, this.s3);
        long mul32x32_644 = mul32x32_64(this.h0, this.r3) + mul32x32_64(this.h1, this.r2) + mul32x32_64(this.h2, this.r1) + mul32x32_64(this.h3, this.r0) + mul32x32_64(this.h4, this.s4);
        long mul32x32_645 = mul32x32_64(this.h0, this.r4) + mul32x32_64(this.h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.r1) + mul32x32_64(this.h4, this.r0);
        int i5 = ((int) mul32x32_64) & RectListKt.Lower26Bits;
        long j2 = mul32x32_642 + (mul32x32_64 >>> 26);
        int i6 = ((int) j2) & RectListKt.Lower26Bits;
        long j3 = mul32x32_643 + (j2 >>> 26);
        this.h2 = ((int) j3) & RectListKt.Lower26Bits;
        long j4 = mul32x32_644 + (j3 >>> 26);
        this.h3 = ((int) j4) & RectListKt.Lower26Bits;
        long j5 = mul32x32_645 + (j4 >>> 26);
        this.h4 = ((int) j5) & RectListKt.Lower26Bits;
        int i7 = (((int) (j5 >>> 26)) * 5) + i5;
        this.h1 = i6 + (i7 >>> 26);
        this.h0 = i7 & RectListKt.Lower26Bits;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            Single$$ExternalSyntheticBUOutline0.m$3("Poly1305 key must be 256 bits.");
            return;
        }
        int i = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Poly1305 requires a 128 bit IV.");
            return;
        }
        int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.r0 = 67108863 & littleEndianToInt;
        int i2 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.r1 = i2;
        int i3 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.r2 = i3;
        int i4 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.r3 = i4;
        int i5 = (littleEndianToInt4 >>> 8) & 1048575;
        this.r4 = i5;
        this.s1 = i2 * 5;
        this.s2 = i3 * 5;
        this.s3 = i4 * 5;
        this.s4 = i5 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.k0 = Pack.littleEndianToInt(bArr, i);
        this.k1 = Pack.littleEndianToInt(bArr, i + 4);
        this.k2 = Pack.littleEndianToInt(bArr, i + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (i + 16 > bArr.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$2("Output buffer is too short.");
            return 0;
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i2 = this.h1;
        int i3 = this.h0;
        int i4 = i2 + (i3 >>> 26);
        int i5 = i3 & RectListKt.Lower26Bits;
        int i6 = this.h2 + (i4 >>> 26);
        int i7 = i4 & RectListKt.Lower26Bits;
        int i8 = this.h3 + (i6 >>> 26);
        int i9 = i6 & RectListKt.Lower26Bits;
        int i10 = this.h4 + (i8 >>> 26);
        int i11 = i8 & RectListKt.Lower26Bits;
        int i12 = ((i10 >>> 26) * 5) + i5;
        int i13 = i10 & RectListKt.Lower26Bits;
        int i14 = i7 + (i12 >>> 26);
        int i15 = i12 & RectListKt.Lower26Bits;
        int i16 = i15 + 5;
        int i17 = i16 >>> 26;
        int i18 = i16 & RectListKt.Lower26Bits;
        int i19 = i17 + i14;
        int i20 = i19 >>> 26;
        int i21 = i19 & RectListKt.Lower26Bits;
        int i22 = i20 + i9;
        int i23 = i22 >>> 26;
        int i24 = i22 & RectListKt.Lower26Bits;
        int i25 = i23 + i11;
        int i26 = 67108863 & i25;
        int i27 = ((i25 >>> 26) + i13) - 67108864;
        int i28 = (i27 >>> 31) - 1;
        int i29 = ~i28;
        this.h0 = (i15 & i29) | (i18 & i28);
        this.h1 = (i14 & i29) | (i21 & i28);
        this.h2 = (i9 & i29) | (i24 & i28);
        this.h3 = (i26 & i28) | (i11 & i29);
        this.h4 = (i13 & i29) | (i27 & i28);
        long j = (((r3 << 26) | r8) & 4294967295L) + (this.k0 & 4294967295L);
        long j2 = (((r3 >>> 6) | (r6 << 20)) & 4294967295L) + (this.k1 & 4294967295L);
        Pack.intToLittleEndian((int) j, bArr, i);
        long j3 = j2 + (j >>> 32);
        Pack.intToLittleEndian((int) j3, bArr, i + 4);
        long j4 = (((r6 >>> 12) | (r5 << 14)) & 4294967295L) + (this.k2 & 4294967295L) + (j3 >>> 32);
        Pack.intToLittleEndian((int) j4, bArr, i + 8);
        Pack.intToLittleEndian((int) ((((r5 >>> 18) | (r4 << 8)) & 4294967295L) + (this.k3 & 4294967295L) + (j4 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else if (!(cipherParameters instanceof ParametersWithIV)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Poly1305 requires an IV when used with a block cipher.");
            return;
        } else {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Poly1305 requires a key.");
        } else {
            setKey(((KeyParameter) cipherParameters).getKey(), bArr);
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.h1 = 0;
        this.h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, min);
            i3 += min;
            this.currentBlockOffset += min;
        }
    }

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }
}
