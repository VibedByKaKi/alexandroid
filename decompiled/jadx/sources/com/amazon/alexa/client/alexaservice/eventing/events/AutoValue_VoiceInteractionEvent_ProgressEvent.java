package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VoiceInteractionEvent_ProgressEvent extends VoiceInteractionEvent.ProgressEvent {
    private final DialogRequestIdentifier dialogRequestId;
    private final String invocationType;
    private final String name;

    public AutoValue_VoiceInteractionEvent_ProgressEvent(String str, @Nullable String str2, DialogRequestIdentifier dialogRequestIdentifier) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.invocationType = str2;
        if (dialogRequestIdentifier != null) {
            this.dialogRequestId = dialogRequestIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionEvent.ProgressEvent) {
            VoiceInteractionEvent.ProgressEvent progressEvent = (VoiceInteractionEvent.ProgressEvent) obj;
            if (this.name.equals(progressEvent.getName()) && ((str = this.invocationType) != null ? str.equals(progressEvent.getInvocationType()) : progressEvent.getInvocationType() == null) && this.dialogRequestId.equals(progressEvent.getDialogRequestId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        String str = this.invocationType;
        return this.dialogRequestId.hashCode() ^ ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public String toString() {
        return "ProgressEvent{name=" + this.name + ", invocationType=" + this.invocationType + ", dialogRequestId=" + this.dialogRequestId + StringSubstitutor.DEFAULT_VAR_END;
    }
}
