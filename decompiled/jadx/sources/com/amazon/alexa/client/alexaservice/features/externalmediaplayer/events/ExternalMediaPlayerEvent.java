package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalMediaPlayerEvent extends Event.NotGated {
    public static ExternalMediaPlayerEvent create(ExternalPlayerIdentifier externalPlayerIdentifier, PlayerEvent playerEvent) {
        return new AutoValue_ExternalMediaPlayerEvent(externalPlayerIdentifier, playerEvent, PlaybackSessionIdentifier.NONE);
    }

    public abstract PlaybackSessionIdentifier getPlaybackSessionId();

    public abstract PlayerEvent getPlayerEvent();

    public abstract ExternalPlayerIdentifier getPlayerId();

    public static ExternalMediaPlayerEvent create(ExternalPlayerIdentifier externalPlayerIdentifier, PlayerEvent playerEvent, PlaybackSessionIdentifier playbackSessionIdentifier) {
        return new AutoValue_ExternalMediaPlayerEvent(externalPlayerIdentifier, playerEvent, playbackSessionIdentifier);
    }
}
