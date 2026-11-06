package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.features.DefaultExperimentTreatmentProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class FtueModule_ProvideDefaultExperimentFeatureCheckerFactory implements Factory<DefaultExperimentTreatmentProvider> {
    private final Provider<FeatureServiceV2> featureServiceV2Provider;

    public FtueModule_ProvideDefaultExperimentFeatureCheckerFactory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2Provider = provider;
    }

    public static FtueModule_ProvideDefaultExperimentFeatureCheckerFactory create(Provider<FeatureServiceV2> provider) {
        return new FtueModule_ProvideDefaultExperimentFeatureCheckerFactory(provider);
    }

    public static DefaultExperimentTreatmentProvider provideDefaultExperimentFeatureChecker(FeatureServiceV2 featureServiceV2) {
        return (DefaultExperimentTreatmentProvider) Preconditions.checkNotNullFromProvides(FtueModule.provideDefaultExperimentFeatureChecker(featureServiceV2));
    }

    @Override // javax.inject.Provider
    public DefaultExperimentTreatmentProvider get() {
        return provideDefaultExperimentFeatureChecker(this.featureServiceV2Provider.get());
    }
}
