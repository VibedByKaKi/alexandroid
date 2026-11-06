package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningConfigurationModule_ProvidesIsDebugEnabledFactory implements Factory<Boolean> {
    private final ProvisioningConfigurationModule module;

    public ProvisioningConfigurationModule_ProvidesIsDebugEnabledFactory(ProvisioningConfigurationModule provisioningConfigurationModule) {
        this.module = provisioningConfigurationModule;
    }

    public static ProvisioningConfigurationModule_ProvidesIsDebugEnabledFactory create(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return new ProvisioningConfigurationModule_ProvidesIsDebugEnabledFactory(provisioningConfigurationModule);
    }

    public static Boolean providesIsDebugEnabled(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return (Boolean) Preconditions.checkNotNull(provisioningConfigurationModule.providesIsDebugEnabled(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return providesIsDebugEnabled(this.module);
    }
}
