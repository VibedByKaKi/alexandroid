package com.amazon.alexa.redesign.view.header;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda11(HomeHeader homeHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        HomeHeader homeHeader = this.f$0;
        switch (i) {
            case 0:
                homeHeader.lambda$loadHomeModesDefaultSubscriptions$25();
                break;
            default:
                homeHeader.lambda$sendTwaRequest$1();
                break;
        }
    }
}
