package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PersonalityUserPerceivedLatencyEvent extends Event.NotGated {
    public static PersonalityUserPerceivedLatencyEvent create(DialogRequestIdentifier dialogRequestIdentifier, long j) {
        return new AutoValue_PersonalityUserPerceivedLatencyEvent(dialogRequestIdentifier, j);
    }

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract long getPersonalityRenderUplMillis();
}
