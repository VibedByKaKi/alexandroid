package com.amazon.alexa.client.alexaservice.base.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SystemErrorEvent extends SystemErrorEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String errorMessage;
    private final SystemErrorEvent.ErrorType errorType;
    private final String unparsedDirective;
    private final boolean userFacing;

    public AutoValue_SystemErrorEvent(SystemErrorEvent.ErrorType errorType, @Nullable String str, @Nullable String str2, boolean z, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (errorType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null errorType");
            throw null;
        }
        this.errorType = errorType;
        this.errorMessage = str;
        this.unparsedDirective = str2;
        this.userFacing = z;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        DialogRequestIdentifier dialogRequestIdentifier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SystemErrorEvent) {
            SystemErrorEvent systemErrorEvent = (SystemErrorEvent) obj;
            if (this.errorType.equals(systemErrorEvent.getErrorType()) && ((str = this.errorMessage) != null ? str.equals(systemErrorEvent.getErrorMessage()) : systemErrorEvent.getErrorMessage() == null) && ((str2 = this.unparsedDirective) != null ? str2.equals(systemErrorEvent.getUnparsedDirective()) : systemErrorEvent.getUnparsedDirective() == null) && this.userFacing == systemErrorEvent.isUserFacing() && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(systemErrorEvent.getDialogRequestIdentifier()) : systemErrorEvent.getDialogRequestIdentifier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent
    @Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent
    public SystemErrorEvent.ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent
    @Nullable
    public String getUnparsedDirective() {
        return this.unparsedDirective;
    }

    public int hashCode() {
        int hashCode = (this.errorType.hashCode() ^ 1000003) * 1000003;
        String str = this.errorMessage;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.unparsedDirective;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.userFacing ? 1231 : 1237)) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return hashCode3 ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent
    public boolean isUserFacing() {
        return this.userFacing;
    }

    public String toString() {
        return "SystemErrorEvent{errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ", unparsedDirective=" + this.unparsedDirective + ", userFacing=" + this.userFacing + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
