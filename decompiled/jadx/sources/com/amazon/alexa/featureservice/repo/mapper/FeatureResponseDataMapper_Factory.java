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
public final class FeatureResponseDataMapper_Factory implements Factory<FeatureResponseDataMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final FeatureResponseDataMapper_Factory INSTANCE = new FeatureResponseDataMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static FeatureResponseDataMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureResponseDataMapper newInstance() {
        return new FeatureResponseDataMapper();
    }

    @Override // javax.inject.Provider
    public FeatureResponseDataMapper get() {
        return newInstance();
    }
}
