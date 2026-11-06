package com.amazon.alexa.voice.tta.features;

import android.content.Context;
import com.amazon.alexa.feature.consumer.api.FeatureFlagConsumer;
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
public final class FeaturesModule_ProvidesFeatureFlagConsumerFactory implements Factory<FeatureFlagConsumer> {
    private final Provider<Context> contextProvider;
    private final FeaturesModule module;

    public FeaturesModule_ProvidesFeatureFlagConsumerFactory(FeaturesModule featuresModule, Provider<Context> provider) {
        this.module = featuresModule;
        this.contextProvider = provider;
    }

    public static FeaturesModule_ProvidesFeatureFlagConsumerFactory create(FeaturesModule featuresModule, Provider<Context> provider) {
        return new FeaturesModule_ProvidesFeatureFlagConsumerFactory(featuresModule, provider);
    }

    public static FeatureFlagConsumer providesFeatureFlagConsumer(FeaturesModule featuresModule, Context context) {
        return (FeatureFlagConsumer) Preconditions.checkNotNullFromProvides(featuresModule.providesFeatureFlagConsumer(context));
    }

    @Override // javax.inject.Provider
    public FeatureFlagConsumer get() {
        return providesFeatureFlagConsumer(this.module, this.contextProvider.get());
    }
}
