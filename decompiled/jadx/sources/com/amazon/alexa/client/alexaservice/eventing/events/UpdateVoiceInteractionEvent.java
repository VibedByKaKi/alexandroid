package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UpdateVoiceInteractionEvent extends Event.NotGated {
    public static UpdateVoiceInteractionEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogRequestIdentifier dialogRequestIdentifier) {
        return new AutoValue_UpdateVoiceInteractionEvent(dialogTurnIdentifier, dialogRequestIdentifier, null);
    }

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestId();

    public abstract DialogTurnIdentifier getDialogTurnId();

    @Nullable
    public abstract String getInvocationType();

    public static UpdateVoiceInteractionEvent create(DialogTurnIdentifier dialogTurnIdentifier, String str) {
        return new AutoValue_UpdateVoiceInteractionEvent(dialogTurnIdentifier, null, str);
    }
}
