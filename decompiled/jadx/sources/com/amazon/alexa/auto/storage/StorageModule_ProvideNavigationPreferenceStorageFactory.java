package com.amazon.alexa.auto.storage;

import android.content.Context;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class StorageModule_ProvideNavigationPreferenceStorageFactory implements Factory<PersistentStorage> {
    private final Provider<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideNavigationPreferenceStorageFactory(StorageModule storageModule, Provider<Context> provider) {
        this.module = storageModule;
        this.contextProvider = provider;
    }

    public static StorageModule_ProvideNavigationPreferenceStorageFactory create(StorageModule storageModule, Provider<Context> provider) {
        return new StorageModule_ProvideNavigationPreferenceStorageFactory(storageModule, provider);
    }

    public static PersistentStorage provideNavigationPreferenceStorage(StorageModule storageModule, Context context) {
        return (PersistentStorage) Preconditions.checkNotNullFromProvides(storageModule.provideNavigationPreferenceStorage(context));
    }

    @Override // javax.inject.Provider
    public PersistentStorage get() {
        return provideNavigationPreferenceStorage(this.module, this.contextProvider.get());
    }
}
