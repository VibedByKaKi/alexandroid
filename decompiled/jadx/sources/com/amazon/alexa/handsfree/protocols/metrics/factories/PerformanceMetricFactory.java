package com.amazon.alexa.handsfree.protocols.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PerformanceMetricFactory {
    Metric buildLatencyMetric(@NonNull String str, @NonNull String str2, long j);

    Metric buildPercentileMetricFailure(@NonNull String str, @NonNull String str2);

    Metric buildPercentileMetricSuccess(@NonNull String str, @NonNull String str2);

    Metric buildPerformanceMetric(@NonNull String str, @NonNull String str2);

    Metric buildPerformanceMetricFailure(@NonNull String str, @NonNull String str2, int i);
}
