package com.amazon.alexa.accessory.crypto;

import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MemoryNegotiatedDataPersistenceLayer implements NegotiatedDataPersistor {
    private static final int DEFAULT_PAGINATION_LIMIT = 100;
    private final int maxPageSize;
    private final NavigableMap<String, CryptoKeyDataStore.NegotiatedData> store;

    public MemoryNegotiatedDataPersistenceLayer(int i) {
        this.store = new TreeMap();
        this.maxPageSize = i;
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public void deleteData(Iterable<String> iterable) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        for (String str : iterable) {
            if (str != null) {
                this.store.remove(str);
            }
        }
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public CryptoKeyDataStore.NegotiatedData getData(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(str).accumulateField(str != null, "accessoryId").throwIfInvalid("MemoryPersistenceLayer - Cannot get data for a null accessory ID.");
        return this.store.get(str);
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public boolean hasData(String str) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(str).accumulateField(str != null, "accessoryId").throwIfInvalid("MemoryPersistenceLayer - Cannot find data for a null accessory ID.");
        return this.store.containsKey(str);
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public CryptoKeyDataStore.ListResult listData(int i, CryptoKeyDataStore.PaginationToken paginationToken) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(null).accumulateField(i > 0, "maxCount").accumulateField(paginationToken != null, "token").throwIfInvalid("MemoryCryptoKeyDataStore.listNegotiatedAccessories - Invalid Inputs");
        int min = Math.min(i, this.maxPageSize);
        NavigableSet<String> navigableKeySet = this.store.navigableKeySet();
        if (CryptoKeyDataStore.PaginationToken.EMPTY != paginationToken) {
            navigableKeySet = navigableKeySet.tailSet(paginationToken.value, true);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator<String> it2 = navigableKeySet.iterator();
        for (int i2 = 0; i2 < min && it2.hasNext(); i2++) {
            builder.add((ImmutableList.Builder) it2.next());
        }
        return new CryptoKeyDataStore.ListResult(builder.build(), it2.hasNext() ? new CryptoKeyDataStore.PaginationToken(it2.next()) : CryptoKeyDataStore.PaginationToken.EMPTY);
    }

    @Override // com.amazon.alexa.accessory.crypto.NegotiatedDataPersistor
    public void putData(String str, CryptoKeyDataStore.NegotiatedData negotiatedData) throws CryptoKeyDataStore.CryptoKeyDataStoreException {
        CryptoKeyDataStore.InvalidInputsException.accumulator(str).accumulateField(str != null, "accessoryId").accumulateField(negotiatedData != null, "toPersist").throwIfInvalid("MemoryPersistenceLayer - putData inputs invalid.");
        this.store.put(str, negotiatedData);
    }

    public MemoryNegotiatedDataPersistenceLayer() {
        this(100);
    }
}
