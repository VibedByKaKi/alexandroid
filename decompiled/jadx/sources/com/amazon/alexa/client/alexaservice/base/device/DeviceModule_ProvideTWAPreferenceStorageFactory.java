package com.amazon.alexa.client.alexaservice.base.device;

import android.content.Context;
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
public final class DeviceModule_ProvideTWAPreferenceStorageFactory implements Factory<PersistentStorage> {
    private final Provider<Context> contextProvider;
    private final DeviceModule module;

    public DeviceModule_ProvideTWAPreferenceStorageFactory(DeviceModule deviceModule, Provider<Context> provider) {
        this.module = deviceModule;
        this.contextProvider = provider;
    }

    public static DeviceModule_ProvideTWAPreferenceStorageFactory create(DeviceModule deviceModule, Provider<Context> provider) {
        return new DeviceModule_ProvideTWAPreferenceStorageFactory(deviceModule, provider);
    }

    public static PersistentStorage provideTWAPreferenceStorage(DeviceModule deviceModule, Context context) {
        return (PersistentStorage) Preconditions.checkNotNullFromProvides(deviceModule.provideTWAPreferenceStorage(context));
    }

    @Override // javax.inject.Provider
    public PersistentStorage get() {
        return provideTWAPreferenceStorage(this.module, this.contextProvider.get());
    }
}
