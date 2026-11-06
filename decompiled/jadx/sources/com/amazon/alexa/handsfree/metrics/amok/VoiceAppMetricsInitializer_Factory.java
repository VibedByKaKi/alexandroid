package com.amazon.alexa.handsfree.metrics.amok;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceAppMetricsInitializer_Factory implements Factory<VoiceAppMetricsInitializer> {
    private final Provider<FeatureServiceV2> featureServiceV2Provider;

    public VoiceAppMetricsInitializer_Factory(Provider<FeatureServiceV2> provider) {
        this.featureServiceV2Provider = provider;
    }

    public static Factory<VoiceAppMetricsInitializer> create(Provider<FeatureServiceV2> provider) {
        return new VoiceAppMetricsInitializer_Factory(provider);
    }

    public static VoiceAppMetricsInitializer newVoiceAppMetricsInitializer(FeatureServiceV2 featureServiceV2) {
        return new VoiceAppMetricsInitializer(featureServiceV2);
    }

    @Override // javax.inject.Provider
    public VoiceAppMetricsInitializer get() {
        return new VoiceAppMetricsInitializer(this.featureServiceV2Provider.get());
    }
}
