package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VisualChannelUpdatedEvent extends VisualChannelUpdatedEvent {
    private final boolean active;
    private final VisualChannelType channelType;
    private final InteractionInterfaceName interactionInterfaceName;

    public AutoValue_VisualChannelUpdatedEvent(VisualChannelType visualChannelType, boolean z, InteractionInterfaceName interactionInterfaceName) {
        if (visualChannelType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null channelType");
            throw null;
        }
        this.channelType = visualChannelType;
        this.active = z;
        if (interactionInterfaceName != null) {
            this.interactionInterfaceName = interactionInterfaceName;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interactionInterfaceName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VisualChannelUpdatedEvent) {
            VisualChannelUpdatedEvent visualChannelUpdatedEvent = (VisualChannelUpdatedEvent) obj;
            if (this.channelType.equals(visualChannelUpdatedEvent.getChannelType()) && this.active == visualChannelUpdatedEvent.isActive() && this.interactionInterfaceName.equals(visualChannelUpdatedEvent.getInteractionInterfaceName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.VisualChannelUpdatedEvent
    public VisualChannelType getChannelType() {
        return this.channelType;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.VisualChannelUpdatedEvent
    public InteractionInterfaceName getInteractionInterfaceName() {
        return this.interactionInterfaceName;
    }

    public int hashCode() {
        return this.interactionInterfaceName.hashCode() ^ ((((this.channelType.hashCode() ^ 1000003) * 1000003) ^ (this.active ? 1231 : 1237)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.VisualChannelUpdatedEvent
    public boolean isActive() {
        return this.active;
    }

    public String toString() {
        return "VisualChannelUpdatedEvent{channelType=" + this.channelType + ", active=" + this.active + ", interactionInterfaceName=" + this.interactionInterfaceName + StringSubstitutor.DEFAULT_VAR_END;
    }
}
