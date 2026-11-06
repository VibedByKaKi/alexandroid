package com.amazon.alexa.hho.navigation.transit.event;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class TransitNavigationEventSubscriber$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransitNavigationEventSubscriber f$0;

    public /* synthetic */ TransitNavigationEventSubscriber$$ExternalSyntheticLambda0(TransitNavigationEventSubscriber transitNavigationEventSubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = transitNavigationEventSubscriber;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        TransitNavigationEventSubscriber transitNavigationEventSubscriber = this.f$0;
        switch (i) {
            case 0:
                TransitNavigationEventSubscriber.subscribeToRequestSessionData$lambda$2(transitNavigationEventSubscriber, message);
                break;
            default:
                TransitNavigationEventSubscriber.subscribeToEndNavigation$lambda$3(transitNavigationEventSubscriber, message);
                break;
        }
    }
}
