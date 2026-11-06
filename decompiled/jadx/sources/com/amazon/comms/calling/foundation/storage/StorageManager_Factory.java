package com.amazon.comms.calling.foundation.storage;

import com.amazon.comms.calling.foundation.storage.providers.StorageProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class StorageManager_Factory implements Factory<StorageManager> {
    private final Provider<StorageProvider> storageProvider;

    public StorageManager_Factory(Provider<StorageProvider> provider) {
        this.storageProvider = provider;
    }

    public static StorageManager_Factory create(Provider<StorageProvider> provider) {
        return new StorageManager_Factory(provider);
    }

    public static StorageManager newInstance(StorageProvider storageProvider) {
        return new StorageManager(storageProvider);
    }

    @Override // javax.inject.Provider
    public StorageManager get() {
        return newInstance(this.storageProvider.get());
    }
}
