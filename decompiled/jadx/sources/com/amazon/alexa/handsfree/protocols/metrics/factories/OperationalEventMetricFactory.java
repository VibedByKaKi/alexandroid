package com.amazon.alexa.handsfree.protocols.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface OperationalEventMetricFactory {
    Metric buildDspApkUpdateMetric(@NonNull String str);

    Metric buildFeatureGateDownMetric(@NonNull String str, @NonNull String str2, @NonNull String str3);

    Metric buildFirstStartupMetric(@NonNull String str);

    Metric buildLatencyMetric(long j, long j2, @NonNull String str);

    Metric buildSdkUpdateMetric(@NonNull String str);
}
