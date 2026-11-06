package com.amazon.alexa.enrollment.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetVoiceEnrollmentEligibilityResponse {
    private final boolean voiceEnrollmentEligibility;

    public GetVoiceEnrollmentEligibilityResponse(boolean z) {
        this.voiceEnrollmentEligibility = z;
    }

    public boolean isVoiceEnrollmentEligibility() {
        return this.voiceEnrollmentEligibility;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(" VoiceEnrollmentEligibility: ");
        stringBuffer.append(this.voiceEnrollmentEligibility);
        return stringBuffer.toString();
    }
}
