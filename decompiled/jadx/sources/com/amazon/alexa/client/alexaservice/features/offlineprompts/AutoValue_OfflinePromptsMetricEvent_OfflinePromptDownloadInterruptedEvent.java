package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadInterruptedEvent extends OfflinePromptsMetricEvent.OfflinePromptDownloadInterruptedEvent {
    private final long requestDuration;

    public AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadInterruptedEvent(long j) {
        this.requestDuration = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OfflinePromptsMetricEvent.OfflinePromptDownloadInterruptedEvent) && this.requestDuration == ((OfflinePromptsMetricEvent.OfflinePromptDownloadInterruptedEvent) obj).getRequestDuration();
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent.OfflinePromptDownloadInterruptedEvent
    public long getRequestDuration() {
        return this.requestDuration;
    }

    public int hashCode() {
        long j = this.requestDuration;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.requestDuration, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("OfflinePromptDownloadInterruptedEvent{requestDuration="));
    }
}
