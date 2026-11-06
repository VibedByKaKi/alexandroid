package com.amazon.dee.app.ui.main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainActivity f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda7(MainActivity mainActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MainActivity mainActivity = this.f$0;
        switch (i) {
            case 0:
                mainActivity.lambda$onConfigurationChanged$6();
                break;
            default:
                mainActivity.lambda$switchLoadingState$9();
                break;
        }
    }
}
