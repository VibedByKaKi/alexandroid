package com.amazon.alexa.photos;

import com.amazon.alexa.photos.metrics.PhotosMetricsConstants;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.cds.CdsMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UploadOperation$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UploadOperation$$ExternalSyntheticLambda0(int i) {
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
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        switch (this.$r8$classId) {
            case 0:
                str = PhotosMetricsConstants.FILE_NOT_FOUND_ERROR;
                return str;
            case 1:
                str2 = PhotosMetricsConstants.CLOUD_DRIVE_EXCEPTION;
                return str2;
            case 2:
                str3 = PhotosMetricsConstants.INTERRUPTED_EXCEPTION;
                return str3;
            case 3:
                str4 = PhotosMetricsConstants.INVALID_FILE_EXCEPTION;
                return str4;
            case 4:
                str5 = PhotosMetricsConstants.UPLOAD_FATAL_ERROR;
                return str5;
            case 5:
                str6 = PhotosMetricsConstants.ALBUM_MISSING_FOLDER_PROPERTY;
                return str6;
            case 6:
                str7 = PhotosMetricsConstants.ACCESSORY_ALBUM_CREATION_FAILED;
                return str7;
            case 7:
                str8 = PhotosMetricsConstants.ACCESSORY_ALBUM_SETUP_FAILED;
                return str8;
            case 8:
                str9 = CdsMetrics.CREATE_NODE_CONFLICT_EXCEPTION;
                return str9;
            case 9:
                str10 = CdsMetrics.CREATE_NODE_CONFLICT_EXCEPTION_NO_NODE_ID;
                return str10;
            case 10:
                str11 = CdsMetrics.CREATE_NODE_EXCEPTION;
                return str11;
            case 11:
                str12 = PhotosMetricsConstants.SEARCH_ACCESSORY_ALBUM_FAILED;
                return str12;
            case 12:
                str13 = PhotosMetricsConstants.UPLOAD_BLOCKED_NO_PERMISSIONS;
                return str13;
            case 13:
                str14 = PhotosMetricsConstants.UPLOAD_BLOCKED_NO_WIFI;
                return str14;
            case 14:
                str15 = PhotosMetricsConstants.UPLOAD_BLOCKED_NO_NETWORK;
                return str15;
            case 15:
                str16 = PhotosMetricsConstants.UPLOAD_V2_REQUEST_ABANDONED;
                return str16;
            case 16:
                str17 = PhotosMetricsConstants.MD5_CONFLICT_SUCCESSFULLY_ADDED_TO_ALBUM;
                return str17;
            case 17:
                str18 = PhotosMetricsConstants.MD5_CONFLICT_FAILED_TO_ADD_TO_ALBUM;
                return str18;
            case 18:
                str19 = PhotosMetricsConstants.UPLOAD_V2_REQUESTS_COMPLETED;
                return str19;
            case 19:
                str20 = PhotosMetricsConstants.UPLOAD_V2_REQUESTS_WITH_AUTOSAVE_COMPLETED;
                return str20;
            case 20:
                str21 = PhotosMetricsConstants.UPLOAD_V2_REQUEST_OVER_QUOTA;
                return str21;
            case 21:
                str22 = PhotosMetricsConstants.UPLOAD_V2_REQUEST_OVER_QUOTA;
                return str22;
            case 22:
                str23 = PhotosMetricsConstants.UPLOAD_NOTIFICATION_WITHOUT_AUTOSAVE;
                return str23;
            case 23:
                str24 = PhotosMetricsConstants.ADD_CHILD_TO_ALBUM;
                return str24;
            case 24:
                str25 = PhotosMetricsConstants.LIST_NODES_TIME;
                return str25;
            case 25:
                str26 = PhotosMetricsConstants.LIST_NODES_RESPONSE_COUNT_V2;
                return str26;
            case 26:
                str27 = PhotosMetricsConstants.FOLDER_NODE_NOT_FOUND;
                return str27;
            case 27:
                str28 = PhotosMetricsConstants.FOLDER_NODE_ID_NOT_FOUND;
                return str28;
            case 28:
                str29 = PhotosMetricsConstants.UPLOAD_V2_REQUEST_SUCCESS;
                return str29;
            default:
                str30 = PhotosMetricsConstants.UPLOAD_V2_REQUESTS_COMPLETED_WITHOUT_NODE;
                return str30;
        }
    }
}
