package com.amazon.deecomms.core;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FeatureFlagManager_Factory implements Factory<FeatureFlagManager> {
    private final Provider<FeatureServiceV2> featureServiceV2LazyProvider;

    public FeatureFlagManager_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2LazyProvider = provider;
    }

    public static FeatureFlagManager_Factory create(Provider<FeatureServiceV2> provider) {
        return new FeatureFlagManager_Factory(provider);
    }

    public static FeatureFlagManager newInstance(Lazy<FeatureServiceV2> lazy) {
        return new FeatureFlagManager(lazy);
    }

    @Override // javax.inject.Provider
    public FeatureFlagManager get() {
        return newInstance(DoubleCheck.lazy(this.featureServiceV2LazyProvider));
    }
}
