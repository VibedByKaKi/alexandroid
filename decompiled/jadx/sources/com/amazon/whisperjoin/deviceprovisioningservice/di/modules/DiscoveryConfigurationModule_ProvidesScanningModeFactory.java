package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.common.sharedtypes.radios.ScanningMode;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DiscoveryConfigurationModule_ProvidesScanningModeFactory implements Factory<ScanningMode> {
    private final DiscoveryConfigurationModule module;

    public DiscoveryConfigurationModule_ProvidesScanningModeFactory(DiscoveryConfigurationModule discoveryConfigurationModule) {
        this.module = discoveryConfigurationModule;
    }

    public static DiscoveryConfigurationModule_ProvidesScanningModeFactory create(DiscoveryConfigurationModule discoveryConfigurationModule) {
        return new DiscoveryConfigurationModule_ProvidesScanningModeFactory(discoveryConfigurationModule);
    }

    public static ScanningMode providesScanningMode(DiscoveryConfigurationModule discoveryConfigurationModule) {
        return (ScanningMode) Preconditions.checkNotNull(discoveryConfigurationModule.providesScanningMode(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ScanningMode get() {
        return providesScanningMode(this.module);
    }
}
