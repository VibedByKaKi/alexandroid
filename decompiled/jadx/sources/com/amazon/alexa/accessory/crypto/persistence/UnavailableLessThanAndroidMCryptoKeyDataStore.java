package com.amazon.alexa.accessory.crypto.persistence;

import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import com.amazon.alexa.accessory.crypto.cipher.Nonce;
import com.amazon.alexa.accessory.crypto.cipher.SupportedCipherSuite;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class UnavailableLessThanAndroidMCryptoKeyDataStore implements CryptoKeyDataStore {
    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public CryptoKeyDataStore.NegotiatedData generateKeys(String str, Nonce nonce, Nonce nonce2, SupportedCipherSuite supportedCipherSuite, int i) throws CryptoKeyDataStore.KeysAlreadyExistException, CryptoKeyDataStore.InvalidInputsException {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public CryptoKeyDataStore.NegotiatedData getData(String str) {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public CryptoKeyDataStore.ListResult listNegotiatedAccessories(int i, CryptoKeyDataStore.PaginationToken paginationToken) throws CryptoKeyDataStore.InvalidInputsException {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public void removeData(String str) {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public CryptoKeyDataStore.NegotiatedData rotateDerivedKeys(String str, Nonce nonce, Nonce nonce2) throws CryptoKeyDataStore.UnrecognizedAccessoryException, CryptoKeyDataStore.InvalidInputsException {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }

    @Override // com.amazon.alexa.accessory.crypto.CryptoKeyDataStore
    public void removeData(Iterable<String> iterable) {
        throw new RuntimeException("KeyExchange not supported in Android < M");
    }
}
