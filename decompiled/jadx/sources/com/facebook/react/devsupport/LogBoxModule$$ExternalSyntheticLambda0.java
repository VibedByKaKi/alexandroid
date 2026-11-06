package com.facebook.react.devsupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class LogBoxModule$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LogBoxModule f$0;

    public /* synthetic */ LogBoxModule$$ExternalSyntheticLambda0(LogBoxModule logBoxModule, int i) {
        this.$r8$classId = i;
        this.f$0 = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        LogBoxModule logBoxModule = this.f$0;
        switch (i) {
            case 0:
                LogBoxModule.hide$lambda$1(logBoxModule);
                break;
            case 1:
                LogBoxModule.invalidate$lambda$2(logBoxModule);
                break;
            default:
                LogBoxModule.show$lambda$0(logBoxModule);
                break;
        }
    }
}
