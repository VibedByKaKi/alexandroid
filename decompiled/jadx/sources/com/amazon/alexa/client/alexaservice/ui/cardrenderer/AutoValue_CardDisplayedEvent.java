package com.amazon.alexa.client.alexaservice.ui.cardrenderer;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CardDisplayedEvent extends CardDisplayedEvent {
    private final String cardType;
    private final DialogRequestIdentifier dialogRequestId;

    public AutoValue_CardDisplayedEvent(@Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str) {
        this.dialogRequestId = dialogRequestIdentifier;
        this.cardType = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CardDisplayedEvent) {
            CardDisplayedEvent cardDisplayedEvent = (CardDisplayedEvent) obj;
            DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
            if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(cardDisplayedEvent.getDialogRequestId()) : cardDisplayedEvent.getDialogRequestId() == null) {
                String str = this.cardType;
                if (str != null ? str.equals(cardDisplayedEvent.getCardType()) : cardDisplayedEvent.getCardType() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.cardrenderer.CardDisplayedEvent
    @Nullable
    public String getCardType() {
        return this.cardType;
    }

    @Override // com.amazon.alexa.client.alexaservice.ui.cardrenderer.CardDisplayedEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    public int hashCode() {
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
        int hashCode = ((dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode()) ^ 1000003) * 1000003;
        String str = this.cardType;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardDisplayedEvent{dialogRequestId=");
        sb.append(this.dialogRequestId);
        sb.append(", cardType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.cardType, StringSubstitutor.DEFAULT_VAR_END);
    }
}
