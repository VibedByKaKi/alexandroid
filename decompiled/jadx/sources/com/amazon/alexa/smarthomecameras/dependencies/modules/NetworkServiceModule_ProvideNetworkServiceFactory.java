package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.protocols.network.NetworkService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class NetworkServiceModule_ProvideNetworkServiceFactory implements Factory<NetworkService> {
    private static final NetworkServiceModule_ProvideNetworkServiceFactory INSTANCE = new NetworkServiceModule_ProvideNetworkServiceFactory();

    public static NetworkServiceModule_ProvideNetworkServiceFactory create() {
        return INSTANCE;
    }

    public static NetworkService provideNetworkService() {
        return (NetworkService) Preconditions.checkNotNull(NetworkServiceModule.provideNetworkService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public NetworkService get() {
        return provideNetworkService();
    }
}
