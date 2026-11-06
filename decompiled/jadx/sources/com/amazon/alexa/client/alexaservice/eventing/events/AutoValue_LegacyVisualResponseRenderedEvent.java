package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.alexaservice.dialog.InteractionInitiator;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LegacyVisualResponseRenderedEvent extends LegacyVisualResponseRenderedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final InteractionInitiator interactionInitiator;
    private final String interactionLabel;
    private final String invocationType;
    private final String invokingApiEventName;
    private final ResponseType responseType;
    private final boolean successfullyRendered;

    public AutoValue_LegacyVisualResponseRenderedEvent(InteractionInitiator interactionInitiator, String str, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str2, @Nullable ResponseType responseType, String str3, boolean z) {
        if (interactionInitiator == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interactionInitiator");
            throw null;
        }
        this.interactionInitiator = interactionInitiator;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invocationType");
            throw null;
        }
        this.invocationType = str;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.interactionLabel = str2;
        this.responseType = responseType;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invokingApiEventName");
            throw null;
        }
        this.invokingApiEventName = str3;
        this.successfullyRendered = z;
    }

    public boolean equals(Object obj) {
        String str;
        ResponseType responseType;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LegacyVisualResponseRenderedEvent) {
            LegacyVisualResponseRenderedEvent legacyVisualResponseRenderedEvent = (LegacyVisualResponseRenderedEvent) obj;
            if (this.interactionInitiator.equals(legacyVisualResponseRenderedEvent.getInteractionInitiator()) && this.invocationType.equals(legacyVisualResponseRenderedEvent.getInvocationType()) && this.dialogRequestIdentifier.equals(legacyVisualResponseRenderedEvent.getDialogRequestIdentifier()) && ((str = this.interactionLabel) != null ? str.equals(legacyVisualResponseRenderedEvent.getInteractionLabel()) : legacyVisualResponseRenderedEvent.getInteractionLabel() == null) && ((responseType = this.responseType) != null ? responseType.equals(legacyVisualResponseRenderedEvent.getResponseType()) : legacyVisualResponseRenderedEvent.getResponseType() == null) && this.invokingApiEventName.equals(legacyVisualResponseRenderedEvent.getInvokingApiEventName()) && this.successfullyRendered == legacyVisualResponseRenderedEvent.isSuccessfullyRendered()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    public InteractionInitiator getInteractionInitiator() {
        return this.interactionInitiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    @Nullable
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    public String getInvokingApiEventName() {
        return this.invokingApiEventName;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    @Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }

    public int hashCode() {
        int hashCode = (((((this.interactionInitiator.hashCode() ^ 1000003) * 1000003) ^ this.invocationType.hashCode()) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003;
        String str = this.interactionLabel;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ResponseType responseType = this.responseType;
        return (this.successfullyRendered ? 1231 : 1237) ^ ((((hashCode2 ^ (responseType != null ? responseType.hashCode() : 0)) * 1000003) ^ this.invokingApiEventName.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LegacyVisualResponseRenderedEvent
    public boolean isSuccessfullyRendered() {
        return this.successfullyRendered;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LegacyVisualResponseRenderedEvent{interactionInitiator=");
        sb.append(this.interactionInitiator);
        sb.append(", invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", interactionLabel=");
        sb.append(this.interactionLabel);
        sb.append(", responseType=");
        sb.append(this.responseType);
        sb.append(", invokingApiEventName=");
        sb.append(this.invokingApiEventName);
        sb.append(", successfullyRendered=");
        return a$$ExternalSyntheticOutline0.m(sb, this.successfullyRendered, StringSubstitutor.DEFAULT_VAR_END);
    }
}
