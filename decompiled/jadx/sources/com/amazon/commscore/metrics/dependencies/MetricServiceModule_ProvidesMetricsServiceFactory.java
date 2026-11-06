package com.amazon.commscore.metrics.dependencies;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class MetricServiceModule_ProvidesMetricsServiceFactory implements Factory<AlexaCommsCoreMetricsService> {
    private final MetricServiceModule module;

    public MetricServiceModule_ProvidesMetricsServiceFactory(MetricServiceModule metricServiceModule) {
        this.module = metricServiceModule;
    }

    public static MetricServiceModule_ProvidesMetricsServiceFactory create(MetricServiceModule metricServiceModule) {
        return new MetricServiceModule_ProvidesMetricsServiceFactory(metricServiceModule);
    }

    public static AlexaCommsCoreMetricsService providesMetricsService(MetricServiceModule metricServiceModule) {
        return (AlexaCommsCoreMetricsService) Preconditions.checkNotNullFromProvides(metricServiceModule.providesMetricsService());
    }

    @Override // javax.inject.Provider
    public AlexaCommsCoreMetricsService get() {
        return providesMetricsService(this.module);
    }
}
