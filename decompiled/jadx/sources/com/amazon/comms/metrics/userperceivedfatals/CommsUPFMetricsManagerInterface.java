package com.amazon.comms.metrics.userperceivedfatals;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CommsUPFMetricsManagerInterface {
    void emitFatalUPFMetric(CommsUPFComponent commsUPFComponent, CommsUPFMetricInteractionType commsUPFMetricInteractionType, String str, String str2);

    void emitSuccessUPFMetric(CommsUPFComponent commsUPFComponent, CommsUPFMetricInteractionType commsUPFMetricInteractionType, String str, String str2);
}
