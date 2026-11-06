package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionProgress;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.utils.validation.Preconditions;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UpdateVoiceInteractionProgressEvent extends Event.NotGated {
    public static UpdateVoiceInteractionProgressEvent create(DialogTurnIdentifier dialogTurnIdentifier, DialogInteractionProgress dialogInteractionProgress) {
        Preconditions.notNull(dialogTurnIdentifier, "dialogTurnIdentifier is null");
        return createInternal(dialogTurnIdentifier, null, dialogInteractionProgress);
    }

    @VisibleForTesting
    public static UpdateVoiceInteractionProgressEvent createInternal(DialogTurnIdentifier dialogTurnIdentifier, DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionProgress dialogInteractionProgress) {
        return new AutoValue_UpdateVoiceInteractionProgressEvent(dialogTurnIdentifier, dialogRequestIdentifier, dialogInteractionProgress);
    }

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestId();

    @Nullable
    public abstract DialogTurnIdentifier getDialogTurnId();

    public abstract DialogInteractionProgress getProgress();

    public static UpdateVoiceInteractionProgressEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionProgress dialogInteractionProgress) {
        Preconditions.notNull(dialogRequestIdentifier, "dialogRequestIdentifier is null");
        return createInternal(null, dialogRequestIdentifier, dialogInteractionProgress);
    }
}
