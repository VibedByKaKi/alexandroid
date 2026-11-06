package com.amazon.alexa.client.metrics.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultMetricsClickUserInteraction extends DefaultMetricsUserInteraction {
    private DefaultMetricsClickUserInteraction(Builder builder) {
        super(builder.eventName, builder.componentName, "click", builder.interactionDetails, builder.serviceName, builder.customEntries);
    }

    @NonNull
    public static Builder getBuilder() {
        return new Builder(0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String componentName;
        private Map<String, Object> customEntries;
        private String eventName;
        private InteractionDetails interactionDetails;
        private final String interactionType;
        private String serviceName;

        private Builder() {
            this.interactionType = "click";
        }

        @NonNull
        public DefaultMetricsClickUserInteraction build() {
            return new DefaultMetricsClickUserInteraction(this, 0);
        }

        @NonNull
        public Builder setComponentName(@NonNull String str) {
            this.componentName = str;
            return this;
        }

        @NonNull
        public Builder setCustomEntries(@NonNull Map<String, Object> map) {
            this.customEntries = map;
            return this;
        }

        @NonNull
        public Builder setEventName(@NonNull String str) {
            this.eventName = str;
            return this;
        }

        @NonNull
        public Builder setInteractionDetails(@Nullable ClickInteractionDetails clickInteractionDetails) {
            this.interactionDetails = clickInteractionDetails;
            return this;
        }

        @NonNull
        public Builder setServiceName(@Nullable String str) {
            this.serviceName = str;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ DefaultMetricsClickUserInteraction(Builder builder, int i) {
        this(builder);
    }
}
