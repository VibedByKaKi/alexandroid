package com.amazon.alexa.client.alexaservice.base.metrics.tracking;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.alexaservice.dialog.InteractionInitiator;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VisualResponseRenderedTrackingState {
    public boolean appBackgrounded;
    public final DialogRequestIdentifier dialogRequestIdentifier;
    public boolean frozen;
    public boolean frozenByExpectSpeech;
    public final boolean initiatedByExpectSpeech;
    public final InteractionInitiator interactionInitiator;

    @Nullable
    public final String interactionLabel;
    public final String invocationType;
    public final String invocationTypeclass;
    public final String invokingApiEventName;

    @Nullable
    public final ResponseType responseType;
    public boolean userNavigatedAway;
    public boolean userRequestRendered;
    public boolean wakeWordOnly;
    public boolean wasInterrupted;

    public VisualResponseRenderedTrackingState(String str, String str2, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str3, @Nullable ResponseType responseType, String str4, InteractionInitiator interactionInitiator, boolean z) {
        this.userRequestRendered = false;
        this.frozen = false;
        this.wasInterrupted = false;
        this.frozenByExpectSpeech = false;
        this.userNavigatedAway = false;
        this.appBackgrounded = false;
        this.wakeWordOnly = false;
        this.invocationType = str;
        this.invocationTypeclass = str2;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.interactionLabel = str3;
        this.responseType = responseType;
        this.invokingApiEventName = str4;
        this.interactionInitiator = interactionInitiator;
        this.initiatedByExpectSpeech = z;
    }

    public VisualResponseRenderedTrackingState(String str, String str2, DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str3, @Nullable ResponseType responseType, String str4, InteractionInitiator interactionInitiator) {
        this(str, str2, dialogRequestIdentifier, str3, responseType, str4, interactionInitiator, false);
    }
}
