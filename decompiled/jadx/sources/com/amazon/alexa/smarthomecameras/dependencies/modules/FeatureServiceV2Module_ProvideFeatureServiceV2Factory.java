package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FeatureServiceV2Module_ProvideFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private static final FeatureServiceV2Module_ProvideFeatureServiceV2Factory INSTANCE = new FeatureServiceV2Module_ProvideFeatureServiceV2Factory();

    public static FeatureServiceV2Module_ProvideFeatureServiceV2Factory create() {
        return INSTANCE;
    }

    public static FeatureServiceV2 provideFeatureServiceV2() {
        return (FeatureServiceV2) Preconditions.checkNotNull(FeatureServiceV2Module.provideFeatureServiceV2(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return provideFeatureServiceV2();
    }
}
