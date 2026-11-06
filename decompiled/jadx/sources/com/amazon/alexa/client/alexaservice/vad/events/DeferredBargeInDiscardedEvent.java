package com.amazon.alexa.client.alexaservice.vad.events;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DeferredBargeInDiscardedEvent extends Event.NotGated {
    private final DialogRequestIdentifier discardedDialogId;

    private DeferredBargeInDiscardedEvent(DialogRequestIdentifier dialogRequestIdentifier) {
        this.discardedDialogId = dialogRequestIdentifier;
    }

    public static DeferredBargeInDiscardedEvent create(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        return new DeferredBargeInDiscardedEvent(dialogRequestIdentifier);
    }

    public DialogRequestIdentifier getDiscardedDialogId() {
        return this.discardedDialogId;
    }
}
