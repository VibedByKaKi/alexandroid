package com.amazon.alexa.mobilytics.executor;

import com.amazon.alexa.mobilytics.configuration.DefaultRecordChecker;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultExecutor$$ExternalSyntheticLambda9 implements MobilyticsUserProvider.Listener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultExecutor$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider.Listener
    public final void onUserChanged(MobilyticsUser mobilyticsUser) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((DefaultExecutor) obj).lambda$handleMessage$11(mobilyticsUser);
                break;
            default:
                ((DefaultRecordChecker) obj).onUserChanged(mobilyticsUser);
                break;
        }
    }
}
