package com.amazon.latencyinfra;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class LatencyReporterArgument {
    private final Map<String, Long> events;
    private final String metaData;

    @Nullable
    private final String mobilyticsOwnerId;
    private final String name;
    private final String namespace;
    private String sourceMetaData;

    @Nullable
    private final Long startTime;
    private final Long timeInterval;
    private final LatencyType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Map<String, Long> events;
        private String metaData;

        @Nullable
        private String mobilyticsOwnerId;
        private String name;
        private String namespace;
        private String sourceMetaData;

        @Nullable
        private Long startTime;
        private Long timeInterval;
        private LatencyType type;

        public LatencyReporterArgument build() {
            return new LatencyReporterArgument(this, 0);
        }

        public Builder withEvents(Map<String, Long> map) {
            if (map != null) {
                this.events = Collections.unmodifiableMap(map);
            }
            return this;
        }

        public Builder withMetaData(String str) {
            this.metaData = str;
            return this;
        }

        public Builder withMobilyticsOwnerId(@Nullable String str) {
            this.mobilyticsOwnerId = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withNamespace(String str) {
            this.namespace = str;
            return this;
        }

        public Builder withSourceMetaData(String str) {
            this.sourceMetaData = str;
            return this;
        }

        public Builder withStartTime(Long l) {
            this.startTime = l;
            return this;
        }

        public Builder withTimeInterval(Long l) {
            this.timeInterval = l;
            return this;
        }

        public Builder withType(LatencyType latencyType) {
            this.type = latencyType;
            return this;
        }
    }

    private LatencyReporterArgument(Builder builder) throws IllegalArgumentException {
        if (builder.type == null || builder.name == null || builder.namespace == null || builder.timeInterval == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("[Latency Infra]: name, type, timeInterval or namespace should not be null.");
            throw null;
        }
        this.name = builder.name;
        this.type = builder.type;
        this.namespace = builder.namespace;
        this.events = builder.events;
        this.timeInterval = builder.timeInterval;
        this.metaData = builder.metaData;
        this.sourceMetaData = builder.sourceMetaData;
        this.startTime = builder.startTime;
        this.mobilyticsOwnerId = builder.mobilyticsOwnerId;
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

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSourceMetaData() {
        return this.sourceMetaData;
    }

    @Nullable
    public Long getStartTime() {
        return this.startTime;
    }

    public Long getTimeInterval() {
        return this.timeInterval;
    }

    public LatencyType getType() {
        return this.type;
    }

    public void setSourceMetaData(String str) {
        this.sourceMetaData = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.type = this.type;
        builder.namespace = this.namespace;
        builder.events = this.events;
        builder.timeInterval = this.timeInterval;
        builder.metaData = this.metaData;
        builder.sourceMetaData = this.sourceMetaData;
        builder.startTime = this.startTime;
        builder.mobilyticsOwnerId = this.mobilyticsOwnerId;
        return builder;
    }

    public /* synthetic */ LatencyReporterArgument(Builder builder, int i) {
        this(builder);
    }
}
