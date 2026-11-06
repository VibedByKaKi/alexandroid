package com.amazon.alexa.enrollment.ui.introduction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentIntroductionUiModel {
    private final boolean isAudioPermissionGranted;
    private final boolean isPersonEnrolled;

    public EnrollmentIntroductionUiModel(boolean z, boolean z2) {
        this.isPersonEnrolled = z;
        this.isAudioPermissionGranted = z2;
    }

    public boolean isAudioPermissionGranted() {
        return this.isAudioPermissionGranted;
    }

    public boolean isUserEligibleForEnrollment() {
        return !this.isPersonEnrolled;
    }
}
