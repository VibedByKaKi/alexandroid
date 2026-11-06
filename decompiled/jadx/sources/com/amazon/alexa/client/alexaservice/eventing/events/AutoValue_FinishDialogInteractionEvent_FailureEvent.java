package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishDialogInteractionEvent_FailureEvent extends FinishDialogInteractionEvent.FailureEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final Map<String, String> failureInformation;
    private final DialogFailureReason failureReason;
    private final boolean textDialog;

    public AutoValue_FinishDialogInteractionEvent_FailureEvent(DialogRequestIdentifier dialogRequestIdentifier, DialogFailureReason dialogFailureReason, @Nullable Map<String, String> map, boolean z) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (dialogFailureReason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null failureReason");
            throw null;
        }
        this.failureReason = dialogFailureReason;
        this.failureInformation = map;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishDialogInteractionEvent.FailureEvent) {
            FinishDialogInteractionEvent.FailureEvent failureEvent = (FinishDialogInteractionEvent.FailureEvent) obj;
            if (this.dialogRequestIdentifier.equals(failureEvent.getDialogRequestIdentifier()) && this.failureReason.equals(failureEvent.getFailureReason()) && ((map = this.failureInformation) != null ? map.equals(failureEvent.getFailureInformation()) : failureEvent.getFailureInformation() == null) && this.textDialog == failureEvent.isTextDialog()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.FailureEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.FailureEvent
    @Nullable
    public Map<String, String> getFailureInformation() {
        return this.failureInformation;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.FailureEvent
    public DialogFailureReason getFailureReason() {
        return this.failureReason;
    }

    public int hashCode() {
        int hashCode = (((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.failureReason.hashCode()) * 1000003;
        Map<String, String> map = this.failureInformation;
        return (this.textDialog ? 1231 : 1237) ^ ((hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.FailureEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FailureEvent{dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", failureReason=");
        sb.append(this.failureReason);
        sb.append(", failureInformation=");
        sb.append(this.failureInformation);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
