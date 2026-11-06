package com.amazon.photos.uploader.internal;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class QueueManagerImpl$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ QueueManagerImpl$$ExternalSyntheticLambda0(int i) {
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
        switch (this.$r8$classId) {
            case 0:
                str = UploadMetrics.QUEUE_PROPERTIES_CHANGED;
                return str;
            case 1:
                str2 = UploadMetrics.NOTIFY_WAIT_FOR_RUNNING_WORKER_TIMEOUT;
                return str2;
            case 2:
                str3 = UploadMetrics.NOTIFICATION_UPDATE_FAILED;
                return str3;
            case 3:
                str4 = UploadMetrics.QUEUE_NEW_ADDED_ALREADY_EXISTS;
                return str4;
            case 4:
                str5 = UploadMetrics.QUEUE_NEW_ADDED;
                return str5;
            default:
                str6 = UploadMetrics.QUEUE_PROPERTIES_UPDATE_FAILED;
                return str6;
        }
    }
}
