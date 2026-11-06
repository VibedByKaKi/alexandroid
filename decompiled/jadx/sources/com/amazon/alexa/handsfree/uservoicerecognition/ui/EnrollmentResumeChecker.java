package com.amazon.alexa.handsfree.uservoicerecognition.ui;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRVendorSettings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentResumeChecker {
    private final TimeInstantProvider mCurrentTimeMillisSupplier;
    private final EnrollmentResumeStateStore mEnrollmentResumeStateStore;
    private final long mResumeAllowedMaxPeriodMillis;
    private final UVRVendorSettings mUVRVendorSettings;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TimeInstantProvider {
        public long getTimeInstantMillis() {
            return System.currentTimeMillis();
        }
    }

    public EnrollmentResumeChecker(@NonNull TimeInstantProvider timeInstantProvider, @NonNull EnrollmentResumeStateStore enrollmentResumeStateStore, @NonNull UVRVendorSettings uVRVendorSettings, int i) {
        this.mEnrollmentResumeStateStore = enrollmentResumeStateStore;
        this.mCurrentTimeMillisSupplier = timeInstantProvider;
        this.mUVRVendorSettings = uVRVendorSettings;
        this.mResumeAllowedMaxPeriodMillis = i * 1000;
    }

    public boolean canResumeEnrollment() {
        return this.mUVRVendorSettings.isEnrollmentResumeSupported() && this.mEnrollmentResumeStateStore.getInstantOfLastFocus() + this.mResumeAllowedMaxPeriodMillis >= this.mCurrentTimeMillisSupplier.getTimeInstantMillis();
    }

    public void resetResumeClock() {
        this.mEnrollmentResumeStateStore.setInstantOfLastFocus(this.mCurrentTimeMillisSupplier.getTimeInstantMillis());
    }
}
