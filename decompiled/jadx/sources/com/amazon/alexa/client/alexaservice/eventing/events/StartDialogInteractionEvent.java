package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class StartDialogInteractionEvent extends Event.NotGated {
    public static StartDialogInteractionEvent create(DialogTurnIdentifier dialogTurnIdentifier, @Nullable String str, @Nullable String str2) {
        return create(dialogTurnIdentifier, str, str2, false);
    }

    public abstract DialogTurnIdentifier getDialogTurnId();

    @Nullable
    public abstract String getInvocationType();

    @Nullable
    public abstract String getSoftwareVersion();

    public abstract boolean isTextDialog();

    public static StartDialogInteractionEvent create(DialogTurnIdentifier dialogTurnIdentifier, @Nullable String str, @Nullable String str2, boolean z) {
        return new AutoValue_StartDialogInteractionEvent(dialogTurnIdentifier, str, str2, z);
    }
}
