package com.amazon.alexa.navigation.menu.viewcontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SmartHomeNavigationViewController$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SmartHomeNavigationViewController f$0;

    public /* synthetic */ SmartHomeNavigationViewController$$ExternalSyntheticLambda1(SmartHomeNavigationViewController smartHomeNavigationViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = smartHomeNavigationViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SmartHomeNavigationViewController smartHomeNavigationViewController = this.f$0;
        switch (i) {
            case 0:
                smartHomeNavigationViewController.showAPlusUpsellButton();
                break;
            default:
                smartHomeNavigationViewController.lambda$checkProductEligibility$2();
                break;
        }
    }
}
