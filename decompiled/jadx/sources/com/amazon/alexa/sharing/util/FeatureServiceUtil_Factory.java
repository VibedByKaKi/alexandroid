package com.amazon.alexa.sharing.util;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class FeatureServiceUtil_Factory implements Factory<FeatureServiceUtil> {
    private final Provider<FeatureServiceV2> featureServiceV2Provider;

    public FeatureServiceUtil_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2Provider = provider;
    }

    public static FeatureServiceUtil_Factory create(Provider<FeatureServiceV2> provider) {
        return new FeatureServiceUtil_Factory(provider);
    }

    public static FeatureServiceUtil newInstance(FeatureServiceV2 featureServiceV2) {
        return new FeatureServiceUtil(featureServiceV2);
    }

    @Override // javax.inject.Provider
    public FeatureServiceUtil get() {
        return newInstance(this.featureServiceV2Provider.get());
    }
}
