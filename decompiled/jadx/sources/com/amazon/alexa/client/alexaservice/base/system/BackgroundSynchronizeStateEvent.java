package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class BackgroundSynchronizeStateEvent extends Event.NotGated {
    public static BackgroundSynchronizeStateEvent create(String str, int i, long j) {
        return new AutoValue_BackgroundSynchronizeStateEvent(str, i, j);
    }

    public abstract int getAttempt();

    public abstract String getDownchannelId();

    public abstract long getFirstAttemptElapsedRealtimeMs();
}
