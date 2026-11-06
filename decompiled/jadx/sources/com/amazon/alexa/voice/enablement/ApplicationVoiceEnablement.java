package com.amazon.alexa.voice.enablement;

import com.amazon.alexa.device.api.DeviceInformation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class ApplicationVoiceEnablement implements VoiceEnablement {
    private final DeviceInformation deviceInformation;

    public ApplicationVoiceEnablement(DeviceInformation deviceInformation) {
        this.deviceInformation = deviceInformation;
    }

    @Override // com.amazon.alexa.voice.enablement.VoiceEnablement
    public boolean isVoicePossible() {
        return (this.deviceInformation.isFireOS() && this.deviceInformation.hasFOSLegacyAlexa()) ? false : true;
    }
}
