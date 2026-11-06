package com.amazon.apl.viewhost.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewhostImpl f$0;

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda7(ViewhostImpl viewhostImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = viewhostImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ViewhostImpl viewhostImpl = this.f$0;
        switch (i) {
            case 0:
                viewhostImpl.lambda$cancelExecution$7();
                break;
            default:
                viewhostImpl.lambda$unBind$4();
                break;
        }
    }
}
