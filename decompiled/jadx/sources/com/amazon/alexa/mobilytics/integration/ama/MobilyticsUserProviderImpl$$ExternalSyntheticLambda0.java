package com.amazon.alexa.mobilytics.integration.ama;

import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class MobilyticsUserProviderImpl$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MobilyticsUser f$0;

    public /* synthetic */ MobilyticsUserProviderImpl$$ExternalSyntheticLambda0(MobilyticsUser mobilyticsUser, int i) {
        this.$r8$classId = i;
        this.f$0 = mobilyticsUser;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        MobilyticsUser mobilyticsUser = this.f$0;
        MobilyticsUserProvider.Listener listener = (MobilyticsUserProvider.Listener) obj;
        switch (i) {
            case 0:
                MobilyticsUserProviderImpl.lambda$onUserChanged$1(mobilyticsUser, listener);
                break;
            default:
                com.amazon.alexa.client.alexaservice.metrics.MobilyticsUserProviderImpl.lambda$onUserChanged$0(mobilyticsUser, listener);
                break;
        }
    }
}
