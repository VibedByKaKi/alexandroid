package com.amazon.alexa.client.alexaservice.audio.audioprovider;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DialogTurnIdentifier extends DialogTurnIdentifier {
    private final boolean textDialog;
    private final String value;

    public AutoValue_DialogTurnIdentifier(String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null value");
            throw null;
        }
        this.value = str;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DialogTurnIdentifier) {
            DialogTurnIdentifier dialogTurnIdentifier = (DialogTurnIdentifier) obj;
            if (this.value.equals(dialogTurnIdentifier.getValue()) && this.textDialog == dialogTurnIdentifier.isTextDialog()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.textDialog ? 1231 : 1237) ^ ((this.value.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DialogTurnIdentifier{value=");
        sb.append(this.value);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
