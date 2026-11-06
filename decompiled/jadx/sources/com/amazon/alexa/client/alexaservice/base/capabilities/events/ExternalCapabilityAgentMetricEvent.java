package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanSuccessEvent;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.Namespace;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ExternalCapabilityAgentMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ECAMultipleAgentsErrorEvent extends ExternalCapabilityAgentMetricEvent {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ECAMultipleAgentsErrorEvent build();

            public abstract Builder setNamespace(Namespace namespace);
        }

        public static Builder builder() {
            return new AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent.Builder();
        }

        public abstract Namespace getNamespace();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ECAScanFailureEvent extends ExternalCapabilityAgentMetricEvent {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ECAScanFailureEvent build();

            public abstract Builder setPackageName(String str);

            public abstract Builder setServiceName(String str);
        }

        public static Builder builder() {
            return new AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent.Builder();
        }

        public abstract String getPackageName();

        public abstract String getServiceName();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ECAScanSuccessEvent extends ExternalCapabilityAgentMetricEvent {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ECAScanSuccessEvent build();

            public abstract Builder setPackageName(String str);

            public abstract Builder setServiceName(String str);
        }

        public static Builder builder() {
            return new AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanSuccessEvent.Builder();
        }

        public abstract String getPackageName();

        public abstract String getServiceName();
    }
}
