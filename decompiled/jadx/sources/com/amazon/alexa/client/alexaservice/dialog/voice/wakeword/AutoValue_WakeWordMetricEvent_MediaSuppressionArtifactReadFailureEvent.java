package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadFailureEvent extends WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent {
    private final String artifactName;
    private final String failureReason;

    public AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadFailureEvent(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null artifactName");
            throw null;
        }
        this.artifactName = str;
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
        if (obj instanceof WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent) {
            WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent mediaSuppressionArtifactReadFailureEvent = (WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent) obj;
            if (this.artifactName.equals(mediaSuppressionArtifactReadFailureEvent.getArtifactName()) && this.failureReason.equals(mediaSuppressionArtifactReadFailureEvent.getFailureReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent
    public String getArtifactName() {
        return this.artifactName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent
    public String getFailureReason() {
        return this.failureReason;
    }

    public int hashCode() {
        return this.failureReason.hashCode() ^ ((this.artifactName.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSuppressionArtifactReadFailureEvent{artifactName=");
        sb.append(this.artifactName);
        sb.append(", failureReason=");
        return a$$ExternalSyntheticOutline0.m(sb, this.failureReason, StringSubstitutor.DEFAULT_VAR_END);
    }
}
