package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.common.sharedtypes.configuration.OveractiveConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DiscoveryConfigurationModule_ProvidesOveractiveConfigurationFactory implements Factory<OveractiveConfiguration> {
    private final DiscoveryConfigurationModule module;

    public DiscoveryConfigurationModule_ProvidesOveractiveConfigurationFactory(DiscoveryConfigurationModule discoveryConfigurationModule) {
        this.module = discoveryConfigurationModule;
    }

    public static DiscoveryConfigurationModule_ProvidesOveractiveConfigurationFactory create(DiscoveryConfigurationModule discoveryConfigurationModule) {
        return new DiscoveryConfigurationModule_ProvidesOveractiveConfigurationFactory(discoveryConfigurationModule);
    }

    public static OveractiveConfiguration providesOveractiveConfiguration(DiscoveryConfigurationModule discoveryConfigurationModule) {
        return (OveractiveConfiguration) Preconditions.checkNotNull(discoveryConfigurationModule.providesOveractiveConfiguration(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public OveractiveConfiguration get() {
        return providesOveractiveConfiguration(this.module);
    }
}
