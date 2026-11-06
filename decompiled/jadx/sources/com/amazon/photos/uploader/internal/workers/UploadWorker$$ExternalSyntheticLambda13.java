package com.amazon.photos.uploader.internal.workers;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.FileSizeCategoryProvider;
import com.amazon.photos.uploader.cds.error.CdsConflictResolverImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadWorker$$ExternalSyntheticLambda13 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileSizeCategoryProvider.FileSizeCategory f$0;

    public /* synthetic */ UploadWorker$$ExternalSyntheticLambda13(FileSizeCategoryProvider.FileSizeCategory fileSizeCategory, int i) {
        this.$r8$classId = i;
        this.f$0 = fileSizeCategory;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String handleSuccessfulUpload$lambda$17;
        String resolveNodeConflict$lambda$2;
        String resolveNodeConflict$lambda$3;
        String resolveNodeConflict$lambda$6;
        String resolveNodeConflict$lambda$7;
        String handleSuccessfulUpload$lambda$18;
        String handleFailedUpload$lambda$23;
        String handleFailedUpload$lambda$24;
        int i = this.$r8$classId;
        FileSizeCategoryProvider.FileSizeCategory fileSizeCategory = this.f$0;
        switch (i) {
            case 0:
                handleSuccessfulUpload$lambda$17 = UploadWorker.handleSuccessfulUpload$lambda$17(fileSizeCategory);
                return handleSuccessfulUpload$lambda$17;
            case 1:
                resolveNodeConflict$lambda$2 = CdsConflictResolverImpl.resolveNodeConflict$lambda$2(fileSizeCategory);
                return resolveNodeConflict$lambda$2;
            case 2:
                resolveNodeConflict$lambda$3 = CdsConflictResolverImpl.resolveNodeConflict$lambda$3(fileSizeCategory);
                return resolveNodeConflict$lambda$3;
            case 3:
                resolveNodeConflict$lambda$6 = CdsConflictResolverImpl.resolveNodeConflict$lambda$6(fileSizeCategory);
                return resolveNodeConflict$lambda$6;
            case 4:
                resolveNodeConflict$lambda$7 = CdsConflictResolverImpl.resolveNodeConflict$lambda$7(fileSizeCategory);
                return resolveNodeConflict$lambda$7;
            case 5:
                handleSuccessfulUpload$lambda$18 = UploadWorker.handleSuccessfulUpload$lambda$18(fileSizeCategory);
                return handleSuccessfulUpload$lambda$18;
            case 6:
                handleFailedUpload$lambda$23 = UploadWorker.handleFailedUpload$lambda$23(fileSizeCategory);
                return handleFailedUpload$lambda$23;
            default:
                handleFailedUpload$lambda$24 = UploadWorker.handleFailedUpload$lambda$24(fileSizeCategory);
                return handleFailedUpload$lambda$24;
        }
    }
}
