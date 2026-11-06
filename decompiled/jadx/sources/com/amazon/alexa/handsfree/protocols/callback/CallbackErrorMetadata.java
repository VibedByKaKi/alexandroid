package com.amazon.alexa.handsfree.protocols.callback;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CallbackErrorMetadata {
    public static final int MISSING_ERROR_CODE = -1;
    public static final String MISSING_ERROR_MESSAGE = "Error message missing";
    public static final int REMOTE_EXCEPTION_ERROR_CODE = -99;
    private static final String SEPARATOR = ":";
    private static final String TAG = "CallbackErrorMetadata";
    public static final String UVR_ENROLLER_CALL_CANCEL_ENROLLMENT = "UVREnrollerCancelEnrollment:%d%s";
    public static final String UVR_ENROLLER_CALL_CANCEL_UTTERANCE_TRAINING = "UVREnrollerCancelUtteranceTraining:%d%s";
    public static final String UVR_ENROLLER_CALL_ENABLE_UVR = "UVREnrollerEnableUVR:%d%s";
    public static final String UVR_ENROLLER_START_ENROLLMENT_ERROR = "UVREnrollerStartEnrollmentError:%d%s";
    private int errorCode;
    private String errorMessage;

    public CallbackErrorMetadata(int i, @NonNull String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getMetricName(@NonNull String str) {
        StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m(str, ":");
        m3869m.append(this.errorCode);
        return m3869m.toString();
    }

    public Throwable getThrowable(@NonNull String str) {
        StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m(str, ":");
        m3869m.append(this.errorCode);
        m3869m.append(":");
        m3869m.append(this.errorMessage);
        return new Throwable(m3869m.toString());
    }

    public CallbackErrorMetadata(int i) {
        this(i, MISSING_ERROR_MESSAGE);
    }

    public CallbackErrorMetadata(@NonNull String str) {
        this(-1, str);
    }

    public CallbackErrorMetadata() {
        this(-1, MISSING_ERROR_MESSAGE);
    }
}
