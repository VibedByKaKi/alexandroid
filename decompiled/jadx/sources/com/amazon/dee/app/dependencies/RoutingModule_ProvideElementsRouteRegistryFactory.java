package com.amazon.dee.app.dependencies;

import com.amazon.alexa.elements.routing.data.ElementsRouteRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RoutingModule_ProvideElementsRouteRegistryFactory implements Factory<ElementsRouteRegistry> {
    private final RoutingModule module;

    public RoutingModule_ProvideElementsRouteRegistryFactory(RoutingModule routingModule) {
        this.module = routingModule;
    }

    public static RoutingModule_ProvideElementsRouteRegistryFactory create(RoutingModule routingModule) {
        return new RoutingModule_ProvideElementsRouteRegistryFactory(routingModule);
    }

    public static ElementsRouteRegistry provideElementsRouteRegistry(RoutingModule routingModule) {
        return (ElementsRouteRegistry) Preconditions.checkNotNullFromProvides(routingModule.provideElementsRouteRegistry());
    }

    @Override // javax.inject.Provider
    public ElementsRouteRegistry get() {
        return provideElementsRouteRegistry(this.module);
    }
}
