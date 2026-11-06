package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine(int i) {
        this.blockSize = i;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (!this.initialised) {
            Single$$ExternalSyntheticBUOutline0.m$2("Null engine not initialised");
            return 0;
        }
        int i3 = this.blockSize;
        if (i + i3 > bArr.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$3("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$2("output buffer too short");
            return 0;
        }
        int i4 = 0;
        while (true) {
            int i5 = this.blockSize;
            if (i4 >= i5) {
                return i5;
            }
            bArr2[i2 + i4] = bArr[i + i4];
            i4++;
        }
    }

    public NullEngine() {
        this(1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
