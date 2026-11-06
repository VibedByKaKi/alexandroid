package com.amazon.alexa.voice.tta.features;

import com.amazon.alexa.feature.consumer.api.FeatureFlagConsumer;
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
public final class FeaturesModule_ProvidesFeatureQueryFactory implements Factory<FeatureQuery> {
    private final Provider<FeatureFlagConsumer> featureFlagConsumerProvider;
    private final FeaturesModule module;

    public FeaturesModule_ProvidesFeatureQueryFactory(FeaturesModule featuresModule, Provider<FeatureFlagConsumer> provider) {
        this.module = featuresModule;
        this.featureFlagConsumerProvider = provider;
    }

    public static FeaturesModule_ProvidesFeatureQueryFactory create(FeaturesModule featuresModule, Provider<FeatureFlagConsumer> provider) {
        return new FeaturesModule_ProvidesFeatureQueryFactory(featuresModule, provider);
    }

    public static FeatureQuery providesFeatureQuery(FeaturesModule featuresModule, FeatureFlagConsumer featureFlagConsumer) {
        return (FeatureQuery) Preconditions.checkNotNullFromProvides(featuresModule.providesFeatureQuery(featureFlagConsumer));
    }

    @Override // javax.inject.Provider
    public FeatureQuery get() {
        return providesFeatureQuery(this.module, this.featureFlagConsumerProvider.get());
    }
}
