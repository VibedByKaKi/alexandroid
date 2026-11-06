package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.routing.api.RoutingService;
import com.google.common.base.Preconditions;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class RoutingServiceModule {
    private final RoutingService routingService;

    public RoutingServiceModule(RoutingService routingService) {
        Preconditions.checkNotNull(routingService, "RoutingService cannot be null");
        this.routingService = routingService;
    }

    @Provides
    @Singleton
    public RoutingService providesRoutingService() {
        return this.routingService;
    }
}
