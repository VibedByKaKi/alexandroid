package com.amazon.alexa.client.alexaservice.ui.cardrenderer;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CardDisplayedEvent extends Event.NotGated {
    public static CardDisplayedEvent create(@Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str) {
        return new AutoValue_CardDisplayedEvent(dialogRequestIdentifier, str);
    }

    @Nullable
    public abstract String getCardType();

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestId();
}
