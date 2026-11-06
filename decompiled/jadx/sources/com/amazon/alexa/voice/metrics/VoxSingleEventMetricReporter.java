package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoxSingleEventMetricReporter extends VoxMetricEventProcessor {
    private final MetricsService metricsService;

    public VoxSingleEventMetricReporter(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @Override // com.amazon.alexa.voice.metrics.VoxMetricEventProcessor
    public void process(VoxMetricEvent voxMetricEvent) {
        String name;
        name = voxMetricEvent.getName();
        name.getClass();
        switch (name) {
            case "VERIFICATION_FAILED_UNKNOWN_ERROR":
            case "VERIFICATION_FAILED_TIMEOUT":
            case "VERIFICATION_FAILED_MISSING_PACKAGENAME":
            case "VOX_EARCON_EOR_CHANGED:DISABLED":
            case "LIVE_MODE_ROUTE_INGRESS":
            case "VOX_HANDSFREE_SETTINGS_DISABLED":
            case "INTERACTION_SCHEDULER.SCHEDULE_FAILED.NOT_CONNECTED":
            case "VOX_EARCON_EOR_CHANGED:ENABLED":
            case "LEADER_SELECTION_ATTEMPTED":
            case "VERIFICATION_FAILED_DISABLED":
            case "VOX_EARCON_SOR_CHANGED:ENABLED":
            case "VERIFICATION_FAILED_UNKNOWN_LEADER":
            case "VERIFICATION_FAILED_INCORRECT_SIGNATURE":
            case "VOX_EARCON_SOR_CHANGED:DISABLED":
                Logger.verbose("VoxSingleEventMetricReporter record event ".concat(name));
                this.metricsService.recordOccurrence(name, "vox_speech", true, null);
                break;
        }
    }
}
