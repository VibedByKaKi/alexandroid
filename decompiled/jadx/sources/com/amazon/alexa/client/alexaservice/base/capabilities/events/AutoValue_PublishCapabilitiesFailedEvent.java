package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendRequestCallback;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PublishCapabilitiesFailedEvent extends PublishCapabilitiesFailedEvent {
    private final String capabilityRefreshId;
    private final boolean final0;
    private final SendRequestCallback.RequestFailureReason requestFailureReason;

    public AutoValue_PublishCapabilitiesFailedEvent(SendRequestCallback.RequestFailureReason requestFailureReason, boolean z, String str) {
        if (requestFailureReason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null requestFailureReason");
            throw null;
        }
        this.requestFailureReason = requestFailureReason;
        this.final0 = z;
        if (str != null) {
            this.capabilityRefreshId = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null capabilityRefreshId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublishCapabilitiesFailedEvent) {
            PublishCapabilitiesFailedEvent publishCapabilitiesFailedEvent = (PublishCapabilitiesFailedEvent) obj;
            if (this.requestFailureReason.equals(publishCapabilitiesFailedEvent.getRequestFailureReason()) && this.final0 == publishCapabilitiesFailedEvent.isFinal() && this.capabilityRefreshId.equals(publishCapabilitiesFailedEvent.getCapabilityRefreshId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishCapabilitiesFailedEvent
    public String getCapabilityRefreshId() {
        return this.capabilityRefreshId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishCapabilitiesFailedEvent
    public SendRequestCallback.RequestFailureReason getRequestFailureReason() {
        return this.requestFailureReason;
    }

    public int hashCode() {
        return this.capabilityRefreshId.hashCode() ^ ((((this.requestFailureReason.hashCode() ^ 1000003) * 1000003) ^ (this.final0 ? 1231 : 1237)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishCapabilitiesFailedEvent
    public boolean isFinal() {
        return this.final0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublishCapabilitiesFailedEvent{requestFailureReason=");
        sb.append(this.requestFailureReason);
        sb.append(", final=");
        sb.append(this.final0);
        sb.append(", capabilityRefreshId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.capabilityRefreshId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
