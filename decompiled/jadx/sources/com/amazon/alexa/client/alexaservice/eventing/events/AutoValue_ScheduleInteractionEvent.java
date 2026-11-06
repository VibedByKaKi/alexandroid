package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaAudioTaskBehavior;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ScheduleInteractionEvent extends ScheduleInteractionEvent {
    private final AlexaAudioTaskBehavior alexaAudioTaskBehavior;
    private final AudioMetadata audioMetadata;
    private final ChannelType channelType;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final AudioInteraction interaction;

    public AutoValue_ScheduleInteractionEvent(ChannelType channelType, AudioInteraction audioInteraction, AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier, AlexaAudioTaskBehavior alexaAudioTaskBehavior) {
        if (channelType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null channelType");
            throw null;
        }
        this.channelType = channelType;
        if (audioInteraction == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interaction");
            throw null;
        }
        this.interaction = audioInteraction;
        if (audioMetadata == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioMetadata");
            throw null;
        }
        this.audioMetadata = audioMetadata;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (alexaAudioTaskBehavior != null) {
            this.alexaAudioTaskBehavior = alexaAudioTaskBehavior;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaAudioTaskBehavior");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScheduleInteractionEvent) {
            ScheduleInteractionEvent scheduleInteractionEvent = (ScheduleInteractionEvent) obj;
            if (this.channelType.equals(scheduleInteractionEvent.getChannelType()) && this.interaction.equals(scheduleInteractionEvent.getInteraction()) && this.audioMetadata.equals(scheduleInteractionEvent.getAudioMetadata()) && this.dialogRequestIdentifier.equals(scheduleInteractionEvent.getDialogRequestIdentifier()) && this.alexaAudioTaskBehavior.equals(scheduleInteractionEvent.getAlexaAudioTaskBehavior())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent
    public AlexaAudioTaskBehavior getAlexaAudioTaskBehavior() {
        return this.alexaAudioTaskBehavior;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent
    public AudioMetadata getAudioMetadata() {
        return this.audioMetadata;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent
    public ChannelType getChannelType() {
        return this.channelType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ScheduleInteractionEvent
    public AudioInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        return this.alexaAudioTaskBehavior.hashCode() ^ ((((((((this.channelType.hashCode() ^ 1000003) * 1000003) ^ this.interaction.hashCode()) * 1000003) ^ this.audioMetadata.hashCode()) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003);
    }

    public String toString() {
        return "ScheduleInteractionEvent{channelType=" + this.channelType + ", interaction=" + this.interaction + ", audioMetadata=" + this.audioMetadata + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + ", alexaAudioTaskBehavior=" + this.alexaAudioTaskBehavior + StringSubstitutor.DEFAULT_VAR_END;
    }
}
