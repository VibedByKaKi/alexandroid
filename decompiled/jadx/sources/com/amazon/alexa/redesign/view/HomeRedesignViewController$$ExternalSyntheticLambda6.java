package com.amazon.alexa.redesign.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeRedesignViewController$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeRedesignViewController f$0;

    public /* synthetic */ HomeRedesignViewController$$ExternalSyntheticLambda6(HomeRedesignViewController homeRedesignViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = homeRedesignViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        HomeRedesignViewController homeRedesignViewController = this.f$0;
        switch (i) {
            case 0:
                homeRedesignViewController.lambda$onFTUX$12();
                break;
            case 1:
                homeRedesignViewController.lambda$resetActivity$8();
                break;
            case 2:
                homeRedesignViewController.lambda$onLifecycleUpdate$15();
                break;
            case 3:
                homeRedesignViewController.lambda$onLifecycleUpdate$16();
                break;
            case 4:
                homeRedesignViewController.lambda$onAgentForwardBottomSheet$14();
                break;
            default:
                homeRedesignViewController.lambda$onFTUX$13();
                break;
        }
    }
}
