package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.NonNull;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Metrics {
    void recordCustomMetric(@NonNull String str, @NonNull ClientMetric clientMetric, @NonNull MetricRecordingType... metricRecordingTypeArr);

    void recordSimpleDuration(@NonNull String str, @NonNull MetricName metricName, double d);

    void recordSimpleErrorEvent(@NonNull String str, @NonNull MetricName metricName, @NonNull Exception exc);

    void recordSimpleEvent(@NonNull String str, @NonNull MetricName metricName, @NonNull MetricRecordingType... metricRecordingTypeArr);

    default void recordCustomMetricRaw(@NonNull String str, @NonNull ClientMetric clientMetric, @NonNull String str2, @NonNull String str3, @NonNull Set<String> set, @NonNull Set<String> set2, @NonNull Double d) {
    }
}
