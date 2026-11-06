package com.amazon.alexa.biloba.dependency;

import com.amazon.alexa.biloba.service.BilobaUrlResolver;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideBilobaUrlResolverFactory implements Factory<BilobaUrlResolver> {
    private final Provider<EnvironmentService> environmentServiceProvider;
    private final ServiceModule module;

    public ServiceModule_ProvideBilobaUrlResolverFactory(ServiceModule serviceModule, Provider<EnvironmentService> provider) {
        this.module = serviceModule;
        this.environmentServiceProvider = provider;
    }

    public static ServiceModule_ProvideBilobaUrlResolverFactory create(ServiceModule serviceModule, Provider<EnvironmentService> provider) {
        return new ServiceModule_ProvideBilobaUrlResolverFactory(serviceModule, provider);
    }

    public static BilobaUrlResolver provideBilobaUrlResolver(ServiceModule serviceModule, EnvironmentService environmentService) {
        return (BilobaUrlResolver) Preconditions.checkNotNull(serviceModule.provideBilobaUrlResolver(environmentService), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public BilobaUrlResolver get() {
        return provideBilobaUrlResolver(this.module, this.environmentServiceProvider.get());
    }
}
