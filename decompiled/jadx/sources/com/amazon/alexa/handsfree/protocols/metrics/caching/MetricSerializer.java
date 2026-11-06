package com.amazon.alexa.handsfree.protocols.metrics.caching;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MetricSerializer {
    @Nullable
    List<Metric> deserializeMetricsList(@NonNull String str);

    @Nullable
    String serializeMetricsList(@NonNull List<Metric> list);
}
