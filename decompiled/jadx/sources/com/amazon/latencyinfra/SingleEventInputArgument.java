package com.amazon.latencyinfra;

import androidx.annotation.Nullable;
import com.amazon.latencyinfra.LatencyRecorderOption;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class SingleEventInputArgument {
    private final Long endTimestamp;
    private final String eventName;
    private final String metaData;

    @Nullable
    private final String mobilyticsOwnerId;
    private final String namespace;
    private final LatencyRecorderOption options;
    private final LatencyType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Long endTimestamp;
        private String eventName;
        private String metaData;

        @Nullable
        private String mobilyticsOwnerId;
        private String namespace;
        private LatencyRecorderOption.Builder options = new LatencyRecorderOption.Builder();

        public SingleEventInputArgument build() {
            return new SingleEventInputArgument(this.eventName, this.namespace, this.metaData, this.endTimestamp, this.mobilyticsOwnerId, this.options.build(), 0);
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

        public Builder withFromAppStart(boolean z) {
            this.options.withFromAppStart(z);
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
    }

    private SingleEventInputArgument(String str, String str2, String str3, Long l, @Nullable String str4, LatencyRecorderOption latencyRecorderOption) {
        this.type = LatencyType.SINGLE;
        if (str == null || str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("[Latency-Infra] event name, namepace, options should not be empty to recrod single time stamp event.");
            throw null;
        }
        this.eventName = str;
        this.namespace = str2;
        this.metaData = str3;
        this.endTimestamp = l;
        this.options = latencyRecorderOption;
        this.mobilyticsOwnerId = str4;
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getEventName() {
        return this.eventName;
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

    public LatencyType getType() {
        return this.type;
    }

    public /* synthetic */ SingleEventInputArgument(String str, String str2, String str3, Long l, String str4, LatencyRecorderOption latencyRecorderOption, int i) {
        this(str, str2, str3, l, str4, latencyRecorderOption);
    }
}
