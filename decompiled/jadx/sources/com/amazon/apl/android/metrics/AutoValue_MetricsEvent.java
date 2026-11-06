package com.amazon.apl.android.metrics;

import com.amazon.apl.android.metrics.MetricsEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import javax.annotation.Nullable;
import lombok.NonNull;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_MetricsEvent extends MetricsEvent {

    @NonNull
    private final MetricEventType eventType;
    private final Map<String, String> metaData;
    private final long metricId;

    @NonNull
    private final String metricName;
    private final long relateId;
    private final long value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MetricsEvent.Builder {

        @NonNull
        private MetricEventType eventType;
        private Map<String, String> metaData;
        private Long metricId;

        @NonNull
        private String metricName;
        private Long relateId;
        private Long value;

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent build() {
            String str = this.metricId == null ? " metricId" : "";
            if (this.metricName == null) {
                str = str.concat(" metricName");
            }
            if (this.eventType == null) {
                str = str.concat(" eventType");
            }
            if (this.relateId == null) {
                str = str.concat(" relateId");
            }
            if (this.value == null) {
                str = str.concat(" value");
            }
            if (str.isEmpty()) {
                return new AutoValue_MetricsEvent(this.metricId.longValue(), this.metricName, this.eventType, this.metaData, this.relateId.longValue(), this.value.longValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder eventType(MetricEventType metricEventType) {
            if (metricEventType != null) {
                this.eventType = metricEventType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventType");
            return null;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder metaData(Map<String, String> map) {
            this.metaData = map;
            return this;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder metricId(long j) {
            this.metricId = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder metricName(String str) {
            if (str != null) {
                this.metricName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null metricName");
            return null;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder relateId(long j) {
            this.relateId = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.apl.android.metrics.MetricsEvent.Builder
        public MetricsEvent.Builder value(long j) {
            this.value = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_MetricsEvent(long j, @NonNull String str, @NonNull MetricEventType metricEventType, @Nullable Map<String, String> map, long j2, long j3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("metricName is marked non-null but is null");
            throw null;
        }
        if (metricEventType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("eventType is marked non-null but is null");
            throw null;
        }
        this.metricId = j;
        this.metricName = str;
        this.eventType = metricEventType;
        this.metaData = map;
        this.relateId = j2;
        this.value = j3;
    }

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricsEvent) {
            MetricsEvent metricsEvent = (MetricsEvent) obj;
            if (this.metricId == metricsEvent.getMetricId() && this.metricName.equals(metricsEvent.getMetricName()) && this.eventType.equals(metricsEvent.getEventType()) && ((map = this.metaData) != null ? map.equals(metricsEvent.getMetaData()) : metricsEvent.getMetaData() == null) && this.relateId == metricsEvent.getRelateId() && this.value == metricsEvent.getValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    @NonNull
    public MetricEventType getEventType() {
        return this.eventType;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    @Nullable
    public Map<String, String> getMetaData() {
        return this.metaData;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    public long getMetricId() {
        return this.metricId;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    @NonNull
    public String getMetricName() {
        return this.metricName;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    public long getRelateId() {
        return this.relateId;
    }

    @Override // com.amazon.apl.android.metrics.MetricsEvent
    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        long j = this.metricId;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.metricName.hashCode()) * 1000003) ^ this.eventType.hashCode()) * 1000003;
        Map<String, String> map = this.metaData;
        int hashCode2 = (hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003;
        long j2 = this.relateId;
        int i = (hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.value;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricsEvent{metricId=");
        sb.append(this.metricId);
        sb.append(", metricName=");
        sb.append(this.metricName);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", metaData=");
        sb.append(this.metaData);
        sb.append(", relateId=");
        sb.append(this.relateId);
        sb.append(", value=");
        return a$$ExternalSyntheticOutline0.m(this.value, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
