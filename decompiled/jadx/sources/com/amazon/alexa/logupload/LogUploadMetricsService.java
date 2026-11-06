package com.amazon.alexa.logupload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.logupload.LogUploadMetricsConstants;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LogUploadMetricsService {
    private static final String TAG = "LogUploadMetricsService";
    private final Mobilytics mobilytics;
    private final String prefix;

    public LogUploadMetricsService(@Nullable String str) {
        Object obj;
        obj = ComponentRegistry.getInstance().get(Mobilytics.class).get();
        this.mobilytics = (Mobilytics) obj;
        this.prefix = TextUtils.isEmpty(str) ? "default" : str;
    }

    private void recordError(String str, @NonNull String str2) {
        this.mobilytics.recordOccurrence(str, true, LogUploadMetricsConstants.ComponentName.COMPONENT, LogUploadMetricsConstants.ComponentName.SUB_COMPONENT);
    }

    private void recordOccurrence(String str) {
        this.mobilytics.recordOccurrence(str, true, LogUploadMetricsConstants.ComponentName.COMPONENT, LogUploadMetricsConstants.ComponentName.SUB_COMPONENT);
    }

    public void recordLogUploadAttempt() {
        recordOccurrence(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.prefix, LogUploadMetricsConstants.EventName.UPLOAD_ATTEMPT_SUFFIX));
    }

    public void recordLogUploadHttpError(int i, @NonNull String str) {
        recordError(this.prefix + LogUploadMetricsConstants.EventName.UPLOAD_HTTP_ERROR_INFIX + i, str);
    }

    public void recordLogUploadOtherError(@NonNull String str) {
        recordError(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.prefix, LogUploadMetricsConstants.EventName.UPLOAD_OTHER_ERROR_SUFFIX), str);
    }

    public void recordLogUploadRetrievingError(@NonNull String str) {
        recordError(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.prefix, LogUploadMetricsConstants.EventName.UPLOAD_RETRIEVING_ERROR_SUFFIX), str);
    }

    public void recordLogUploadSuccess() {
        recordOccurrence(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.prefix, LogUploadMetricsConstants.EventName.UPLOAD_SUCCESS_SUFFIX));
    }
}
