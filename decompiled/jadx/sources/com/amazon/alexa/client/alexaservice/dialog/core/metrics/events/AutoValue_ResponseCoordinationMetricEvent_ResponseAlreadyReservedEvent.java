package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ResponseAlreadyReservedEvent extends ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final long externalDecisionReceivedTimestampEpochMs;
    private final long externalDecisionTimestampEpochMs;
    private final long internalDecisionTimestampEpochMs;
    private final String invocationType;
    private final long reservationTimestampEpochMs;

    public AutoValue_ResponseCoordinationMetricEvent_ResponseAlreadyReservedEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, long j3, long j4) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.externalDecisionTimestampEpochMs = j;
        this.externalDecisionReceivedTimestampEpochMs = j2;
        this.internalDecisionTimestampEpochMs = j3;
        this.reservationTimestampEpochMs = j4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent) {
            ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent responseAlreadyReservedEvent = (ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(responseAlreadyReservedEvent.getInvocationType()) : responseAlreadyReservedEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(responseAlreadyReservedEvent.getDialogRequestIdentifier()) : responseAlreadyReservedEvent.getDialogRequestIdentifier() == null) {
                    if (this.externalDecisionTimestampEpochMs == responseAlreadyReservedEvent.getExternalDecisionTimestampEpochMs() && this.externalDecisionReceivedTimestampEpochMs == responseAlreadyReservedEvent.getExternalDecisionReceivedTimestampEpochMs() && this.internalDecisionTimestampEpochMs == responseAlreadyReservedEvent.getInternalDecisionTimestampEpochMs() && this.reservationTimestampEpochMs == responseAlreadyReservedEvent.getReservationTimestampEpochMs()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    public long getExternalDecisionReceivedTimestampEpochMs() {
        return this.externalDecisionReceivedTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    public long getExternalDecisionTimestampEpochMs() {
        return this.externalDecisionTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    public long getInternalDecisionTimestampEpochMs() {
        return this.internalDecisionTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseAlreadyReservedEvent
    public long getReservationTimestampEpochMs() {
        return this.reservationTimestampEpochMs;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        int hashCode2 = dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0;
        long j = this.externalDecisionTimestampEpochMs;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.externalDecisionReceivedTimestampEpochMs;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.internalDecisionTimestampEpochMs;
        long j4 = this.reservationTimestampEpochMs;
        return ((int) ((j4 >>> 32) ^ j4)) ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseAlreadyReservedEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", externalDecisionTimestampEpochMs=");
        sb.append(this.externalDecisionTimestampEpochMs);
        sb.append(", externalDecisionReceivedTimestampEpochMs=");
        sb.append(this.externalDecisionReceivedTimestampEpochMs);
        sb.append(", internalDecisionTimestampEpochMs=");
        sb.append(this.internalDecisionTimestampEpochMs);
        sb.append(", reservationTimestampEpochMs=");
        return a$$ExternalSyntheticOutline0.m(this.reservationTimestampEpochMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
