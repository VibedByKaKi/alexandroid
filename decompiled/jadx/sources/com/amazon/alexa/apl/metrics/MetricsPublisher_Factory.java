package com.amazon.alexa.apl.metrics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class MetricsPublisher_Factory implements Factory<MetricsPublisher> {
    private final Provider<APLEventReporter> mAPLEventReporterProvider;

    public MetricsPublisher_Factory(Provider<APLEventReporter> provider) {
        this.mAPLEventReporterProvider = provider;
    }

    public static MetricsPublisher_Factory create(Provider<APLEventReporter> provider) {
        return new MetricsPublisher_Factory(provider);
    }

    public static MetricsPublisher newInstance(APLEventReporter aPLEventReporter) {
        return new MetricsPublisher(aPLEventReporter);
    }

    @Override // javax.inject.Provider
    public MetricsPublisher get() {
        return newInstance(this.mAPLEventReporterProvider.get());
    }
}
