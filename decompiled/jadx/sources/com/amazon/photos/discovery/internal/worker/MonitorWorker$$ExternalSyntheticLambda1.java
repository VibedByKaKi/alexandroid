package com.amazon.photos.discovery.internal.worker;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.internal.workers.UploadWorker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MonitorWorker$$ExternalSyntheticLambda1 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ MonitorWorker$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordStageComparison$lambda$10$lambda$9$lambda$8;
        String handleSuccessfulUpload$lambda$15;
        String handleSuccessfulUpload$lambda$19;
        String handleFailedUpload$lambda$21;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                recordStageComparison$lambda$10$lambda$9$lambda$8 = MonitorWorker.recordStageComparison$lambda$10$lambda$9$lambda$8(i2);
                return recordStageComparison$lambda$10$lambda$9$lambda$8;
            case 1:
                handleSuccessfulUpload$lambda$15 = UploadWorker.handleSuccessfulUpload$lambda$15(i2);
                return handleSuccessfulUpload$lambda$15;
            case 2:
                handleSuccessfulUpload$lambda$19 = UploadWorker.handleSuccessfulUpload$lambda$19(i2);
                return handleSuccessfulUpload$lambda$19;
            default:
                handleFailedUpload$lambda$21 = UploadWorker.handleFailedUpload$lambda$21(i2);
                return handleFailedUpload$lambda$21;
        }
    }
}
