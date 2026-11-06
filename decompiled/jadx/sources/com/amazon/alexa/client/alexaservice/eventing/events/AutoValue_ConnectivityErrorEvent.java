package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConnectivityErrorEvent extends ConnectivityErrorEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final boolean isActiveNetworkTooSlow;
    private final boolean isNetworkTransition;
    private final boolean textDialog;

    public AutoValue_ConnectivityErrorEvent(boolean z, boolean z2, boolean z3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        this.isNetworkTransition = z;
        this.isActiveNetworkTooSlow = z2;
        this.textDialog = z3;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    public boolean equals(Object obj) {
        DialogRequestIdentifier dialogRequestIdentifier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectivityErrorEvent) {
            ConnectivityErrorEvent connectivityErrorEvent = (ConnectivityErrorEvent) obj;
            if (this.isNetworkTransition == connectivityErrorEvent.getIsNetworkTransition() && this.isActiveNetworkTooSlow == connectivityErrorEvent.getIsActiveNetworkTooSlow() && this.textDialog == connectivityErrorEvent.isTextDialog() && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(connectivityErrorEvent.getDialogRequestIdentifier()) : connectivityErrorEvent.getDialogRequestIdentifier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ConnectivityErrorEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ConnectivityErrorEvent
    public boolean getIsActiveNetworkTooSlow() {
        return this.isActiveNetworkTooSlow;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ConnectivityErrorEvent
    public boolean getIsNetworkTransition() {
        return this.isNetworkTransition;
    }

    public int hashCode() {
        int i = ((((((this.isNetworkTransition ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.isActiveNetworkTooSlow ? 1231 : 1237)) * 1000003) ^ (this.textDialog ? 1231 : 1237)) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode()) ^ i;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ConnectivityErrorEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        return "ConnectivityErrorEvent{isNetworkTransition=" + this.isNetworkTransition + ", isActiveNetworkTooSlow=" + this.isActiveNetworkTooSlow + ", textDialog=" + this.textDialog + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
