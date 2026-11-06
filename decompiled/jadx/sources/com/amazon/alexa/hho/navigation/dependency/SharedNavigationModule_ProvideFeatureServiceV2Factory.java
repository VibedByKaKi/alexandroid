package com.amazon.alexa.hho.navigation.dependency;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvideFeatureServiceV2Factory implements Factory<LazyComponent<FeatureServiceV2>> {
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvideFeatureServiceV2Factory(SharedNavigationModule sharedNavigationModule) {
        this.module = sharedNavigationModule;
    }

    public static SharedNavigationModule_ProvideFeatureServiceV2Factory create(SharedNavigationModule sharedNavigationModule) {
        return new SharedNavigationModule_ProvideFeatureServiceV2Factory(sharedNavigationModule);
    }

    public static LazyComponent<FeatureServiceV2> provideFeatureServiceV2(SharedNavigationModule sharedNavigationModule) {
        return (LazyComponent) Preconditions.checkNotNullFromProvides(sharedNavigationModule.provideFeatureServiceV2());
    }

    @Override // javax.inject.Provider
    public LazyComponent<FeatureServiceV2> get() {
        return provideFeatureServiceV2(this.module);
    }
}
