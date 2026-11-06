package com.amazon.photos.uploader;

import com.amazon.alexa.photos.metrics.CloudDriveMetrics;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.autosave.internal.metrics.MetricsHelper;
import com.amazon.photos.autosave.internal.upload.UploadHelper;
import com.amazon.photos.discovery.internal.server.MetricsServiceApi;
import com.amazon.photos.discovery.internal.worker.WorkerUtilKt;
import com.amazon.photos.uploader.cds.CdsSinglePartMetadataUploader;
import com.amazon.photos.uploader.cds.CdsSinglePartUploader;
import com.amazon.photos.uploader.cds.UrlConnectionUploader;
import com.amazon.photos.uploader.cds.error.CdsUploadErrorResolver;
import com.amazon.photos.uploader.cds.error.CdsUploadPartErrorResolver;
import com.amazon.photos.uploader.cds.multipart.CdsMultiPartUploader;
import com.amazon.photos.uploader.cds.multipart.MultipartUploadInitiator;
import com.amazon.photos.uploader.cds.quota.CdsQuotaBlockerEvaluator;
import com.amazon.photos.uploader.internal.workers.UploadWorker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadCompleter$$ExternalSyntheticLambda1 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UploadCompleter$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String reportMetrics$lambda$1;
        String lambda$recordEvent$0;
        String logMetricWithTimer$lambda$1;
        String logMetricWithCountAndTimer$lambda$2;
        String logMetricWithCountAndTimer$lambda$3;
        String logMetricWithCount$lambda$0;
        String tryOperation$lambda$17;
        String recordAndResetCallMetrics$lambda$0;
        String recordAbortErrorAndFailWorker$lambda$0;
        String reportMetrics$lambda$2;
        String logMetricWithCount$lambda$35;
        String recordErrorMetric$lambda$9;
        String recordErrorMetric$lambda$7;
        String recordUnknownErrorMetric$lambda$12;
        String recordCallSuccess$lambda$7;
        String recordCallSuccess$lambda$8;
        String recordErrorMetric$lambda$92;
        String uploadResponseFailure$lambda$2$lambda$1;
        String resolve$lambda$0;
        String uploadPartResponseFailure$lambda$2$lambda$1;
        String handleAcceptableException$lambda$1;
        String handleUploadRequestException$lambda$0;
        String onUploadFailed$lambda$6;
        String onUploadFailed$lambda$8;
        String logErrorMetric$lambda$34;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                reportMetrics$lambda$1 = UploadCompleter.reportMetrics$lambda$1(str);
                return reportMetrics$lambda$1;
            case 1:
                lambda$recordEvent$0 = CloudDriveMetrics.lambda$recordEvent$0(str);
                return lambda$recordEvent$0;
            case 2:
                logMetricWithTimer$lambda$1 = MetricsHelper.logMetricWithTimer$lambda$1(str);
                return logMetricWithTimer$lambda$1;
            case 3:
                logMetricWithCountAndTimer$lambda$2 = MetricsHelper.logMetricWithCountAndTimer$lambda$2(str);
                return logMetricWithCountAndTimer$lambda$2;
            case 4:
                logMetricWithCountAndTimer$lambda$3 = MetricsHelper.logMetricWithCountAndTimer$lambda$3(str);
                return logMetricWithCountAndTimer$lambda$3;
            case 5:
                logMetricWithCount$lambda$0 = MetricsHelper.logMetricWithCount$lambda$0(str);
                return logMetricWithCount$lambda$0;
            case 6:
                tryOperation$lambda$17 = UploadHelper.tryOperation$lambda$17(str);
                return tryOperation$lambda$17;
            case 7:
                recordAndResetCallMetrics$lambda$0 = MetricsServiceApi.recordAndResetCallMetrics$lambda$0(str);
                return recordAndResetCallMetrics$lambda$0;
            case 8:
                recordAbortErrorAndFailWorker$lambda$0 = WorkerUtilKt.recordAbortErrorAndFailWorker$lambda$0(str);
                return recordAbortErrorAndFailWorker$lambda$0;
            case 9:
                reportMetrics$lambda$2 = UploadCompleter.reportMetrics$lambda$2(str);
                return reportMetrics$lambda$2;
            case 10:
                logMetricWithCount$lambda$35 = UploaderOperations.logMetricWithCount$lambda$35(str);
                return logMetricWithCount$lambda$35;
            case 11:
                recordErrorMetric$lambda$9 = CdsSinglePartMetadataUploader.recordErrorMetric$lambda$9(str);
                return recordErrorMetric$lambda$9;
            case 12:
                recordErrorMetric$lambda$7 = CdsSinglePartUploader.recordErrorMetric$lambda$7(str);
                return recordErrorMetric$lambda$7;
            case 13:
                recordUnknownErrorMetric$lambda$12 = UrlConnectionUploader.recordUnknownErrorMetric$lambda$12(str);
                return recordUnknownErrorMetric$lambda$12;
            case 14:
                recordCallSuccess$lambda$7 = UrlConnectionUploader.recordCallSuccess$lambda$7(str);
                return recordCallSuccess$lambda$7;
            case 15:
                recordCallSuccess$lambda$8 = UrlConnectionUploader.recordCallSuccess$lambda$8(str);
                return recordCallSuccess$lambda$8;
            case 16:
                recordErrorMetric$lambda$92 = UrlConnectionUploader.recordErrorMetric$lambda$9(str);
                return recordErrorMetric$lambda$92;
            case 17:
                uploadResponseFailure$lambda$2$lambda$1 = CdsUploadErrorResolver.uploadResponseFailure$lambda$2$lambda$1(str);
                return uploadResponseFailure$lambda$2$lambda$1;
            case 18:
                resolve$lambda$0 = CdsUploadPartErrorResolver.resolve$lambda$0(str);
                return resolve$lambda$0;
            case 19:
                uploadPartResponseFailure$lambda$2$lambda$1 = CdsUploadPartErrorResolver.uploadPartResponseFailure$lambda$2$lambda$1(str);
                return uploadPartResponseFailure$lambda$2$lambda$1;
            case 20:
                return CdsMultiPartUploader.recordErrorMetric$lambda$3(str);
            case 21:
                handleAcceptableException$lambda$1 = MultipartUploadInitiator.handleAcceptableException$lambda$1(str);
                return handleAcceptableException$lambda$1;
            case 22:
                handleUploadRequestException$lambda$0 = MultipartUploadInitiator.handleUploadRequestException$lambda$0(str);
                return handleUploadRequestException$lambda$0;
            case 23:
                onUploadFailed$lambda$6 = CdsQuotaBlockerEvaluator.onUploadFailed$lambda$6(str);
                return onUploadFailed$lambda$6;
            case 24:
                onUploadFailed$lambda$8 = CdsQuotaBlockerEvaluator.onUploadFailed$lambda$8(str);
                return onUploadFailed$lambda$8;
            default:
                logErrorMetric$lambda$34 = UploadWorker.logErrorMetric$lambda$34(str);
                return logErrorMetric$lambda$34;
        }
    }
}
