package com.amazon.alexa.accessory.crypto;

import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface NegotiatedDataPersistor {
    void deleteData(Iterable<String> iterable) throws CryptoKeyDataStore.CryptoKeyDataStoreException;

    CryptoKeyDataStore.NegotiatedData getData(String str) throws CryptoKeyDataStore.InvalidInputsException, CryptoKeyDataStore.CryptoKeyDataStoreException;

    boolean hasData(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreException;

    CryptoKeyDataStore.ListResult listData(int i, CryptoKeyDataStore.PaginationToken paginationToken) throws CryptoKeyDataStore.InvalidInputsException, CryptoKeyDataStore.CryptoKeyDataStoreException;

    void putData(String str, CryptoKeyDataStore.NegotiatedData negotiatedData) throws CryptoKeyDataStore.InvalidInputsException, CryptoKeyDataStore.CryptoKeyDataStoreException;
}
