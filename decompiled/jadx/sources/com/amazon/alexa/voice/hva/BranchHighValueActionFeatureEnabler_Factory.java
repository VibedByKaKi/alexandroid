package com.amazon.alexa.voice.hva;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class BranchHighValueActionFeatureEnabler_Factory implements Factory<BranchHighValueActionFeatureEnabler> {
    private final Provider<FeatureServiceV2> featureServiceProvider;

    public BranchHighValueActionFeatureEnabler_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceProvider = provider;
    }

    public static BranchHighValueActionFeatureEnabler_Factory create(Provider<FeatureServiceV2> provider) {
        return new BranchHighValueActionFeatureEnabler_Factory(provider);
    }

    public static BranchHighValueActionFeatureEnabler newInstance(FeatureServiceV2 featureServiceV2) {
        return new BranchHighValueActionFeatureEnabler(featureServiceV2);
    }

    @Override // javax.inject.Provider
    public BranchHighValueActionFeatureEnabler get() {
        return newInstance(this.featureServiceProvider.get());
    }
}
