package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.AutoValue_MetricsEvent;
import com.amazon.alexa.mosaic.apl.events.AutoValue_MetricsEvent_Metric;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class MetricsEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract MetricsEvent build();

        public Builder metric(Metric metric) {
            return metrics(Collections.singletonList(metric));
        }

        public abstract Builder metrics(List<Metric> list);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class Metric {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract Metric build();

            public abstract Builder domain(String str);

            public abstract Builder name(String str);

            public abstract Builder type(Type type);

            public abstract Builder value(Long l);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Type {
            COUNTER,
            TIMER
        }

        public static Builder builder() {
            return new AutoValue_MetricsEvent_Metric.Builder();
        }

        public abstract String domain();

        public abstract String name();

        public abstract Type type();

        public abstract Long value();
    }

    public static Builder builder() {
        return new AutoValue_MetricsEvent.Builder();
    }

    public abstract List<Metric> metrics();
}
