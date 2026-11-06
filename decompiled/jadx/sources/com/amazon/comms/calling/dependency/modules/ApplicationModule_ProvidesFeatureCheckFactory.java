package com.amazon.comms.calling.dependency.modules;

import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.calling.foundation.features.providers.FeatureCheckProvider;
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
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesFeatureCheckFactory implements Factory<FeatureCheck> {
    private final ApplicationModule module;
    private final Provider<FeatureCheckProvider> providerProvider;

    public ApplicationModule_ProvidesFeatureCheckFactory(ApplicationModule applicationModule, Provider<FeatureCheckProvider> provider) {
        this.module = applicationModule;
        this.providerProvider = provider;
    }

    public static ApplicationModule_ProvidesFeatureCheckFactory create(ApplicationModule applicationModule, Provider<FeatureCheckProvider> provider) {
        return new ApplicationModule_ProvidesFeatureCheckFactory(applicationModule, provider);
    }

    public static FeatureCheck providesFeatureCheck(ApplicationModule applicationModule, FeatureCheckProvider featureCheckProvider) {
        return (FeatureCheck) Preconditions.checkNotNullFromProvides(applicationModule.providesFeatureCheck(featureCheckProvider));
    }

    @Override // javax.inject.Provider
    public FeatureCheck get() {
        return providesFeatureCheck(this.module, this.providerProvider.get());
    }
}
