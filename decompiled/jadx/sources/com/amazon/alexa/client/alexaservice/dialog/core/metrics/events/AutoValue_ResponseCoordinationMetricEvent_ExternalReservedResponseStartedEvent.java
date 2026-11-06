package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ExternalReservedResponseStartedEvent extends ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final long externalDecisionTimestampEpochMs;
    private final long externalReservedResponseStartedEpochMs;
    private final String invocationType;

    public AutoValue_ResponseCoordinationMetricEvent_ExternalReservedResponseStartedEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier, long j, long j2) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.externalDecisionTimestampEpochMs = j;
        this.externalReservedResponseStartedEpochMs = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent) {
            ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent externalReservedResponseStartedEvent = (ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(externalReservedResponseStartedEvent.getInvocationType()) : externalReservedResponseStartedEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(externalReservedResponseStartedEvent.getDialogRequestIdentifier()) : externalReservedResponseStartedEvent.getDialogRequestIdentifier() == null) {
                    if (this.externalDecisionTimestampEpochMs == externalReservedResponseStartedEvent.getExternalDecisionTimestampEpochMs() && this.externalReservedResponseStartedEpochMs == externalReservedResponseStartedEvent.getExternalReservedResponseStartedEpochMs()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent
    public long getExternalDecisionTimestampEpochMs() {
        return this.externalDecisionTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent
    public long getExternalReservedResponseStartedEpochMs() {
        return this.externalReservedResponseStartedEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ExternalReservedResponseStartedEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        int hashCode2 = dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0;
        long j = this.externalDecisionTimestampEpochMs;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.externalReservedResponseStartedEpochMs;
        return ((int) ((j2 >>> 32) ^ j2)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalReservedResponseStartedEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", externalDecisionTimestampEpochMs=");
        sb.append(this.externalDecisionTimestampEpochMs);
        sb.append(", externalReservedResponseStartedEpochMs=");
        return a$$ExternalSyntheticOutline0.m(this.externalReservedResponseStartedEpochMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
