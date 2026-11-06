package com.amazon.alexa.client.alexaservice.base.interactions.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioFocusTransientLossEvent extends AudioFocusTransientLossEvent {
    private final int audioMode;

    public AutoValue_AudioFocusTransientLossEvent(int i) {
        this.audioMode = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AudioFocusTransientLossEvent) && this.audioMode == ((AudioFocusTransientLossEvent) obj).getAudioMode();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusTransientLossEvent
    public int getAudioMode() {
        return this.audioMode;
    }

    public int hashCode() {
        return this.audioMode ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("AudioFocusTransientLossEvent{audioMode="), this.audioMode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
