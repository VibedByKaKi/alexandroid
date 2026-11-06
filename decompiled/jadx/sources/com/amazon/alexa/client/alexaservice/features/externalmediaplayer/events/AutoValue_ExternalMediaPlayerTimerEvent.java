package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.ExternalMediaPlayerTimerMetricEnum;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalMediaPlayerTimerEvent extends ExternalMediaPlayerTimerEvent {
    private final ExternalMediaPlayerTimerMetricEnum event;

    public AutoValue_ExternalMediaPlayerTimerEvent(ExternalMediaPlayerTimerMetricEnum externalMediaPlayerTimerMetricEnum) {
        if (externalMediaPlayerTimerMetricEnum != null) {
            this.event = externalMediaPlayerTimerMetricEnum;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null event");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalMediaPlayerTimerEvent) {
            return this.event.equals(((ExternalMediaPlayerTimerEvent) obj).getEvent());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerTimerEvent
    public ExternalMediaPlayerTimerMetricEnum getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ExternalMediaPlayerTimerEvent{event=" + this.event + StringSubstitutor.DEFAULT_VAR_END;
    }
}
