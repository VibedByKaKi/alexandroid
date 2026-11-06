package com.amazon.alexa.mobilytics.executor;

import com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageListener;
import com.amazon.alexa.mobilytics.identity.message.eventBus.MobilyticsEventBusMessageType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultExecutor$$ExternalSyntheticLambda0 implements MobilyticsMessageListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultExecutor f$0;

    public /* synthetic */ DefaultExecutor$$ExternalSyntheticLambda0(DefaultExecutor defaultExecutor, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultExecutor;
    }

    @Override // com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageListener
    public final void onMessageReceived(MobilyticsEventBusMessageType mobilyticsEventBusMessageType) {
        int i = this.$r8$classId;
        DefaultExecutor defaultExecutor = this.f$0;
        switch (i) {
            case 0:
                defaultExecutor.lambda$prepareForCaching$23(mobilyticsEventBusMessageType);
                break;
            default:
                defaultExecutor.lambda$handleMessage$13(mobilyticsEventBusMessageType);
                break;
        }
    }
}
