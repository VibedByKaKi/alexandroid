package com.amazon.alexa.routing;

import android.os.Bundle;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteMatch;
import com.amazon.alexa.routing.api.RouteMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultRouteMatcher implements RouteMatcher {
    private final Route target;

    public DefaultRouteMatcher(Route route) {
        this.target = route;
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public int getPriority() {
        return this.target.getPriority();
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public Route getRoute() {
        return this.target;
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public RouteMatch match(String str) {
        Bundle parseParameters;
        if (this.target.getTemplate() == null || (parseParameters = this.target.getTemplate().parseParameters(str)) == null) {
            return null;
        }
        return new RouteMatch(this.target, parseParameters);
    }
}
