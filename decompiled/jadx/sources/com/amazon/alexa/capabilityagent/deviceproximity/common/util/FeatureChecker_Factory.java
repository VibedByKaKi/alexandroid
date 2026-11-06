package com.amazon.alexa.capabilityagent.deviceproximity.common.util;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.LazyComponent;
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
public final class FeatureChecker_Factory implements Factory<FeatureChecker> {
    private final Provider<LazyComponent<FeatureServiceV2>> clientProvider;

    public FeatureChecker_Factory(Provider<LazyComponent<FeatureServiceV2>> provider) {
        this.clientProvider = provider;
    }

    public static FeatureChecker_Factory create(Provider<LazyComponent<FeatureServiceV2>> provider) {
        return new FeatureChecker_Factory(provider);
    }

    public static FeatureChecker newInstance(LazyComponent<FeatureServiceV2> lazyComponent) {
        return new FeatureChecker(lazyComponent);
    }

    @Override // javax.inject.Provider
    public FeatureChecker get() {
        return newInstance(this.clientProvider.get());
    }
}
