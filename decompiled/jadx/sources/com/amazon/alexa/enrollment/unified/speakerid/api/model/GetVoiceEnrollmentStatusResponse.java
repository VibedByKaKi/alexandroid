package com.amazon.alexa.enrollment.unified.speakerid.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetVoiceEnrollmentStatusResponse {
    private final VoiceEnrollmentStatus voiceEnrollmentStatus;

    public GetVoiceEnrollmentStatusResponse(VoiceEnrollmentStatus voiceEnrollmentStatus) {
        this.voiceEnrollmentStatus = voiceEnrollmentStatus;
    }

    public VoiceEnrollmentStatus getVoiceEnrollmentStatus() {
        return this.voiceEnrollmentStatus;
    }

    public String toString() {
        return this.voiceEnrollmentStatus.toString();
    }
}
