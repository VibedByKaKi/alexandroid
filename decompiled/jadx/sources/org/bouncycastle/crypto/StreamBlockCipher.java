package org.bouncycastle.crypto;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$3("input buffer too small");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$2("output buffer too short");
            return 0;
        }
        while (i < i4) {
            bArr2[i3] = calculateByte(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b) {
        return calculateByte(b);
    }
}
