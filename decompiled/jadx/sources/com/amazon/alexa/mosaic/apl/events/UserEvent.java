package com.amazon.alexa.mosaic.apl.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.mosaic.apl.events.AutoValue_UserEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class UserEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder arguments(List<Object> list);

        public abstract UserEvent build();

        public abstract Builder components(Map<String, Object> map);

        public abstract Builder flags(Map<String, Object> map);

        public abstract Builder sources(Map<String, Object> map);
    }

    public static Builder builder() {
        return new AutoValue_UserEvent.Builder();
    }

    @Nullable
    public abstract List<Object> arguments();

    @Nullable
    public abstract Map<String, Object> components();

    @Nullable
    public abstract Map<String, Object> flags();

    @Nullable
    public abstract Map<String, Object> sources();
}
