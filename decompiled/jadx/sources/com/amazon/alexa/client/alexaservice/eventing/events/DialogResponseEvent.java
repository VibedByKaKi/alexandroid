package com.amazon.alexa.client.alexaservice.eventing.events;

import android.os.SystemClock;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DialogResponseEvent extends Event.NotGated {
    public static DialogResponseEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier) {
        return new AutoValue_DialogResponseEvent(dialogRequestIdentifier, dialogTurnIdentifier, SystemClock.elapsedRealtime());
    }

    public abstract DialogRequestIdentifier getDialogRequestId();

    public abstract DialogTurnIdentifier getDialogTurnId();

    public abstract long getResponseTimestamp();

    public static DialogResponseEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier, long j) {
        return new AutoValue_DialogResponseEvent(dialogRequestIdentifier, dialogTurnIdentifier, j);
    }
}
