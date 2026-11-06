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
public final class AplVisualTask_Factory implements Factory<AplVisualTask> {
    private final Provider<MetricsPublisher> mMetricsPublisherProvider;

    public AplVisualTask_Factory(Provider<MetricsPublisher> provider) {
        this.mMetricsPublisherProvider = provider;
    }

    public static AplVisualTask_Factory create(Provider<MetricsPublisher> provider) {
        return new AplVisualTask_Factory(provider);
    }

    public static AplVisualTask newInstance(MetricsPublisher metricsPublisher) {
        return new AplVisualTask(metricsPublisher);
    }

    @Override // javax.inject.Provider
    public AplVisualTask get() {
        return newInstance(this.mMetricsPublisherProvider.get());
    }
}
