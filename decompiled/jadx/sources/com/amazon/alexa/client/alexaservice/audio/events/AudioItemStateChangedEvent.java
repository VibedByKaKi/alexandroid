package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.api.AlexaPlayerInfoState;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioItemStateChangedEvent extends Event.NotGated {
    public static AudioItemStateChangedEvent create(AlexaPlayerInfoState alexaPlayerInfoState, AudioItemIdentifier audioItemIdentifier, long j) {
        return new AutoValue_AudioItemStateChangedEvent(alexaPlayerInfoState, audioItemIdentifier, j);
    }

    public abstract AudioItemIdentifier getAudioItemIdentifier();

    public abstract long getOffset();

    public abstract AlexaPlayerInfoState getPlayerInfoState();
}
