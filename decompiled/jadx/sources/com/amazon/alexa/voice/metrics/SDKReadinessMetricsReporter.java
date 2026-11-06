package com.amazon.alexa.voice.metrics;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.metrics.service.MetricsService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SDKReadinessMetricsReporter extends VoxMetricEventProcessor {
    private static final String TAG = "SDKReadinessMetricsReporter";
    private final MetricsService metricsService;
    private long sdkConnectionAttemptStartTime = -1;

    public SDKReadinessMetricsReporter(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    private void reportConnectionFailureFailureOccurrence(boolean z) {
        VoxMetricEventProcessor.recordOccurrence(this.metricsService, VoiceMetricsConstants.SDK_STARTUP_RESULT, z);
    }

    private void resetConnectionAttemptedTime() {
        this.sdkConnectionAttemptStartTime = -1L;
    }

    @VisibleForTesting
    public long getSDKConnectionAttemptStartTime() {
        return this.sdkConnectionAttemptStartTime;
    }

    @Override // com.amazon.alexa.voice.metrics.VoxMetricEventProcessor
    public void process(VoxMetricEvent voxMetricEvent) {
        String name;
        long timestamp;
        name = voxMetricEvent.getName();
        timestamp = voxMetricEvent.getTimestamp();
        name.getClass();
        switch (name) {
            case "SDK_CONNECTION_ESTABLISHED":
                reportConnectionFailureFailureOccurrence(false);
                long j = this.sdkConnectionAttemptStartTime;
                if (j >= 0) {
                    long j2 = timestamp - j;
                    if (j2 > 0) {
                        resetConnectionAttemptedTime();
                        VoxMetricEventProcessor.recordLatency(this.metricsService, VoiceMetricsConstants.SDK_STARTUP_LATENCY, j2);
                        break;
                    } else {
                        Log.e(TAG, "Invalid latency number : " + j2);
                        resetConnectionAttemptedTime();
                        VoxMetricEventProcessor.recordEventMetric(this.metricsService, VoiceMetricsConstants.SDK_STARTUP_NEGATIVE_LATENCY);
                        break;
                    }
                } else {
                    Log.e(TAG, "Invalid start time : " + this.sdkConnectionAttemptStartTime);
                    resetConnectionAttemptedTime();
                    VoxMetricEventProcessor.recordEventMetric(this.metricsService, VoiceMetricsConstants.SDK_STARTUP_INVALID_START_TIME);
                    break;
                }
            case "SDK_CONNECTION_FAILED":
                resetConnectionAttemptedTime();
                reportConnectionFailureFailureOccurrence(true);
                break;
            case "SDK_CONNECTION_ATTEMPTED":
                this.sdkConnectionAttemptStartTime = timestamp;
                break;
            default:
                Log.w(TAG, "process: unsupported event: ".concat(name));
                break;
        }
    }
}
