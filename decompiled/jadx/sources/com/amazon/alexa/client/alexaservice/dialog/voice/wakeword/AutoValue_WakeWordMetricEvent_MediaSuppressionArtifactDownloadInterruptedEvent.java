package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadInterruptedEvent extends WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent {
    private final String artifactName;
    private final long requestDuration;

    public AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadInterruptedEvent(String str, long j) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null artifactName");
            throw null;
        }
        this.artifactName = str;
        this.requestDuration = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent) {
            WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent mediaSuppressionArtifactDownloadInterruptedEvent = (WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent) obj;
            if (this.artifactName.equals(mediaSuppressionArtifactDownloadInterruptedEvent.getArtifactName()) && this.requestDuration == mediaSuppressionArtifactDownloadInterruptedEvent.getRequestDuration()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent
    public String getArtifactName() {
        return this.artifactName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent
    public long getRequestDuration() {
        return this.requestDuration;
    }

    public int hashCode() {
        int hashCode = (this.artifactName.hashCode() ^ 1000003) * 1000003;
        long j = this.requestDuration;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSuppressionArtifactDownloadInterruptedEvent{artifactName=");
        sb.append(this.artifactName);
        sb.append(", requestDuration=");
        return a$$ExternalSyntheticOutline0.m(this.requestDuration, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
