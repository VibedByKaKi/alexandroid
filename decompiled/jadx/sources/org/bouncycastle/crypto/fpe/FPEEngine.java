package org.bouncycastle.crypto.fpe;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    public FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    public static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i != sArr.length; i++) {
            Pack.shortToBigEndian(sArr[i], bArr, i * 2);
        }
        return bArr;
    }

    public static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("data must be an even number of bytes for a wide radix");
            return null;
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = Pack.bigEndianToShort(bArr, i * 2);
        }
        return sArr;
    }

    public abstract int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public abstract int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.fpeParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("FPE engine not initialized");
            return 0;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("input length cannot be negative");
            return 0;
        }
        if (bArr == null || bArr2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("buffer value is null");
            return 0;
        }
        if (bArr.length < i + i2) {
            CrlID$$ExternalSyntheticBUOutline0.m$3("input buffer too short");
            return 0;
        }
        if (bArr2.length >= i3 + i2) {
            return this.forEncryption ? encryptBlock(bArr, i, i2, bArr2, i3) : decryptBlock(bArr, i, i2, bArr2, i3);
        }
        CrlID$$ExternalSyntheticBUOutline0.m$2("output buffer too short");
        return 0;
    }
}
