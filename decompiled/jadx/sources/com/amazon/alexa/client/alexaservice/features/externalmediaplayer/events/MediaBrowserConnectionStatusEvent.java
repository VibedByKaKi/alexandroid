package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MediaBrowserConnectionStatusEvent extends Event.NotGated {
    public static MediaBrowserConnectionStatusEvent create(ExternalPlayerIdentifier externalPlayerIdentifier, boolean z, int i) {
        return new AutoValue_MediaBrowserConnectionStatusEvent(externalPlayerIdentifier, z, i);
    }

    public abstract boolean getIsConnected();

    public abstract int getNumberOfAttempts();

    public abstract ExternalPlayerIdentifier getPlayerId();
}
