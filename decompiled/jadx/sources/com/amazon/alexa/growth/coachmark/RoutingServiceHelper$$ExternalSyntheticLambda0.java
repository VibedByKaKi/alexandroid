package com.amazon.alexa.growth.coachmark;

import com.amazon.alexa.growth.coachmark.RoutingServiceHelper;
import com.amazon.alexa.mobilytics.integration.ama.MobilyticsRouteProviderImpl;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class RoutingServiceHelper$$ExternalSyntheticLambda0 implements RoutingObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RoutingServiceHelper$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.routing.api.RoutingObserver
    public final void onRouteChanged(RouteContext routeContext) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((RoutingServiceHelper.OnRouteChangesListener) obj).onRouteChange(routeContext);
                break;
            default:
                ((MobilyticsRouteProviderImpl) obj).onRouteChanged(routeContext);
                break;
        }
    }
}
