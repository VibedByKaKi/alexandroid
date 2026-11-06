package com.amazon.alexa.redesign.view.container;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AgentForwardHomeViewController$$ExternalSyntheticLambda25 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AgentForwardHomeViewController f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AgentForwardHomeViewController$$ExternalSyntheticLambda25(AgentForwardHomeViewController agentForwardHomeViewController, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = agentForwardHomeViewController;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$84$lambda$83(this.f$0, this.f$1);
                break;
            case 1:
                AgentForwardHomeViewController.initHomeModesIntegration$lambda$93$lambda$89$lambda$87$lambda$86(this.f$0, this.f$1);
                break;
            case 2:
                AgentForwardHomeViewController.initHomeNameIntegration$lambda$107$lambda$106$lambda$104$lambda$103(this.f$0, this.f$1);
                break;
            default:
                AgentForwardHomeViewController.initHomeNameIntegration$lambda$101$lambda$100(this.f$0, this.f$1);
                break;
        }
    }
}
