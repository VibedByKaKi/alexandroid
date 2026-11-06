package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaAudioTaskBehavior;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ScheduleInteractionEvent extends Event.NotGated {
    public static ScheduleInteractionEvent create(ChannelType channelType, AudioInteraction audioInteraction, AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier, AlexaAudioTaskBehavior alexaAudioTaskBehavior) {
        return new AutoValue_ScheduleInteractionEvent(channelType, audioInteraction, audioMetadata, dialogRequestIdentifier, alexaAudioTaskBehavior);
    }

    public abstract AlexaAudioTaskBehavior getAlexaAudioTaskBehavior();

    public abstract AudioMetadata getAudioMetadata();

    public abstract ChannelType getChannelType();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract AudioInteraction getInteraction();

    public static ScheduleInteractionEvent create(ChannelType channelType, AudioInteraction audioInteraction, AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier) {
        return create(channelType, audioInteraction, audioMetadata, dialogRequestIdentifier, AlexaAudioTaskBehavior.DEFAULT);
    }
}
