package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadSuccessEvent extends WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent {
    private final String artifactID;
    private final String artifactName;
    private final long requestDuration;

    public AutoValue_WakeWordMetricEvent_MediaSuppressionArtifactDownloadSuccessEvent(String str, long j, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null artifactName");
            throw null;
        }
        this.artifactName = str;
        this.requestDuration = j;
        if (str2 != null) {
            this.artifactID = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null artifactID");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent) {
            WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent mediaSuppressionArtifactDownloadSuccessEvent = (WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent) obj;
            if (this.artifactName.equals(mediaSuppressionArtifactDownloadSuccessEvent.getArtifactName()) && this.requestDuration == mediaSuppressionArtifactDownloadSuccessEvent.getRequestDuration() && this.artifactID.equals(mediaSuppressionArtifactDownloadSuccessEvent.getArtifactID())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent
    public String getArtifactID() {
        return this.artifactID;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent
    public String getArtifactName() {
        return this.artifactName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent
    public long getRequestDuration() {
        return this.requestDuration;
    }

    public int hashCode() {
        int hashCode = (this.artifactName.hashCode() ^ 1000003) * 1000003;
        long j = this.requestDuration;
        return this.artifactID.hashCode() ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSuppressionArtifactDownloadSuccessEvent{artifactName=");
        sb.append(this.artifactName);
        sb.append(", requestDuration=");
        sb.append(this.requestDuration);
        sb.append(", artifactID=");
        return a$$ExternalSyntheticOutline0.m(sb, this.artifactID, StringSubstitutor.DEFAULT_VAR_END);
    }
}
