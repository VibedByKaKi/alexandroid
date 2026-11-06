package com.amazon.whisperjoin.deviceprovisioningservice.metrics;

import com.amazon.whisperjoin.metrics.MinervaMetricsRecorder;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorderProvider;
import com.amazon.whisperjoin.metrics.WhisperJoinMetricSourceName;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AutoDiscoveryMetricsRecorder {
    private final MinervaMetricsRecorder mMinervaRecorder;
    private AtomicInteger mControlledSetupReportSize = new AtomicInteger();
    private AtomicInteger mDevicesIneligibleForAutomatedSetupReportSize = new AtomicInteger();
    private AtomicInteger mRecentlySetupDevicesReportSize = new AtomicInteger();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AutoDiscoveryMetric {
        private static final String CLIENT_SETUP_STATUS_REQUEST_COUNT = "FFSAutoDiscoveryClientSetupStatusRequestCount";
        private static final String CONTROLLED_SETUP_DEVICE_COUNT = "FFSAutoDiscoveryControlledSetupDeviceCount";
        private static final String FAILURE_REPORT_COUNT = "FFSAutoDiscoveryFailureReportCount";
        private static final String INELIGIBLE_FOR_AUTOMATED_SETUP_DEVICE_COUNT = "FFSAutoDiscoveryIneligibleForAutomatedSetupDeviceCount";
        private static final String PREFIX = "FFSAutoDiscovery";
        private static final String RECENTLY_SETUP_DEVICE_COUNT = "FFSAutoDiscoveryRecentlySetupDeviceCount";
        private static final String SCAN_TOTAL_MILLIS = "FFSAutoDiscoveryUptimeTotalMillis";
        private static final String START_COUNT = "FFSAutoDiscoveryStartCount";

        private AutoDiscoveryMetric() {
        }
    }

    public AutoDiscoveryMetricsRecorder(MinervaMetricsRecorderProvider minervaMetricsRecorderProvider) {
        MinervaMetricsRecorder metricsRecorder = minervaMetricsRecorderProvider.getMetricsRecorder(WhisperJoinMetricSourceName.FFS_PROVISIONING_SERVICE_SCHEMA_ID);
        this.mMinervaRecorder = metricsRecorder;
        metricsRecorder.addAnonymousIdentity();
    }

    private void ratchetValueUp(AtomicInteger atomicInteger, int i) {
        boolean z;
        do {
            int i2 = atomicInteger.get();
            z = i2 >= i;
            if (!z) {
                z = atomicInteger.compareAndSet(i2, i);
            }
        } while (!z);
    }

    public void onAutoDiscoveryStart() {
        this.mMinervaRecorder.incrementCounter("FFSAutoDiscoveryStartCount");
        this.mMinervaRecorder.startTimer("FFSAutoDiscoveryUptimeTotalMillis");
    }

    public void onAutoDiscoveryStop() {
        this.mMinervaRecorder.stopTimer("FFSAutoDiscoveryUptimeTotalMillis");
    }

    public void onControlledSetupReport(int i) {
        ratchetValueUp(this.mControlledSetupReportSize, i);
    }

    public void onDestroy() {
        this.mMinervaRecorder.recordCounter("FFSAutoDiscoveryControlledSetupDeviceCount", this.mControlledSetupReportSize.get());
        this.mMinervaRecorder.recordCounter("FFSAutoDiscoveryIneligibleForAutomatedSetupDeviceCount", this.mDevicesIneligibleForAutomatedSetupReportSize.get());
        this.mMinervaRecorder.recordCounter("FFSAutoDiscoveryRecentlySetupDeviceCount", this.mRecentlySetupDevicesReportSize.get());
        this.mMinervaRecorder.close();
    }

    public void onDevicesIneligibleForAutomatedSetupReport(int i) {
        ratchetValueUp(this.mDevicesIneligibleForAutomatedSetupReportSize, i);
    }

    public void onFailureReport() {
        this.mMinervaRecorder.incrementCounter("FFSAutoDiscoveryFailureReportCount");
    }

    public void onGetCustomerProvisioneesSetupStatus() {
        this.mMinervaRecorder.incrementCounter("FFSAutoDiscoveryClientSetupStatusRequestCount");
    }

    public void onRecentlySetupDevicesReport(int i) {
        ratchetValueUp(this.mRecentlySetupDevicesReportSize, i);
    }
}
