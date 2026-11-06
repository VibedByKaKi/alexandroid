package com.amazon.alexa.accessory.capabilities.bulkdata;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsServiceHolder;
import com.amazon.alexa.accessory.metrics.MetricsConstants;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BulkDataMetricsReporter {
    private BulkDataMetricsReporter() {
    }

    public static void recordIncomingManifest(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.BulkData.INCOMING_MANIFEST_SUCCESS, str, z, (Map) null);
    }

    public static void recordIncomingManifestTime(long j, String str) {
        AccessoryMetricsServiceHolder.getInstance().get().recordCounter(MetricsConstants.BulkData.INCOMING_MANIFEST_TIME, str, new Long(j).doubleValue(), null);
    }

    public static void recordIncomingTransfer(boolean z, String str) {
        Automotive$$ExternalSyntheticOutline0.m(MetricsConstants.BulkData.INCOMING_TRANSFER_SUCCESS, str, z, (Map) null);
    }

    public static void recordIncomingTransferTime(long j, String str) {
        AccessoryMetricsServiceHolder.getInstance().get().recordCounter(MetricsConstants.BulkData.INCOMING_TRANSFER_TIME, str, new Long(j).doubleValue(), null);
    }
}
