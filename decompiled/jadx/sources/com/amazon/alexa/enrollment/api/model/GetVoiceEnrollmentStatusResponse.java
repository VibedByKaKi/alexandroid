package com.amazon.alexa.enrollment.api.model;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetVoiceEnrollmentStatusResponse {
    private static final String TAG = "VoxEn_GetVoiceEnrollmentStatusResponse";
    private final VoiceEnrollmentStatus voiceEnrollmentStatus;

    public GetVoiceEnrollmentStatusResponse(VoiceEnrollmentStatus voiceEnrollmentStatus) {
        this.voiceEnrollmentStatus = voiceEnrollmentStatus;
        Log.i(TAG, "GetVoiceEnrollmentStatus_QualityCheckResult: " + voiceEnrollmentStatus.getQualityCheckResult());
    }

    public VoiceEnrollmentStatus getVoiceEnrollmentStatus() {
        return this.voiceEnrollmentStatus;
    }

    public String toString() {
        return this.voiceEnrollmentStatus.toString();
    }
}
