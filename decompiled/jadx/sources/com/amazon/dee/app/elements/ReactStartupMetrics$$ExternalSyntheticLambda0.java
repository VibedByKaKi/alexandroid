package com.amazon.dee.app.elements;

import com.amazon.alexa.eventing.EventArgs;
import com.amazon.alexa.eventing.EventHandler;
import com.dee.app.metrics.MetricDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ReactStartupMetrics$$ExternalSyntheticLambda0 implements EventHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactStartupMetrics f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ MetricDescriptor f$2;

    public /* synthetic */ ReactStartupMetrics$$ExternalSyntheticLambda0(ReactStartupMetrics reactStartupMetrics, long j, MetricDescriptor metricDescriptor, int i) {
        this.$r8$classId = i;
        this.f$0 = reactStartupMetrics;
        this.f$1 = j;
        this.f$2 = metricDescriptor;
    }

    @Override // com.amazon.alexa.eventing.EventHandler
    public final void onEvent(EventArgs eventArgs) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startTimers$0(this.f$1, this.f$2, eventArgs);
                break;
            default:
                this.f$0.lambda$startBridgelessTimers$2(this.f$1, this.f$2, eventArgs);
                break;
        }
    }
}
