package com.amazon.alexa.routing;

import androidx.annotation.NonNull;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteApiUtils;
import com.amazon.alexa.routing.api.RoutingRegistry;
import com.google.common.base.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RouteUtils extends RouteApiUtils {
    private RouteUtils() {
    }

    @Deprecated
    public static Optional<Route> getRouteWithNonInheritedContentMode(@NonNull Route route, @NonNull RoutingRegistry routingRegistry) {
        Route parentRouteWithContentMode = RouteApiUtils.getParentRouteWithContentMode(route, routingRegistry);
        return parentRouteWithContentMode == null ? Optional.absent() : Optional.of(parentRouteWithContentMode);
    }
}
