package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UserPerceivedLatencyCalculatedEvent extends UserPerceivedLatencyCalculatedEvent {
    private final long alexaSpeechReadyRealtimeMs;
    private final long alexaSpeechStartedRealtimeMs;
    private final long clientSideUplContributionMs;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final DialogTurnIdentifier dialogTurnIdentifier;
    private final long endOfSpeechOffsetRealtimeMs;
    private final String invocationType;
    private final long normalizedClientSideUplContributionMs;
    private final long normalizedUserPerceivedLatencyMs;
    private final boolean opusEncoded;
    private final long totalUserPerceivedLatencyMs;
    private final boolean usingLegacyAlgorithm;

    public AutoValue_UserPerceivedLatencyCalculatedEvent(String str, DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
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
        if (dialogTurnIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogTurnIdentifier");
            throw null;
        }
        this.dialogTurnIdentifier = dialogTurnIdentifier;
        this.endOfSpeechOffsetRealtimeMs = j;
        this.alexaSpeechReadyRealtimeMs = j2;
        this.alexaSpeechStartedRealtimeMs = j3;
        this.normalizedUserPerceivedLatencyMs = j4;
        this.totalUserPerceivedLatencyMs = j5;
        this.normalizedClientSideUplContributionMs = j6;
        this.clientSideUplContributionMs = j7;
        this.opusEncoded = z;
        this.usingLegacyAlgorithm = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserPerceivedLatencyCalculatedEvent) {
            UserPerceivedLatencyCalculatedEvent userPerceivedLatencyCalculatedEvent = (UserPerceivedLatencyCalculatedEvent) obj;
            if (this.invocationType.equals(userPerceivedLatencyCalculatedEvent.getInvocationType()) && this.dialogRequestIdentifier.equals(userPerceivedLatencyCalculatedEvent.getDialogRequestIdentifier()) && this.dialogTurnIdentifier.equals(userPerceivedLatencyCalculatedEvent.getDialogTurnIdentifier()) && this.endOfSpeechOffsetRealtimeMs == userPerceivedLatencyCalculatedEvent.getEndOfSpeechOffsetRealtimeMs() && this.alexaSpeechReadyRealtimeMs == userPerceivedLatencyCalculatedEvent.getAlexaSpeechReadyRealtimeMs() && this.alexaSpeechStartedRealtimeMs == userPerceivedLatencyCalculatedEvent.getAlexaSpeechStartedRealtimeMs() && this.normalizedUserPerceivedLatencyMs == userPerceivedLatencyCalculatedEvent.getNormalizedUserPerceivedLatencyMs() && this.totalUserPerceivedLatencyMs == userPerceivedLatencyCalculatedEvent.getTotalUserPerceivedLatencyMs() && this.normalizedClientSideUplContributionMs == userPerceivedLatencyCalculatedEvent.getNormalizedClientSideUplContributionMs() && this.clientSideUplContributionMs == userPerceivedLatencyCalculatedEvent.getClientSideUplContributionMs() && this.opusEncoded == userPerceivedLatencyCalculatedEvent.isOpusEncoded() && this.usingLegacyAlgorithm == userPerceivedLatencyCalculatedEvent.isUsingLegacyAlgorithm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getAlexaSpeechReadyRealtimeMs() {
        return this.alexaSpeechReadyRealtimeMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getAlexaSpeechStartedRealtimeMs() {
        return this.alexaSpeechStartedRealtimeMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getClientSideUplContributionMs() {
        return this.clientSideUplContributionMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public DialogTurnIdentifier getDialogTurnIdentifier() {
        return this.dialogTurnIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getEndOfSpeechOffsetRealtimeMs() {
        return this.endOfSpeechOffsetRealtimeMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getNormalizedClientSideUplContributionMs() {
        return this.normalizedClientSideUplContributionMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getNormalizedUserPerceivedLatencyMs() {
        return this.normalizedUserPerceivedLatencyMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public long getTotalUserPerceivedLatencyMs() {
        return this.totalUserPerceivedLatencyMs;
    }

    public int hashCode() {
        int hashCode = (((((this.invocationType.hashCode() ^ 1000003) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003) ^ this.dialogTurnIdentifier.hashCode()) * 1000003;
        long j = this.endOfSpeechOffsetRealtimeMs;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.alexaSpeechReadyRealtimeMs;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.alexaSpeechStartedRealtimeMs;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.normalizedUserPerceivedLatencyMs;
        int i4 = (i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.totalUserPerceivedLatencyMs;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.normalizedClientSideUplContributionMs;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.clientSideUplContributionMs;
        return ((((i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ (this.opusEncoded ? 1231 : 1237)) * 1000003) ^ (this.usingLegacyAlgorithm ? 1231 : 1237);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public boolean isOpusEncoded() {
        return this.opusEncoded;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UserPerceivedLatencyCalculatedEvent
    public boolean isUsingLegacyAlgorithm() {
        return this.usingLegacyAlgorithm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserPerceivedLatencyCalculatedEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", dialogTurnIdentifier=");
        sb.append(this.dialogTurnIdentifier);
        sb.append(", endOfSpeechOffsetRealtimeMs=");
        sb.append(this.endOfSpeechOffsetRealtimeMs);
        sb.append(", alexaSpeechReadyRealtimeMs=");
        sb.append(this.alexaSpeechReadyRealtimeMs);
        sb.append(", alexaSpeechStartedRealtimeMs=");
        sb.append(this.alexaSpeechStartedRealtimeMs);
        sb.append(", normalizedUserPerceivedLatencyMs=");
        sb.append(this.normalizedUserPerceivedLatencyMs);
        sb.append(", totalUserPerceivedLatencyMs=");
        sb.append(this.totalUserPerceivedLatencyMs);
        sb.append(", normalizedClientSideUplContributionMs=");
        sb.append(this.normalizedClientSideUplContributionMs);
        sb.append(", clientSideUplContributionMs=");
        sb.append(this.clientSideUplContributionMs);
        sb.append(", opusEncoded=");
        sb.append(this.opusEncoded);
        sb.append(", usingLegacyAlgorithm=");
        return a$$ExternalSyntheticOutline0.m(sb, this.usingLegacyAlgorithm, StringSubstitutor.DEFAULT_VAR_END);
    }
}
