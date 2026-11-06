package com.amazon.photos.uploader.internal.workers;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class BaseWorker$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BaseWorker$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String componentsSetup$lambda$0;
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
        String str11;
        String str12;
        String handleSuccessfulUpload$lambda$16;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        switch (this.$r8$classId) {
            case 0:
                componentsSetup$lambda$0 = BaseWorker.componentsSetup$lambda$0();
                return componentsSetup$lambda$0;
            case 1:
                str = UploadMetrics.BAIL_UPLOAD_REQUEST_NOT_FOUND;
                return str;
            case 2:
                str2 = UploadMetrics.BAIL_UPLOAD_ACCOUNT_NOT_LOGIN;
                return str2;
            case 3:
                str3 = UploadMetrics.BLOCKED_REQUEST_COUNT;
                return str3;
            case 4:
                str4 = UploadMetrics.UPLOAD_BLOCKER_STATE_EVALUATION;
                return str4;
            case 5:
                str5 = UploadMetrics.UNBLOCKED_REQUEST_COUNT;
                return str5;
            case 6:
                str6 = UploadMetrics.UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME;
                return str6;
            case 7:
                str7 = UploadMetrics.UPLOAD_SCHEDULING_COMPLETED;
                return str7;
            case 8:
                str8 = UploadMetrics.UPLOAD_SCHEDULING_COMPLETED_TIME;
                return str8;
            case 9:
                str9 = UploadMetrics.UPLOAD_SCHEDULING_INTERRUPTED;
                return str9;
            case 10:
                str10 = UploadMetrics.UPLOAD_SCHEDULING_INTERRUPTED_TIME;
                return str10;
            case 11:
                str11 = UploadMetrics.BAIL_UPLOAD_REQUEST_CANCELLED;
                return str11;
            case 12:
                str12 = UploadMetrics.UPLOAD_REQUESTED_TO_SUCCEEDED;
                return str12;
            case 13:
                handleSuccessfulUpload$lambda$16 = UploadWorker.handleSuccessfulUpload$lambda$16();
                return handleSuccessfulUpload$lambda$16;
            case 14:
                str13 = UploadMetrics.UPLOAD_AVERAGE_ATTEMPTS_SUCCESS;
                return str13;
            case 15:
                str14 = UploadMetrics.UPLOAD_FILE_RATE;
                return str14;
            case 16:
                str15 = UploadMetrics.UNKNOWN_RESPONSE;
                return str15;
            case 17:
                str16 = UploadMetrics.ALL_DIGESTS_COMPUTED;
                return str16;
            case 18:
                str17 = UploadMetrics.UPLOAD_ABANDONED;
                return str17;
            case 19:
                str18 = UploadMetrics.MD5_COMPUTED;
                return str18;
            case 20:
                str19 = UploadMetrics.VISUAL_DIGEST_COMPUTE_EXCEPTION;
                return str19;
            case 21:
                str20 = UploadMetrics.UPLOAD_BLOCKED_UNKNOWN_REASON;
                return str20;
            case 22:
                str21 = UploadMetrics.UPLOAD_BLOCKED;
                return str21;
            case 23:
                str22 = UploadMetrics.ABANDONED_SOCKET_TIME_OUT_EXCEPTION;
                return str22;
            case 24:
                str23 = UploadMetrics.UPLOAD_STARTED_REQUEST_TIME;
                return str23;
            case 25:
                str24 = UploadMetrics.UPLOAD_AVERAGE_ATTEMPTS_ABANDONED;
                return str24;
            default:
                str25 = UploadMetrics.UPLOAD_NOT_ABANDONED;
                return str25;
        }
    }
}
