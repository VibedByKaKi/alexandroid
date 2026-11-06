package com.amazon.alexa.featureservice.repo.mapper;

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
public final class FeatureIdentifierCollectionMapper_Factory implements Factory<FeatureIdentifierCollectionMapper> {
    private final Provider<FeatureIdentifierDataMapper> featureIdentifierDataMapperProvider;

    public FeatureIdentifierCollectionMapper_Factory(Provider<FeatureIdentifierDataMapper> provider) {
        this.featureIdentifierDataMapperProvider = provider;
    }

    public static FeatureIdentifierCollectionMapper_Factory create(Provider<FeatureIdentifierDataMapper> provider) {
        return new FeatureIdentifierCollectionMapper_Factory(provider);
    }

    public static FeatureIdentifierCollectionMapper newInstance(FeatureIdentifierDataMapper featureIdentifierDataMapper) {
        return new FeatureIdentifierCollectionMapper(featureIdentifierDataMapper);
    }

    @Override // javax.inject.Provider
    public FeatureIdentifierCollectionMapper get() {
        return newInstance(this.featureIdentifierDataMapperProvider.get());
    }
}
