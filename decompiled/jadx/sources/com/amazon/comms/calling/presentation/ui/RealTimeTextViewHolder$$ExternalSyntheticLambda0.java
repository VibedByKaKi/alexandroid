package com.amazon.comms.calling.presentation.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RealTimeTextViewHolder$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealTimeTextViewHolder f$0;

    public /* synthetic */ RealTimeTextViewHolder$$ExternalSyntheticLambda0(RealTimeTextViewHolder realTimeTextViewHolder, int i) {
        this.$r8$classId = i;
        this.f$0 = realTimeTextViewHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RealTimeTextViewHolder realTimeTextViewHolder = this.f$0;
        switch (i) {
            case 0:
                RealTimeTextViewHolder.setUpListeners$lambda$3$lambda$2(realTimeTextViewHolder);
                break;
            default:
                RealTimeTextViewHolder.toggleRemoteTextViewVisibilityIfNeeded$lambda$6(realTimeTextViewHolder);
                break;
        }
    }
}
