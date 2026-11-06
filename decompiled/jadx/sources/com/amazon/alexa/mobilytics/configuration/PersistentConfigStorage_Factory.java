package com.amazon.alexa.mobilytics.configuration;

import com.amazon.alexa.mobilytics.internal.JsonConverter;
import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class PersistentConfigStorage_Factory implements Factory<PersistentConfigStorage> {
    private final Provider<JsonConverter> converterProvider;
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public PersistentConfigStorage_Factory(Provider<PersistentStorage.Factory> provider, Provider<JsonConverter> provider2) {
        this.storageFactoryProvider = provider;
        this.converterProvider = provider2;
    }

    public static PersistentConfigStorage_Factory create(Provider<PersistentStorage.Factory> provider, Provider<JsonConverter> provider2) {
        return new PersistentConfigStorage_Factory(provider, provider2);
    }

    public static PersistentConfigStorage newInstance(PersistentStorage.Factory factory, JsonConverter jsonConverter) {
        return new PersistentConfigStorage(factory, jsonConverter);
    }

    @Override // javax.inject.Provider
    public PersistentConfigStorage get() {
        return newInstance(this.storageFactoryProvider.get(), this.converterProvider.get());
    }
}
