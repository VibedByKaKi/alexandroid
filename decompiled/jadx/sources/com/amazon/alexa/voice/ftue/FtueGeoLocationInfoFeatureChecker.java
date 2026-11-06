package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.voice.features.DefaultExperimentTreatmentProvider;
import com.amazon.alexa.voice.features.ExperimentalFeatures;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FtueGeoLocationInfoFeatureChecker implements FeatureEnabler {
    private static final String TAG = "FtueGeoLocationInfoFeatureChecker";
    private DefaultExperimentTreatmentProvider ftueExperimentFeatureChecker;

    public FtueGeoLocationInfoFeatureChecker(DefaultExperimentTreatmentProvider defaultExperimentTreatmentProvider) {
        this.ftueExperimentFeatureChecker = defaultExperimentTreatmentProvider;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.ALEXA_MOBILE_FAB_GEOLOCATION_DISCLOSURE;
    }

    public boolean isGeoLocationInfoEnabled() {
        return this.ftueExperimentFeatureChecker.getTreatmentAndRecordTrigger(ExperimentalFeatures.ALEXA_MOBILE_FAB_GEOLOCATION_DISCLOSURE).equals("T1");
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
    }
}
