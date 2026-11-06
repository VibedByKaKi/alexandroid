package com.amazon.alexa.handsfree.protocols.metrics;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MetricsEmitter {
    void recordMetrics(@NonNull Context context, @NonNull Object obj, @NonNull Metric... metricArr);

    void recordMetrics(@NonNull MetricsRecordMode metricsRecordMode, @NonNull Context context, @NonNull Object obj, @NonNull Metric... metricArr);
}
