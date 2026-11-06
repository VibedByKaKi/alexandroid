package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.base.system.AVSEndpointStage;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AvsEndpointStageChangedEvent extends AvsEndpointStageChangedEvent {
    private final AVSEndpointStage avsEndpointStage;

    public AutoValue_AvsEndpointStageChangedEvent(AVSEndpointStage aVSEndpointStage) {
        if (aVSEndpointStage != null) {
            this.avsEndpointStage = aVSEndpointStage;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null avsEndpointStage");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AvsEndpointStageChangedEvent) {
            return this.avsEndpointStage.equals(((AvsEndpointStageChangedEvent) obj).getAvsEndpointStage());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.AvsEndpointStageChangedEvent
    public AVSEndpointStage getAvsEndpointStage() {
        return this.avsEndpointStage;
    }

    public int hashCode() {
        return this.avsEndpointStage.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AvsEndpointStageChangedEvent{avsEndpointStage=" + this.avsEndpointStage + StringSubstitutor.DEFAULT_VAR_END;
    }
}
