package com.amazon.alexa.featureservice.implementation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FeatureRegistryUtil_Factory implements Factory<FeatureRegistryUtil> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final FeatureRegistryUtil_Factory INSTANCE = new FeatureRegistryUtil_Factory();

        private InstanceHolder() {
        }
    }

    public static FeatureRegistryUtil_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureRegistryUtil newInstance() {
        return new FeatureRegistryUtil();
    }

    @Override // javax.inject.Provider
    public FeatureRegistryUtil get() {
        return newInstance();
    }
}
