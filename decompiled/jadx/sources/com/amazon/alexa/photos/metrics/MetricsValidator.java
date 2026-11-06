package com.amazon.alexa.photos.metrics;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Supplier;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.autosave.internal.metrics.AutosaveMetricEvents;
import com.amazon.photos.autosave.internal.workers.AutosaveWorker;
import com.amazon.photos.autosave.internal.workers.CancelAndRescheduleWorker;
import com.amazon.photos.autosave.internal.workers.CancelUploadsWorker;
import com.amazon.photos.uploader.UploaderOperations;
import com.amazon.photos.uploader.cds.CdsMetrics;
import com.amazon.photos.uploader.cds.quota.CdsQuotaBlockerEvaluator;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;
import com.amazon.photos.uploader.internal.workers.BlockerEvaluatorWorker;
import com.amazon.photos.uploader.internal.workers.ReevaluateWorker;
import com.amazon.photos.uploader.internal.workers.SchedulerWorker;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MetricsValidator {
    private static final double ALWAYS_RECORD = 2.0d;

    @NonNull
    private static final Map<String, Double> METRICS_TO_SAMPLE_RATE = initMapSampleRate();
    private static final double ONE_MILLIONTH = 1.0E-6d;
    private static final double ONE_PERCENT = 0.01d;
    private static final double ONE_TENTH = 0.1d;
    private static final double ONE_THOUSANDTH = 0.001d;

    @VisibleForTesting
    protected Supplier<Double> randomDouble = new MetricsValidator$$ExternalSyntheticLambda0(0);

    @NonNull
    private static String createKey(@NonNull String str, @NonNull String str2) {
        return a$$ExternalSyntheticOutline0.m$1(str, "|", str2);
    }

    private double getSampleRate(@NonNull String str) {
        Map<String, Double> map = METRICS_TO_SAMPLE_RATE;
        if (map.containsKey(str)) {
            return map.get(str).doubleValue();
        }
        return 2.0d;
    }

    @NonNull
    private static Map<String, Double> initMapSampleRate() {
        HashMap hashMap = new HashMap();
        putInMap(hashMap, "AlexaDeviceBackgroundImageModule", "InitializingUploadBundle_AUTOSAVE_APP_LAUNCH", 0.01d);
        putInMap(hashMap, "AlexaDeviceBackgroundImageModule", "InitializingUploadBundle_AUTOSAVE_FEATURE_UPDATE", 0.01d);
        putInMap(hashMap, "AlexaDeviceBackgroundImageModule", PhotosMetricsConstants.USER_IDENTITY_CHANGED_SIGN_IN, 0.01d);
        putInMap(hashMap, "AlexaDeviceBackgroundImageModule", PhotosMetricsConstants.USER_WEBLAB_TREATMENT_CHANGED, 0.01d);
        putInMap(hashMap, "AlexaDeviceBackgroundImageModule", "UserWeblabTreatmentChanged_AUTOSAVE", 0.01d);
        putInMap(hashMap, "AutosaveUploadRequestObserver", AutosaveMetricEvents.AUTOSAVE_UPLOAD_BLOCKED, 0.01d);
        putInMap(hashMap, "AutosaveUploadRequestObserver", AutosaveMetricEvents.AUTOSAVE_UPLOAD_STARTED, 0.1d);
        putInMap(hashMap, "AutosaveUploadRequestObserver", AutosaveMetricEvents.AUTOSAVE_UPLOAD_SUCCESS, 0.1d);
        putInMap(hashMap, "CDSMetrics", "OverallError", 0.1d);
        putInMap(hashMap, "CDSMetrics", "OverallErrorCDSExceptionCode403", 0.1d);
        putInMap(hashMap, "CDSMetrics", "OverallSuccess", 0.01d);
        putInMap(hashMap, "CDSMetrics", "getQuotaError", 0.1d);
        putInMap(hashMap, "CDSMetrics", "getQuotaErrorCDSExceptionCode403", 0.1d);
        putInMap(hashMap, "CDSMetrics", "getQuotaSuccess", 0.01d);
        putInMap(hashMap, CdsQuotaBlockerEvaluator.TAG, CdsMetrics.QUOTA_NEW_REQUEST_BLOCKED, 0.01d);
        putInMap(hashMap, CdsQuotaBlockerEvaluator.TAG, CdsMetrics.QUOTA_SUBSCRIPTION_REFRESH, 0.01d);
        putInMap(hashMap, CdsQuotaBlockerEvaluator.TAG, CdsMetrics.QUOTA_SUBSCRIPTION_REFRESH_FAILED, 0.1d);
        putInMap(hashMap, "ManualUploadRequestObse", PhotosMetricsConstants.UPLOAD_V2_REQUEST_OVER_QUOTA, 0.01d);
        putInMap(hashMap, "ManualUploadRequestObserver", PhotosMetricsConstants.UPLOAD_V2_PROGRESS_STARTED, 0.1d);
        putInMap(hashMap, "ManualUploadRequestObserver", PhotosMetricsConstants.UPLOAD_V2_REQUEST_ABANDONED, 0.01d);
        putInMap(hashMap, "ManualUploadRequestObserver", PhotosMetricsConstants.UPLOAD_V2_REQUEST_SUCCESS, 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.AddedScanBatchGetLocalTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.AddedScanBatchProcessTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.AddedScanFillBatchTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.DeletedScanCheckDeletedTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.DeletedScanDeleteTransactionTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.DeletedScanFetchOneBatchTime.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.DigestPhotoMd5Calculation.time", 0.01d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.DiscoveryItemCompletion.time", 0.01d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.OverallTime.time", 0.01d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.ScanAddedBatchComplete.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_BLOCKER_STATE_EVALUATION.time", 0.001d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME_FOR_ATTEMPT_0.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_HANDLED_REQUEST_TIME.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_HANDLED_REQUEST_TIME_FOR_ATTEMPT_0.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_REQUEST_TO_SUCCEEDED.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_SCHEDULING_COMPLETED_TIME.time", 0.001d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_SUCCEEDED_ON_ATTEMPT_1.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.UPLOAD_SUCCEEDED_SMALL.time", 0.1d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.getQuotaTime.time", 0.01d);
        putInMap(hashMap, "PhotosUploaderV2", "native.PhotosUploaderV2.postNodeTime.time", 0.1d);
        putInMap(hashMap, SchedulerWorker.TAG, UploadMetrics.UPLOAD_SCHEDULING_COMPLETED, 0.001d);
        putInMap(hashMap, "UploadBundleManager", PhotosMetricsConstants.HVA_UPLOAD_BUNDLE_ALREADY_PAUSED, 0.1d);
        putInMap(hashMap, "UploadBundleManager", PhotosMetricsConstants.HVA_UPLOAD_BUNDLE_ALREADY_RESUMED, 0.01d);
        putInMap(hashMap, "UploadBundleManager", PhotosMetricsConstants.HVA_UPLOAD_BUNDLE_PAUSED, 0.01d);
        putInMap(hashMap, "UploadBundleManager", PhotosMetricsConstants.HVA_UPLOAD_BUNDLE_RESUMED, 0.01d);
        putInMap(hashMap, "UploadCompleter", "UPLOAD_SUCCEEDED_SMALL", 0.1d);
        putInMap(hashMap, UploaderOperations.TAG, UploadMetrics.CLEAR_BLOCKER_CACHE, 0.01d);
        putInMap(hashMap, UploaderOperations.TAG, UploadMetrics.OVERRIDE_CANCELLED_UPLOAD_REQUEST, 0.01d);
        putInMap(hashMap, UploaderOperations.TAG, UploadMetrics.UPLOAD_CANCELLED, 0.01d);
        putInMap(hashMap, UploaderOperations.TAG, UploadMetrics.UPLOAD_PAUSED, 0.01d);
        putInMap(hashMap, UploaderOperations.TAG, UploadMetrics.UPLOAD_RESUMED, 0.01d);
        putInMap(hashMap, UploadWorker.TAG, UploadMetrics.BLOCKED_REQUEST_COUNT, 0.001d);
        putInMap(hashMap, UploadWorker.TAG, UploadMetrics.UNBLOCKED_REQUEST_COUNT, 0.001d);
        putInMap(hashMap, UploadWorker.TAG, UploadMetrics.UPLOAD_AVERAGE_ATTEMPTS_SUCCESS, 0.1d);
        putInMap(hashMap, UploadWorker.TAG, UploadMetrics.UPLOAD_FILE_RATE, 0.1d);
        putInMap(hashMap, UploadWorker.TAG, "UPLOAD_SIZE_CATEGORY_SUCCEEDED_BETWEEN_2MB_5MB", 0.1d);
        putInMap(hashMap, UploadWorker.TAG, "UPLOAD_SIZE_CATEGORY_SUCCEEDED_LESS_THAN_2MB", 0.1d);
        putInMap(hashMap, UploadWorker.TAG, "UPLOAD_SIZE_GROUP_CATEGORY_SUCCEEDED_SMALL_FILE", 0.1d);
        putInMap(hashMap, UploadWorker.TAG, "UPLOAD_SUCCEEDED", 0.1d);
        putInMap(hashMap, UploadWorker.TAG, "UPLOAD_SUCCEEDED_ON_ATTEMPT_1", 0.1d);
        putInMap(hashMap, "UrlConnectionUploader", "postNodeSuccess", 0.1d);
        putInMap(hashMap, AutosaveWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, BlockerEvaluatorWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, CancelAndRescheduleWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, CancelUploadsWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, ReevaluateWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, SchedulerWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        putInMap(hashMap, UploadWorker.TAG, "INJECT_SUCCEEDED", 1.0E-6d);
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$new$0() {
        return Double.valueOf(ThreadLocalRandom.current().nextDouble());
    }

    private static void putInMap(@NonNull Map<String, Double> map, @NonNull String str, @NonNull String str2, double d) {
        map.put(createKey(str, str2), Double.valueOf(d));
    }

    private boolean shouldAcceptRate(double d) {
        return this.randomDouble.get().doubleValue() < d;
    }

    @AnyThread
    public boolean shouldRecord(@NonNull String str, @NonNull MetricName metricName) {
        double sampleRate = getSampleRate(createKey(str, metricName.getEventName()));
        if (sampleRate > 1.0d) {
            return true;
        }
        return shouldAcceptRate(sampleRate);
    }
}
