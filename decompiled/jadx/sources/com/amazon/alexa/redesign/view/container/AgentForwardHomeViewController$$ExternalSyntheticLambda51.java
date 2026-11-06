package com.amazon.alexa.redesign.view.container;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.dee.app.data.api.ElementLocalStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda51 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ElementLocalStorage f$0;
    public final /* synthetic */ AgentForwardHomeViewController f$1;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda51(ElementLocalStorage elementLocalStorage, AgentForwardHomeViewController agentForwardHomeViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = elementLocalStorage;
        this.f$1 = agentForwardHomeViewController;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        switch (this.$r8$classId) {
            case 0:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$89(this.f$0, this.f$1, message);
                break;
            default:
                AgentForwardHomeViewController.initHomeNameIntegration$lambda$107$lambda$106(this.f$0, this.f$1, message);
                break;
        }
    }
}
