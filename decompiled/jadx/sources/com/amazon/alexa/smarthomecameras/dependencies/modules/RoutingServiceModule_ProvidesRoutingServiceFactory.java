package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.routing.api.RoutingService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RoutingServiceModule_ProvidesRoutingServiceFactory implements Factory<RoutingService> {
    private final RoutingServiceModule module;

    public RoutingServiceModule_ProvidesRoutingServiceFactory(RoutingServiceModule routingServiceModule) {
        this.module = routingServiceModule;
    }

    public static RoutingServiceModule_ProvidesRoutingServiceFactory create(RoutingServiceModule routingServiceModule) {
        return new RoutingServiceModule_ProvidesRoutingServiceFactory(routingServiceModule);
    }

    public static RoutingService providesRoutingService(RoutingServiceModule routingServiceModule) {
        return (RoutingService) Preconditions.checkNotNull(routingServiceModule.providesRoutingService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public RoutingService get() {
        return providesRoutingService(this.module);
    }
}
