package com.amazon.alexa.voice.ra;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RaInternationalFeatureEnabler implements FeatureEnabler {
    private static final String TAG = "RaInternationalFeatureEnabler";
    private boolean isEnabled = false;

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableFeature ", TAG, z);
        this.isEnabled = z;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.REMARKABLE_ALEXA_UI_I18N;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }
}
