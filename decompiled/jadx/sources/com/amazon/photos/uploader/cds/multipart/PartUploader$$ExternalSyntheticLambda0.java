package com.amazon.photos.uploader.cds.multipart;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.cds.CdsMetrics;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class PartUploader$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PartUploader$$ExternalSyntheticLambda0(int i) {
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
        switch (this.$r8$classId) {
            case 0:
                str = CdsMetrics.PART_UPLOAD_EXCEPTION;
                return str;
            case 1:
                str2 = CdsMetrics.PART_UPLOAD_TIME_TAKEN;
                return str2;
            case 2:
                str3 = CdsMetrics.UPLOAD_REQUEST_CALLED_MULTIPLE_TIMES;
                return str3;
            case 3:
                str4 = CdsMetrics.UPLOAD_SUCCESS_RESPONSE_ON_FAIL_FLOW;
                return str4;
            case 4:
                str5 = CdsMetrics.UPLOAD_UNKNOWN_RESPONSE_ON_FAIL_FLOW;
                return str5;
            case 5:
                str6 = UploadMetrics.UPLOAD_REQUEST_CALLED_ON_EMPTY_PARTS;
                return str6;
            case 6:
                str7 = UploadMetrics.UPLOAD_REQUEST_CALLED_ON_EMPTY_PARTS;
                return str7;
            case 7:
                str8 = UploadMetrics.UPLOAD_PART_START_TIME;
                return str8;
            case 8:
                str9 = CdsMetrics.MULTIPART_VERIFICATION_EXCEPTION;
                return str9;
            case 9:
                str10 = CdsMetrics.MULTIPART_EXPIRY_EXCEPTION;
                return str10;
            default:
                str11 = CdsMetrics.DB_PART_UPLOAD_EXCEPTION;
                return str11;
        }
    }
}
