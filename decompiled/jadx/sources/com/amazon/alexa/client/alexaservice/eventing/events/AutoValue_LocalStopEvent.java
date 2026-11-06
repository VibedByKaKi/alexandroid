package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.LocalStopEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LocalStopEvent extends LocalStopEvent {
    private final LocalStopEvent.Source source;

    public AutoValue_LocalStopEvent(LocalStopEvent.Source source) {
        if (source != null) {
            this.source = source;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null source");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalStopEvent) {
            return this.source.equals(((LocalStopEvent) obj).getSource());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LocalStopEvent
    public LocalStopEvent.Source getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() ^ 1000003;
    }

    public String toString() {
        return "LocalStopEvent{source=" + this.source + StringSubstitutor.DEFAULT_VAR_END;
    }
}
