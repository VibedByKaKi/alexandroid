package com.amazon.alexa.mobilytics.executor;

import com.amazon.alexa.mobilytics.connector.ConnectorExecutor;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultExecutor$$ExternalSyntheticLambda2 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MobilyticsEvent f$0;

    public /* synthetic */ DefaultExecutor$$ExternalSyntheticLambda2(MobilyticsEvent mobilyticsEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = mobilyticsEvent;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        MobilyticsEvent mobilyticsEvent = this.f$0;
        ConnectorExecutor connectorExecutor = (ConnectorExecutor) obj;
        switch (i) {
            case 0:
                connectorExecutor.executeRecordEvent(mobilyticsEvent);
                break;
            case 1:
                DefaultExecutor.lambda$recordEvent$16(mobilyticsEvent, connectorExecutor);
                break;
            case 2:
                connectorExecutor.executeRecordEvent(mobilyticsEvent);
                break;
            default:
                connectorExecutor.executeRecordEvent(mobilyticsEvent);
                break;
        }
    }
}
