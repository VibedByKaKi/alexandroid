package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_StartDialogInteractionEvent extends StartDialogInteractionEvent {
    private final DialogTurnIdentifier dialogTurnId;
    private final String invocationType;
    private final String softwareVersion;
    private final boolean textDialog;

    public AutoValue_StartDialogInteractionEvent(DialogTurnIdentifier dialogTurnIdentifier, @Nullable String str, @Nullable String str2, boolean z) {
        if (dialogTurnIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogTurnId");
            throw null;
        }
        this.dialogTurnId = dialogTurnIdentifier;
        this.invocationType = str;
        this.softwareVersion = str2;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartDialogInteractionEvent) {
            StartDialogInteractionEvent startDialogInteractionEvent = (StartDialogInteractionEvent) obj;
            if (this.dialogTurnId.equals(startDialogInteractionEvent.getDialogTurnId()) && ((str = this.invocationType) != null ? str.equals(startDialogInteractionEvent.getInvocationType()) : startDialogInteractionEvent.getInvocationType() == null) && ((str2 = this.softwareVersion) != null ? str2.equals(startDialogInteractionEvent.getSoftwareVersion()) : startDialogInteractionEvent.getSoftwareVersion() == null) && this.textDialog == startDialogInteractionEvent.isTextDialog()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent
    public DialogTurnIdentifier getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent
    @Nullable
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int hashCode() {
        int hashCode = (this.dialogTurnId.hashCode() ^ 1000003) * 1000003;
        String str = this.invocationType;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.softwareVersion;
        return (this.textDialog ? 1231 : 1237) ^ ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartDialogInteractionEvent{dialogTurnId=");
        sb.append(this.dialogTurnId);
        sb.append(", invocationType=");
        sb.append(this.invocationType);
        sb.append(", softwareVersion=");
        sb.append(this.softwareVersion);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
