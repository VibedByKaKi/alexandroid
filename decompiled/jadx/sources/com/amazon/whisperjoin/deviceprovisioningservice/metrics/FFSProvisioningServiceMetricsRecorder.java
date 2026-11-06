package com.amazon.whisperjoin.deviceprovisioningservice.metrics;

import android.os.SystemClock;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorder;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorderProvider;
import com.amazon.whisperjoin.metrics.WhisperJoinMetricSourceName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FFSProvisioningServiceMetricsRecorder {
    private MinervaMetricsRecorder mMinervaRecorder;
    private final MinervaMetricsRecorderProvider mMinervaRecorderProvider;
    private long mSetupWorkflowStartTime = -1;
    private long mWorkflowStartTime = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FFSBattery {
        private static final String PERCENT_DROP_PER_HOUR_SERVICE_LIFETIME = "PercentDropPerHourServiceLifetime";
        private static final String PERCENT_DROP_PER_HOUR_USING_BATTERY = "PercentDropPerHourUsingBattery";
        private static final String PERCENT_DROP_PER_HOUR_USING_BATTERY_DOZE_ACTIVE = "PercentDropPerHourUsingBatteryDozeActive";
        private static final String PERCENT_DROP_PER_HOUR_USING_BATTERY_DOZE_INACTIVE = "PercentDropPerHourUsingBatteryDozeInactive";
        private static final String PREFIX = "FFSBattery";

        private FFSBattery() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FFSConstraintMetric {
        private static final String ALLOW_LISTED_COUNT = "FFSConstraintAllowListedCount";
        private static final String API_REQUIRES_LOCATION_PERMISSION_FOR_SCAN = "FFSConstraintApiRequiresLocationPermissionForScan";
        private static final String BLUETOOTH_ENABLED_AT_START_COUNT = "FFSConstraintBluetoothEnabledAtStartCount";
        private static final String PERMISSION_APP_LOCATION_ENABLED_COUNT = "FFSConstraintAppLocationEnabledCount";
        private static final String PERMISSION_SYSTEM_LOCATION_ENABLED_COUNT = "FFSConstraintSystemLocationEnabledCount";
        private static final String POWER_ABOVE_THRESHOLD_AT_START_COUNT = "FFSConstraintPowerAboveThresholdAtStartCount";
        private static final String POWER_ABOVE_TRESHOLD_WHILE_RUNNING_COUNT = "FFSConstraintPowerAboveThresholdWhileRunningCount";
        private static final String POWER_BELOW_TRESHOLD_WHILE_RUNNING_COUNT = "FFSConstraintPowerBelowThresholdWhileRunningCount";
        private static final String PREFIX = "FFSConstraint";

        private FFSConstraintMetric() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FFSServiceMetric {
        private static final String DOZE_ENTER_COUNT = "FFSServiceDozeEnterCount";
        private static final String DOZE_EXIT_COUNT = "FFSServiceDozeExitCount";
        private static final String PREFIX = "FFSService";
        private static final String START_COUNT = "FFSServiceStartCount";
        private static final String UPTIME_POWER_BATTERY_DOZE_ACTIVE_MILLIS = "FFSServiceUptimePowerBatteryDozeActiveMillis";
        private static final String UPTIME_POWER_BATTERY_DOZE_INACTIVE_MILLIS = "FFSServiceUptimePowerBatteryDozeInactiveMillis";
        private static final String UPTIME_POWER_BATTERY_MILLIS = "FFSServiceUptimePowerBatteryMillis";
        private static final String UPTIME_POWER_CHARGER_MILLIS = "FFSServiceUptimePowerChargerMillis";
        private static final String UPTIME_TOTAL_MILLIS = "FFSServiceUptimeTotalMillis";

        private FFSServiceMetric() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FFSWorkflowMetric {
        private static final String BACKOFF_COUNT = "FFSWorkflowBackOffCount";
        private static final String BACKOFF_COUNT_CAUSE_PREFIX = "FFSWorkflowBackOffCount_";
        private static final String BACKOFF_DURATION_MILLIS = "FFSWorkflowBackOffDurationMillis";
        private static final String ERROR_COUNT = "FFSWorkflowErrorCount";
        private static final String PREFIX = "FFSWorkflow";
        private static final String SETUP_ATTEMPT_COUNT = "FFSWorkflowSetupAttemptCount";
        private static final String SETUP_FAILURE_COUNT = "FFSWorkflowSetupFailureCount";
        private static final String SETUP_FAILURE_DURATION_MILLIS = "FFSWorkflowSetupFailureDurationMillis";
        private static final String SETUP_SUCCESS_COUNT = "FFSWorkflowSetupSuccessCount";
        private static final String SETUP_SUCCESS_DURATION_MILLIS = "FFSWorkflowSetupSuccessDurationMillis";
        private static final String START_COUNT = "FFSWorkflowStartCount";
        private static final String UPTIME_TOTAL_MILLIS = "FFSWorkflowUptimeTotalMillis";

        private FFSWorkflowMetric() {
        }
    }

    public FFSProvisioningServiceMetricsRecorder(MinervaMetricsRecorderProvider minervaMetricsRecorderProvider) {
        this.mMinervaRecorderProvider = minervaMetricsRecorderProvider;
    }

    public void onApiDoesntRequireLocationPermissionForScan() {
        this.mMinervaRecorder.recordCounter("FFSConstraintApiRequiresLocationPermissionForScan", 0.0d);
    }

    public void onApiRequireLocationPermissionForScan(boolean z, boolean z2) {
        this.mMinervaRecorder.recordCounter("FFSConstraintApiRequiresLocationPermissionForScan", 1.0d);
        this.mMinervaRecorder.recordCounter("FFSConstraintAppLocationEnabledCount", z ? 1.0d : 0.0d);
        this.mMinervaRecorder.recordCounter("FFSConstraintSystemLocationEnabledCount", z2 ? 1.0d : 0.0d);
    }

    public void onServiceStart() {
        MinervaMetricsRecorder metricsRecorder = this.mMinervaRecorderProvider.getMetricsRecorder(WhisperJoinMetricSourceName.FFS_PROVISIONING_SERVICE_SCHEMA_ID);
        this.mMinervaRecorder = metricsRecorder;
        metricsRecorder.addAnonymousIdentity();
        this.mMinervaRecorder.incrementCounter("FFSServiceStartCount");
        this.mMinervaRecorder.startTimer("FFSServiceUptimeTotalMillis");
    }

    public void onServiceStop() {
        this.mMinervaRecorder.stopTimer("FFSServiceUptimeTotalMillis");
        this.mMinervaRecorder.close();
    }

    public void onWorkflowBackoff(String str) {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowBackOffCount");
        this.mMinervaRecorder.incrementCounter("FFSWorkflowBackOffCount_" + str);
        if (this.mWorkflowStartTime != -1) {
            this.mMinervaRecorder.addTimer("FFSWorkflowBackOffDurationMillis", SystemClock.elapsedRealtime() - this.mWorkflowStartTime);
        }
    }

    public void onWorkflowError() {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowErrorCount");
    }

    public void onWorkflowSetupAttemptStart() {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowSetupAttemptCount");
        this.mSetupWorkflowStartTime = SystemClock.elapsedRealtime();
    }

    public void onWorkflowSetupFailure() {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowSetupFailureCount");
        if (this.mSetupWorkflowStartTime != -1) {
            this.mMinervaRecorder.addTimer("FFSWorkflowSetupFailureDurationMillis", SystemClock.elapsedRealtime() - this.mSetupWorkflowStartTime);
        }
    }

    public void onWorkflowSetupSuccess() {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowSetupSuccessCount");
        if (this.mSetupWorkflowStartTime != -1) {
            this.mMinervaRecorder.addTimer("FFSWorkflowSetupSuccessDurationMillis", SystemClock.elapsedRealtime() - this.mSetupWorkflowStartTime);
        }
    }

    public void onWorkflowStart() {
        this.mMinervaRecorder.incrementCounter("FFSWorkflowStartCount");
        this.mMinervaRecorder.startTimer("FFSWorkflowUptimeTotalMillis");
        this.mWorkflowStartTime = SystemClock.elapsedRealtime();
    }

    public void onWorkflowStop() {
        this.mMinervaRecorder.stopTimer("FFSWorkflowUptimeTotalMillis");
    }
}
