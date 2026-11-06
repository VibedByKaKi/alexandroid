package com.amazon.alexa.handsfree.uservoicerecognition.ui;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentResumeStateStore {
    private static final String ENROLLMENT_COMPLETE = "enrollmentComplete";
    private static final String INSTANT_OF_LAST_FOCUS = "instantOfLastFocusMillis";
    private static final String SHARED_PREFS_FILENAME = "com.amazon.alexa.handsfree.uvr.EnrollmentResumeStateStore";
    private final SharedPreferences mSharedPreferences;

    public EnrollmentResumeStateStore(@NonNull Context context) {
        this.mSharedPreferences = context.getSharedPreferences(SHARED_PREFS_FILENAME, 0);
    }

    public boolean getEnrollmentComplete() {
        return this.mSharedPreferences.getBoolean(ENROLLMENT_COMPLETE, false);
    }

    public long getInstantOfLastFocus() {
        return this.mSharedPreferences.getLong(INSTANT_OF_LAST_FOCUS, 0L);
    }

    public void setEnrollmentComplete() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.mSharedPreferences, ENROLLMENT_COMPLETE, true);
    }

    public void setInstantOfLastFocus(long j) {
        this.mSharedPreferences.edit().putLong(INSTANT_OF_LAST_FOCUS, j).apply();
    }
}
