package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.routing.api.RoutingRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RoutingRegistryModule_ProvideRoutingRegistryFactory implements Factory<RoutingRegistry> {
    private static final RoutingRegistryModule_ProvideRoutingRegistryFactory INSTANCE = new RoutingRegistryModule_ProvideRoutingRegistryFactory();

    public static RoutingRegistryModule_ProvideRoutingRegistryFactory create() {
        return INSTANCE;
    }

    public static RoutingRegistry provideRoutingRegistry() {
        return (RoutingRegistry) Preconditions.checkNotNull(RoutingRegistryModule.provideRoutingRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public RoutingRegistry get() {
        return provideRoutingRegistry();
    }
}
