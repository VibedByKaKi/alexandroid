package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class VoxMetricEventProcessor {
    public static void recordEventMetric(MetricsService metricsService, String str) {
        Logger.verbose("record event metric:" + str);
        metricsService.recordEvent(str, "vox_speech", null);
    }

    public static void recordEventMetricWithClickInteraction(MetricsService metricsService, String str, String str2, String str3) {
        Logger.verbose("record click metric:" + str);
        metricsService.recordEventMetricWithClickInteraction(str, "vox_speech", str2, str3);
    }

    public static void recordLatency(MetricsService metricsService, String str, long j) {
        Logger.verbose("record latency event:" + str + " duration:" + j);
        metricsService.recordTimer(new VoiceMetricsTimer(str, "vox_speech", null, j, false));
    }

    public static void recordOccurrence(MetricsService metricsService, String str, boolean z) {
        Logger.verbose("Record occurrence metric: " + str + " : Occurred : " + z);
        metricsService.recordOccurrence(str, "vox_speech", z, null);
    }

    public abstract void process(VoxMetricEvent voxMetricEvent);

    public static void recordLatency(MetricsService metricsService, String str, String str2, long j) {
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("record latency event:", str2, " duration:", j);
        m.append(" componentName:");
        m.append(str);
        Logger.verbose(m.toString());
        metricsService.recordTimer(new VoiceMetricsTimer(str2, str, null, j, false));
    }
}
