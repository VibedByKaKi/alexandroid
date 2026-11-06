package com.amazon.alexa.handsfree.protocols.metrics;

import com.amazon.alexa.handsfree.protocols.metrics.caching.MetricSerializer;
import com.amazon.alexa.handsfree.protocols.metrics.factories.MetricFactoryProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MetricsConfiguration_Factory implements Factory<MetricsConfiguration> {
    private final Provider<MetricFactoryProvider> metricFactoryProvider;
    private final Provider<MetricSerializer> metricSerializerProvider;
    private final Provider<MetricsEmitter> metricsEmitterProvider;

    public MetricsConfiguration_Factory(Provider<MetricsEmitter> provider, Provider<MetricFactoryProvider> provider2, Provider<MetricSerializer> provider3) {
        this.metricsEmitterProvider = provider;
        this.metricFactoryProvider = provider2;
        this.metricSerializerProvider = provider3;
    }

    public static MetricsConfiguration_Factory create(Provider<MetricsEmitter> provider, Provider<MetricFactoryProvider> provider2, Provider<MetricSerializer> provider3) {
        return new MetricsConfiguration_Factory(provider, provider2, provider3);
    }

    public static MetricsConfiguration newMetricsConfiguration(MetricsEmitter metricsEmitter, MetricFactoryProvider metricFactoryProvider, MetricSerializer metricSerializer) {
        return new MetricsConfiguration(metricsEmitter, metricFactoryProvider, metricSerializer);
    }

    public static MetricsConfiguration provideInstance(Provider<MetricsEmitter> provider, Provider<MetricFactoryProvider> provider2, Provider<MetricSerializer> provider3) {
        return new MetricsConfiguration(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    public MetricsConfiguration get() {
        return provideInstance(this.metricsEmitterProvider, this.metricFactoryProvider, this.metricSerializerProvider);
    }
}
