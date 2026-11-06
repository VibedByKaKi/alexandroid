package com.amazon.alexa.featureservice.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FeatureSubscriptionMap_Factory implements Factory<FeatureSubscriptionMap> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final FeatureSubscriptionMap_Factory INSTANCE = new FeatureSubscriptionMap_Factory();

        private InstanceHolder() {
        }
    }

    public static FeatureSubscriptionMap_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureSubscriptionMap newInstance() {
        return new FeatureSubscriptionMap();
    }

    @Override // javax.inject.Provider
    public FeatureSubscriptionMap get() {
        return newInstance();
    }
}
