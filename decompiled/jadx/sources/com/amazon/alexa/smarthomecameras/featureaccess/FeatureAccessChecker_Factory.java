package com.amazon.alexa.smarthomecameras.featureaccess;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FeatureAccessChecker_Factory implements Factory<FeatureAccessChecker> {
    private final Provider<FeatureServiceV2> featureServiceV2Provider;

    public FeatureAccessChecker_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2Provider = provider;
    }

    public static FeatureAccessChecker_Factory create(Provider<FeatureServiceV2> provider) {
        return new FeatureAccessChecker_Factory(provider);
    }

    public static FeatureAccessChecker newInstance(FeatureServiceV2 featureServiceV2) {
        return new FeatureAccessChecker(featureServiceV2);
    }

    @Override // javax.inject.Provider
    public FeatureAccessChecker get() {
        return new FeatureAccessChecker(this.featureServiceV2Provider.get());
    }
}
