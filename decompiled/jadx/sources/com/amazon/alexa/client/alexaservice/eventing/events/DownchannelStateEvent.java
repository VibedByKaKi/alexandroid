package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DownchannelStateEvent extends Event.NotGated {
    public static DownchannelStateEvent create(boolean z, DownchannelIdentifier downchannelIdentifier) {
        return new AutoValue_DownchannelStateEvent(z, downchannelIdentifier);
    }

    public abstract DownchannelIdentifier getDownchannelIdentifier();

    public abstract boolean getIsEstablished();
}
