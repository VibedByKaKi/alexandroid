package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.alexaservice.dialog.InteractionInitiator;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class LegacyVisualResponseRenderedEvent extends Event.NotGated {
    public static LegacyVisualResponseRenderedEvent create(InteractionInitiator interactionInitiator, String str, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str2, @Nullable ResponseType responseType, String str3, boolean z) {
        return new AutoValue_LegacyVisualResponseRenderedEvent(interactionInitiator, str, dialogRequestIdentifier, str2, responseType, str3, z);
    }

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract InteractionInitiator getInteractionInitiator();

    @Nullable
    public abstract String getInteractionLabel();

    public abstract String getInvocationType();

    public abstract String getInvokingApiEventName();

    @Nullable
    public abstract ResponseType getResponseType();

    public abstract boolean isSuccessfullyRendered();
}
