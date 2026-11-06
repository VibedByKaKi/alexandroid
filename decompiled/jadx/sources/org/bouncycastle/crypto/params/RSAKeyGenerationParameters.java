package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            Single$$ExternalSyntheticBUOutline0.m$3("key strength too small");
            throw null;
        }
        if (!bigInteger.testBit(0)) {
            Single$$ExternalSyntheticBUOutline0.m$3("public exponent cannot be even");
            throw null;
        }
        this.publicExponent = bigInteger;
        this.certainty = i2;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
}
