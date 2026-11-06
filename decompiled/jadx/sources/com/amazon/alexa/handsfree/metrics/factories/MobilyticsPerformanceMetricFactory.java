package com.amazon.alexa.handsfree.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsCounterWrapper;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsTimerWrapper;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MobilyticsPerformanceMetricFactory implements PerformanceMetricFactory {
    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory
    public Metric buildLatencyMetric(@NonNull String str, @NonNull String str2, long j) {
        return new MobilyticsMetricsTimerWrapper(str2, str, j);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory
    public Metric buildPercentileMetricFailure(@NonNull String str, @NonNull String str2) {
        MobilyticsMetricsCounterWrapper mobilyticsMetricsCounterWrapper = new MobilyticsMetricsCounterWrapper(str2, str);
        mobilyticsMetricsCounterWrapper.incrementCounterByValue(0L);
        return mobilyticsMetricsCounterWrapper;
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory
    public Metric buildPercentileMetricSuccess(@NonNull String str, @NonNull String str2) {
        MobilyticsMetricsCounterWrapper mobilyticsMetricsCounterWrapper = new MobilyticsMetricsCounterWrapper(str2, str);
        mobilyticsMetricsCounterWrapper.incrementCounterByValue(1L);
        return mobilyticsMetricsCounterWrapper;
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory
    public Metric buildPerformanceMetric(@NonNull String str, @NonNull String str2) {
        MobilyticsMetricsCounterWrapper mobilyticsMetricsCounterWrapper = new MobilyticsMetricsCounterWrapper(str2, str);
        mobilyticsMetricsCounterWrapper.incrementCounter();
        return mobilyticsMetricsCounterWrapper;
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.PerformanceMetricFactory
    public Metric buildPerformanceMetricFailure(@NonNull String str, @NonNull String str2, int i) {
        MobilyticsMetricsCounterWrapper mobilyticsMetricsCounterWrapper = new MobilyticsMetricsCounterWrapper(str2, str);
        mobilyticsMetricsCounterWrapper.incrementCounterByValue(i);
        return mobilyticsMetricsCounterWrapper;
    }
}
