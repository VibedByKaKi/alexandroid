package com.amazon.alexa.dnssd.dependencies;

import com.amazon.alexa.dnssd.util.Metrics;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvideMetricsFactory implements Factory<Metrics> {
    private final Provider<MetricsServiceV2> metricsServiceV2Provider;
    private final DnssdModule module;

    public DnssdModule_ProvideMetricsFactory(DnssdModule dnssdModule, Provider<MetricsServiceV2> provider) {
        this.module = dnssdModule;
        this.metricsServiceV2Provider = provider;
    }

    public static DnssdModule_ProvideMetricsFactory create(DnssdModule dnssdModule, Provider<MetricsServiceV2> provider) {
        return new DnssdModule_ProvideMetricsFactory(dnssdModule, provider);
    }

    public static Metrics provideMetrics(DnssdModule dnssdModule, MetricsServiceV2 metricsServiceV2) {
        return (Metrics) Preconditions.checkNotNullFromProvides(dnssdModule.provideMetrics(metricsServiceV2));
    }

    @Override // javax.inject.Provider
    public Metrics get() {
        return provideMetrics(this.module, this.metricsServiceV2Provider.get());
    }
}
