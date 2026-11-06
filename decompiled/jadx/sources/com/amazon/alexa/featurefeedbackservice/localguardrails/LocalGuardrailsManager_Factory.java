package com.amazon.alexa.featurefeedbackservice.localguardrails;

import com.amazon.alexa.featurefeedbackservice.storage.SharedPreferenceRepo;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class LocalGuardrailsManager_Factory implements Factory<LocalGuardrailsManager> {
    private final Provider<FeatureServiceV2> featureServiceProvider;
    private final Provider<SharedPreferenceRepo> repoProvider;

    public LocalGuardrailsManager_Factory(Provider<SharedPreferenceRepo> provider, Provider<FeatureServiceV2> provider2) {
        this.repoProvider = provider;
        this.featureServiceProvider = provider2;
    }

    public static LocalGuardrailsManager_Factory create(Provider<SharedPreferenceRepo> provider, Provider<FeatureServiceV2> provider2) {
        return new LocalGuardrailsManager_Factory(provider, provider2);
    }

    public static LocalGuardrailsManager newInstance(Lazy<SharedPreferenceRepo> lazy, Lazy<FeatureServiceV2> lazy2) {
        return new LocalGuardrailsManager(lazy, lazy2);
    }

    @Override // javax.inject.Provider
    public LocalGuardrailsManager get() {
        return newInstance(DoubleCheck.lazy(this.repoProvider), DoubleCheck.lazy(this.featureServiceProvider));
    }
}
