package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.dependencies.tts.IPlayback;
import com.amazon.alexa.mosaic.apl.events.AutoValue_AudioEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class AudioEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioEvent build();

        public abstract Builder playback(IPlayback iPlayback);

        public abstract Builder type(Type type);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        SCHEDULE,
        UNSCHEDULE
    }

    public static Builder builder() {
        return new AutoValue_AudioEvent.Builder();
    }

    public abstract IPlayback playback();

    public abstract Type type();
}
