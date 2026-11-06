package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit.DSSServiceConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningConfigurationModule_ProvidesDSSServiceConfigurationFactory implements Factory<DSSServiceConfiguration> {
    private final ProvisioningConfigurationModule module;

    public ProvisioningConfigurationModule_ProvidesDSSServiceConfigurationFactory(ProvisioningConfigurationModule provisioningConfigurationModule) {
        this.module = provisioningConfigurationModule;
    }

    public static ProvisioningConfigurationModule_ProvidesDSSServiceConfigurationFactory create(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return new ProvisioningConfigurationModule_ProvidesDSSServiceConfigurationFactory(provisioningConfigurationModule);
    }

    public static DSSServiceConfiguration providesDSSServiceConfiguration(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return (DSSServiceConfiguration) Preconditions.checkNotNull(provisioningConfigurationModule.providesDSSServiceConfiguration(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public DSSServiceConfiguration get() {
        return providesDSSServiceConfiguration(this.module);
    }
}
