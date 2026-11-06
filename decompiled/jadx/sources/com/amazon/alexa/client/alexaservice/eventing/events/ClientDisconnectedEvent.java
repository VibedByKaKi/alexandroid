package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ClientDisconnectedEvent extends Event.NotGated {
    public static ClientDisconnectedEvent create(@Nullable ExtendedClient extendedClient) {
        return create(extendedClient, false);
    }

    @Nullable
    public abstract ExtendedClient getClient();

    public abstract boolean wasExpectedDisconnection();

    public static ClientDisconnectedEvent create(@Nullable ExtendedClient extendedClient, boolean z) {
        return new AutoValue_ClientDisconnectedEvent(extendedClient, z);
    }
}
