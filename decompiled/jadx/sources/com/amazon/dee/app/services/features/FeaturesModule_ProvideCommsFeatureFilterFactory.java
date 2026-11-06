package com.amazon.dee.app.services.features;

import com.amazon.alexa.protocols.features.FeatureFilter;
import com.amazon.deecomms.core.decoupling.AlexaCommsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FeaturesModule_ProvideCommsFeatureFilterFactory implements Factory<FeatureFilter> {
    private final Provider<AlexaCommsService> commsServiceProvider;

    public FeaturesModule_ProvideCommsFeatureFilterFactory(Provider<AlexaCommsService> provider) {
        this.commsServiceProvider = provider;
    }

    public static FeaturesModule_ProvideCommsFeatureFilterFactory create(Provider<AlexaCommsService> provider) {
        return new FeaturesModule_ProvideCommsFeatureFilterFactory(provider);
    }

    public static FeatureFilter provideCommsFeatureFilter(AlexaCommsService alexaCommsService) {
        return (FeatureFilter) Preconditions.checkNotNullFromProvides(FeaturesModule.provideCommsFeatureFilter(alexaCommsService));
    }

    @Override // javax.inject.Provider
    public FeatureFilter get() {
        return provideCommsFeatureFilter(this.commsServiceProvider.get());
    }
}
