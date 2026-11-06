package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.routing.api.RoutingRegistry;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class RoutingRegistryModule {
    @Provides
    @Singleton
    public static RoutingRegistry provideRoutingRegistry() {
        return (RoutingRegistry) Automotive$$ExternalSyntheticOutline0.m(RoutingRegistry.class);
    }
}
