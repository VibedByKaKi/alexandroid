package com.amazon.alexa.voice.ui;

import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor;
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
/* loaded from: classes20.dex */
public final class UiModule_ProvideCardMetricsInteractorFactory implements Factory<CardMetricsInteractor> {
    private final Provider<MetricsBridge> metricsBridgeProvider;

    public UiModule_ProvideCardMetricsInteractorFactory(Provider<MetricsBridge> provider) {
        this.metricsBridgeProvider = provider;
    }

    public static UiModule_ProvideCardMetricsInteractorFactory create(Provider<MetricsBridge> provider) {
        return new UiModule_ProvideCardMetricsInteractorFactory(provider);
    }

    public static CardMetricsInteractor provideCardMetricsInteractor(MetricsBridge metricsBridge) {
        return (CardMetricsInteractor) Preconditions.checkNotNullFromProvides(UiModule.provideCardMetricsInteractor(metricsBridge));
    }

    @Override // javax.inject.Provider
    public CardMetricsInteractor get() {
        return provideCardMetricsInteractor(this.metricsBridgeProvider.get());
    }
}
