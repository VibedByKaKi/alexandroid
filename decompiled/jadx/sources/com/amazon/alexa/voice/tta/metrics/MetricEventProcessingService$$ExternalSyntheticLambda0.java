package com.amazon.alexa.voice.tta.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class MetricEventProcessingService$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetricEventProcessingService f$0;
    public final /* synthetic */ EventTime f$1;

    public /* synthetic */ MetricEventProcessingService$$ExternalSyntheticLambda0(MetricEventProcessingService metricEventProcessingService, EventTime eventTime, int i) {
        this.$r8$classId = i;
        this.f$0 = metricEventProcessingService;
        this.f$1 = eventTime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stop$1(this.f$1);
                break;
            default:
                this.f$0.lambda$start$0(this.f$1);
                break;
        }
    }
}
