package org.bouncycastle.crypto.prng;

/* loaded from: classes11.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
