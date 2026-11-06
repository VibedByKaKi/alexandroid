package com.amazon.alexa.biloba.routing;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.biloba.dependency.BilobaScope;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@BilobaScope
/* loaded from: classes17.dex */
public class DeferredRoutingHelper {
    public static final String DEFERRED_ROUTE_CONTEXT = "deferred_route_context";
    private static final String TAG = "DeferredRoutingHelper";
    private RouteContext deferredRouteContext;

    @Inject
    Lazy<RoutingService> routingService;

    @VisibleForTesting
    public DeferredRoutingHelper(Lazy<RoutingService> lazy) {
        this.routingService = lazy;
    }

    public void clearDeferredRouteContext() {
        LogUtils.d(TAG, "Clearing deferred route context.");
        this.deferredRouteContext = null;
    }

    public RouteContext getDeferredRouteContext() {
        return this.deferredRouteContext;
    }

    public void processDeferredRouteContext() {
        RouteContext routeContext = this.deferredRouteContext;
        if (routeContext == null) {
            LogUtils.d(TAG, "No deferred route to navigate to.");
            return;
        }
        String name = routeContext.getRoute().getName();
        LogUtils.d(TAG, "Processing deferred route context; navigating to " + name);
        this.routingService.get().route(name).with(DEFERRED_ROUTE_CONTEXT, this.deferredRouteContext).navigate();
        clearDeferredRouteContext();
    }

    public void setDeferredRouteContext(RouteContext routeContext) {
        this.deferredRouteContext = routeContext;
    }

    @Inject
    public DeferredRoutingHelper() {
    }
}
