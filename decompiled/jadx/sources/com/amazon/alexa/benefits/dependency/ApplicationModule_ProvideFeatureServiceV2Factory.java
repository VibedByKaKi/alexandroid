package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFeatureServiceV2Factory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFeatureServiceV2Factory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFeatureServiceV2Factory(applicationModule);
    }

    public static FeatureServiceV2 provideFeatureServiceV2(ApplicationModule applicationModule) {
        return (FeatureServiceV2) Preconditions.checkNotNull(applicationModule.provideFeatureServiceV2(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return provideFeatureServiceV2(this.module);
    }
}
