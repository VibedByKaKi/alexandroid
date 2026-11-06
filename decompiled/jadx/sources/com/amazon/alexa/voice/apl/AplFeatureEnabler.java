package com.amazon.alexa.voice.apl;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AplFeatureEnabler implements FeatureEnabler {
    private static final String TAG = "AplFeatureEnabler";
    private final DeviceInformation deviceInformation;
    private boolean isWeblabEnabled = false;

    public AplFeatureEnabler(DeviceInformation deviceInformation) {
        this.deviceInformation = deviceInformation;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        this.isWeblabEnabled = z;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.APL;
    }

    public boolean isAplEnabled() {
        return this.deviceInformation.isFireOS() ? !this.deviceInformation.hasFOSLegacyAlexa() : this.isWeblabEnabled;
    }
}
