package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.events.MetricsEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_MetricsEvent_Metric extends MetricsEvent.Metric {
    private final String domain;
    private final String name;
    private final MetricsEvent.Metric.Type type;
    private final Long value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MetricsEvent.Metric.Builder {
        private String domain;
        private String name;
        private MetricsEvent.Metric.Type type;
        private Long value;

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric.Builder
        public MetricsEvent.Metric build() {
            String str;
            MetricsEvent.Metric.Type type;
            Long l;
            String str2 = this.domain;
            if (str2 != null && (str = this.name) != null && (type = this.type) != null && (l = this.value) != null) {
                return new AutoValue_MetricsEvent_Metric(str2, str, type, l, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.domain == null) {
                sb.append(" domain");
            }
            if (this.name == null) {
                sb.append(" name");
            }
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.value == null) {
                sb.append(" value");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric.Builder
        public MetricsEvent.Metric.Builder domain(String str) {
            if (str != null) {
                this.domain = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null domain");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric.Builder
        public MetricsEvent.Metric.Builder name(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric.Builder
        public MetricsEvent.Metric.Builder type(MetricsEvent.Metric.Type type) {
            if (type != null) {
                this.type = type;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric.Builder
        public MetricsEvent.Metric.Builder value(Long l) {
            if (l != null) {
                this.value = l;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null value");
            return null;
        }
    }

    private AutoValue_MetricsEvent_Metric(String str, String str2, MetricsEvent.Metric.Type type, Long l) {
        this.domain = str;
        this.name = str2;
        this.type = type;
        this.value = l;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric
    public String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricsEvent.Metric) {
            MetricsEvent.Metric metric = (MetricsEvent.Metric) obj;
            if (this.domain.equals(metric.domain()) && this.name.equals(metric.name()) && this.type.equals(metric.type()) && this.value.equals(metric.value())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() ^ ((((((this.domain.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.type.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric
    public String name() {
        return this.name;
    }

    public String toString() {
        return "Metric{domain=" + this.domain + ", name=" + this.name + ", type=" + this.type + ", value=" + this.value + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric
    public MetricsEvent.Metric.Type type() {
        return this.type;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.MetricsEvent.Metric
    public Long value() {
        return this.value;
    }

    public /* synthetic */ AutoValue_MetricsEvent_Metric(String str, String str2, MetricsEvent.Metric.Type type, Long l, int i) {
        this(str, str2, type, l);
    }
}
