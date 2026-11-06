package com.amazon.alexa.dnssd.dependencies;

import com.dee.app.metrics.MetricsServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvideMetricsServiceFactory implements Factory<MetricsServiceV2> {
    private final DnssdModule module;

    public DnssdModule_ProvideMetricsServiceFactory(DnssdModule dnssdModule) {
        this.module = dnssdModule;
    }

    public static DnssdModule_ProvideMetricsServiceFactory create(DnssdModule dnssdModule) {
        return new DnssdModule_ProvideMetricsServiceFactory(dnssdModule);
    }

    public static MetricsServiceV2 provideMetricsService(DnssdModule dnssdModule) {
        return (MetricsServiceV2) Preconditions.checkNotNullFromProvides(dnssdModule.provideMetricsService());
    }

    @Override // javax.inject.Provider
    public MetricsServiceV2 get() {
        return provideMetricsService(this.module);
    }
}
