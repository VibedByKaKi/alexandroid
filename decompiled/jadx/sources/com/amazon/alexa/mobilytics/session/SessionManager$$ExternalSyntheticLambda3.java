package com.amazon.alexa.mobilytics.session;

import com.amazon.alexa.mobilytics.executor.DefaultExecutor;
import com.amazon.alexa.mobilytics.identity.MobilyticsRoute;
import com.amazon.alexa.mobilytics.identity.MobilyticsRouteProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SessionManager$$ExternalSyntheticLambda3 implements MobilyticsRouteProvider.Listener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SessionManager$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsRouteProvider.Listener
    public final void onRouteChanged(MobilyticsRoute mobilyticsRoute) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((SessionManager) obj).onRouteChanged(mobilyticsRoute);
                break;
            default:
                ((DefaultExecutor) obj).lambda$handleMessage$14(mobilyticsRoute);
                break;
        }
    }
}
