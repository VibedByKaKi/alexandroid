package org.bouncycastle.crypto.modes;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int i2;
        int i3;
        int blockSize = this.cipher.getBlockSize();
        boolean z = this.forEncryption;
        int i4 = this.bufOff;
        if (z) {
            if (i4 != blockSize) {
                i3 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    CrlID$$ExternalSyntheticBUOutline0.m$2("output buffer too short");
                    return 0;
                }
                i3 = this.cipher.processBlock(this.buf, 0, bArr, i);
                this.bufOff = 0;
            }
            byte b = (byte) (blockSize - this.bufOff);
            while (true) {
                int i5 = this.bufOff;
                if (i5 >= blockSize) {
                    break;
                }
                this.buf[i5] = b;
                this.bufOff = i5 + 1;
            }
            i2 = this.cipher.processBlock(this.buf, 0, bArr, i + i3) + i3;
        } else {
            if (i4 != blockSize) {
                CrlID$$ExternalSyntheticBUOutline0.m$3("last block incomplete in decryption");
                return 0;
            }
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i6 = bArr3[blockSize - 1] & 255;
            if (i6 > blockSize) {
                CrlID$$ExternalSyntheticBUOutline0.m$1("pad block corrupted");
                return 0;
            }
            int i7 = processBlock - i6;
            System.arraycopy(bArr3, 0, bArr, i, i7);
            i2 = i7;
        }
        reset();
        return i2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!this.forEncryption) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
            this.bufOff = 0;
            i3 = processBlock;
        }
        byte[] bArr3 = this.buf;
        int i4 = this.bufOff;
        this.bufOff = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Can't have a negative input length!");
            return 0;
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$2("output buffer too short");
            return 0;
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i4 = this.bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i3);
            this.bufOff = 0;
            i2 -= i5;
            i += i5;
            i6 = processBlock;
            while (i2 > this.buf.length) {
                i6 += this.cipher.processBlock(bArr, i, bArr2, i3 + i6);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
        this.bufOff += i2;
        return i6;
    }
}
