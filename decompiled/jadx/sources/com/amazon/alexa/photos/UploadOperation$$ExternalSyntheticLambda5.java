package com.amazon.alexa.photos;

import com.amazon.clouddrive.android.core.interfaces.MetricName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UploadOperation$$ExternalSyntheticLambda5 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UploadOperation$$ExternalSyntheticLambda5(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String lambda$recordDuration$10;
        String lambda$recordErrorMetrics$0;
        String lambda$recordDuration$1;
        String lambda$listNodes$4;
        String lambda$listNodes$5;
        String lambda$listNodes$6;
        String lambda$recordListNodesCount$7;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$recordDuration$10 = UploadOperation.lambda$recordDuration$10(str);
                return lambda$recordDuration$10;
            case 1:
                lambda$recordErrorMetrics$0 = CdsRequestHelper.lambda$recordErrorMetrics$0(str);
                return lambda$recordErrorMetrics$0;
            case 2:
                lambda$recordDuration$1 = CdsRequestHelper.lambda$recordDuration$1(str);
                return lambda$recordDuration$1;
            case 3:
                lambda$listNodes$4 = CdsPhotosUploader.lambda$listNodes$4(str);
                return lambda$listNodes$4;
            case 4:
                lambda$listNodes$5 = CdsPhotosUploader.lambda$listNodes$5(str);
                return lambda$listNodes$5;
            case 5:
                lambda$listNodes$6 = CdsPhotosUploader.lambda$listNodes$6(str);
                return lambda$listNodes$6;
            case 6:
                lambda$recordListNodesCount$7 = CdsPhotosUploader.lambda$recordListNodesCount$7(str);
                return lambda$recordListNodesCount$7;
            default:
                return CdsRequestHelperV2.lambda$listNodeForRequest$4(str);
        }
    }
}
