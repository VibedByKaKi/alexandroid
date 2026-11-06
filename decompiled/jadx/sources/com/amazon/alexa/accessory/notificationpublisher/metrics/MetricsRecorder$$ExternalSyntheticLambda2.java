package com.amazon.alexa.accessory.notificationpublisher.metrics;

import com.dee.app.metrics.AlexaMetricsEvent;
import com.dee.app.metrics.MetricsCounter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MetricsRecorder$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetricsRecorder f$0;
    public final /* synthetic */ AlexaMetricsEvent f$1;

    public /* synthetic */ MetricsRecorder$$ExternalSyntheticLambda2(MetricsRecorder metricsRecorder, AlexaMetricsEvent alexaMetricsEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = metricsRecorder;
        this.f$1 = alexaMetricsEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$doRecordDuration$1((FixedDurationTimer) this.f$1);
                break;
            default:
                this.f$0.lambda$doRecordCounter$0((MetricsCounter) this.f$1);
                break;
        }
    }
}
