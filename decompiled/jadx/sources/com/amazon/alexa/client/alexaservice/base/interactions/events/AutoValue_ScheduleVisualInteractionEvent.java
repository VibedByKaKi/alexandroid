package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.VisualInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ScheduleVisualInteractionEvent extends ScheduleVisualInteractionEvent {
    private final VisualChannelType channelType;
    private final VisualInteraction interaction;

    public AutoValue_ScheduleVisualInteractionEvent(VisualChannelType visualChannelType, VisualInteraction visualInteraction) {
        if (visualChannelType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null channelType");
            throw null;
        }
        this.channelType = visualChannelType;
        if (visualInteraction != null) {
            this.interaction = visualInteraction;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interaction");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScheduleVisualInteractionEvent) {
            ScheduleVisualInteractionEvent scheduleVisualInteractionEvent = (ScheduleVisualInteractionEvent) obj;
            if (this.channelType.equals(scheduleVisualInteractionEvent.getChannelType()) && this.interaction.equals(scheduleVisualInteractionEvent.getInteraction())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.ScheduleVisualInteractionEvent
    public VisualChannelType getChannelType() {
        return this.channelType;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.ScheduleVisualInteractionEvent
    public VisualInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        return this.interaction.hashCode() ^ ((this.channelType.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ScheduleVisualInteractionEvent{channelType=" + this.channelType + ", interaction=" + this.interaction + StringSubstitutor.DEFAULT_VAR_END;
    }
}
