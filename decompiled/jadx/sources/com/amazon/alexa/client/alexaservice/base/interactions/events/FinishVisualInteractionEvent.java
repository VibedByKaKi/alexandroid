package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class FinishVisualInteractionEvent extends Event.NotGated {
    public static FinishVisualInteractionEvent create(InteractionIdentifier interactionIdentifier) {
        return new AutoValue_FinishVisualInteractionEvent(interactionIdentifier);
    }

    public abstract InteractionIdentifier getInteractionIdentifier();
}
