package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordsUpdatedEvent extends WakeWordsUpdatedEvent {
    private final boolean fromDirective;
    private final List<String> wakeWords;

    public AutoValue_WakeWordsUpdatedEvent(List<String> list, boolean z) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null wakeWords");
            throw null;
        }
        this.wakeWords = list;
        this.fromDirective = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordsUpdatedEvent) {
            WakeWordsUpdatedEvent wakeWordsUpdatedEvent = (WakeWordsUpdatedEvent) obj;
            if (this.wakeWords.equals(wakeWordsUpdatedEvent.getWakeWords()) && this.fromDirective == wakeWordsUpdatedEvent.isFromDirective()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordsUpdatedEvent
    public List<String> getWakeWords() {
        return this.wakeWords;
    }

    public int hashCode() {
        return (this.fromDirective ? 1231 : 1237) ^ ((this.wakeWords.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordsUpdatedEvent
    public boolean isFromDirective() {
        return this.fromDirective;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WakeWordsUpdatedEvent{wakeWords=");
        sb.append(this.wakeWords);
        sb.append(", fromDirective=");
        return a$$ExternalSyntheticOutline0.m(sb, this.fromDirective, StringSubstitutor.DEFAULT_VAR_END);
    }
}
