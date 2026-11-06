package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class NetworkServiceModule {
    @Provides
    @Singleton
    public static NetworkService provideNetworkService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(NetworkService.class).get();
        return (NetworkService) obj;
    }
}
