package com.amazon.alexa.voice.hva;

import android.util.Log;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.features.VoiceFeature;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class BranchHighValueActionFeatureEnabler {
    private final FeatureServiceV2 featureService;

    @Inject
    public BranchHighValueActionFeatureEnabler(FeatureServiceV2 featureServiceV2) {
        this.featureService = featureServiceV2;
    }

    public boolean isEnabled() {
        VoiceFeature voiceFeature = VoiceFeature.BRANCH_HVA_ANDROID;
        try {
            return this.featureService.hasAccess(voiceFeature.getFeatureNamespace(), voiceFeature.getName(), false);
        } catch (RuntimeException e) {
            Log.e("VoiceHighValueAction", "Unable to read the Branch HVA feature gate.", e);
            return false;
        }
    }
}
