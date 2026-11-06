package com.amazon.alexa.voice.ra;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RedesignedGreetingEnabler implements FeatureEnabler {
    private static final int DISABLED = 0;
    private static final int ENABLED = 1;
    private static final String TAG = "RedesignedGreetingEnabler";
    private boolean isWeblabEnabled = false;

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableFeature ", TAG, z);
        this.isWeblabEnabled = z;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.RA_SHOW_REDESIGNED_GREETING;
    }

    public int isEnabled() {
        return this.isWeblabEnabled ? 1 : 0;
    }
}
