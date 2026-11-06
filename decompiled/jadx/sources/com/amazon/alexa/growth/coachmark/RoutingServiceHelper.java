package com.amazon.alexa.growth.coachmark;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingObserver;
import com.amazon.alexa.routing.api.RoutingService;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RoutingServiceHelper {
    protected static final String TAG = "RoutingServiceHelper";

    @VisibleForTesting
    RoutingObserver routingObserver;
    private final RoutingService routingService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnRouteChangesListener {
        void onRouteChange(RouteContext routeContext);
    }

    public RoutingServiceHelper(RoutingService routingService) {
        this.routingService = routingService;
    }

    public void registerRouteChangeListener(OnRouteChangesListener onRouteChangesListener) {
        if (this.routingObserver == null) {
            Objects.requireNonNull(onRouteChangesListener);
            RoutingServiceHelper$$ExternalSyntheticLambda0 routingServiceHelper$$ExternalSyntheticLambda0 = new RoutingServiceHelper$$ExternalSyntheticLambda0(onRouteChangesListener, 0);
            this.routingObserver = routingServiceHelper$$ExternalSyntheticLambda0;
            this.routingService.registerObserver(routingServiceHelper$$ExternalSyntheticLambda0);
        }
    }

    public void unregisterRouteChangeListener() {
        RoutingObserver routingObserver = this.routingObserver;
        if (routingObserver != null) {
            try {
                this.routingService.unregisterObserver(routingObserver);
                this.routingObserver = null;
            } catch (Exception e) {
                Log.e(TAG, "Error occurred when unregistering routing listener", e);
            }
        }
    }
}
