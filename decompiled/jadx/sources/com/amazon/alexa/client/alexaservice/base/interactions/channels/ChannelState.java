package com.amazon.alexa.client.alexaservice.base.interactions.channels;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.AutoValue_ChannelState;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ChannelState {
    private static ChannelState create(InteractionInterfaceName interactionInterfaceName, long j, boolean z) {
        return new AutoValue_ChannelState(interactionInterfaceName, j, z);
    }

    public static ChannelState createActive(InteractionInterfaceName interactionInterfaceName) {
        return create(interactionInterfaceName, 0L, true);
    }

    public static ChannelState createInactive(InteractionInterfaceName interactionInterfaceName, long j) {
        return create(interactionInterfaceName, j, false);
    }

    public static TypeAdapter<ChannelState> typeAdapter(Gson gson) {
        return new AutoValue_ChannelState.GsonTypeAdapter(gson);
    }

    public abstract long getIdleStartTimeSystemMilliseconds();

    public abstract boolean getIsActive();

    public abstract InteractionInterfaceName getLatestInterfaceName();

    public String toString() {
        return "cs: " + getLatestInterfaceName() + "-" + getIdleStartTimeSystemMilliseconds();
    }
}
