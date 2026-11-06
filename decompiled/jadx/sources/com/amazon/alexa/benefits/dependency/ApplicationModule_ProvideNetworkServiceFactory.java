package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.protocols.network.NetworkService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideNetworkServiceFactory implements Factory<NetworkService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideNetworkServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideNetworkServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideNetworkServiceFactory(applicationModule);
    }

    public static NetworkService provideNetworkService(ApplicationModule applicationModule) {
        return (NetworkService) Preconditions.checkNotNull(applicationModule.provideNetworkService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public NetworkService get() {
        return provideNetworkService(this.module);
    }
}
