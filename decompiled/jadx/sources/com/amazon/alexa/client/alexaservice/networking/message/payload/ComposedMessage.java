package com.amazon.alexa.client.alexaservice.networking.message.payload;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.networking.message.payload.AutoValue_ComposedMessage;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.messages.Message;
import com.google.auto.value.AutoValue;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ComposedMessage {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ComposedMessage build();

        public abstract Builder setContext(Collection<ComponentState> collection);

        public abstract Builder setDirective(Message message);

        public abstract Builder setEvent(Message message);
    }

    public static Builder builder() {
        return new AutoValue_ComposedMessage.Builder();
    }

    @Nullable
    public abstract Collection<ComponentState> getContext();

    @Nullable
    public abstract Message getDirective();

    @Nullable
    public abstract Message getEvent();
}
