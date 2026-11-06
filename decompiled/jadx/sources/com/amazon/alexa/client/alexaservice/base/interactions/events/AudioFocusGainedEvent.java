package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioFocusGainedEvent extends Event.NotGated {
    public static AudioFocusGainedEvent create(AudioMetadata.AudioFocusDuration audioFocusDuration, boolean z, boolean z2) {
        return new AutoValue_AudioFocusGainedEvent(audioFocusDuration, z, z2);
    }

    public abstract AudioMetadata.AudioFocusDuration getDuration();

    public abstract boolean wasAnotherAppPlayingMusic();

    public abstract boolean wasEmpPlayingMusic();
}
