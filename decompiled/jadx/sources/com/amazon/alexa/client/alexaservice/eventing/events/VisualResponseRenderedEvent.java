package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.metrics.AddFragmentState;
import com.amazon.alexa.client.alexaservice.base.metrics.InteractionModelState;
import com.amazon.alexa.client.alexaservice.base.metrics.RenderFailureCategory;
import com.amazon.alexa.client.alexaservice.base.metrics.ResponseRenderedType;
import com.amazon.alexa.client.alexaservice.dialog.InteractionInitiator;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class VisualResponseRenderedEvent extends Event.NotGated {
    public static VisualResponseRenderedEvent create(InteractionInitiator interactionInitiator, String str, String str2, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str3, ResponseRenderedType responseRenderedType, DialogInteractionResult.Type type, @Nullable RenderFailureCategory renderFailureCategory, AddFragmentState addFragmentState, InteractionModelState interactionModelState, @Nullable String str4, String str5, boolean z) {
        return new AutoValue_VisualResponseRenderedEvent(interactionInitiator, str, str2, dialogRequestIdentifier, str3, responseRenderedType, type, renderFailureCategory, addFragmentState, interactionModelState, str4, str5, z);
    }

    public abstract AddFragmentState getAddFragmentState();

    public abstract DialogInteractionResult.Type getDialogInteractionResultType();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract InteractionInitiator getInteractionInitiator();

    @Nullable
    public abstract String getInteractionLabel();

    public abstract InteractionModelState getInteractionModelState();

    public abstract String getInvocationSource();

    public abstract String getInvocationType();

    public abstract String getInvokingApiEventName();

    @Nullable
    public abstract RenderFailureCategory getRenderFailureCategory();

    public abstract ResponseRenderedType getResponseRenderedType();

    public abstract boolean isSuccessfullyRendered();

    @Nullable
    public abstract String sdkFailureReason();
}
