package com.amazon.alexa.client.alexaservice.features.launcher.events;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.launcher.events.AutoValue_AlexaLauncherEvent;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Outcome;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Reasons;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Target;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Token;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AlexaLauncherEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AlexaLauncherEvent build();

        public abstract Builder setEventType(@NonNull String str);

        public abstract Builder setOutcome(@NonNull Outcome outcome);

        public abstract Builder setReasons(@NonNull List<Reasons> list);

        public abstract Builder setTarget(@NonNull Target target);

        public abstract Builder setToken(@NonNull Token token);
    }

    public static Builder builder() {
        return new AutoValue_AlexaLauncherEvent.Builder();
    }

    public abstract String getEventType();

    public abstract Outcome getOutcome();

    public abstract List<Reasons> getReasons();

    public abstract Target getTarget();

    public abstract Token getToken();
}
