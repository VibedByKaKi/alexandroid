package com.amazon.dee.app.dependencies;

import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.dee.app.services.environment.PersistentEndpointsStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class EnvironmentModule_ProvidePersistentEndpointsStorageFactory implements Factory<PersistentEndpointsStorage> {
    private final EnvironmentModule module;
    private final Provider<PersistentStorage.Factory> storageFactoryProvider;

    public EnvironmentModule_ProvidePersistentEndpointsStorageFactory(EnvironmentModule environmentModule, Provider<PersistentStorage.Factory> provider) {
        this.module = environmentModule;
        this.storageFactoryProvider = provider;
    }

    public static EnvironmentModule_ProvidePersistentEndpointsStorageFactory create(EnvironmentModule environmentModule, Provider<PersistentStorage.Factory> provider) {
        return new EnvironmentModule_ProvidePersistentEndpointsStorageFactory(environmentModule, provider);
    }

    public static PersistentEndpointsStorage providePersistentEndpointsStorage(EnvironmentModule environmentModule, PersistentStorage.Factory factory) {
        return (PersistentEndpointsStorage) Preconditions.checkNotNullFromProvides(environmentModule.providePersistentEndpointsStorage(factory));
    }

    @Override // javax.inject.Provider
    public PersistentEndpointsStorage get() {
        return providePersistentEndpointsStorage(this.module, this.storageFactoryProvider.get());
    }
}
