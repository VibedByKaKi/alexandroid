package com.amazon.alexa.accessory.metrics;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MetricsCollectorMetricsReporter implements MetricsReporter {
    private final MetricsCollector metricsCollector;

    public MetricsCollectorMetricsReporter(MetricsCollector metricsCollector) {
        Preconditions.notNull(metricsCollector, "metricsCollector");
        this.metricsCollector = metricsCollector;
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsReporter
    public void recordEvent(MetricsEvent metricsEvent) {
        Preconditions.notNull(metricsEvent, "event");
        this.metricsCollector.recordEvent(metricsEvent);
    }
}
