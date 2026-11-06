package com.amazon.alexa.configservice.dependencies;

import com.amazon.alexa.protocols.network.NetworkService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ConfigsModule_ProvidesNetworkServiceFactory implements Factory<NetworkService> {
    private final ConfigsModule module;

    public ConfigsModule_ProvidesNetworkServiceFactory(ConfigsModule configsModule) {
        this.module = configsModule;
    }

    public static ConfigsModule_ProvidesNetworkServiceFactory create(ConfigsModule configsModule) {
        return new ConfigsModule_ProvidesNetworkServiceFactory(configsModule);
    }

    public static NetworkService providesNetworkService(ConfigsModule configsModule) {
        return (NetworkService) Preconditions.checkNotNull(configsModule.providesNetworkService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public NetworkService get() {
        return providesNetworkService(this.module);
    }
}
