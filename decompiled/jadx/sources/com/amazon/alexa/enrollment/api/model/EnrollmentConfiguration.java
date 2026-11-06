package com.amazon.alexa.enrollment.api.model;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class EnrollmentConfiguration {
    private static final int GET_ENROLLMENT_API_MAX_RETRY_COUNT = 4;
    private static final long GET_ENROLLMENT_STATUS_API_MAX_TIMEOUT = 5000;
    private static final String TAG = "VoxEn_EnrollmentConfiguration";
    private static EnrollmentConfiguration enrollmentConfiguration;
    private int maxRetriesPerTrainingPhrase = 4;
    private long getEnrollmentStatusApiTimeout = 5000;
    public final long startEnrollmentApiTimeout = 15000;
    public final int startEnrollmentApiMaxRetryCount = 2;
    public final long eligibilityEnrollmentApiTimeout = 4000;

    private EnrollmentConfiguration() {
    }

    public static synchronized EnrollmentConfiguration getInstance() {
        EnrollmentConfiguration enrollmentConfiguration2;
        synchronized (EnrollmentConfiguration.class) {
            try {
                if (enrollmentConfiguration == null) {
                    enrollmentConfiguration = new EnrollmentConfiguration();
                }
                enrollmentConfiguration2 = enrollmentConfiguration;
            } catch (Throwable th) {
                throw th;
            }
        }
        return enrollmentConfiguration2;
    }

    public long getGetEnrollmentStatusApiTimeout() {
        return this.getEnrollmentStatusApiTimeout;
    }

    public int getMaxRetriesPerTrainingPhrase() {
        return this.maxRetriesPerTrainingPhrase;
    }

    public void resetConfig() {
        this.getEnrollmentStatusApiTimeout = 5000L;
        this.maxRetriesPerTrainingPhrase = 4;
    }

    public void updateConfig(VoiceEnrollmentGUIConfiguration voiceEnrollmentGUIConfiguration) {
        Log.i(TAG, "GetEnrollmentStatusApiTimeout " + voiceEnrollmentGUIConfiguration.getVoiceEnrollmentStatusApiTimeout() + "MaxRetriesPerTrainingPhrase " + voiceEnrollmentGUIConfiguration.getMaxRetriesPerTrainingPhrase());
        this.getEnrollmentStatusApiTimeout = voiceEnrollmentGUIConfiguration.getVoiceEnrollmentStatusApiTimeout();
        this.maxRetriesPerTrainingPhrase = voiceEnrollmentGUIConfiguration.getMaxRetriesPerTrainingPhrase();
    }
}
