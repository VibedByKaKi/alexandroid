package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SpeechPlaybackEndedEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Reason {
        FINISHED,
        STOPPED,
        FAILED
    }

    public static SpeechPlaybackEndedEvent create(SpeechToken speechToken, Reason reason) {
        return new AutoValue_SpeechPlaybackEndedEvent(speechToken, reason);
    }

    public abstract Reason getReason();

    public abstract SpeechToken getToken();
}
