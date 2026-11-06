package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadFailureEvent extends OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent {
    private final String failureReason;
    private final String modelMD5;
    private final long requestDuration;

    public AutoValue_OfflinePromptsMetricEvent_OfflinePromptDownloadFailureEvent(long j, String str, String str2) {
        this.requestDuration = j;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null modelMD5");
            throw null;
        }
        this.modelMD5 = str;
        if (str2 != null) {
            this.failureReason = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null failureReason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent) {
            OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent offlinePromptDownloadFailureEvent = (OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent) obj;
            if (this.requestDuration == offlinePromptDownloadFailureEvent.getRequestDuration() && this.modelMD5.equals(offlinePromptDownloadFailureEvent.getModelMD5()) && this.failureReason.equals(offlinePromptDownloadFailureEvent.getFailureReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent
    public String getFailureReason() {
        return this.failureReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent
    public String getModelMD5() {
        return this.modelMD5;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent
    public long getRequestDuration() {
        return this.requestDuration;
    }

    public int hashCode() {
        long j = this.requestDuration;
        return this.failureReason.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.modelMD5.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OfflinePromptDownloadFailureEvent{requestDuration=");
        sb.append(this.requestDuration);
        sb.append(", modelMD5=");
        sb.append(this.modelMD5);
        sb.append(", failureReason=");
        return a$$ExternalSyntheticOutline0.m(sb, this.failureReason, StringSubstitutor.DEFAULT_VAR_END);
    }
}
