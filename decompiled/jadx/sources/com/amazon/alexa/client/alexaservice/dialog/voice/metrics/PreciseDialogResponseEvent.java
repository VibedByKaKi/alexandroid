package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PreciseDialogResponseEvent extends Event.NotGated {
    public static PreciseDialogResponseEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier, long j) {
        return new AutoValue_PreciseDialogResponseEvent(dialogRequestIdentifier, dialogTurnIdentifier, j);
    }

    public abstract DialogRequestIdentifier getDialogRequestId();

    public abstract DialogTurnIdentifier getDialogTurnId();

    public abstract long getElapsedTimeOfResponse();
}
