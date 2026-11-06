package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import android.content.Context;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MetricsReporter_Factory implements Factory<MetricsReporter> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsBuilderProvider> metricsBuilderProvider;

    public MetricsReporter_Factory(Provider<MetricsBuilderProvider> provider, Provider<Context> provider2) {
        this.metricsBuilderProvider = provider;
        this.contextProvider = provider2;
    }

    public static MetricsReporter_Factory create(Provider<MetricsBuilderProvider> provider, Provider<Context> provider2) {
        return new MetricsReporter_Factory(provider, provider2);
    }

    public static MetricsReporter newInstance(MetricsBuilderProvider metricsBuilderProvider, Context context) {
        return new MetricsReporter(metricsBuilderProvider, context);
    }

    @Override // javax.inject.Provider
    public MetricsReporter get() {
        return new MetricsReporter(this.metricsBuilderProvider.get(), this.contextProvider.get());
    }
}
