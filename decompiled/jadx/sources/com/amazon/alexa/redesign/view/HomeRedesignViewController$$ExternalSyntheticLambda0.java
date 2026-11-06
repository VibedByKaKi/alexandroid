package com.amazon.alexa.redesign.view;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeRedesignViewController$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeRedesignViewController f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ HomeRedesignViewController$$ExternalSyntheticLambda0(HomeRedesignViewController homeRedesignViewController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = homeRedesignViewController;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeCardAt$11(this.f$1);
                break;
            default:
                this.f$0.lambda$removeActivityCard$9(this.f$1);
                break;
        }
    }
}
