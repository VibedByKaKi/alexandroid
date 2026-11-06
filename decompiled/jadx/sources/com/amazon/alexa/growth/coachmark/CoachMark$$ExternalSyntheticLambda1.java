package com.amazon.alexa.growth.coachmark;

import android.view.View;
import com.amazon.alexa.growth.coachmark.RoutingServiceHelper;
import com.amazon.alexa.routing.api.RouteContext;
import com.github.florent37.viewtooltip.ViewTooltip;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CoachMark$$ExternalSyntheticLambda1 implements ViewTooltip.ListenerHide, RoutingServiceHelper.OnRouteChangesListener, ViewTooltip.ListenerDisplay {
    public final /* synthetic */ CoachMark f$0;

    public /* synthetic */ CoachMark$$ExternalSyntheticLambda1(CoachMark coachMark) {
        this.f$0 = coachMark;
    }

    @Override // com.github.florent37.viewtooltip.ViewTooltip.ListenerDisplay
    public void onDisplay(View view) {
        this.f$0.lambda$show$1(view);
    }

    @Override // com.github.florent37.viewtooltip.ViewTooltip.ListenerHide
    public void onHide(View view) {
        this.f$0.lambda$dismiss$7(view);
    }

    @Override // com.amazon.alexa.growth.coachmark.RoutingServiceHelper.OnRouteChangesListener
    public void onRouteChange(RouteContext routeContext) {
        this.f$0.lambda$show$3(routeContext);
    }
}
