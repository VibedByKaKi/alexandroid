package com.amazon.alexa.accessory.capabilities.metrics;

import com.amazon.alexa.accessory.AccessorySession;
import com.amazon.alexa.accessory.protocol.Metrics;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface MetricsObserver {
    void onMetricsAvailable(AccessorySession accessorySession, List<AccessoryMetric> list, List<Metrics.MetricsEvent> list2);
}
