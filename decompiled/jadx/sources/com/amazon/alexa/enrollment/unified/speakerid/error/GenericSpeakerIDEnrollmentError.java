package com.amazon.alexa.enrollment.unified.speakerid.error;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.enrollment.unified.speakerid.metrics.SpeakerIDMetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GenericSpeakerIDEnrollmentError extends SpeakerIDEnrollmentError {
    public static final String UNKNOWN_EXCEPTION = "UnknownException";

    public GenericSpeakerIDEnrollmentError(int i, int i2, @NonNull String str, @NonNull Throwable th, boolean z, Context context) {
        super(i, i2, str, th, z, SpeakerIDMetricsConstants.ErrorType.UNKNOWN_EXCEPTION, new SpeakerIDErrorParser(context));
    }

    @Override // com.amazon.alexa.enrollment.unified.speakerid.error.SpeakerIDEnrollmentError
    public String getErrorPmetName() {
        return UNKNOWN_EXCEPTION;
    }
}
