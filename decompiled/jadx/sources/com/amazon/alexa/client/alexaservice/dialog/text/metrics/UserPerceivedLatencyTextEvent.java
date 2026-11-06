package com.amazon.alexa.client.alexaservice.dialog.text.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UserPerceivedLatencyTextEvent extends Event.NotGated {
    public static UserPerceivedLatencyTextEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, @Nullable ResponseType responseType, @Nullable String str2, String str3, String str4) {
        return new AutoValue_UserPerceivedLatencyTextEvent(str, dialogRequestIdentifier, j, j2, responseType, str2, str3, str4);
    }

    public abstract long getDeviceProcessingLatencyMillis();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract String getInitiator();

    @Nullable
    public abstract String getInteractionLabel();

    public abstract String getInvocationType();

    public abstract String getInvokingApiEventName();

    @Nullable
    public abstract ResponseType getResponseType();

    public abstract long getUserPerceivedLatencyMillis();
}
