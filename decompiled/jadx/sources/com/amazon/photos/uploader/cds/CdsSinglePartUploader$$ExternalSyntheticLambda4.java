package com.amazon.photos.uploader.cds;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.cds.multipart.CdsMultiPartUploader;
import com.amazon.photos.uploader.internal.workers.UploadWorker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsSinglePartUploader$$ExternalSyntheticLambda4 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ UploadErrorCategory f$1;

    public /* synthetic */ CdsSinglePartUploader$$ExternalSyntheticLambda4(String str, UploadErrorCategory uploadErrorCategory, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = uploadErrorCategory;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordErrorMetric$lambda$10;
        String recordErrorMetric$lambda$12;
        String recordErrorMetric$lambda$6;
        String logErrorMetric$lambda$37;
        switch (this.$r8$classId) {
            case 0:
                recordErrorMetric$lambda$10 = CdsSinglePartUploader.recordErrorMetric$lambda$10(this.f$0, this.f$1);
                return recordErrorMetric$lambda$10;
            case 1:
                recordErrorMetric$lambda$12 = CdsSinglePartMetadataUploader.recordErrorMetric$lambda$12(this.f$0, this.f$1);
                return recordErrorMetric$lambda$12;
            case 2:
                recordErrorMetric$lambda$6 = CdsMultiPartUploader.recordErrorMetric$lambda$6(this.f$0, this.f$1);
                return recordErrorMetric$lambda$6;
            default:
                logErrorMetric$lambda$37 = UploadWorker.logErrorMetric$lambda$37(this.f$0, this.f$1);
                return logErrorMetric$lambda$37;
        }
    }
}
