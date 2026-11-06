package com.amazon.identity.auth.device.framework.crypto;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AESCipher$KeySize {
    KEY_SIZE_128_BITS(128),
    KEY_SIZE_192_BITS(192),
    KEY_SIZE_256_BITS(256);

    private int mKeySizeInBit;

    AESCipher$KeySize(int i) {
        this.mKeySizeInBit = i;
    }

    public int getKeySizeInBit() {
        return this.mKeySizeInBit;
    }
}
