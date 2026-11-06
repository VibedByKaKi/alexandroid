package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ShallowInternalReservationEvent extends ResponseCoordinationMetricEvent.ShallowInternalReservationEvent {
    private final boolean agreed;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final long externalResponseReceivedTimestampEpochMs;
    private final long externalResponseTimestampEpochMs;
    private final long internalDecisionTimestampEpochMs;
    private final String invocationType;

    public AutoValue_ResponseCoordinationMetricEvent_ShallowInternalReservationEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier, boolean z, long j, long j2, long j3) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.agreed = z;
        this.internalDecisionTimestampEpochMs = j;
        this.externalResponseTimestampEpochMs = j2;
        this.externalResponseReceivedTimestampEpochMs = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ShallowInternalReservationEvent) {
            ResponseCoordinationMetricEvent.ShallowInternalReservationEvent shallowInternalReservationEvent = (ResponseCoordinationMetricEvent.ShallowInternalReservationEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(shallowInternalReservationEvent.getInvocationType()) : shallowInternalReservationEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(shallowInternalReservationEvent.getDialogRequestIdentifier()) : shallowInternalReservationEvent.getDialogRequestIdentifier() == null) {
                    if (this.agreed == shallowInternalReservationEvent.isAgreed() && this.internalDecisionTimestampEpochMs == shallowInternalReservationEvent.getInternalDecisionTimestampEpochMs() && this.externalResponseTimestampEpochMs == shallowInternalReservationEvent.getExternalResponseTimestampEpochMs() && this.externalResponseReceivedTimestampEpochMs == shallowInternalReservationEvent.getExternalResponseReceivedTimestampEpochMs()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    public long getExternalResponseReceivedTimestampEpochMs() {
        return this.externalResponseReceivedTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    public long getExternalResponseTimestampEpochMs() {
        return this.externalResponseTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    public long getInternalDecisionTimestampEpochMs() {
        return this.internalDecisionTimestampEpochMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        int hashCode2 = (hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0)) * 1000003;
        int i = this.agreed ? 1231 : 1237;
        long j = this.internalDecisionTimestampEpochMs;
        int i2 = (((hashCode2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.externalResponseTimestampEpochMs;
        long j3 = this.externalResponseReceivedTimestampEpochMs;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowInternalReservationEvent
    public boolean isAgreed() {
        return this.agreed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShallowInternalReservationEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", agreed=");
        sb.append(this.agreed);
        sb.append(", internalDecisionTimestampEpochMs=");
        sb.append(this.internalDecisionTimestampEpochMs);
        sb.append(", externalResponseTimestampEpochMs=");
        sb.append(this.externalResponseTimestampEpochMs);
        sb.append(", externalResponseReceivedTimestampEpochMs=");
        return a$$ExternalSyntheticOutline0.m(this.externalResponseReceivedTimestampEpochMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
