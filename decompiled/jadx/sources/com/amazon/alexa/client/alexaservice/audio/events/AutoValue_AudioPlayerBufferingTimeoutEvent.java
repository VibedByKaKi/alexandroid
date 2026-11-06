package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.core.MetricPlayItem;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerBufferingTimeoutEvent extends AudioPlayerBufferingTimeoutEvent {
    private final MetricPlayItem playItem;

    public AutoValue_AudioPlayerBufferingTimeoutEvent(MetricPlayItem metricPlayItem) {
        if (metricPlayItem != null) {
            this.playItem = metricPlayItem;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playItem");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioPlayerBufferingTimeoutEvent) {
            return this.playItem.equals(((AudioPlayerBufferingTimeoutEvent) obj).getPlayItem());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerBufferingTimeoutEvent
    public MetricPlayItem getPlayItem() {
        return this.playItem;
    }

    public int hashCode() {
        return this.playItem.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AudioPlayerBufferingTimeoutEvent{playItem=" + this.playItem + StringSubstitutor.DEFAULT_VAR_END;
    }
}
