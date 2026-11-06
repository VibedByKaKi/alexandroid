package com.amazon.alexa.client.metrics.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultMetricsViewUserInteraction extends DefaultMetricsUserInteraction {
    private DefaultMetricsViewUserInteraction(Builder builder) {
        super(builder.eventName, builder.componentName, "view", builder.interactionDetails, builder.serviceName, builder.customEntries);
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

        @Nullable
        private InteractionDetails interactionDetails;
        private final String interactionType;

        @Nullable
        private String serviceName;

        private Builder() {
            this.interactionType = "view";
        }

        @NonNull
        public DefaultMetricsViewUserInteraction build() {
            return new DefaultMetricsViewUserInteraction(this, 0);
        }

        @NonNull
        public Builder setComponentName(String str) {
            this.componentName = str;
            return this;
        }

        @NonNull
        public Builder setCustomEntries(Map<String, Object> map) {
            this.customEntries = map;
            return this;
        }

        @NonNull
        public Builder setEventName(String str) {
            this.eventName = str;
            return this;
        }

        @NonNull
        public Builder setInteractionDetails(@Nullable ViewInteractionDetails viewInteractionDetails) {
            this.interactionDetails = viewInteractionDetails;
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

    public /* synthetic */ DefaultMetricsViewUserInteraction(Builder builder, int i) {
        this(builder);
    }
}
