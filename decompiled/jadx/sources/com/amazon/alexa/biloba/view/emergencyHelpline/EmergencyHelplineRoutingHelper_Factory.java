package com.amazon.alexa.biloba.view.emergencyHelpline;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class EmergencyHelplineRoutingHelper_Factory implements Factory<EmergencyHelplineRoutingHelper> {
    private final Provider<FeatureServiceV2> featureServiceV2Provider;

    public EmergencyHelplineRoutingHelper_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2Provider = provider;
    }

    public static EmergencyHelplineRoutingHelper_Factory create(Provider<FeatureServiceV2> provider) {
        return new EmergencyHelplineRoutingHelper_Factory(provider);
    }

    public static EmergencyHelplineRoutingHelper newInstance(Lazy<FeatureServiceV2> lazy) {
        return new EmergencyHelplineRoutingHelper(lazy);
    }

    @Override // javax.inject.Provider
    public EmergencyHelplineRoutingHelper get() {
        return new EmergencyHelplineRoutingHelper(DoubleCheck.lazy(this.featureServiceV2Provider));
    }
}
