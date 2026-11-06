package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent extends ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent {
    private final String packageName;
    private final String serviceName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder {
        private String packageName;
        private String serviceName;

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder
        public ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent build() {
            String str = this.serviceName == null ? " serviceName" : "";
            if (this.packageName == null) {
                str = str.concat(" packageName");
            }
            if (str.isEmpty()) {
                return new AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent(this.serviceName, this.packageName, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder
        public ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder setPackageName(String str) {
            if (str != null) {
                this.packageName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null packageName");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder
        public ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent.Builder setServiceName(String str) {
            if (str != null) {
                this.serviceName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null serviceName");
            return null;
        }
    }

    private AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent(String str, String str2) {
        this.serviceName = str;
        this.packageName = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent) {
            ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent eCAScanFailureEvent = (ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent) obj;
            if (this.serviceName.equals(eCAScanFailureEvent.getServiceName()) && this.packageName.equals(eCAScanFailureEvent.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ExternalCapabilityAgentMetricEvent.ECAScanFailureEvent
    public String getServiceName() {
        return this.serviceName;
    }

    public int hashCode() {
        return this.packageName.hashCode() ^ ((this.serviceName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECAScanFailureEvent{serviceName=");
        sb.append(this.serviceName);
        sb.append(", packageName=");
        return a$$ExternalSyntheticOutline0.m(sb, this.packageName, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ExternalCapabilityAgentMetricEvent_ECAScanFailureEvent(String str, String str2, int i) {
        this(str, str2);
    }
}
