package com.amazon.alexa.accessorykit.finishsetup.metrics;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class DefaultFinishSetupMetricsRecorder implements FinishSetupMetricsRecorder {
    private final AccessoryMetricsService accessoryMetricsService;

    public DefaultFinishSetupMetricsRecorder(AccessoryMetricsService accessoryMetricsService) {
        Preconditions.notNull(accessoryMetricsService, "accessoryMetricsService");
        this.accessoryMetricsService = accessoryMetricsService;
    }

    @Override // com.amazon.alexa.accessorykit.finishsetup.metrics.FinishSetupMetricsRecorder
    public void recordKnownDeviceSetupCompleted(String str) {
        this.accessoryMetricsService.recordOccurrence("FinishAlexaSetupKnownDeviceSetupCompleted", str, true, null);
    }

    @Override // com.amazon.alexa.accessorykit.finishsetup.metrics.FinishSetupMetricsRecorder
    public void recordShowNotification(String str) {
        this.accessoryMetricsService.recordOccurrence("FinishAlexaSetupShowNotification", str, true, null);
    }
}
