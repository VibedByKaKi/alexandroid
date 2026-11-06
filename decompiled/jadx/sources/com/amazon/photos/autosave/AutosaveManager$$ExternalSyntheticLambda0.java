package com.amazon.photos.autosave;

import com.amazon.alexa.photos.uploadV2.CdaSdkMetrics;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.autosave.internal.metrics.AutosaveMetricEvents;
import com.amazon.photos.autosave.internal.workers.BaseWorker;
import com.amazon.photos.discovery.metrics.DiscoveryMetricsKt;
import com.amazon.photos.uploader.cds.CdsMetrics;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AutosaveManager$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AutosaveManager$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String str;
        String lambda$recordCallSuccess$1;
        String lambda$recordCallSuccess$3;
        String lambda$recordCallError$5;
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
        String componentsSetup$lambda$0;
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
        switch (this.$r8$classId) {
            case 0:
                str = AutosaveMetricEvents.REUPLOAD_RESOLVE_PATHS_FAILED;
                return str;
            case 1:
                lambda$recordCallSuccess$1 = CdaSdkMetrics.lambda$recordCallSuccess$1();
                return lambda$recordCallSuccess$1;
            case 2:
                lambda$recordCallSuccess$3 = CdaSdkMetrics.lambda$recordCallSuccess$3();
                return lambda$recordCallSuccess$3;
            case 3:
                lambda$recordCallError$5 = CdaSdkMetrics.lambda$recordCallError$5();
                return lambda$recordCallError$5;
            case 4:
                str2 = AutosaveMetricEvents.REUPLOAD_LOCAL_ITEMS_FAILED;
                return str2;
            case 5:
                str3 = AutosaveMetricEvents.AUTOSAVE_END_LATENCY_TIMER;
                return str3;
            case 6:
                str4 = AutosaveMetricEvents.AUTOSAVE_CONTENT_DEDUPE_LATENCY;
                return str4;
            case 7:
                str5 = AutosaveMetricEvents.AUTOSAVE_START_LATENCY_TIMER;
                return str5;
            case 8:
                str6 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_ABANDONED;
                return str6;
            case 9:
                str7 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_STARTED;
                return str7;
            case 10:
                str8 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_SUCCESS;
                return str8;
            case 11:
                str9 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_SUCCESS_MERGE;
                return str9;
            case 12:
                str10 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_BLOCKED;
                return str10;
            case 13:
                str11 = AutosaveMetricEvents.AUTOSAVE_UPLOAD_FAILED;
                return str11;
            case 14:
                str12 = AutosaveMetricEvents.AUTOSAVE_SET_PHOTO_CONTENT_DATE;
                return str12;
            case 15:
                str13 = AutosaveMetricEvents.AUTOSAVE_SET_VIDEO_CONTENT_DATE;
                return str13;
            case 16:
                str14 = AutosaveMetricEvents.FAMILY_VAULT_AUTOSAVE_ADDED;
                return str14;
            case 17:
                componentsSetup$lambda$0 = BaseWorker.componentsSetup$lambda$0();
                return componentsSetup$lambda$0;
            case 18:
                str15 = AutosaveMetricEvents.FOLDER_DELETED;
                return str15;
            case 19:
                str16 = DiscoveryMetricsKt.PARSE_RESOLUTION_FAILURE;
                return str16;
            case 20:
                str17 = DiscoveryMetricsKt.PARSE_RESOLUTION_FAILURE;
                return str17;
            case 21:
                str18 = UploadMetrics.TOO_MANY_REQUESTS_BACKOFF_APPLIED;
                return str18;
            case 22:
                str19 = UploadMetrics.MAX_BACKOFF_WEAK_OR_METERED_CONNECTION_APPLIED;
                return str19;
            case 23:
                str20 = UploadMetrics.MAX_BACKOFF_APPLIED;
                return str20;
            case 24:
                str21 = UploadMetrics.EXPONENTIAL_BACKOFF_APPLIED;
                return str21;
            case 25:
                str22 = UploadMetrics.AVERAGE_BACKOFF_TIER_ON_CLEAR;
                return str22;
            case 26:
                str23 = UploadMetrics.UNAUTHORIZED_ERROR_SET_BLOCKER;
                return str23;
            case 27:
                str24 = UploadMetrics.UNAUTHORIZED_ACCESS_BLOCKER;
                return str24;
            case 28:
                str25 = UploadMetrics.CLEAR_BLOCKER_CACHE;
                return str25;
            default:
                str26 = CdsMetrics.MORE_THAN_ONE_NODE_FOR_NODE_ID;
                return str26;
        }
    }
}
