package com.amazon.alexa.accessory.metrics;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FirmwareTaskMetricsReporter$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetricsReporter f$0;

    public /* synthetic */ FirmwareTaskMetricsReporter$$ExternalSyntheticLambda3(MetricsReporter metricsReporter, int i) {
        this.$r8$classId = i;
        this.f$0 = metricsReporter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        MetricsEvent metricsEvent;
        int i = this.$r8$classId;
        MetricsReporter metricsReporter = this.f$0;
        switch (i) {
            case 0:
                metricsEvent = (CustomMetricsEvent) obj;
                break;
            default:
                metricsEvent = (MetricsEvent) obj;
                break;
        }
        metricsReporter.recordEvent(metricsEvent);
    }
}
