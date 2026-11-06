package com.amazon.alexa.featureservice.repo.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FeatureIdentifierDataMapper_Factory implements Factory<FeatureIdentifierDataMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final FeatureIdentifierDataMapper_Factory INSTANCE = new FeatureIdentifierDataMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static FeatureIdentifierDataMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureIdentifierDataMapper newInstance() {
        return new FeatureIdentifierDataMapper();
    }

    @Override // javax.inject.Provider
    public FeatureIdentifierDataMapper get() {
        return newInstance();
    }
}
