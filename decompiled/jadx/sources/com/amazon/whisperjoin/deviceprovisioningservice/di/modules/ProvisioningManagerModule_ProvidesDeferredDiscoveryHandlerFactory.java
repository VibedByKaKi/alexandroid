package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.util.Clock;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.deferred.DeferredDiscoveryHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProvisioningManagerModule_ProvidesDeferredDiscoveryHandlerFactory implements Factory<DeferredDiscoveryHandler> {
    private final Provider<Clock> clockProvider;
    private final ProvisioningManagerModule module;

    public ProvisioningManagerModule_ProvidesDeferredDiscoveryHandlerFactory(ProvisioningManagerModule provisioningManagerModule, Provider<Clock> provider) {
        this.module = provisioningManagerModule;
        this.clockProvider = provider;
    }

    public static ProvisioningManagerModule_ProvidesDeferredDiscoveryHandlerFactory create(ProvisioningManagerModule provisioningManagerModule, Provider<Clock> provider) {
        return new ProvisioningManagerModule_ProvidesDeferredDiscoveryHandlerFactory(provisioningManagerModule, provider);
    }

    public static DeferredDiscoveryHandler providesDeferredDiscoveryHandler(ProvisioningManagerModule provisioningManagerModule, Clock clock) {
        return (DeferredDiscoveryHandler) Preconditions.checkNotNull(provisioningManagerModule.providesDeferredDiscoveryHandler(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public DeferredDiscoveryHandler get() {
        return providesDeferredDiscoveryHandler(this.module, this.clockProvider.get());
    }
}
