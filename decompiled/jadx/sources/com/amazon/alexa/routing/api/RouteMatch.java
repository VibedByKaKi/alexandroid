package com.amazon.alexa.routing.api;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RouteMatch {
    private final Bundle params;
    private final Route route;

    public RouteMatch(Route route, Bundle bundle) {
        this.route = route;
        this.params = bundle;
    }

    public Bundle getParams() {
        return this.params;
    }

    public Route getRoute() {
        return this.route;
    }
}
