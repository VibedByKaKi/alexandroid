package com.amazon.alexa.enrollment.unified.speakerid.api.model;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class StartVoiceEnrollmentResponse {
    private final VoiceEnrollmentGUIConfiguration voiceEnrollmentGUIConfiguration;
    private final VoiceEnrollmentStatus voiceEnrollmentStatus;

    public StartVoiceEnrollmentResponse(VoiceEnrollmentStatus voiceEnrollmentStatus, VoiceEnrollmentGUIConfiguration voiceEnrollmentGUIConfiguration) {
        this.voiceEnrollmentStatus = voiceEnrollmentStatus;
        this.voiceEnrollmentGUIConfiguration = voiceEnrollmentGUIConfiguration;
    }

    public VoiceEnrollmentGUIConfiguration getVoiceEnrollmentGUIConfiguration() {
        return this.voiceEnrollmentGUIConfiguration;
    }

    public VoiceEnrollmentStatus getVoiceEnrollmentStatus() {
        return this.voiceEnrollmentStatus;
    }

    public String toString() {
        String str = "";
        if (this.voiceEnrollmentStatus != null) {
            str = "" + this.voiceEnrollmentStatus.toString();
        }
        if (this.voiceEnrollmentGUIConfiguration == null) {
            return str;
        }
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(this.voiceEnrollmentGUIConfiguration.toString());
        return m.toString();
    }
}
