package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.CapabilityPublishRequest;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendRequestCallback;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PublishAddOrUpdateCapabilitiesEvent extends PublishAddOrUpdateCapabilitiesEvent {
    private final SendRequestCallback callback;
    private final CapabilityPublishRequest request;

    public AutoValue_PublishAddOrUpdateCapabilitiesEvent(CapabilityPublishRequest capabilityPublishRequest, SendRequestCallback sendRequestCallback) {
        if (capabilityPublishRequest == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null request");
            throw null;
        }
        this.request = capabilityPublishRequest;
        if (sendRequestCallback != null) {
            this.callback = sendRequestCallback;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null callback");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublishAddOrUpdateCapabilitiesEvent) {
            PublishAddOrUpdateCapabilitiesEvent publishAddOrUpdateCapabilitiesEvent = (PublishAddOrUpdateCapabilitiesEvent) obj;
            if (this.request.equals(publishAddOrUpdateCapabilitiesEvent.getRequest()) && this.callback.equals(publishAddOrUpdateCapabilitiesEvent.getCallback())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishAddOrUpdateCapabilitiesEvent
    public SendRequestCallback getCallback() {
        return this.callback;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishAddOrUpdateCapabilitiesEvent
    public CapabilityPublishRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return this.callback.hashCode() ^ ((this.request.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "PublishAddOrUpdateCapabilitiesEvent{request=" + this.request + ", callback=" + this.callback + StringSubstitutor.DEFAULT_VAR_END;
    }
}
