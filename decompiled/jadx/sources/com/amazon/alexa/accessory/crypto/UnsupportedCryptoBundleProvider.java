package com.amazon.alexa.accessory.crypto;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class UnsupportedCryptoBundleProvider implements CryptoBundleProvider {
    @Override // com.amazon.alexa.accessory.crypto.CryptoBundleProvider
    public String accessoryId() {
        throw new UnsupportedOperationException("accessoryId() is not supported yet.");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoBundleProvider
    public CryptoBundle fetchCryptoBundle() {
        throw new UnsupportedOperationException("fetchCrytoBundle() is not supported yet.");
    }
}
