package com.amazon.photos.uploader.cds;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.clouddrive.cdasdk.CloudDriveException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsSinglePartUploader$$ExternalSyntheticLambda6 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CloudDriveException f$0;

    public /* synthetic */ CdsSinglePartUploader$$ExternalSyntheticLambda6(CloudDriveException cloudDriveException, int i) {
        this.$r8$classId = i;
        this.f$0 = cloudDriveException;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String recordCloudDriveException$lambda$6;
        String recordCloudDriveException$lambda$8;
        int i = this.$r8$classId;
        CloudDriveException cloudDriveException = this.f$0;
        switch (i) {
            case 0:
                recordCloudDriveException$lambda$6 = CdsSinglePartUploader.recordCloudDriveException$lambda$6(cloudDriveException);
                return recordCloudDriveException$lambda$6;
            default:
                recordCloudDriveException$lambda$8 = CdsSinglePartMetadataUploader.recordCloudDriveException$lambda$8(cloudDriveException);
                return recordCloudDriveException$lambda$8;
        }
    }
}
