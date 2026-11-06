package com.amazon.dee.app.dependencies;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.api.PlatformFeatureServiceV2;
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
/* loaded from: classes3.dex */
public final class FeatureServiceModule_ProvideFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private final FeatureServiceModule module;
    private final Provider<PlatformFeatureServiceV2> platformFeatureServiceV2Provider;

    public FeatureServiceModule_ProvideFeatureServiceV2Factory(FeatureServiceModule featureServiceModule, Provider<PlatformFeatureServiceV2> provider) {
        this.module = featureServiceModule;
        this.platformFeatureServiceV2Provider = provider;
    }

    public static FeatureServiceModule_ProvideFeatureServiceV2Factory create(FeatureServiceModule featureServiceModule, Provider<PlatformFeatureServiceV2> provider) {
        return new FeatureServiceModule_ProvideFeatureServiceV2Factory(featureServiceModule, provider);
    }

    public static FeatureServiceV2 provideFeatureServiceV2(FeatureServiceModule featureServiceModule, PlatformFeatureServiceV2 platformFeatureServiceV2) {
        return (FeatureServiceV2) Preconditions.checkNotNullFromProvides(featureServiceModule.provideFeatureServiceV2(platformFeatureServiceV2));
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return provideFeatureServiceV2(this.module, this.platformFeatureServiceV2Provider.get());
    }
}
