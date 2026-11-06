package com.amazon.apl.android.metrics;

import com.amazon.apl.android.metrics.AutoValue_MetricsEvent;
import com.google.auto.value.AutoValue;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class MetricsEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract MetricsEvent build();

        public abstract Builder eventType(MetricEventType metricEventType);

        public abstract Builder metaData(Map<String, String> map);

        public abstract Builder metricId(long j);

        public abstract Builder metricName(String str);

        public abstract Builder relateId(long j);

        public abstract Builder value(long j);
    }

    public static Builder builder() {
        return new AutoValue_MetricsEvent.Builder();
    }

    @NonNull
    public abstract MetricEventType getEventType();

    @Nullable
    public abstract Map<String, String> getMetaData();

    public abstract long getMetricId();

    @NonNull
    public abstract String getMetricName();

    public abstract long getRelateId();

    public abstract long getValue();
}
