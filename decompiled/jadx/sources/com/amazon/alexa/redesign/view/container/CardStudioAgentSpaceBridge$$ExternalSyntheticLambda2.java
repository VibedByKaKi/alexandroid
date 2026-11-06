package com.amazon.alexa.redesign.view.container;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda2 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStudioAgentSpaceBridge f$0;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda2(CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge, int i) {
        this.$r8$classId = i;
        this.f$0 = cardStudioAgentSpaceBridge;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        CardStudioAgentSpaceBridge cardStudioAgentSpaceBridge = this.f$0;
        switch (i) {
            case 0:
                CardStudioAgentSpaceBridge.subscribePullToRefreshEvent$lambda$26(cardStudioAgentSpaceBridge, message);
                break;
            default:
                CardStudioAgentSpaceBridge.subscribeNativeRouteEvent$lambda$23(cardStudioAgentSpaceBridge, message);
                break;
        }
    }
}
