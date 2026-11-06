package com.amazon.comms.metrics;

import android.content.Context;
import com.amazon.comms.metrics.publisher.MetricsPublisher;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface UnifiedMetricsFactory {
    public static final int SHUTDOWN_DELAY_MILLISECS = 15000;

    UnifiedMetricEvent createMetricEvent(String str, String str2);

    void initialize(Context context, Set<MetricsPublisher> set);

    void record(UnifiedMetricEvent unifiedMetricEvent);

    void record(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination);

    void record(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination, Priority priority);

    void record(UnifiedMetricEvent unifiedMetricEvent, Priority priority);

    void recordTrace(String str, String str2, String str3, String str4, String str5);

    void shutdown();
}
