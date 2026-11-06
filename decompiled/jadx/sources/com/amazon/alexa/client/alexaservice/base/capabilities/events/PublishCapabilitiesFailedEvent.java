package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendRequestCallback;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PublishCapabilitiesFailedEvent extends Event.NotGated {
    public static PublishCapabilitiesFailedEvent create(SendRequestCallback.RequestFailureReason requestFailureReason, boolean z, String str) {
        return new AutoValue_PublishCapabilitiesFailedEvent(requestFailureReason, z, str);
    }

    public abstract String getCapabilityRefreshId();

    public abstract SendRequestCallback.RequestFailureReason getRequestFailureReason();

    public abstract boolean isFinal();
}
