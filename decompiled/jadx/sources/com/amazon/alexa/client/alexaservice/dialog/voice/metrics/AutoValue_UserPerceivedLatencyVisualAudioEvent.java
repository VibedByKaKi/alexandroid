package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UserPerceivedLatencyVisualAudioEvent extends UserPerceivedLatencyVisualAudioEvent {
    private final long deviceProcessingLatencyMillis;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String invocationType;
    private final long userPerceivedLatencyMillis;
    private final boolean usingLegacyAlgorithm;

    public AutoValue_UserPerceivedLatencyVisualAudioEvent(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invocationType");
            throw null;
        }
        this.invocationType = str;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.deviceProcessingLatencyMillis = j;
        this.userPerceivedLatencyMillis = j2;
        this.usingLegacyAlgorithm = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserPerceivedLatencyVisualAudioEvent) {
            UserPerceivedLatencyVisualAudioEvent userPerceivedLatencyVisualAudioEvent = (UserPerceivedLatencyVisualAudioEvent) obj;
            if (this.invocationType.equals(userPerceivedLatencyVisualAudioEvent.getInvocationType()) && this.dialogRequestIdentifier.equals(userPerceivedLatencyVisualAudioEvent.getDialogRequestIdentifier()) && this.deviceProcessingLatencyMillis == userPerceivedLatencyVisualAudioEvent.getDeviceProcessingLatencyMillis() && this.userPerceivedLatencyMillis == userPerceivedLatencyVisualAudioEvent.getUserPerceivedLatencyMillis() && this.usingLegacyAlgorithm == userPerceivedLatencyVisualAudioEvent.isUsingLegacyAlgorithm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyVisualAudioEvent
    public long getDeviceProcessingLatencyMillis() {
        return this.deviceProcessingLatencyMillis;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyVisualAudioEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyVisualAudioEvent
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyVisualAudioEvent
    public long getUserPerceivedLatencyMillis() {
        return this.userPerceivedLatencyMillis;
    }

    public int hashCode() {
        int hashCode = (((this.invocationType.hashCode() ^ 1000003) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003;
        long j = this.deviceProcessingLatencyMillis;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.userPerceivedLatencyMillis;
        return (this.usingLegacyAlgorithm ? 1231 : 1237) ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyVisualAudioEvent
    public boolean isUsingLegacyAlgorithm() {
        return this.usingLegacyAlgorithm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserPerceivedLatencyVisualAudioEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", deviceProcessingLatencyMillis=");
        sb.append(this.deviceProcessingLatencyMillis);
        sb.append(", userPerceivedLatencyMillis=");
        sb.append(this.userPerceivedLatencyMillis);
        sb.append(", usingLegacyAlgorithm=");
        return a$$ExternalSyntheticOutline0.m(sb, this.usingLegacyAlgorithm, StringSubstitutor.DEFAULT_VAR_END);
    }
}
