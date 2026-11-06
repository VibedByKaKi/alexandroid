package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ResponseReservedEvent extends ResponseCoordinationMetricEvent.ResponseReservedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final boolean internal;
    private final String invocationType;

    public AutoValue_ResponseCoordinationMetricEvent_ResponseReservedEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.internal = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ResponseReservedEvent) {
            ResponseCoordinationMetricEvent.ResponseReservedEvent responseReservedEvent = (ResponseCoordinationMetricEvent.ResponseReservedEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(responseReservedEvent.getInvocationType()) : responseReservedEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(responseReservedEvent.getDialogRequestIdentifier()) : responseReservedEvent.getDialogRequestIdentifier() == null) {
                    if (this.internal == responseReservedEvent.isInternal()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseReservedEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseReservedEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (this.internal ? 1231 : 1237) ^ ((hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseReservedEvent
    public boolean isInternal() {
        return this.internal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseReservedEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", internal=");
        return a$$ExternalSyntheticOutline0.m(sb, this.internal, StringSubstitutor.DEFAULT_VAR_END);
    }
}
