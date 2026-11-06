package com.amazon.alexa.sharing.presenter;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class FallbackStrategyPresenter_Factory implements Factory<FallbackStrategyPresenter> {
    private final Provider<AlexaCommsCoreMetricsService> metricsServiceLazyProvider;

    public FallbackStrategyPresenter_Factory(Provider<AlexaCommsCoreMetricsService> provider) {
        this.metricsServiceLazyProvider = provider;
    }

    public static FallbackStrategyPresenter_Factory create(Provider<AlexaCommsCoreMetricsService> provider) {
        return new FallbackStrategyPresenter_Factory(provider);
    }

    public static FallbackStrategyPresenter newInstance(Lazy<AlexaCommsCoreMetricsService> lazy) {
        return new FallbackStrategyPresenter(lazy);
    }

    @Override // javax.inject.Provider
    public FallbackStrategyPresenter get() {
        return newInstance(DoubleCheck.lazy(this.metricsServiceLazyProvider));
    }
}
