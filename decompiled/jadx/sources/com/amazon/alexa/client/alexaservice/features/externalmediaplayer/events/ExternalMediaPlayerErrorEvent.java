package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerError;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalMediaPlayerErrorEvent extends Event.NotGated {
    public static ExternalMediaPlayerErrorEvent create(@Nullable ExternalPlayerIdentifier externalPlayerIdentifier, PlayerError playerError) {
        return new AutoValue_ExternalMediaPlayerErrorEvent(externalPlayerIdentifier, playerError);
    }

    public abstract PlayerError getPlayerError();

    @Nullable
    public abstract ExternalPlayerIdentifier getPlayerId();
}
