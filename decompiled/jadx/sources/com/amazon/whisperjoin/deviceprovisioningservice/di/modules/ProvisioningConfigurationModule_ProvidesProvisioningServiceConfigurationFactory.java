package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisioningServiceConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningConfigurationModule_ProvidesProvisioningServiceConfigurationFactory implements Factory<ProvisioningServiceConfiguration> {
    private final ProvisioningConfigurationModule module;

    public ProvisioningConfigurationModule_ProvidesProvisioningServiceConfigurationFactory(ProvisioningConfigurationModule provisioningConfigurationModule) {
        this.module = provisioningConfigurationModule;
    }

    public static ProvisioningConfigurationModule_ProvidesProvisioningServiceConfigurationFactory create(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return new ProvisioningConfigurationModule_ProvidesProvisioningServiceConfigurationFactory(provisioningConfigurationModule);
    }

    public static ProvisioningServiceConfiguration providesProvisioningServiceConfiguration(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return (ProvisioningServiceConfiguration) Preconditions.checkNotNull(provisioningConfigurationModule.providesProvisioningServiceConfiguration(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ProvisioningServiceConfiguration get() {
        return providesProvisioningServiceConfiguration(this.module);
    }
}
