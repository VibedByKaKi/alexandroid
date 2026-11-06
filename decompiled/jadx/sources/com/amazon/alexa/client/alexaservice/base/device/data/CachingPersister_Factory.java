package com.amazon.alexa.client.alexaservice.base.device.data;

import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKey;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class CachingPersister_Factory<Key extends CachingPersister.PersisterKey, Value> implements Factory<CachingPersister<Key, Value>> {
    private final Provider<CachingPersister.PersisterKeyFactory<Key>> persisterKeyFactoryProvider;
    private final Provider<PersistedDataLoader> storeProvider;
    private final Provider<Class<Value>> typeProvider;

    public CachingPersister_Factory(Provider<Class<Value>> provider, Provider<CachingPersister.PersisterKeyFactory<Key>> provider2, Provider<PersistedDataLoader> provider3) {
        this.typeProvider = provider;
        this.persisterKeyFactoryProvider = provider2;
        this.storeProvider = provider3;
    }

    public static <Key extends CachingPersister.PersisterKey, Value> CachingPersister_Factory<Key, Value> create(Provider<Class<Value>> provider, Provider<CachingPersister.PersisterKeyFactory<Key>> provider2, Provider<PersistedDataLoader> provider3) {
        return new CachingPersister_Factory<>(provider, provider2, provider3);
    }

    public static <Key extends CachingPersister.PersisterKey, Value> CachingPersister<Key, Value> newInstance(Class<Value> cls, CachingPersister.PersisterKeyFactory<Key> persisterKeyFactory, Lazy<PersistedDataLoader> lazy) {
        return new CachingPersister<>(cls, persisterKeyFactory, lazy);
    }

    @Override // javax.inject.Provider
    public CachingPersister<Key, Value> get() {
        return newInstance(this.typeProvider.get(), this.persisterKeyFactoryProvider.get(), DoubleCheck.lazy(this.storeProvider));
    }
}
