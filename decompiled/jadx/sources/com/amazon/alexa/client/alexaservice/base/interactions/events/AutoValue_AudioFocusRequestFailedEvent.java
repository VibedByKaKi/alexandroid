package com.amazon.alexa.client.alexaservice.base.interactions.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioFocusRequestFailedEvent extends AudioFocusRequestFailedEvent {
    private final int audioMode;
    private final int focusResultCode;

    public AutoValue_AudioFocusRequestFailedEvent(int i, int i2) {
        this.focusResultCode = i;
        this.audioMode = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioFocusRequestFailedEvent) {
            AudioFocusRequestFailedEvent audioFocusRequestFailedEvent = (AudioFocusRequestFailedEvent) obj;
            if (this.focusResultCode == audioFocusRequestFailedEvent.getFocusResultCode() && this.audioMode == audioFocusRequestFailedEvent.getAudioMode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedEvent
    public int getAudioMode() {
        return this.audioMode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedEvent
    public int getFocusResultCode() {
        return this.focusResultCode;
    }

    public int hashCode() {
        return this.audioMode ^ ((this.focusResultCode ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioFocusRequestFailedEvent{focusResultCode=");
        sb.append(this.focusResultCode);
        sb.append(", audioMode=");
        return a$$ExternalSyntheticOutline0.m(sb, this.audioMode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
