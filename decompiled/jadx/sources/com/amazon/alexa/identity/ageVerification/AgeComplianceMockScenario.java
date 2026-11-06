package com.amazon.alexa.identity.ageVerification;

import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public enum AgeComplianceMockScenario {
    CONTROL,
    VERIFIED_ADULT,
    SUPERVISED_TEEN,
    SUPERVISED_CHILD,
    UNKNOWN_USER_STATUS,
    APPROVAL_PENDING,
    APPROVAL_DENIED,
    NETWORK_ERROR,
    API_UNAVAILABLE,
    PLAY_STORE_NOT_FOUND,
    APP_NOT_OWNED;

    public static AgeComplianceMockScenario fromString(@NonNull String str) {
        for (AgeComplianceMockScenario ageComplianceMockScenario : values()) {
            if (ageComplianceMockScenario.name().equalsIgnoreCase(str)) {
                return ageComplianceMockScenario;
            }
        }
        Log.w("AgeComplianceMockScenario", "Unknown value: [" + str + "]. Defaulting to CONTROL");
        return CONTROL;
    }
}
