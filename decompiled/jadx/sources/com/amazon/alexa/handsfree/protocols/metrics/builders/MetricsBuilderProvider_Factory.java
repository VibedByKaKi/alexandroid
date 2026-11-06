package com.amazon.alexa.handsfree.protocols.metrics.builders;

import com.amazon.alexa.handsfree.protocols.metrics.MetricsConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MetricsBuilderProvider_Factory implements Factory<MetricsBuilderProvider> {
    private final Provider<MetricsConfiguration> metricsConfigurationProvider;

    public MetricsBuilderProvider_Factory(Provider<MetricsConfiguration> provider) {
        this.metricsConfigurationProvider = provider;
    }

    public static MetricsBuilderProvider_Factory create(Provider<MetricsConfiguration> provider) {
        return new MetricsBuilderProvider_Factory(provider);
    }

    public static MetricsBuilderProvider newMetricsBuilderProvider(MetricsConfiguration metricsConfiguration) {
        return new MetricsBuilderProvider(metricsConfiguration);
    }

    public static MetricsBuilderProvider provideInstance(Provider<MetricsConfiguration> provider) {
        return new MetricsBuilderProvider(provider.get());
    }

    @Override // javax.inject.Provider
    public MetricsBuilderProvider get() {
        return provideInstance(this.metricsConfigurationProvider);
    }
}
