package com.amazon.alexa.routing;

import android.os.Bundle;
import com.amazon.alexa.routing.api.ParameterMapper;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteAlias;
import com.amazon.alexa.routing.api.RouteMatch;
import com.amazon.alexa.routing.api.RouteMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultRouteAliasMatcher implements RouteMatcher {
    private final RouteAlias alias;

    public DefaultRouteAliasMatcher(RouteAlias routeAlias) {
        this.alias = routeAlias;
    }

    public ParameterMapper getParameterMapper() {
        return this.alias.getParameterMap();
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public int getPriority() {
        return this.alias.getPriority();
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public Route getRoute() {
        return this.alias.getTarget();
    }

    @Override // com.amazon.alexa.routing.api.RouteMatcher
    public RouteMatch match(String str) {
        Bundle parseParameters = this.alias.getTemplate().parseParameters(str);
        if (parseParameters == null) {
            return null;
        }
        if (this.alias.getParameterMap() != null) {
            parseParameters = this.alias.getParameterMap().map(parseParameters);
        }
        return new RouteMatch(this.alias.getTarget(), parseParameters);
    }
}
