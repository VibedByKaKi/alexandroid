package com.amazon.alexa.hho.navigation.dependency;

import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvidePersistentStorageFactoryFactory implements Factory<LazyComponent<PersistentStorage.Factory>> {
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvidePersistentStorageFactoryFactory(SharedNavigationModule sharedNavigationModule) {
        this.module = sharedNavigationModule;
    }

    public static SharedNavigationModule_ProvidePersistentStorageFactoryFactory create(SharedNavigationModule sharedNavigationModule) {
        return new SharedNavigationModule_ProvidePersistentStorageFactoryFactory(sharedNavigationModule);
    }

    public static LazyComponent<PersistentStorage.Factory> providePersistentStorageFactory(SharedNavigationModule sharedNavigationModule) {
        return (LazyComponent) Preconditions.checkNotNullFromProvides(sharedNavigationModule.providePersistentStorageFactory());
    }

    @Override // javax.inject.Provider
    public LazyComponent<PersistentStorage.Factory> get() {
        return providePersistentStorageFactory(this.module);
    }
}
