package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvidePersistentStorageFactoryFactory implements Factory<PersistentStorage.Factory> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidePersistentStorageFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidePersistentStorageFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidePersistentStorageFactoryFactory(applicationModule);
    }

    public static PersistentStorage.Factory providePersistentStorageFactory(ApplicationModule applicationModule) {
        return (PersistentStorage.Factory) Preconditions.checkNotNull(applicationModule.providePersistentStorageFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public PersistentStorage.Factory get() {
        return providePersistentStorageFactory(this.module);
    }
}
