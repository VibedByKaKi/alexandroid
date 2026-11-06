package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class LocalStopEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Source {
        CANCEL_USER_INTERACTION,
        PAUSE_CONTROL,
        CANNOT_EXPECT_SPEECH
    }

    public static LocalStopEvent createCancelUserInteraction() {
        return new AutoValue_LocalStopEvent(Source.CANCEL_USER_INTERACTION);
    }

    public static LocalStopEvent createCannotExpectSpeech() {
        return new AutoValue_LocalStopEvent(Source.CANNOT_EXPECT_SPEECH);
    }

    public static LocalStopEvent createPauseControl() {
        return new AutoValue_LocalStopEvent(Source.PAUSE_CONTROL);
    }

    public abstract Source getSource();
}
