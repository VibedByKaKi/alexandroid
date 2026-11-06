package com.amazon.alexa.featureservice.service;

import com.amazon.alexa.featureservice.util.FeatureSubscriptionMap;
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
public final class FeatureSubscriptionManager_Factory implements Factory<FeatureSubscriptionManager> {
    private final Provider<FeatureSubscriptionMap> featureSubscriptionMapProvider;

    public FeatureSubscriptionManager_Factory(Provider<FeatureSubscriptionMap> provider) {
        this.featureSubscriptionMapProvider = provider;
    }

    public static FeatureSubscriptionManager_Factory create(Provider<FeatureSubscriptionMap> provider) {
        return new FeatureSubscriptionManager_Factory(provider);
    }

    public static FeatureSubscriptionManager newInstance(FeatureSubscriptionMap featureSubscriptionMap) {
        return new FeatureSubscriptionManager(featureSubscriptionMap);
    }

    @Override // javax.inject.Provider
    public FeatureSubscriptionManager get() {
        return newInstance(this.featureSubscriptionMapProvider.get());
    }
}
