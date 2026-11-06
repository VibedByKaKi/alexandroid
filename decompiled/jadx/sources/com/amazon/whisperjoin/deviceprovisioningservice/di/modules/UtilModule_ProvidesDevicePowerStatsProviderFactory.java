package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.service.power.DevicePowerStatusProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UtilModule_ProvidesDevicePowerStatsProviderFactory implements Factory<DevicePowerStatusProvider> {
    private final Provider<Context> contextProvider;
    private final UtilModule module;

    public UtilModule_ProvidesDevicePowerStatsProviderFactory(UtilModule utilModule, Provider<Context> provider) {
        this.module = utilModule;
        this.contextProvider = provider;
    }

    public static UtilModule_ProvidesDevicePowerStatsProviderFactory create(UtilModule utilModule, Provider<Context> provider) {
        return new UtilModule_ProvidesDevicePowerStatsProviderFactory(utilModule, provider);
    }

    public static DevicePowerStatusProvider providesDevicePowerStatsProvider(UtilModule utilModule, Context context) {
        return (DevicePowerStatusProvider) Preconditions.checkNotNull(utilModule.providesDevicePowerStatsProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public DevicePowerStatusProvider get() {
        return providesDevicePowerStatsProvider(this.module, this.contextProvider.get());
    }
}
