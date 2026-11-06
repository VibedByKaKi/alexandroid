package com.amazon.alexa.voice.bottomsheet;

import android.content.Context;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.service.MetricsService;
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
/* loaded from: classes19.dex */
public final class BottomSheetModule_ProvideBottomSheetEnablerFactory implements Factory<BottomSheetFeatureEnabler> {
    private final Provider<Context> contextProvider;
    private final Provider<LocaleInteractor> localeInteractorProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public BottomSheetModule_ProvideBottomSheetEnablerFactory(Provider<Context> provider, Provider<LocaleInteractor> provider2, Provider<MetricsService> provider3) {
        this.contextProvider = provider;
        this.localeInteractorProvider = provider2;
        this.metricsServiceProvider = provider3;
    }

    public static BottomSheetModule_ProvideBottomSheetEnablerFactory create(Provider<Context> provider, Provider<LocaleInteractor> provider2, Provider<MetricsService> provider3) {
        return new BottomSheetModule_ProvideBottomSheetEnablerFactory(provider, provider2, provider3);
    }

    public static BottomSheetFeatureEnabler provideBottomSheetEnabler(Context context, LocaleInteractor localeInteractor, MetricsService metricsService) {
        return (BottomSheetFeatureEnabler) Preconditions.checkNotNullFromProvides(BottomSheetModule.provideBottomSheetEnabler(context, localeInteractor, metricsService));
    }

    @Override // javax.inject.Provider
    public BottomSheetFeatureEnabler get() {
        return provideBottomSheetEnabler(this.contextProvider.get(), this.localeInteractorProvider.get(), this.metricsServiceProvider.get());
    }
}
