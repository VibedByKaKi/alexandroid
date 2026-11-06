package com.amazon.alexa.voice.tta.features;

import com.amazon.alexa.feature.consumer.api.FeatureQuery;
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
public final class FeaturesModule_ProvidesFeatureCheckerFactory implements Factory<FeatureChecker> {
    private final Provider<FeatureQuery> featureQueryProvider;
    private final FeaturesModule module;

    public FeaturesModule_ProvidesFeatureCheckerFactory(FeaturesModule featuresModule, Provider<FeatureQuery> provider) {
        this.module = featuresModule;
        this.featureQueryProvider = provider;
    }

    public static FeaturesModule_ProvidesFeatureCheckerFactory create(FeaturesModule featuresModule, Provider<FeatureQuery> provider) {
        return new FeaturesModule_ProvidesFeatureCheckerFactory(featuresModule, provider);
    }

    public static FeatureChecker providesFeatureChecker(FeaturesModule featuresModule, FeatureQuery featureQuery) {
        return (FeatureChecker) Preconditions.checkNotNullFromProvides(featuresModule.providesFeatureChecker(featureQuery));
    }

    @Override // javax.inject.Provider
    public FeatureChecker get() {
        return providesFeatureChecker(this.module, this.featureQueryProvider.get());
    }
}
