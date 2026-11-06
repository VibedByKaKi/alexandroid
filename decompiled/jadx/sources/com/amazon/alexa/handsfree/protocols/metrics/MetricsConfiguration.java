package com.amazon.alexa.handsfree.protocols.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.metrics.caching.MetricSerializer;
import com.amazon.alexa.handsfree.protocols.metrics.factories.MetricFactoryProvider;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class MetricsConfiguration {
    private final MetricFactoryProvider mMetricFactoryProvider;
    private final MetricSerializer mMetricSerializer;
    private final MetricsEmitter mMetricsEmitter;

    @Inject
    public MetricsConfiguration(MetricsEmitter metricsEmitter, MetricFactoryProvider metricFactoryProvider, MetricSerializer metricSerializer) {
        this.mMetricsEmitter = metricsEmitter;
        this.mMetricFactoryProvider = metricFactoryProvider;
        this.mMetricSerializer = metricSerializer;
    }

    @NonNull
    public MetricFactoryProvider getMetricFactoryProvider() {
        return this.mMetricFactoryProvider;
    }

    @NonNull
    public MetricSerializer getMetricSerializer() {
        return this.mMetricSerializer;
    }

    @NonNull
    public MetricsEmitter getMetricsEmitter() {
        return this.mMetricsEmitter;
    }
}
