package com.amazon.deecomms.calling.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NewCallActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NewCallActivity f$0;

    public /* synthetic */ NewCallActivity$$ExternalSyntheticLambda0(NewCallActivity newCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = newCallActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NewCallActivity newCallActivity = this.f$0;
        switch (i) {
            case 0:
                newCallActivity.lambda$startTimer$5();
                break;
            case 1:
                newCallActivity.lambda$update$4();
                break;
            default:
                newCallActivity.lambda$onRequestPermissionsResult$1();
                break;
        }
    }
}
