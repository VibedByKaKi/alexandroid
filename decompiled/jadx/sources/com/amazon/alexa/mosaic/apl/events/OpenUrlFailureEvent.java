package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.AutoValue_OpenUrlFailureEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class OpenUrlFailureEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract OpenUrlFailureEvent build();

        public abstract Builder message(String str);
    }

    public static Builder builder() {
        return new AutoValue_OpenUrlFailureEvent.Builder();
    }

    public abstract String message();
}
