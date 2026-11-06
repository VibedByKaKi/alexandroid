package com.amazon.comms.metrics.publisher;

import android.content.Context;
import com.amazon.comms.metrics.MetricsDestination;
import com.amazon.comms.metrics.UnifiedMetricEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MetricsPublisher {
    void initialize(Context context);

    void record(UnifiedMetricEvent unifiedMetricEvent, MetricsDestination metricsDestination);

    void recordTrace(String str, String str2, String str3, String str4, String str5);

    void shutdown();

    void shutdownTracePublisherService();
}
