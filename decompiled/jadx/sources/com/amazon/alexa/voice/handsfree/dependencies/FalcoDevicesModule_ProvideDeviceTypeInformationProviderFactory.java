package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FalcoDevicesModule_ProvideDeviceTypeInformationProviderFactory implements Factory<DeviceTypeInformationProvider> {
    private final Provider<Context> contextProvider;
    private final FalcoDevicesModule module;

    public FalcoDevicesModule_ProvideDeviceTypeInformationProviderFactory(FalcoDevicesModule falcoDevicesModule, Provider<Context> provider) {
        this.module = falcoDevicesModule;
        this.contextProvider = provider;
    }

    public static FalcoDevicesModule_ProvideDeviceTypeInformationProviderFactory create(FalcoDevicesModule falcoDevicesModule, Provider<Context> provider) {
        return new FalcoDevicesModule_ProvideDeviceTypeInformationProviderFactory(falcoDevicesModule, provider);
    }

    public static DeviceTypeInformationProvider provideDeviceTypeInformationProvider(FalcoDevicesModule falcoDevicesModule, Context context) {
        return (DeviceTypeInformationProvider) Preconditions.checkNotNull(falcoDevicesModule.provideDeviceTypeInformationProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public DeviceTypeInformationProvider get() {
        return provideDeviceTypeInformationProvider(this.module, this.contextProvider.get());
    }
}
