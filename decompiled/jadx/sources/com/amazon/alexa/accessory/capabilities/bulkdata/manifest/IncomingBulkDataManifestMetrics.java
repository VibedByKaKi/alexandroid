package com.amazon.alexa.accessory.capabilities.bulkdata.manifest;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.capabilities.bulkdata.BulkDataMetricsReporter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class IncomingBulkDataManifestMetrics {
    private final String deviceType;
    private long startTime = 0;

    public IncomingBulkDataManifestMetrics(@Nullable String str) {
        this.deviceType = str;
    }

    private void recordCompletionMetrics(boolean z) {
        String str = this.deviceType;
        if (str == null) {
            return;
        }
        BulkDataMetricsReporter.recordIncomingManifest(z, str);
        if (this.startTime == 0) {
            return;
        }
        BulkDataMetricsReporter.recordIncomingManifestTime(System.currentTimeMillis() - this.startTime, this.deviceType);
    }

    public void onError() {
        recordCompletionMetrics(false);
    }

    public void onStart() {
        this.startTime = System.currentTimeMillis();
    }

    public void onSuccess() {
        recordCompletionMetrics(true);
    }
}
