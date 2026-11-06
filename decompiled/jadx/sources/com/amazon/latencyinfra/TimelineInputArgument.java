package com.amazon.latencyinfra;

import androidx.annotation.Nullable;
import com.amazon.latencyinfra.LatencyRecorderOption;
import java.util.Collections;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class TimelineInputArgument {
    private Long endTimestamp;
    private final String eventName;
    private final Map<String, Long> events;
    private String metaData;

    @Nullable
    private final String mobilyticsOwnerId;
    private final String namespace;
    private final LatencyRecorderOption options;
    private Long startTimestamp;
    private final Integer tag;
    private final String timelineName;
    private final LatencyType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Long endTimestamp;
        private String eventName;
        private Map<String, Long> events;
        private String metaData;

        @Nullable
        private String mobilyticsOwnerId;
        private String namespace;
        private LatencyRecorderOption.Builder options = new LatencyRecorderOption.Builder();
        private Long startTimestamp;
        private Integer tag;
        private String timelineName;

        public TimelineInputArgument build() {
            return new TimelineInputArgument(this, 0);
        }

        public Builder withCustomerOption(boolean z) {
            this.options.withCustomerOption(z);
            return this;
        }

        public Builder withEndTimestamp(Long l) {
            this.endTimestamp = l;
            return this;
        }

        public Builder withEventName(String str) {
            this.eventName = str;
            return this;
        }

        public Builder withEvents(Map<String, Long> map) {
            if (map != null) {
                this.events = Collections.unmodifiableMap(map);
            }
            return this;
        }

        public Builder withLogOption(boolean z) {
            this.options.withLogOption(z);
            return this;
        }

        public Builder withMetaData(String str) {
            if (!str.equals("")) {
                this.metaData = str;
            }
            return this;
        }

        public Builder withMetricsOption(boolean z) {
            this.options.withMetricsOption(z);
            return this;
        }

        public Builder withMobilyticsOwnerId(@Nullable String str) {
            this.mobilyticsOwnerId = str;
            return this;
        }

        public Builder withNamespace(String str) {
            this.namespace = str;
            return this;
        }

        public Builder withNamespaceOption(boolean z) {
            this.options.withNamespaceOption(z);
            return this;
        }

        public Builder withPerfTestOption(boolean z) {
            this.options.withPerfTestOption(z);
            return this;
        }

        public Builder withStartTimestamp(Long l) {
            this.startTimestamp = l;
            return this;
        }

        public Builder withTag(Integer num) {
            this.tag = num;
            return this;
        }

        public Builder withTimelineName(String str) {
            this.timelineName = str;
            return this;
        }
    }

    private TimelineInputArgument(Builder builder) {
        this.type = LatencyType.TIMELINE;
        if (builder.timelineName == null || builder.namespace == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("[Latency Infra]: timeline name, namespace or options should not be unset for timeline event");
            throw null;
        }
        this.eventName = builder.eventName;
        this.events = builder.events;
        this.namespace = builder.namespace;
        this.tag = builder.tag;
        this.options = builder.options.build();
        this.timelineName = builder.timelineName;
        this.startTimestamp = builder.startTimestamp;
        this.endTimestamp = builder.endTimestamp;
        this.metaData = builder.metaData;
        this.mobilyticsOwnerId = builder.mobilyticsOwnerId;
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getEventName() {
        return this.eventName;
    }

    public Map<String, Long> getEvents() {
        return this.events;
    }

    public String getMetaData() {
        return this.metaData;
    }

    @Nullable
    public String getMobilyticsOwnerId() {
        return this.mobilyticsOwnerId;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public LatencyRecorderOption getOptions() {
        return this.options;
    }

    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public Integer getTag() {
        return this.tag;
    }

    public String getTimelineName() {
        return this.timelineName;
    }

    public LatencyType getType() {
        return this.type;
    }

    public /* synthetic */ TimelineInputArgument(Builder builder, int i) {
        this(builder);
    }
}
