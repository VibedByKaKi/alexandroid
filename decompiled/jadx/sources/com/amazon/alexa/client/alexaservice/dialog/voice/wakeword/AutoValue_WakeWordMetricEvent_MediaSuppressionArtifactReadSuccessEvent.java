package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadSuccessEvent extends WakeWordMetricEvent.MediaSuppressionArtifactReadSuccessEvent {
    private final String artifactName;

    public AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactReadSuccessEvent(String str) {
        if (str != null) {
            this.artifactName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null artifactName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordMetricEvent.MediaSuppressionArtifactReadSuccessEvent) {
            return this.artifactName.equals(((WakeWordMetricEvent.MediaSuppressionArtifactReadSuccessEvent) obj).getArtifactName());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactReadSuccessEvent
    public String getArtifactName() {
        return this.artifactName;
    }

    public int hashCode() {
        return this.artifactName.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("MediaSuppressionArtifactReadSuccessEvent{artifactName="), this.artifactName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
