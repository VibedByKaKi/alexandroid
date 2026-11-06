package com.amazon.alexa.routing;

import android.os.Bundle;
import com.amazon.alexa.routing.DefaultRoutingService;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DefaultRoutingService$$ExternalSyntheticLambda4 implements DefaultRoutingService.RouteMatcher, DefaultRoutingService.UriMatcherFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultRoutingService f$0;

    public /* synthetic */ DefaultRoutingService$$ExternalSyntheticLambda4(DefaultRoutingService defaultRoutingService, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultRoutingService;
    }

    @Override // com.amazon.alexa.routing.DefaultRoutingService.UriMatcherFactory
    public Object create(Route route, Bundle bundle) {
        RoutingService.RoutingBuilder lambda$match$6;
        lambda$match$6 = this.f$0.lambda$match$6(route, bundle);
        return lambda$match$6;
    }

    @Override // com.amazon.alexa.routing.DefaultRoutingService.RouteMatcher
    public boolean match(RouteContext routeContext, String str) {
        boolean matchesName;
        boolean matchesUri;
        int i = this.$r8$classId;
        DefaultRoutingService defaultRoutingService = this.f$0;
        switch (i) {
            case 0:
                matchesName = defaultRoutingService.matchesName(routeContext, str);
                return matchesName;
            default:
                matchesUri = defaultRoutingService.matchesUri(routeContext, str);
                return matchesUri;
        }
    }
}
