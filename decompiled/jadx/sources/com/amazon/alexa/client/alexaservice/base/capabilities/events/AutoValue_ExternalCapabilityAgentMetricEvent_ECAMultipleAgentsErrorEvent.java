package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent;
import com.amazon.alexa.client.core.messages.Namespace;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent extends ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent {
    private final Namespace namespace;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent.Builder {
        private Namespace namespace;

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent.Builder
        public ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent build() {
            String str = this.namespace == null ? " namespace" : "";
            if (str.isEmpty()) {
                return new AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent(this.namespace, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent.Builder
        public ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent.Builder setNamespace(Namespace namespace) {
            if (namespace != null) {
                this.namespace = namespace;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null namespace");
            return null;
        }
    }

    private AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent(Namespace namespace) {
        this.namespace = namespace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent) {
            return this.namespace.equals(((ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent) obj).getNamespace());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAMultipleAgentsErrorEvent
    public Namespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return this.namespace.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ECAMultipleAgentsErrorEvent{namespace=" + this.namespace + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_ExternalCapabilityAgentMetricEvent_ECAMultipleAgentsErrorEvent(Namespace namespace, int i) {
        this(namespace);
    }
}
