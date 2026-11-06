package com.amazon.alexa.featurefeedbackservice.dependencies;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImplementationModule_ProvidesFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesFeatureServiceV2Factory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesFeatureServiceV2Factory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesFeatureServiceV2Factory(implementationModule);
    }

    public static FeatureServiceV2 providesFeatureServiceV2(ImplementationModule implementationModule) {
        return (FeatureServiceV2) Preconditions.checkNotNull(implementationModule.providesFeatureServiceV2(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return providesFeatureServiceV2(this.module);
    }
}
