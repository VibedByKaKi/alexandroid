package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ShallowExternalReservationEvent extends ResponseCoordinationMetricEvent.ShallowExternalReservationEvent {
    private final boolean agreed;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String invocationType;

    public AutoValue_ResponseCoordinationMetricEvent_ShallowExternalReservationEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.agreed = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ShallowExternalReservationEvent) {
            ResponseCoordinationMetricEvent.ShallowExternalReservationEvent shallowExternalReservationEvent = (ResponseCoordinationMetricEvent.ShallowExternalReservationEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(shallowExternalReservationEvent.getInvocationType()) : shallowExternalReservationEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(shallowExternalReservationEvent.getDialogRequestIdentifier()) : shallowExternalReservationEvent.getDialogRequestIdentifier() == null) {
                    if (this.agreed == shallowExternalReservationEvent.isAgreed()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowExternalReservationEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowExternalReservationEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (this.agreed ? 1231 : 1237) ^ ((hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ShallowExternalReservationEvent
    public boolean isAgreed() {
        return this.agreed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShallowExternalReservationEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", agreed=");
        return a$$ExternalSyntheticOutline0.m(sb, this.agreed, StringSubstitutor.DEFAULT_VAR_END);
    }
}
