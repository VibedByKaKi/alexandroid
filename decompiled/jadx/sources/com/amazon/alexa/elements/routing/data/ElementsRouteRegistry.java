package com.amazon.alexa.elements.routing.data;

import android.util.Log;
import com.amazon.alexa.routing.api.RoutingRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsRouteRegistry {
    default void addAllRoutes(RoutingRegistry routingRegistry, ElementsRouteCollection[] elementsRouteCollectionArr) {
        for (ElementsRouteCollection elementsRouteCollection : elementsRouteCollectionArr) {
            for (ElementRoute elementRoute : elementsRouteCollection.getCollection()) {
                try {
                    routingRegistry.register(elementRoute.buildRoute());
                } catch (Exception e) {
                    Log.e("ElementsRouteRegistry", "Failed to register elements route.", e);
                }
            }
        }
    }

    void registerRoutes(RoutingRegistry routingRegistry);
}
