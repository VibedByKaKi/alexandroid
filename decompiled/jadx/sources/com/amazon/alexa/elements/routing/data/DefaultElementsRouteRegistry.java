package com.amazon.alexa.elements.routing.data;

import com.amazon.alexa.routing.api.RoutingRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DefaultElementsRouteRegistry implements ElementsRouteRegistry {
    @Override // com.amazon.alexa.elements.routing.data.ElementsRouteRegistry
    public void registerRoutes(RoutingRegistry routingRegistry) {
        addAllRoutes(routingRegistry, new ElementsRouteCollection[]{new GeneratedRouteCollection1(), new GeneratedRouteCollection2(), new GeneratedRouteCollection3(), new GeneratedRouteCollection4()});
    }
}
