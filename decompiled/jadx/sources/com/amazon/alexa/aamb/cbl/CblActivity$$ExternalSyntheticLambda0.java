package com.amazon.alexa.aamb.cbl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class CblActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CblActivity f$0;

    public /* synthetic */ CblActivity$$ExternalSyntheticLambda0(CblActivity cblActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cblActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CblActivity cblActivity = this.f$0;
        switch (i) {
            case 0:
                cblActivity.resetSystemBarsThemeColor();
                break;
            case 1:
                cblActivity.saveSystemBarsThemeColor();
                break;
            default:
                cblActivity.setSystemBarsThemeColor();
                break;
        }
    }
}
