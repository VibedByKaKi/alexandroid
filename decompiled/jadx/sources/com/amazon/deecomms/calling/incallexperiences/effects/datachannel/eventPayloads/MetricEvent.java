package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model.EffectsMetric;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MetricEvent {
    private String effectSessionId;
    private List<EffectsMetric> metrics;
    private String requestId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String effectsSessionId;
        private List<EffectsMetric> metrics;
        private String requestId;

        public MetricEvent build() {
            return new MetricEvent(this.requestId, this.metrics, this.effectsSessionId, 0);
        }

        public Builder withEffectsSessionId(@NonNull String str) {
            this.effectsSessionId = str;
            return this;
        }

        public Builder withMetrics(@NonNull List<EffectsMetric> list) {
            this.metrics = list;
            return this;
        }

        public Builder withRequestId(@NonNull String str) {
            this.requestId = str;
            return this;
        }
    }

    private MetricEvent(@NonNull String str, @NonNull String str2, @NonNull List<EffectsMetric> list) {
        this.requestId = str;
        this.effectSessionId = str2;
        this.metrics = list;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MetricEvent.class == obj.getClass()) {
            MetricEvent metricEvent = (MetricEvent) obj;
            if (this.requestId.equals(metricEvent.requestId) && this.effectSessionId.equals(metricEvent.effectSessionId) && Objects.equals(this.metrics, metricEvent.metrics)) {
                return true;
            }
        }
        return false;
    }

    public String getEffectsSessionId() {
        return this.effectSessionId;
    }

    public List<EffectsMetric> getMetrics() {
        return this.metrics;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return Objects.hash(this.requestId, this.effectSessionId, this.metrics);
    }

    public /* synthetic */ MetricEvent(String str, List list, String str2, int i) {
        this(str, str2, list);
    }
}
