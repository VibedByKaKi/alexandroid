package com.amazon.alexa.client.alexaservice.base.interactions.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class VisualChannelUpdatedEvent extends Event.NotGated {
    public static VisualChannelUpdatedEvent create(VisualChannelType visualChannelType, boolean z, @Nullable InteractionInterfaceName interactionInterfaceName) {
        if (interactionInterfaceName == null) {
            interactionInterfaceName = InteractionInterfaceName.UNKNOWN;
        }
        return new AutoValue_VisualChannelUpdatedEvent(visualChannelType, z, interactionInterfaceName);
    }

    public abstract VisualChannelType getChannelType();

    public abstract InteractionInterfaceName getInteractionInterfaceName();

    public abstract boolean isActive();

    public static VisualChannelUpdatedEvent create(VisualChannelType visualChannelType, boolean z) {
        return create(visualChannelType, z, null);
    }
}
