package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes11.dex */
public class ISO10126d2Padding implements BlockCipherPadding {
    SecureRandom random;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            bArr[i] = (byte) this.random.nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO10126-2";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        CrlID$$ExternalSyntheticBUOutline0.m$1("pad block corrupted");
        return 0;
    }
}
