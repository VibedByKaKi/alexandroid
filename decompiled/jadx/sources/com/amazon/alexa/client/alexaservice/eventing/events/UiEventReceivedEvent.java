package com.amazon.alexa.client.alexaservice.eventing.events;

import android.os.Bundle;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UiEventReceivedEvent extends Event.NotGated {
    public static UiEventReceivedEvent create(UiEventName uiEventName, Bundle bundle) {
        return new AutoValue_UiEventReceivedEvent(uiEventName, bundle);
    }

    public abstract Bundle getEventData();

    public abstract UiEventName getUiEventName();
}
