package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.RecoverableVoiceInteractionEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RecoverableVoiceInteractionEvent_DownchannelAvailable extends RecoverableVoiceInteractionEvent.DownchannelAvailable {
    private final DialogFailureReason failureReason;
    private final String invocationType;
    private final long latencyBetweenFailureAndAvailableMs;

    public AutoValue_RecoverableVoiceInteractionEvent_DownchannelAvailable(DialogFailureReason dialogFailureReason, String str, long j) {
        if (dialogFailureReason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null failureReason");
            throw null;
        }
        this.failureReason = dialogFailureReason;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invocationType");
            throw null;
        }
        this.invocationType = str;
        this.latencyBetweenFailureAndAvailableMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecoverableVoiceInteractionEvent.DownchannelAvailable) {
            RecoverableVoiceInteractionEvent.DownchannelAvailable downchannelAvailable = (RecoverableVoiceInteractionEvent.DownchannelAvailable) obj;
            if (this.failureReason.equals(downchannelAvailable.getFailureReason()) && this.invocationType.equals(downchannelAvailable.getInvocationType()) && this.latencyBetweenFailureAndAvailableMs == downchannelAvailable.getLatencyBetweenFailureAndAvailableMs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecoverableVoiceInteractionEvent.DownchannelAvailable
    public DialogFailureReason getFailureReason() {
        return this.failureReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecoverableVoiceInteractionEvent.DownchannelAvailable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecoverableVoiceInteractionEvent.DownchannelAvailable
    public long getLatencyBetweenFailureAndAvailableMs() {
        return this.latencyBetweenFailureAndAvailableMs;
    }

    public int hashCode() {
        int hashCode = (((this.failureReason.hashCode() ^ 1000003) * 1000003) ^ this.invocationType.hashCode()) * 1000003;
        long j = this.latencyBetweenFailureAndAvailableMs;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownchannelAvailable{failureReason=");
        sb.append(this.failureReason);
        sb.append(", invocationType=");
        sb.append(this.invocationType);
        sb.append(", latencyBetweenFailureAndAvailableMs=");
        return a$$ExternalSyntheticOutline0.m(this.latencyBetweenFailureAndAvailableMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
