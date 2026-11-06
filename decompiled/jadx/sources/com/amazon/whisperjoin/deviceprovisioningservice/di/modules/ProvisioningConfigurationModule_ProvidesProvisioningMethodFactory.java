package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisioningMethod;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningConfigurationModule_ProvidesProvisioningMethodFactory implements Factory<ProvisioningMethod> {
    private final ProvisioningConfigurationModule module;

    public ProvisioningConfigurationModule_ProvidesProvisioningMethodFactory(ProvisioningConfigurationModule provisioningConfigurationModule) {
        this.module = provisioningConfigurationModule;
    }

    public static ProvisioningConfigurationModule_ProvidesProvisioningMethodFactory create(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return new ProvisioningConfigurationModule_ProvidesProvisioningMethodFactory(provisioningConfigurationModule);
    }

    public static ProvisioningMethod providesProvisioningMethod(ProvisioningConfigurationModule provisioningConfigurationModule) {
        return (ProvisioningMethod) Preconditions.checkNotNull(provisioningConfigurationModule.providesProvisioningMethod(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ProvisioningMethod get() {
        return providesProvisioningMethod(this.module);
    }
}
