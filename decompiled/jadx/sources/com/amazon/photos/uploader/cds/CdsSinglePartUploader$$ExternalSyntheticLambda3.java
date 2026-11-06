package com.amazon.photos.uploader.cds;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.cds.multipart.CdsMultiPartUploader;
import com.amazon.photos.uploader.internal.workers.UploadWorker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsSinglePartUploader$$ExternalSyntheticLambda3 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Throwable f$1;

    public /* synthetic */ CdsSinglePartUploader$$ExternalSyntheticLambda3(String str, Throwable th, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = th;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordErrorMetric$lambda$11;
        String logErrorMetric$lambda$36;
        switch (this.$r8$classId) {
            case 0:
                return CdsSinglePartUploader.recordErrorMetric$lambda$9(this.f$0, this.f$1);
            case 1:
                recordErrorMetric$lambda$11 = CdsSinglePartMetadataUploader.recordErrorMetric$lambda$11(this.f$0, this.f$1);
                return recordErrorMetric$lambda$11;
            case 2:
                return CdsMultiPartUploader.recordErrorMetric$lambda$5(this.f$0, this.f$1);
            default:
                logErrorMetric$lambda$36 = UploadWorker.logErrorMetric$lambda$36(this.f$0, this.f$1);
                return logErrorMetric$lambda$36;
        }
    }
}
