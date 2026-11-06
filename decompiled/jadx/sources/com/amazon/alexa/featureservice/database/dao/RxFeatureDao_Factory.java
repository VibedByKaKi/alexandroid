package com.amazon.alexa.featureservice.database.dao;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class RxFeatureDao_Factory implements Factory<RxFeatureDao> {
    private final Provider<FeatureFlagDao> daoProvider;

    public RxFeatureDao_Factory(Provider<FeatureFlagDao> provider) {
        this.daoProvider = provider;
    }

    public static RxFeatureDao_Factory create(Provider<FeatureFlagDao> provider) {
        return new RxFeatureDao_Factory(provider);
    }

    public static RxFeatureDao newInstance(FeatureFlagDao featureFlagDao) {
        return new RxFeatureDao(featureFlagDao);
    }

    @Override // javax.inject.Provider
    public RxFeatureDao get() {
        return newInstance(this.daoProvider.get());
    }
}
