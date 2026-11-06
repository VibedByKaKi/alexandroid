package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionProgress;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UpdateVoiceInteractionProgressEvent extends UpdateVoiceInteractionProgressEvent {
    private final DialogRequestIdentifier dialogRequestId;
    private final DialogTurnIdentifier dialogTurnId;
    private final DialogInteractionProgress progress;

    public AutoValue_UpdateVoiceInteractionProgressEvent(@Nullable DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionProgress dialogInteractionProgress) {
        this.dialogTurnId = dialogTurnIdentifier;
        this.dialogRequestId = dialogRequestIdentifier;
        if (dialogInteractionProgress != null) {
            this.progress = dialogInteractionProgress;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null progress");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateVoiceInteractionProgressEvent) {
            UpdateVoiceInteractionProgressEvent updateVoiceInteractionProgressEvent = (UpdateVoiceInteractionProgressEvent) obj;
            DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnId;
            if (dialogTurnIdentifier != null ? dialogTurnIdentifier.equals(updateVoiceInteractionProgressEvent.getDialogTurnId()) : updateVoiceInteractionProgressEvent.getDialogTurnId() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(updateVoiceInteractionProgressEvent.getDialogRequestId()) : updateVoiceInteractionProgressEvent.getDialogRequestId() == null) {
                    if (this.progress.equals(updateVoiceInteractionProgressEvent.getProgress())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UpdateVoiceInteractionProgressEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UpdateVoiceInteractionProgressEvent
    @Nullable
    public DialogTurnIdentifier getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.UpdateVoiceInteractionProgressEvent
    public DialogInteractionProgress getProgress() {
        return this.progress;
    }

    public int hashCode() {
        DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnId;
        int hashCode = ((dialogTurnIdentifier == null ? 0 : dialogTurnIdentifier.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
        return this.progress.hashCode() ^ ((hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "UpdateVoiceInteractionProgressEvent{dialogTurnId=" + this.dialogTurnId + ", dialogRequestId=" + this.dialogRequestId + ", progress=" + this.progress + StringSubstitutor.DEFAULT_VAR_END;
    }
}
