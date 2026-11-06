package com.amazon.alexa.handsfree.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsCounterWrapper;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsTimerWrapper;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MobilyticsOperationalEventMetricFactory implements OperationalEventMetricFactory {
    private static final String COMPONTENT_ALEXA_HANDS_FREE = "ALEXA_HANDSFREE_COMPONENTS";
    private static final String DSP_APK_UPDATE = "DSP_APK_UPDATE";
    private static final String FEATURE_GATE_DOWN = "FEATURE_GATE_DIALED_DOWN";
    private static final String FIRST_START_UP = "FIRST_START_UP";
    private static final String SDK_UPDATE = "SDK_UPDATE";
    private static final String SEPARATOR = ":";
    private static final String SUB_COMPONENT_LATENCY = "LATENCY";

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory
    public Metric buildDspApkUpdateMetric(@NonNull String str) {
        return new MobilyticsMetricsCounterWrapper(DSP_APK_UPDATE, str);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory
    public Metric buildFeatureGateDownMetric(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return new MobilyticsMetricsCounterWrapper(a$$ExternalSyntheticOutline0.m("FEATURE_GATE_DIALED_DOWN:", str2), a$$ExternalSyntheticOutline0.m$1(str, ":", str3)).withContentId2(str2).withContentType2(str3);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory
    public Metric buildFirstStartupMetric(@NonNull String str) {
        return new MobilyticsMetricsCounterWrapper(FIRST_START_UP, str);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory
    public Metric buildLatencyMetric(long j, long j2, @NonNull String str) {
        return new MobilyticsMetricsTimerWrapper(str, SUB_COMPONENT_LATENCY, j2 - j);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.OperationalEventMetricFactory
    public Metric buildSdkUpdateMetric(@NonNull String str) {
        return new MobilyticsMetricsCounterWrapper(SDK_UPDATE, str);
    }
}
