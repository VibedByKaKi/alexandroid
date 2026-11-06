package com.amazon.alexa.mobilytics.internal;

import android.content.Context;
import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class InstallationIdProvider_Factory implements Factory<InstallationIdProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public InstallationIdProvider_Factory(Provider<PersistentStorage.Factory> provider, Provider<Context> provider2) {
        this.storageFactoryProvider = provider;
        this.contextProvider = provider2;
    }

    public static InstallationIdProvider_Factory create(Provider<PersistentStorage.Factory> provider, Provider<Context> provider2) {
        return new InstallationIdProvider_Factory(provider, provider2);
    }

    public static InstallationIdProvider newInstance(PersistentStorage.Factory factory, Context context) {
        return new InstallationIdProvider(factory, context);
    }

    @Override // javax.inject.Provider
    public InstallationIdProvider get() {
        return newInstance(this.storageFactoryProvider.get(), this.contextProvider.get());
    }
}
