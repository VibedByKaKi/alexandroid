package com.amazon.alexa.voice.bottomsheet;

import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class GrootBottomSheetFeatureEnabler_Factory implements Factory<GrootBottomSheetFeatureEnabler> {
    private final Provider<LocaleInteractor> localeInteractorProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public GrootBottomSheetFeatureEnabler_Factory(Provider<LocaleInteractor> provider, Provider<MetricsService> provider2) {
        this.localeInteractorProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static GrootBottomSheetFeatureEnabler_Factory create(Provider<LocaleInteractor> provider, Provider<MetricsService> provider2) {
        return new GrootBottomSheetFeatureEnabler_Factory(provider, provider2);
    }

    public static GrootBottomSheetFeatureEnabler newInstance(LocaleInteractor localeInteractor, MetricsService metricsService) {
        return new GrootBottomSheetFeatureEnabler(localeInteractor, metricsService);
    }

    @Override // javax.inject.Provider
    public GrootBottomSheetFeatureEnabler get() {
        return newInstance(this.localeInteractorProvider.get(), this.metricsServiceProvider.get());
    }
}
