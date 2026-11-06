package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DESParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArr = new byte[8];
        do {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
        } while (DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        int i = this.strength;
        if (i == 0 || i == 7) {
            this.strength = 8;
        } else {
            if (i == 8) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("DES key must be 64 bits long.");
        }
    }
}
