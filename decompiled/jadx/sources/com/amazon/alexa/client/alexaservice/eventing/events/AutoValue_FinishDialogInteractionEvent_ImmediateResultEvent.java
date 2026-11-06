package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishDialogInteractionEvent_ImmediateResultEvent extends FinishDialogInteractionEvent.ImmediateResultEvent {
    private final String invocationType;
    private final DialogInteractionResult.Reason reason;
    private final String softwareVersion;
    private final boolean textDialog;

    public AutoValue_FinishDialogInteractionEvent_ImmediateResultEvent(@Nullable String str, String str2, DialogInteractionResult.Reason reason, boolean z) {
        this.invocationType = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null softwareVersion");
            throw null;
        }
        this.softwareVersion = str2;
        if (reason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null reason");
            throw null;
        }
        this.reason = reason;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishDialogInteractionEvent.ImmediateResultEvent) {
            FinishDialogInteractionEvent.ImmediateResultEvent immediateResultEvent = (FinishDialogInteractionEvent.ImmediateResultEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(immediateResultEvent.getInvocationType()) : immediateResultEvent.getInvocationType() == null) {
                if (this.softwareVersion.equals(immediateResultEvent.getSoftwareVersion()) && this.reason.equals(immediateResultEvent.getReason()) && this.textDialog == immediateResultEvent.isTextDialog()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.ImmediateResultEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.ImmediateResultEvent
    public DialogInteractionResult.Reason getReason() {
        return this.reason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.ImmediateResultEvent
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int hashCode() {
        String str = this.invocationType;
        return (this.textDialog ? 1231 : 1237) ^ (((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.softwareVersion.hashCode()) * 1000003) ^ this.reason.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.ImmediateResultEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImmediateResultEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", softwareVersion=");
        sb.append(this.softwareVersion);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
