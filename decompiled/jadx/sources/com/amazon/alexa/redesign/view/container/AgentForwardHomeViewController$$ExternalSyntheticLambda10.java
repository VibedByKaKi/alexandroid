package com.amazon.alexa.redesign.view.container;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AgentForwardHomeViewController f$0;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda10(AgentForwardHomeViewController agentForwardHomeViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = agentForwardHomeViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AgentForwardHomeViewController agentForwardHomeViewController = this.f$0;
        switch (i) {
            case 0:
                AgentForwardHomeViewController.showTourToast$lambda$99(agentForwardHomeViewController);
                break;
            case 1:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$68$lambda$67$lambda$66(agentForwardHomeViewController);
                break;
            case 2:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$62$lambda$61$lambda$60(agentForwardHomeViewController);
                break;
            case 3:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$49$lambda$48$lambda$47(agentForwardHomeViewController);
                break;
            case 4:
                AgentForwardHomeViewController.startHomeModesSubscriptions$lambda$94(agentForwardHomeViewController);
                break;
            case 5:
                agentForwardHomeViewController.performColdStartDeeplinkCheck$AlexaMobileAndroidHomeChannel_release();
                break;
            case 6:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$53$lambda$52$lambda$51(agentForwardHomeViewController);
                break;
            case 7:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$92$lambda$91(agentForwardHomeViewController);
                break;
            case 8:
                AgentForwardHomeViewController.registerEventBusListeners$lambda$65$lambda$64$lambda$63(agentForwardHomeViewController);
                break;
            default:
                AgentForwardHomeViewController.initHomeNameIntegration$lambda$108(agentForwardHomeViewController);
                break;
        }
    }
}
