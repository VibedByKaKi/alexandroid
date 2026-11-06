package com.amazon.alexa.client.alexaservice.audio.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MicrophoneMuteEvent extends MicrophoneMuteEvent {
    private final boolean muted;

    public AutoValue_MicrophoneMuteEvent(boolean z) {
        this.muted = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MicrophoneMuteEvent) && this.muted == ((MicrophoneMuteEvent) obj).isMuted();
    }

    public int hashCode() {
        return (this.muted ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.MicrophoneMuteEvent
    public boolean isMuted() {
        return this.muted;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("MicrophoneMuteEvent{muted="), this.muted, StringSubstitutor.DEFAULT_VAR_END);
    }
}
