package com.amazon.alexa.client.alexaservice.base.interactions.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ChannelUpdatedEvent extends Event.NotGated {
    public static ChannelUpdatedEvent create(ChannelType channelType, boolean z, @Nullable InteractionInterfaceName interactionInterfaceName) {
        if (interactionInterfaceName == null) {
            interactionInterfaceName = InteractionInterfaceName.UNKNOWN;
        }
        return new AutoValue_ChannelUpdatedEvent(channelType, z, interactionInterfaceName);
    }

    public abstract ChannelType getChannelType();

    public abstract InteractionInterfaceName getInteractionInterfaceName();

    public abstract boolean isActive();

    public static ChannelUpdatedEvent create(ChannelType channelType, boolean z) {
        return create(channelType, z, null);
    }
}
