package com.amazon.photos.uploader.cds;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsUploader$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CdsUploader$$ExternalSyntheticLambda0(int i) {
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
        String str11;
        String str12;
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
                str = CdsMetrics.EXTERNAL_INTERRUPTION;
                return str;
            case 1:
                str2 = CdsMetrics.CREATE_NODE_CONFLICT_EXCEPTION;
                return str2;
            case 2:
                str3 = CdsMetrics.CREATE_NODE_CONFLICT_EXCEPTION_NO_NODE_ID;
                return str3;
            case 3:
                str4 = CdsMetrics.CREATE_NODE_EXCEPTION;
                return str4;
            case 4:
                str5 = CdsMetrics.UPLOAD_POST_NODE_CLOUD_DRIVE_EXCEPTION;
                return str5;
            case 5:
                str6 = CdsMetrics.UPLOAD_POST_NODE_CLOUD_DRIVE_EXCEPTION;
                return str6;
            case 6:
                return UrlConnectionUploader.parseServiceError$lambda$13();
            case 7:
                return UrlConnectionUploader.parseErrorStream$lambda$15$lambda$14();
            case 8:
                str7 = CdsMetrics.CONFLICT_RESOLUTION_CANNOT_RESOLVE_JPEG;
                return str7;
            case 9:
                str8 = CdsMetrics.CONFLICT_RESOLUTION_RENAME_AND_RETRY;
                return str8;
            case 10:
                str9 = CdsMetrics.CONFLICT_RESOLUTION_CANNOT_RESOLVE;
                return str9;
            case 11:
                str10 = CdsMetrics.CONFLICT_RESOLUTION_MERGE_WITH_CLOUD_MD5;
                return str10;
            case 12:
                str11 = CdsMetrics.CONFLICT_RESOLUTION_MERGE_WITH_CLOUD_VD;
                return str11;
            case 13:
                str12 = CdsMetrics.QUOTA_NEW_REQUEST_BLOCKED;
                return str12;
            case 14:
                str13 = CdsMetrics.UPLOADER_QUOTA_FAILED_UNEXPECTED;
                return str13;
            case 15:
                str14 = CdsMetrics.UPLOADER_QUOTA_FAILED_REPORT_ERROR;
                return str14;
            case 16:
                str15 = CdsMetrics.QUOTA_RESPONSE_BAD_DATE;
                return str15;
            case 17:
                str16 = CdsMetrics.UPLOADER_QUOTA_BLOCKED_UNEXPECTED;
                return str16;
            case 18:
                str17 = CdsMetrics.UPLOADER_QUOTA_BLOCKED_FIXED;
                return str17;
            case 19:
                str18 = CdsMetrics.UPLOADER_QUOTA_BLOCKED_FIX_ERROR;
                return str18;
            case 20:
                str19 = CdsMetrics.QUOTA_SUBSCRIPTION_REFRESH;
                return str19;
            case 21:
                str20 = CdsMetrics.QUOTA_SUBSCRIPTION_REFRESH_FAILED;
                return str20;
            case 22:
                str21 = UploadMetrics.PART_MD5_COMPUTE_EXCEPTION;
                return str21;
            case 23:
                str22 = UploadMetrics.PART_MD5_COMPUTE_EXCEPTION;
                return str22;
            case 24:
                str23 = UploadMetrics.VISUAL_DIGEST_COMPUTE_EXCEPTION;
                return str23;
            case 25:
                str24 = UploadMetrics.MD5_COMPUTE_EXCEPTION;
                return str24;
            default:
                str25 = UploadMetrics.MD5_COMPUTE_EXCEPTION;
                return str25;
        }
    }
}
