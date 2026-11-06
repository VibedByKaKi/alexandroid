package com.amazon.alexa.mobilytics.session;

import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultSessionStorage_Factory implements Factory<DefaultSessionStorage> {
    private final Provider<String> installationIdProvider;
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public DefaultSessionStorage_Factory(Provider<PersistentStorage.Factory> provider, Provider<String> provider2) {
        this.storageFactoryProvider = provider;
        this.installationIdProvider = provider2;
    }

    public static DefaultSessionStorage_Factory create(Provider<PersistentStorage.Factory> provider, Provider<String> provider2) {
        return new DefaultSessionStorage_Factory(provider, provider2);
    }

    public static DefaultSessionStorage newInstance(PersistentStorage.Factory factory, String str) {
        return new DefaultSessionStorage(factory, str);
    }

    @Override // javax.inject.Provider
    public DefaultSessionStorage get() {
        return newInstance(this.storageFactoryProvider.get(), this.installationIdProvider.get());
    }
}
