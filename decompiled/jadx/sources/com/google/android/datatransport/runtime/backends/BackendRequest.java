package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes7.dex */
public abstract class BackendRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract BackendRequest build();

        public abstract Builder setEvents(Iterable<EventInternal> iterable);

        public abstract Builder setExtras(@Nullable byte[] bArr);
    }

    public static Builder builder() {
        return new AutoValue_BackendRequest.Builder();
    }

    public static BackendRequest create(Iterable<EventInternal> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<EventInternal> getEvents();

    @Nullable
    public abstract byte[] getExtras();
}
