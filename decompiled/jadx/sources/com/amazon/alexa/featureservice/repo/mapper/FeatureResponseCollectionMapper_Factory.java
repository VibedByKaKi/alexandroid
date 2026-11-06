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
public final class FeatureResponseCollectionMapper_Factory implements Factory<FeatureResponseCollectionMapper> {
    private final Provider<FeatureResponseDataMapper> featureResponseDataMapperProvider;

    public FeatureResponseCollectionMapper_Factory(Provider<FeatureResponseDataMapper> provider) {
        this.featureResponseDataMapperProvider = provider;
    }

    public static FeatureResponseCollectionMapper_Factory create(Provider<FeatureResponseDataMapper> provider) {
        return new FeatureResponseCollectionMapper_Factory(provider);
    }

    public static FeatureResponseCollectionMapper newInstance(FeatureResponseDataMapper featureResponseDataMapper) {
        return new FeatureResponseCollectionMapper(featureResponseDataMapper);
    }

    @Override // javax.inject.Provider
    public FeatureResponseCollectionMapper get() {
        return newInstance(this.featureResponseDataMapperProvider.get());
    }
}
