package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class InteractionEvent extends Event.NotGated {
    public static final String AGGREGATE_METRIC_SUFFIX = "AGGREGATE";
    public static final String UNKNOWN_FAILURE_REASON = "Unknown";

    public abstract DialogRequestIdentifier getDialogRequestId();

    @Nullable
    public abstract String getInvocationType();

    public abstract String getName();
}
