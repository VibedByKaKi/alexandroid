package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.VisualInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ScheduleVisualInteractionEvent extends Event.NotGated {
    public static ScheduleVisualInteractionEvent create(VisualChannelType visualChannelType, VisualInteraction visualInteraction) {
        return new AutoValue_ScheduleVisualInteractionEvent(visualChannelType, visualInteraction);
    }

    public abstract VisualChannelType getChannelType();

    public abstract VisualInteraction getInteraction();
}
