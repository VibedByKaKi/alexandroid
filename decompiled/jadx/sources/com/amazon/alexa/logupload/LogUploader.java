package com.amazon.alexa.logupload;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LogUploader {
    public static final String DTS_SESSION_ID = "dtsSessionId";
    private static final int HTTP_ERROR_STATUS_START = 400;
    public static final Executor SERIAL_EXECUTOR = Executors.newSingleThreadExecutor();
    private static final String TAG = "LogUploader";
    private final Context context;

    @VisibleForTesting
    LogNetworkService logNetworkService;

    @VisibleForTesting
    LogRetriever logRetriever;

    @VisibleForTesting
    LogUploadMetricsService logUploadMetricsService;
    private final String metricPrefix;

    public LogUploader(Context context, @Nullable String str) {
        this.context = context;
        this.metricPrefix = str;
    }

    private LogNetworkService getLogNetworkService() {
        if (this.logNetworkService == null) {
            this.logNetworkService = new LogNetworkService();
        }
        return this.logNetworkService;
    }

    private LogRetriever getLogRetriever() {
        if (this.logRetriever == null) {
            this.logRetriever = new LogRetriever(this.context);
        }
        return this.logRetriever;
    }

    private LogUploadMetricsService getLogUploadMetricsService() {
        if (this.logUploadMetricsService == null) {
            this.logUploadMetricsService = new LogUploadMetricsService(this.metricPrefix);
        }
        return this.logUploadMetricsService;
    }

    private void handleLogUploadException(LogUploadException logUploadException) {
        Log.e(TAG, "Unable to upload logs to DET", logUploadException);
        if (logUploadException.getExceptionCode() != 2 || logUploadException.getExceptionSubCode() < 400) {
            getLogUploadMetricsService().recordLogUploadOtherError(logUploadException.getMessage());
        } else {
            getLogUploadMetricsService().recordLogUploadHttpError(logUploadException.getExceptionSubCode(), logUploadException.getMessage());
        }
    }

    public void uploadLogsToDET(String str) {
        SERIAL_EXECUTOR.execute(new Event$$ExternalSyntheticLambda2(this, str, 16));
    }

    @VisibleForTesting
    /* renamed from: uploadLogsToDETSynchronously, reason: merged with bridge method [inline-methods] */
    public void lambda$uploadLogsToDET$0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i(TAG, "DTS Session Id is invalid");
            return;
        }
        getLogUploadMetricsService().recordLogUploadAttempt();
        try {
            try {
                getLogNetworkService().sendLogReport(getLogRetriever().getDETReport(str));
                getLogUploadMetricsService().recordLogUploadSuccess();
            } catch (LogUploadException e) {
                handleLogUploadException(e);
            }
        } catch (LogUploadException e2) {
            Log.e(TAG, "Unable to retrieve logs", e2);
            getLogUploadMetricsService().recordLogUploadRetrievingError(e2.getMessage());
        }
    }
}
