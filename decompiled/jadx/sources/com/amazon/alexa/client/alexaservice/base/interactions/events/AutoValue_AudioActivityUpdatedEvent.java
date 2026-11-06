package com.amazon.alexa.client.alexaservice.base.interactions.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioActivityUpdatedEvent extends AudioActivityUpdatedEvent {
    private final boolean isAudioScheduled;

    public AutoValue_AudioActivityUpdatedEvent(boolean z) {
        this.isAudioScheduled = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AudioActivityUpdatedEvent) && this.isAudioScheduled == ((AudioActivityUpdatedEvent) obj).getIsAudioScheduled();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioActivityUpdatedEvent
    public boolean getIsAudioScheduled() {
        return this.isAudioScheduled;
    }

    public int hashCode() {
        return (this.isAudioScheduled ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("AudioActivityUpdatedEvent{isAudioScheduled="), this.isAudioScheduled, StringSubstitutor.DEFAULT_VAR_END);
    }
}
