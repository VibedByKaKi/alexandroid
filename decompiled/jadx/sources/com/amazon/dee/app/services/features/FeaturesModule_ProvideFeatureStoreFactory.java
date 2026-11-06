package com.amazon.dee.app.services.features;

import com.amazon.alexa.feature.provider.api.FeatureStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FeaturesModule_ProvideFeatureStoreFactory implements Factory<FeatureStore> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final FeaturesModule_ProvideFeatureStoreFactory INSTANCE = new FeaturesModule_ProvideFeatureStoreFactory();

        private InstanceHolder() {
        }
    }

    public static FeaturesModule_ProvideFeatureStoreFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureStore provideFeatureStore() {
        return (FeatureStore) Preconditions.checkNotNullFromProvides(FeaturesModule.provideFeatureStore());
    }

    @Override // javax.inject.Provider
    public FeatureStore get() {
        return provideFeatureStore();
    }
}
