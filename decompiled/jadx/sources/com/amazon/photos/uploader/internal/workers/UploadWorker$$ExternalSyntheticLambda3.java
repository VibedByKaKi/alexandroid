package com.amazon.photos.uploader.internal.workers;

import androidx.work.WorkInfo;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.discovery.dedupe.stages.DigestCalculatorStage;
import com.amazon.photos.discovery.internal.model.ItemTypeCount;
import com.amazon.photos.discovery.internal.worker.MonitorWorker;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.cds.error.CdsUploadErrorResolver;
import com.amazon.photos.uploader.cds.error.UploadException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadWorker$$ExternalSyntheticLambda3 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UploadWorker$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordUploadStartMetrics$lambda$4;
        String recordExceptionMetricsForDigestCalculation$lambda$7;
        String recordLocalItemDataAnalysis$lambda$16$lambda$15$lambda$14;
        String recordWorkInfoMetrics$lambda$13$lambda$12;
        String resolve$lambda$0;
        String recordRequestDurationMetric$lambda$6;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                recordUploadStartMetrics$lambda$4 = UploadWorker.recordUploadStartMetrics$lambda$4((UploadWorker) obj);
                return recordUploadStartMetrics$lambda$4;
            case 1:
                recordExceptionMetricsForDigestCalculation$lambda$7 = DigestCalculatorStage.recordExceptionMetricsForDigestCalculation$lambda$7((Exception) obj);
                return recordExceptionMetricsForDigestCalculation$lambda$7;
            case 2:
                recordLocalItemDataAnalysis$lambda$16$lambda$15$lambda$14 = MonitorWorker.recordLocalItemDataAnalysis$lambda$16$lambda$15$lambda$14((ItemTypeCount) obj);
                return recordLocalItemDataAnalysis$lambda$16$lambda$15$lambda$14;
            case 3:
                recordWorkInfoMetrics$lambda$13$lambda$12 = MonitorWorker.recordWorkInfoMetrics$lambda$13$lambda$12((WorkInfo) obj);
                return recordWorkInfoMetrics$lambda$13$lambda$12;
            case 4:
                resolve$lambda$0 = CdsUploadErrorResolver.resolve$lambda$0((UploadException) obj);
                return resolve$lambda$0;
            default:
                recordRequestDurationMetric$lambda$6 = SchedulerWorker.recordRequestDurationMetric$lambda$6((UploadRequest) obj);
                return recordRequestDurationMetric$lambda$6;
        }
    }
}
