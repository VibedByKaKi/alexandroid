package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.client.alexaservice.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class ClientFacingLocalesChangedEvent extends Event.NotGated {
    private ClientFacingLocalesChangedEvent() {
    }

    public static ClientFacingLocalesChangedEvent create() {
        return new ClientFacingLocalesChangedEvent();
    }
}
