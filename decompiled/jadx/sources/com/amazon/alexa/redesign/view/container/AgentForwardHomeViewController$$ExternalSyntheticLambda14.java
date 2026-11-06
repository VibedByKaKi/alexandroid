package com.amazon.alexa.redesign.view.container;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda14 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AgentForwardHomeViewController f$0;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda14(AgentForwardHomeViewController agentForwardHomeViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = agentForwardHomeViewController;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        AgentForwardHomeViewController agentForwardHomeViewController = this.f$0;
        switch (i) {
            case 0:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$46$lambda$45(agentForwardHomeViewController, message);
                break;
            case 1:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$49$lambda$48(agentForwardHomeViewController, message);
                break;
            case 2:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$53$lambda$52(agentForwardHomeViewController, message);
                break;
            case 3:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$56$lambda$55(agentForwardHomeViewController, message);
                break;
            case 4:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$59$lambda$58(agentForwardHomeViewController, message);
                break;
            case 5:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$62$lambda$61(agentForwardHomeViewController, message);
                break;
            case 6:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$65$lambda$64(agentForwardHomeViewController, message);
                break;
            case 7:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$68$lambda$67(agentForwardHomeViewController, message);
                break;
            case 8:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$70$lambda$69(agentForwardHomeViewController, message);
                break;
            case 9:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$73$lambda$72(agentForwardHomeViewController, message);
                break;
            default:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$92(agentForwardHomeViewController, message);
                break;
        }
    }
}
