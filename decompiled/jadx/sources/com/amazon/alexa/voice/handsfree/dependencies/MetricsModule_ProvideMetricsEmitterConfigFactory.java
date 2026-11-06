package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.protocols.metrics.MetricsEmitterConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class MetricsModule_ProvideMetricsEmitterConfigFactory implements Factory<MetricsEmitterConfig> {
    private final MetricsModule module;

    public MetricsModule_ProvideMetricsEmitterConfigFactory(MetricsModule metricsModule) {
        this.module = metricsModule;
    }

    public static MetricsModule_ProvideMetricsEmitterConfigFactory create(MetricsModule metricsModule) {
        return new MetricsModule_ProvideMetricsEmitterConfigFactory(metricsModule);
    }

    public static MetricsEmitterConfig provideMetricsEmitterConfig(MetricsModule metricsModule) {
        return (MetricsEmitterConfig) Preconditions.checkNotNull(metricsModule.provideMetricsEmitterConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public MetricsEmitterConfig get() {
        return provideMetricsEmitterConfig(this.module);
    }
}
