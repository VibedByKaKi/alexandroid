package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.metrics.AddFragmentState;
import com.amazon.alexa.client.alexaservice.base.metrics.InteractionModelState;
import com.amazon.alexa.client.alexaservice.base.metrics.RenderFailureCategory;
import com.amazon.alexa.client.alexaservice.base.metrics.ResponseRenderedType;
import com.amazon.alexa.client.alexaservice.dialog.InteractionInitiator;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VisualResponseRenderedEvent extends VisualResponseRenderedEvent {
    private final AddFragmentState getAddFragmentState;
    private final DialogInteractionResult.Type getDialogInteractionResultType;
    private final DialogRequestIdentifier getDialogRequestIdentifier;
    private final InteractionInitiator getInteractionInitiator;
    private final String getInteractionLabel;
    private final InteractionModelState getInteractionModelState;
    private final String getInvocationSource;
    private final String getInvocationType;
    private final String getInvokingApiEventName;
    private final RenderFailureCategory getRenderFailureCategory;
    private final ResponseRenderedType getResponseRenderedType;
    private final boolean isSuccessfullyRendered;
    private final String sdkFailureReason;

    public AutoValue_VisualResponseRenderedEvent(InteractionInitiator interactionInitiator, String str, String str2, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str3, ResponseRenderedType responseRenderedType, DialogInteractionResult.Type type, @Nullable RenderFailureCategory renderFailureCategory, AddFragmentState addFragmentState, InteractionModelState interactionModelState, @Nullable String str4, String str5, boolean z) {
        if (interactionInitiator == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getInteractionInitiator");
            throw null;
        }
        this.getInteractionInitiator = interactionInitiator;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getInvocationType");
            throw null;
        }
        this.getInvocationType = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getInvocationSource");
            throw null;
        }
        this.getInvocationSource = str2;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getDialogRequestIdentifier");
            throw null;
        }
        this.getDialogRequestIdentifier = dialogRequestIdentifier;
        this.getInteractionLabel = str3;
        if (responseRenderedType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getResponseRenderedType");
            throw null;
        }
        this.getResponseRenderedType = responseRenderedType;
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getDialogInteractionResultType");
            throw null;
        }
        this.getDialogInteractionResultType = type;
        this.getRenderFailureCategory = renderFailureCategory;
        if (addFragmentState == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getAddFragmentState");
            throw null;
        }
        this.getAddFragmentState = addFragmentState;
        if (interactionModelState == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getInteractionModelState");
            throw null;
        }
        this.getInteractionModelState = interactionModelState;
        this.sdkFailureReason = str4;
        if (str5 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getInvokingApiEventName");
            throw null;
        }
        this.getInvokingApiEventName = str5;
        this.isSuccessfullyRendered = z;
    }

    public boolean equals(Object obj) {
        String str;
        RenderFailureCategory renderFailureCategory;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VisualResponseRenderedEvent) {
            VisualResponseRenderedEvent visualResponseRenderedEvent = (VisualResponseRenderedEvent) obj;
            if (this.getInteractionInitiator.equals(visualResponseRenderedEvent.getInteractionInitiator()) && this.getInvocationType.equals(visualResponseRenderedEvent.getInvocationType()) && this.getInvocationSource.equals(visualResponseRenderedEvent.getInvocationSource()) && this.getDialogRequestIdentifier.equals(visualResponseRenderedEvent.getDialogRequestIdentifier()) && ((str = this.getInteractionLabel) != null ? str.equals(visualResponseRenderedEvent.getInteractionLabel()) : visualResponseRenderedEvent.getInteractionLabel() == null) && this.getResponseRenderedType.equals(visualResponseRenderedEvent.getResponseRenderedType()) && this.getDialogInteractionResultType.equals(visualResponseRenderedEvent.getDialogInteractionResultType()) && ((renderFailureCategory = this.getRenderFailureCategory) != null ? renderFailureCategory.equals(visualResponseRenderedEvent.getRenderFailureCategory()) : visualResponseRenderedEvent.getRenderFailureCategory() == null) && this.getAddFragmentState.equals(visualResponseRenderedEvent.getAddFragmentState()) && this.getInteractionModelState.equals(visualResponseRenderedEvent.getInteractionModelState()) && ((str2 = this.sdkFailureReason) != null ? str2.equals(visualResponseRenderedEvent.sdkFailureReason()) : visualResponseRenderedEvent.sdkFailureReason() == null) && this.getInvokingApiEventName.equals(visualResponseRenderedEvent.getInvokingApiEventName()) && this.isSuccessfullyRendered == visualResponseRenderedEvent.isSuccessfullyRendered()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public AddFragmentState getAddFragmentState() {
        return this.getAddFragmentState;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public DialogInteractionResult.Type getDialogInteractionResultType() {
        return this.getDialogInteractionResultType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.getDialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public InteractionInitiator getInteractionInitiator() {
        return this.getInteractionInitiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    @Nullable
    public String getInteractionLabel() {
        return this.getInteractionLabel;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public InteractionModelState getInteractionModelState() {
        return this.getInteractionModelState;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public String getInvocationSource() {
        return this.getInvocationSource;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public String getInvocationType() {
        return this.getInvocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public String getInvokingApiEventName() {
        return this.getInvokingApiEventName;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    @Nullable
    public RenderFailureCategory getRenderFailureCategory() {
        return this.getRenderFailureCategory;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public ResponseRenderedType getResponseRenderedType() {
        return this.getResponseRenderedType;
    }

    public int hashCode() {
        int hashCode = (((((((this.getInteractionInitiator.hashCode() ^ 1000003) * 1000003) ^ this.getInvocationType.hashCode()) * 1000003) ^ this.getInvocationSource.hashCode()) * 1000003) ^ this.getDialogRequestIdentifier.hashCode()) * 1000003;
        String str = this.getInteractionLabel;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.getResponseRenderedType.hashCode()) * 1000003) ^ this.getDialogInteractionResultType.hashCode()) * 1000003;
        RenderFailureCategory renderFailureCategory = this.getRenderFailureCategory;
        int hashCode3 = (((((hashCode2 ^ (renderFailureCategory == null ? 0 : renderFailureCategory.hashCode())) * 1000003) ^ this.getAddFragmentState.hashCode()) * 1000003) ^ this.getInteractionModelState.hashCode()) * 1000003;
        String str2 = this.sdkFailureReason;
        return (this.isSuccessfullyRendered ? 1231 : 1237) ^ ((((hashCode3 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.getInvokingApiEventName.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    public boolean isSuccessfullyRendered() {
        return this.isSuccessfullyRendered;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VisualResponseRenderedEvent
    @Nullable
    public String sdkFailureReason() {
        return this.sdkFailureReason;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VisualResponseRenderedEvent{getInteractionInitiator=");
        sb.append(this.getInteractionInitiator);
        sb.append(", getInvocationType=");
        sb.append(this.getInvocationType);
        sb.append(", getInvocationSource=");
        sb.append(this.getInvocationSource);
        sb.append(", getDialogRequestIdentifier=");
        sb.append(this.getDialogRequestIdentifier);
        sb.append(", getInteractionLabel=");
        sb.append(this.getInteractionLabel);
        sb.append(", getResponseRenderedType=");
        sb.append(this.getResponseRenderedType);
        sb.append(", getDialogInteractionResultType=");
        sb.append(this.getDialogInteractionResultType);
        sb.append(", getRenderFailureCategory=");
        sb.append(this.getRenderFailureCategory);
        sb.append(", getAddFragmentState=");
        sb.append(this.getAddFragmentState);
        sb.append(", getInteractionModelState=");
        sb.append(this.getInteractionModelState);
        sb.append(", sdkFailureReason=");
        sb.append(this.sdkFailureReason);
        sb.append(", getInvokingApiEventName=");
        sb.append(this.getInvokingApiEventName);
        sb.append(", isSuccessfullyRendered=");
        return a$$ExternalSyntheticOutline0.m(sb, this.isSuccessfullyRendered, StringSubstitutor.DEFAULT_VAR_END);
    }
}
