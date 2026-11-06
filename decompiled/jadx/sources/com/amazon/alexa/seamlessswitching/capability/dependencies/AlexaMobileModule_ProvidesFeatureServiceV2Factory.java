package com.amazon.alexa.seamlessswitching.capability.dependencies;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class AlexaMobileModule_ProvidesFeatureServiceV2Factory implements Factory<FeatureServiceV2> {
    private final AlexaMobileModule module;

    public AlexaMobileModule_ProvidesFeatureServiceV2Factory(AlexaMobileModule alexaMobileModule) {
        this.module = alexaMobileModule;
    }

    public static AlexaMobileModule_ProvidesFeatureServiceV2Factory create(AlexaMobileModule alexaMobileModule) {
        return new AlexaMobileModule_ProvidesFeatureServiceV2Factory(alexaMobileModule);
    }

    public static FeatureServiceV2 providesFeatureServiceV2(AlexaMobileModule alexaMobileModule) {
        return (FeatureServiceV2) Preconditions.checkNotNullFromProvides(alexaMobileModule.providesFeatureServiceV2());
    }

    @Override // javax.inject.Provider
    public FeatureServiceV2 get() {
        return providesFeatureServiceV2(this.module);
    }
}
