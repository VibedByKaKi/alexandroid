package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RequestIdentifier extends RequestIdentifier {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String value;

    public AutoValue_RequestIdentifier(String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null value");
            throw null;
        }
        this.value = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    public boolean equals(Object obj) {
        DialogRequestIdentifier dialogRequestIdentifier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestIdentifier) {
            RequestIdentifier requestIdentifier = (RequestIdentifier) obj;
            if (this.value.equals(requestIdentifier.getValue()) && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(requestIdentifier.getDialogRequestIdentifier()) : requestIdentifier.getDialogRequestIdentifier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = (this.value.hashCode() ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "RequestIdentifier{value=" + this.value + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
