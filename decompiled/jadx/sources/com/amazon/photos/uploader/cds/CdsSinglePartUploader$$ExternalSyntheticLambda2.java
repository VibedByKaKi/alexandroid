package com.amazon.photos.uploader.cds;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.cds.multipart.CdsMultiPartUploader;
import com.amazon.photos.uploader.internal.workers.UploadWorker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsSinglePartUploader$$ExternalSyntheticLambda2 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CdsSinglePartUploader$$ExternalSyntheticLambda2(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordErrorMetric$lambda$8;
        String recordErrorMetric$lambda$4;
        String logErrorMetric$lambda$35;
        switch (this.$r8$classId) {
            case 0:
                recordErrorMetric$lambda$8 = CdsSinglePartUploader.recordErrorMetric$lambda$8(this.f$0, this.f$1);
                return recordErrorMetric$lambda$8;
            case 1:
                return CdsSinglePartMetadataUploader.recordErrorMetric$lambda$10(this.f$0, this.f$1);
            case 2:
                recordErrorMetric$lambda$4 = CdsMultiPartUploader.recordErrorMetric$lambda$4(this.f$0, this.f$1);
                return recordErrorMetric$lambda$4;
            default:
                logErrorMetric$lambda$35 = UploadWorker.logErrorMetric$lambda$35(this.f$0, this.f$1);
                return logErrorMetric$lambda$35;
        }
    }
}
