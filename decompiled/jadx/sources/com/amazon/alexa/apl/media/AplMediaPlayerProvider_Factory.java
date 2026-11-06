package com.amazon.alexa.apl.media;

import com.amazon.alexa.apl.metrics.MetricsPublisher;
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
public final class AplMediaPlayerProvider_Factory implements Factory<AplMediaPlayerProvider> {
    private final Provider<MetricsPublisher> metricsPublisherProvider;

    public AplMediaPlayerProvider_Factory(Provider<MetricsPublisher> provider) {
        this.metricsPublisherProvider = provider;
    }

    public static AplMediaPlayerProvider_Factory create(Provider<MetricsPublisher> provider) {
        return new AplMediaPlayerProvider_Factory(provider);
    }

    public static AplMediaPlayerProvider newInstance(MetricsPublisher metricsPublisher) {
        return new AplMediaPlayerProvider(metricsPublisher);
    }

    @Override // javax.inject.Provider
    public AplMediaPlayerProvider get() {
        return newInstance(this.metricsPublisherProvider.get());
    }
}
