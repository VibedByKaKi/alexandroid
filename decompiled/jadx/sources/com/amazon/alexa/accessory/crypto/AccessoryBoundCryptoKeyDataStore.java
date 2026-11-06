package com.amazon.alexa.accessory.crypto;

import com.amazon.alexa.accessory.capabilities.speech.AccessoryIdentifierProvider;
import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AccessoryBoundCryptoKeyDataStore implements CryptoBundleProvider {
    private final AccessoryIdentifierProvider idProvider;
    private final CryptoKeyDataStore keyStore;

    public AccessoryBoundCryptoKeyDataStore(AccessoryIdentifierProvider accessoryIdentifierProvider, CryptoKeyDataStore cryptoKeyDataStore) {
        Preconditions.notNull(accessoryIdentifierProvider, "idProvider");
        Preconditions.notNull(cryptoKeyDataStore, "keyStore");
        this.idProvider = accessoryIdentifierProvider;
        this.keyStore = cryptoKeyDataStore;
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoBundleProvider
    public String accessoryId() {
        return this.idProvider.getIdentifier();
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoBundleProvider
    public CryptoBundle fetchCryptoBundle() {
        CryptoKeyDataStore.NegotiatedData data = this.keyStore.getData(accessoryId());
        if (data == null) {
            return null;
        }
        return new CryptoBundle(data.cipherSuite, data.cipherTransform, data.encryptionKey, data.authenticationKey);
    }
}
