package com.amazon.alexa.accessory.metrics;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.metrics.MetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class EnvironmentMetricsReporter implements MetricsReporter {
    private final MetricsReporter metricsReporter;

    public EnvironmentMetricsReporter(MetricsReporter metricsReporter) {
        Preconditions.notNull(metricsReporter, "metricsReporter");
        this.metricsReporter = metricsReporter;
    }

    @Override // com.amazon.alexa.accessory.metrics.MetricsReporter
    public void recordEvent(MetricsEvent metricsEvent) {
        Preconditions.notNull(metricsEvent, "event");
        CustomMetricsEvent customMetricsEvent = new CustomMetricsEvent(metricsEvent);
        customMetricsEvent.putString(MetricsConstants.Environment.ACCESSORY_LIBRARY_VERSION, "1.4");
        this.metricsReporter.recordEvent(customMetricsEvent);
    }
}
