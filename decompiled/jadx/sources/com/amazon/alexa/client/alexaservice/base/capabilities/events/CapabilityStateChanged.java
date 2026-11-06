package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.Namespace;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CapabilityStateChanged extends Event.NotGated {
    public static CapabilityStateChanged create(Set<Namespace> set) {
        return new AutoValue_CapabilityStateChanged(set);
    }

    public abstract Set<Namespace> getNamespaces();
}
