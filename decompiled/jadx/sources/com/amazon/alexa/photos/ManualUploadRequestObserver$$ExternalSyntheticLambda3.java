package com.amazon.alexa.photos;

import com.amazon.alexa.photos.metrics.PhotosMetricsConstants;
import com.amazon.clouddrive.android.core.interfaces.MetricName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ManualUploadRequestObserver$$ExternalSyntheticLambda3 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ManualUploadRequestObserver$$ExternalSyntheticLambda3(int i) {
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
        switch (this.$r8$classId) {
            case 0:
                str = PhotosMetricsConstants.MAKE_UPLOAD_LONG_RUNNING_FAILED_NO_UPLOAD_BUNDLE;
                return str;
            case 1:
                str2 = PhotosMetricsConstants.UPLOAD_BLOCKED_PAUSED;
                return str2;
            case 2:
                str3 = PhotosMetricsConstants.MAKE_UPLOAD_LONG_RUNNING_FAILED_NO_NOTIFICATION_MANAGER;
                return str3;
            case 3:
                str4 = PhotosMetricsConstants.UPLOAD_BLOCKED_LOW_BATTERY;
                return str4;
            case 4:
                str5 = PhotosMetricsConstants.UPLOAD_V2_PROGRESS_STARTED;
                return str5;
            case 5:
                str6 = PhotosMetricsConstants.LIST_ALBUM_TIME;
                return str6;
            default:
                str7 = PhotosMetricsConstants.ALBUM_NODE_NOT_FOUND;
                return str7;
        }
    }
}
