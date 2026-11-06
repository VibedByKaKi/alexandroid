package com.amazon.apl.android.metrics.impl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MetricsRecorder$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetricsRecorder f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ MetricsRecorder$$ExternalSyntheticLambda1(MetricsRecorder metricsRecorder, String str, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = metricsRecorder;
        this.f$1 = str;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$recordCounter$4(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$recordMilestone$0(this.f$1, this.f$2);
                break;
        }
    }
}
