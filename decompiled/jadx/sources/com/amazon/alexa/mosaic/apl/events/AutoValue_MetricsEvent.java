package com.amazon.alexa.mosaic.apl.events;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.events.MetricsEvent;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_MetricsEvent extends MetricsEvent {
    private final List<MetricsEvent.Metric> metrics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MetricsEvent.Builder {
        private List<MetricsEvent.Metric> metrics;

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Builder
        public MetricsEvent build() {
            List<MetricsEvent.Metric> list = this.metrics;
            if (list != null) {
                return new AutoValue_MetricsEvent(list, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: metrics");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Builder
        public MetricsEvent.Builder metrics(List<MetricsEvent.Metric> list) {
            if (list != null) {
                this.metrics = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null metrics");
            return null;
        }
    }

    private AutoValue_MetricsEvent(List<MetricsEvent.Metric> list) {
        this.metrics = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricsEvent) {
            return this.metrics.equals(((MetricsEvent) obj).metrics());
        }
        return false;
    }

    public int hashCode() {
        return this.metrics.hashCode() ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent
    public List<MetricsEvent.Metric> metrics() {
        return this.metrics;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.metrics, new StringBuilder("MetricsEvent{metrics="));
    }

    public /* synthetic */ AutoValue_MetricsEvent(List list, int i) {
        this(list);
    }
}
