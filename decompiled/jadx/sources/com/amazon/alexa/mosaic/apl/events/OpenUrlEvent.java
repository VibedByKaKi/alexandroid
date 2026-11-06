package com.amazon.alexa.mosaic.apl.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.mosaic.apl.events.AutoValue_OpenUrlEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.amazon.alexa.mosaic.apl.interfaces.UrlEventCallback;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class OpenUrlEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract OpenUrlEvent build();

        public abstract Builder flags(@Nullable String str);

        public abstract Builder handleOpenUrlEventResult(UrlEventCallback urlEventCallback);

        public abstract Builder url(String str);
    }

    public static Builder builder() {
        return new AutoValue_OpenUrlEvent.Builder();
    }

    @Nullable
    public abstract String flags();

    public abstract UrlEventCallback handleOpenUrlEventResult();

    public abstract String url();
}
