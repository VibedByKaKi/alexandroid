package com.amazon.deecomms.calling.accessibility;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class RealTimeTextView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealTimeTextView f$0;

    public /* synthetic */ RealTimeTextView$$ExternalSyntheticLambda0(RealTimeTextView realTimeTextView, int i) {
        this.$r8$classId = i;
        this.f$0 = realTimeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RealTimeTextView realTimeTextView = this.f$0;
        switch (i) {
            case 0:
                realTimeTextView.lambda$hideFarSideTextViewIfNeeded$1();
                break;
            default:
                realTimeTextView.lambda$showKeyboard$0();
                break;
        }
    }
}
