package com.amazon.photos.uploader;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploaderOperations$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UploaderOperations$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        switch (this.$r8$classId) {
            case 0:
                str = UploadMetrics.OVERRIDE_CANCELLED_UPLOAD_REQUEST;
                return str;
            case 1:
                str2 = UploadMetrics.BACKOFF_CLEARED;
                return str2;
            case 2:
                str3 = UploadMetrics.CLEAR_BLOCKER_CACHE;
                return str3;
            case 3:
                str4 = UploadMetrics.UPLOAD_PAUSED;
                return str4;
            case 4:
                str5 = UploadMetrics.UPLOAD_RESUMED;
                return str5;
            case 5:
                str6 = UploadMetrics.OVERRIDE_SUCCEEDED_UPLOAD_REQUEST;
                return str6;
            case 6:
                str7 = UploadMetrics.UPLOAD_REQUEST_CANCEL_EVENT;
                return str7;
            case 7:
                str8 = UploadMetrics.UPLOAD_REQUEST_CANCEL_COUNT;
                return str8;
            case 8:
                str9 = UploadMetrics.UPLOAD_REQUEST_CANCEL_TIMER;
                return str9;
            default:
                str10 = UploadMetrics.UPLOAD_REQUEST_CANCEL_TIMER_PER_ITEM;
                return str10;
        }
    }
}
