package com.amazon.alexa.client.alexaservice.audio.core;

import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerBufferingMetricEvent extends AudioPlayerBufferingMetricEvent {
    private final MetricPlayItem metricPlayItem;

    public AutoValue_AudioPlayerBufferingMetricEvent(MetricPlayItem metricPlayItem) {
        if (metricPlayItem != null) {
            this.metricPlayItem = metricPlayItem;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null metricPlayItem");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioPlayerBufferingMetricEvent) {
            return this.metricPlayItem.equals(((AudioPlayerBufferingMetricEvent) obj).getMetricPlayItem());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerBufferingMetricEvent
    public MetricPlayItem getMetricPlayItem() {
        return this.metricPlayItem;
    }

    public int hashCode() {
        return this.metricPlayItem.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AudioPlayerBufferingMetricEvent{metricPlayItem=" + this.metricPlayItem + StringSubstitutor.DEFAULT_VAR_END;
    }
}
