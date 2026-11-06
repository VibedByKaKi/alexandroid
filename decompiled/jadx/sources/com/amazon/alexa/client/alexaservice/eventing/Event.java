package com.amazon.alexa.client.alexaservice.eventing;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.Feature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class Event {
    private final long createdTime = SystemClock.elapsedRealtime();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotGated extends Event {
        @Override // com.amazon.alexa.client.alexaservice.eventing.Event
        @Nullable
        public Feature getGatingFeature() {
            return null;
        }
    }

    public long getCreatedTimeMilliseconds() {
        return this.createdTime;
    }

    @Nullable
    public abstract Feature getGatingFeature();

    public boolean hasGatingFeature() {
        return getGatingFeature() != null;
    }
}
