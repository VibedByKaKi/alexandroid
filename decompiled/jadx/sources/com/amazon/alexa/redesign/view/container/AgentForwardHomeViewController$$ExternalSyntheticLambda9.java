package com.amazon.alexa.redesign.view.container;

import com.amazon.alexa.eventbus.api.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Message f$0;
    public final /* synthetic */ AgentForwardHomeViewController f$1;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda9(Message message, AgentForwardHomeViewController agentForwardHomeViewController) {
        this.$r8$classId = 0;
        this.f$0 = message;
        this.f$1 = agentForwardHomeViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$59$lambda$58$lambda$57(this.f$0, this.f$1);
                break;
            case 1:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$73$lambda$72$lambda$71(this.f$1, this.f$0);
                break;
            case 2:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$56$lambda$55$lambda$54(this.f$1, this.f$0);
                break;
            default:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$92$lambda$90(this.f$1, this.f$0);
                break;
        }
    }

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda9(AgentForwardHomeViewController agentForwardHomeViewController, Message message, int i) {
        this.$r8$classId = i;
        this.f$1 = agentForwardHomeViewController;
        this.f$0 = message;
    }
}
