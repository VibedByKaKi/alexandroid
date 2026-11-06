package com.amazon.alexa.client.alexaservice.base.device;

import com.amazon.alexa.client.core.device.PersistentStorage;
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
public final class DeviceModule_ProvideUserDependentStorageFactory implements Factory<UserDependentStorage> {
    private final Provider<PersistentStorage> capabilitiesStoreProvider;
    private final DeviceModule module;
    private final Provider<PersistentStorage> playbackStateStoreProvider;
    private final Provider<PersistentStorage> settingsStoreProvider;
    private final Provider<PersistentStorage> twaStoreProvider;

    public DeviceModule_ProvideUserDependentStorageFactory(DeviceModule deviceModule, Provider<PersistentStorage> provider, Provider<PersistentStorage> provider2, Provider<PersistentStorage> provider3, Provider<PersistentStorage> provider4) {
        this.module = deviceModule;
        this.twaStoreProvider = provider;
        this.settingsStoreProvider = provider2;
        this.capabilitiesStoreProvider = provider3;
        this.playbackStateStoreProvider = provider4;
    }

    public static DeviceModule_ProvideUserDependentStorageFactory create(DeviceModule deviceModule, Provider<PersistentStorage> provider, Provider<PersistentStorage> provider2, Provider<PersistentStorage> provider3, Provider<PersistentStorage> provider4) {
        return new DeviceModule_ProvideUserDependentStorageFactory(deviceModule, provider, provider2, provider3, provider4);
    }

    public static UserDependentStorage provideUserDependentStorage(DeviceModule deviceModule, PersistentStorage persistentStorage, PersistentStorage persistentStorage2, PersistentStorage persistentStorage3, PersistentStorage persistentStorage4) {
        return (UserDependentStorage) Preconditions.checkNotNullFromProvides(deviceModule.provideUserDependentStorage(persistentStorage, persistentStorage2, persistentStorage3, persistentStorage4));
    }

    @Override // javax.inject.Provider
    public UserDependentStorage get() {
        return provideUserDependentStorage(this.module, this.twaStoreProvider.get(), this.settingsStoreProvider.get(), this.capabilitiesStoreProvider.get(), this.playbackStateStoreProvider.get());
    }
}
