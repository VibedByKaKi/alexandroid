package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsServiceHolder;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class KotaMetricsHelper {
    private KotaMetricsHelper() {
    }

    public static void recordFirmwareDownloadSuccess(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.FIRMWARE_DOWNLOAD_SUCCESS, str, z, (Map) null);
    }

    public static void recordJobActivatedSuccess(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.JOB_ACTIVATED_SUCCESS, str, z, (Map) null);
    }

    public static void recordJobScheduledSuccess(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.DOWNLOAD_JOB_SCHEDULED_SUCCESS, str, z, (Map) null);
    }

    public static void recordPreparedCheckForUpdateRequest(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.PREPARE_DFU_CHECK_UPDATE, str, z, (Map) null);
    }

    public static void recordUpdateCheckError(Throwable th, String str) {
        AccessoryMetricsServiceHolder.getInstance().get().recordCriticalEvent(MetricsConstants.Kota.UPDATE_CHECK_ERROR, MetricsConstants.Kota.UPDATE_CHECK_ERROR, str, th);
    }

    public static void recordUpdateCheckSuccess(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.UPDATE_CHECK_SUCCESS, str, z, (Map) null);
    }

    public static void recordUserRetrievedForOtaGroupNameQuery(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.USER_RETRIEVED_FOR_OTA_GROUP_NAME_QUERY, str, z, (Map) null);
    }

    public static void recordUserRetrievedForUpdateCheck(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.Kota.USER_RETRIEVED_FOR_DFU_CHECK_UPDATE, str, z, (Map) null);
    }
}
